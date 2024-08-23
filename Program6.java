//import stuff here!
import java.util.Scanner;

//Your code here
public class Program6 {
    public static void main(String[] args) {
        final double pi = 3.14159;
        double radius = 0;

        Scanner radScanner = new Scanner(System.in);
        radius = radScanner.nextDouble() ;
        double diameter = 2*radius;
        double area = pi * radius * radius;
        double circumference = pi * diameter;
        System.out.println("The area is: " + round(1000 *area) / 1000.0 );
        System.out.println("The circumference is: " + round(1000*circumference)/1000.0);
        
        
    }
}
//Paste console output below:
/*


*/
