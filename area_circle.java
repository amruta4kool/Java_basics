package assignmentmdk;

import java.util.Scanner;

public class area_circle {

	public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Prompt user for radius
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        // Calculate area and circumference
        double area = Math.PI * radius * radius;
       
        // circle
        System.out.println("Area of the circle = " + area);
                    
        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();
        
        System.out.print("Enter the breadth of the rectangle: ");
        double breadth = scanner.nextDouble();

        double area1=length*breadth;
        System.out.println("Area of the rectangle = " + area1);
        
        //square
        System.out.print("Enter the side of the sqaure: ");
        double side = scanner.nextDouble();
        double area2=side*side;
        System.out.println("Area of the sqaure = " + area2);
        
        //triangle
        System.out.print("Enter the base of the triangle: ");
        double base = scanner.nextDouble();
        
        System.out.print("Enter the height of the triangle: ");
        double height = scanner.nextDouble();
        
        double area3=0.5*base*height;
        System.out.println("Area of the triangle = " + area3);
        
        
        scanner.close();
    }
	
}
