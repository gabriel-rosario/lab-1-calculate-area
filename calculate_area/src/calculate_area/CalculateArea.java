package calculate_area;
import java.awt.*;
import java.util.Scanner;

public class CalculateArea {


	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter radius of a circle: ");
		double radius = input.nextDouble();
		
		double area = Math.PI * Math.pow(radius, 2);
		
		System.out.println("The area of the circle of radius: " + radius + " is: "+ area);
		System.out.println("Half of the area is: " + area/2);
		
	}
}
