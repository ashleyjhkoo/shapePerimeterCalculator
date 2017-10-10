package perimeter_quiz;

import edu.duke.*;
import java.io.File;

public class PerimeterAssignmentRunner {
    public int getNumPoints (Shape s) {
        int numPoints =0 ;
        //Point somePoint = s.getPoints();
        for (Point somePoint : s.getPoints()){
           numPoints += 1;
        }
        return numPoints;
    }

    public double getAverageLength(Shape s) {
        int points = getNumPoints(s);
        perimeterRunnerAssignment pr = new perimeterRunnerAssignment();
        double totalPerim = pr.getPerimeter(s);
        double avgLength = totalPerim / points;
        return avgLength;
    }

    public double getLargestSide(Shape s) {
        //perimeterRunnerAssignment pr = new perimeterRunnerAssignment();
        double longestSide = 0.0;
        Point prevPt = s.getLastPoint();
        for (Point currPt : s.getPoints()) {
            double currDist = prevPt.distance(currPt);
            if (currDist > longestSide) {
                longestSide = currDist;
            }
            prevPt = currPt;
        }
        return longestSide;
    }

    public double getLargestX(Shape s) {
        double largestX = -1000.0;        
        for(Point currPt : s.getPoints()){
            double currX = currPt.getX();
            if(currX > largestX){
               largestX = currX;
            }
        }
        return largestX;
    }

    public double getLargestPerimeterMultipleFiles() {
        DirectoryResource dr = new DirectoryResource();
        double largestPerim = 0.0;
        perimeterRunnerAssignment pr = new perimeterRunnerAssignment();
        for (File f : dr.selectedFiles()) {
            FileResource fr = new FileResource(f);
            Shape s = new Shape(fr);
            double eachPerim = pr.getPerimeter(s);
            if(eachPerim > largestPerim){
                largestPerim = eachPerim;
            }
        }
        return largestPerim;
    }

    public String getFileWithLargestPerimeter() {
        DirectoryResource dr = new DirectoryResource();
        double largestPerim = 0.0;
        File thisFile = null;
        perimeterRunnerAssignment pr = new perimeterRunnerAssignment();
        for (File f : dr.selectedFiles()){
            FileResource fr = new FileResource(f);
            Shape s = new Shape(fr);
            double eachPerim = pr.getPerimeter(s);
            if(eachPerim > largestPerim){
                largestPerim = eachPerim;
                thisFile = f;
            }
        }
        File temp = thisFile;    // replace this code
        return temp.getName();
    }

    public void testPerimeterMultipleFiles() {
        double largestPerim = getLargestPerimeterMultipleFiles();
        System.out.println("largest perimeter among shapes = " + largestPerim);
    }

    public void testFileWithLargestPerimeter() {
        String fileWithLargestPerim = getFileWithLargestPerimeter();
        System.out.println("file with largest perimeter = " + fileWithLargestPerim);
    }

    // This method creates a triangle that you can use to test your other methods
    public void triangle(){
        Shape triangle = new Shape();
        triangle.addPoint(new Point(0,0));
        triangle.addPoint(new Point(6,0));
        triangle.addPoint(new Point(3,6));
        for (Point p : triangle.getPoints()){
            System.out.println(p);
        }
        perimeterRunnerAssignment pr = new perimeterRunnerAssignment();
        double peri = pr.getPerimeter(triangle);
        System.out.println("perimeter = "+peri);
    }

    // This method prints names of all files in a chosen folder that you can use to test your other methods
    public void printFileNames() {
        DirectoryResource dr = new DirectoryResource();
        for (File f : dr.selectedFiles()) {
            System.out.println(f);
        }
    }

    public static void main (String[] args) {
        perimeterRunnerAssignment pr = new perimeterRunnerAssignment();
        pr.testPerimeter();
    }
}
