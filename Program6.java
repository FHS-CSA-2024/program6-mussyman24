//import stuff here!
import java.util.Scanner;

//Your code here
public class Program6 {
    public static void main(String[] args) {
        final double pi = 3.14159;
        double radius = 0;
        System.out.println("Enter the radius: ");
        Scanner radScanner = new Scanner(System.in);
        radius = radScanner.nextDouble() ;
        double diameter = 2*radius;
        double area = pi * radius * radius;
        double circumference = pi * diameter;
        System.out.println("The diameter is: " + diameter );
        System.out.println("The area is: " + Math.round(1000 *area) / 1000.0 );
        System.out.println("The circumference is: " + Math.round(1000*circumference)/1000.0);


    }
}
//Paste console output below:
/*
 * Enter the radius: 
3.712
The diameter is: 7.424
The area is: 43.288
The circumference is: 23.323

 * 
 */
