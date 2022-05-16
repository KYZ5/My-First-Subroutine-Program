/*
 * Stella Castura
 * 5/13/2022
 * mathSubroutines.java
 * A program that performs 5 math functions in subroutines
 */
package math.subroutines;
import java.util.Scanner;
/**
 *
 * @author stcas7054
 */
public class MathSubroutines {

    /**
     * @param x
     * //@param args the command line arguments
     */
    public static void isItAPrime(double x)
    {
        boolean prime = true;
        double i = x - 1;
        if (x==1)
        {
            prime = true;
        } 
        if (x < 0)
        {
        while (i < x && prime == true)
        {
            if ((x / i)==((int) x - i))
            {
                prime = false;
            }
            i--;
        }
        }
        else
        {
            i += 2;
            if ((x / i)==((int) x - i))
            {
                prime = false;
            }
            i++;
        }
        if (prime == true)
        {
            System.out.println("The number is a prime");
        }
        else
        {
            System.out.println("The number is not a prime");
        }
    }
    public static void angle(int x, int y)
    {
        System.out.println("The missing angle is " + (180 - x - y) + " degrees");
    }
    public static void sphere(double r)
    {
        System.out.println("The volume of the sphere is " + ((4/3*Math.PI)*r*r*r) + " cm cubed");
    }
    public static void cube (double l)
    {
        System.out.println("The volume of the cube is " + (l*l*l) + " cm cubed");
    }
    public static void root(double x)
    {
        System.out.println("The square root of the number is " + (Math.pow(x, 0.5)));
    }
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Please enter the number corresponding to the function you would like to perform");
        System.out.println("1 - Determine if a number is a prime");
        System.out.println("2 - Find the missing angle in a triangle");
        System.out.println("3 - Find the volume of a sphere");
        System.out.println("4 - Find the volume of a cube");
        System.out.println("5 - Find the square root of a number");
        int choice = scan.nextInt();
        
        switch (choice) {
            case 1:
                System.out.println("You have chosen to determine if a number is a prime");
                System.out.println("Please enter your number");
                int num = scan.nextInt();
                isItAPrime(num);
                break;
            case 2:
                System.out.println("You have chosen to find the missing angle in a triangle");
                System.out.println("Please enter the two known angles as integer values");
                int x = scan.nextInt();
                int y = scan.nextInt();
                angle(x,y);
                break;
            case 3:
                System.out.println("You have chosen to find the volume of a sphere");
                System.out.println("Please enter the radius of the sphere in cm");
                double rad = scan.nextDouble();
                sphere(rad);
                break;
            case 4:
                System.out.println("You have chosen to find the volume of a cube");
                System.out.println("Please enter the side length of the cube in cm");
                double l = scan.nextDouble();
                cube(l);
                break;
            default:
                System.out.println("You have chosen to find the square root of a number");
                System.out.println("Please enter the number you want the square root of");
                int n = scan.nextInt();
                root(n);
                break;
        }
        
        
    }
    
}
