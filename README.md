# shapePerimeterCalculator
# Calculating perimeters of the shapes that consist of the points that read from the files.
# Coding environment - BlueJ 4.1.1-Duke

<< This is a patch 1.0

<< package perimeter_quiz includes two classes: PerimeterAssignmentRunner, perimeterRunnerAssignment

<< public class perimeterRunnerAssignment
* public double getPerimeter (Shape s) <- method 01
  - from the file, it reads the points of the shape and create shape
  - calculate each distance(length of the line between points)
  - calculate the total perimeter of the shape by adding all line distances

* public void testPerimeter () <- method 02
  - from the file, it reads the points of the shape and create shape
  - print out 5 information of the shape that reads from the file: 
  1) perimeter of the shape
  2) number of points: triangle's number of points is 3
  3) longest length of the lines in a shape
  4) largest x point among all x points of the shape
  5) average length of the line length in a shape
  
* public static void main (String[] args) <- method 03
  - main method
  - create new class perimeterRunnerAssignment
  - call testPerimeter() method inside the class perimeterRunnerAssignment
  
<< public class PerimeterAssignmentRunner
* public int getNumPoints(shape s) <- method 01
  - calculate number of all points of the shape
  
* public double getAverageLength(Shape s) <- method 02
  - calculate the average line length of the shape
  
* public double getLargestSide(Shape s) <- method 03
  - find out the largest line length among all line lengths in the shape
  
* public double getLargestX(Shape s) <- method 04
  - find out the largest x point among all x points in the shape
  
* public double getLargestPerimeterMultipleFiles() <- method 05
  - find out the largest perimeter among all different shapes that read from multiple files
  
* public String getFileWithLargestPerimeter() <- method 06
  - find out the file that has the largest perimeter among all different shapes that read from multiple files
  
* public void testPerimeterMultipleFiles() <- method 07
  - print out the largest perimeter among all shapes
  
* public void testFileWithLargestPerimeter() <- method 08
  - print out the file with the largest perimeter among all shapes
  
* public void triangle() <- method 09
  - create triangle shpae
  - add three points
  - print out each point
  - create the class perimeterRunnerAssignment
  - call the getPerimeter inside the class perimeterRunnerAssignment
  - calculate the perimeter of the triangle
  - print out the perimeter of the triangle
  
* public void printFileNames() <- method 10
  - print out the names of all files in a chosen folder that I can use to test my other methods
  - create a new directory from directory resource
  - print each file from the selected files
  
* public static void main(String[] args) <- method 11
  - this is the main method
  - create new class perimeterRunnerAssignment
  - call testPerimeter() inside the class perimeterRunnerAssignment
  
