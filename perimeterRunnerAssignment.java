package perimeter_quiz;
import edu.duke.*;
import java.io.File;

/**
 * Getting the total perimeters(the sum of all perimeter distances) of the shape.
 * 
 * @author (Ashley Junghee Koo) 
 * @version (Oct. 8th, 2017)
 */
public class perimeterRunnerAssignment {
public double getPerimeter (Shape s) {
        // Start with totalPerim = 0
        double totalPerim = 0.0;
        // Start wth prevPt = the last point 
        Point prevPt = s.getLastPoint();
        // For each point currPt in the shape,
        for (Point currPt : s.getPoints()) {
            // Find distance from prevPt point to currPt 
            double currDist = prevPt.distance(currPt);
            // Update totalPerim by currDist
            totalPerim = totalPerim + currDist;
            // Update prevPt to be currPt
            prevPt = currPt;
        }
        // totalPerim is the answer
        return totalPerim;
    }

    public void testPerimeter () {
        FileResource fr = new FileResource();
        Shape s = new Shape(fr);
        double length = getPerimeter(s);
        PerimeterAssignmentRunner pr = new PerimeterAssignmentRunner();
        int points = pr.getNumPoints(s);
        double longestSide = pr.getLargestSide(s);
        double largestX = pr.getLargestX(s);
        double avgLength = pr.getAverageLength(s);
        System.out.println("perimeter = " + length);
        System.out.println("number of points = " + points);
        System.out.println("longest side = " + longestSide);
        System.out.println("largest X = " + largestX);
        System.out.println("avgLength = " + avgLength);
    }

    public static void main (String[] args) {
        perimeterRunnerAssignment pr = new perimeterRunnerAssignment();
        pr.testPerimeter();
    }
}
