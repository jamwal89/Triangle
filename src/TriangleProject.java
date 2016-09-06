import java.util.Scanner;
public class TriangleProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Enter the sides of the triangle \n");
		double a = scan.nextDouble();
		double b = scan.nextDouble();
		double c = scan.nextDouble();
		
		if (a==b && a==c)
			System.out.println("The triangle is equivalent");
			
			else
				System.out.println("The triangle is not eq triangle");
			
		
	
	}}
		

	


