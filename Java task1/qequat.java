/*2. Write a Java program to solve quadratic equations (use if, else if and else).
Test Data
Input a: 1
Input b: 5
Input c: 1
Expected Output :
The roots are -0.20871215252208009 and -4.7912878474779195 */

import java.util.Scanner;
import java.lang.Math;
public class qequat{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the value of 'a': ");
        double a= s.nextDouble();
        System.out.print("Enter the value of 'b': ");
        double b = s.nextDouble();
        System.out.print("Enter the value of 'c': ");
        double c = s.nextDouble();
        double d = (b*b)-4*a*c; //discriminant

        double x1= (-b+(Math.sqrt(d)))/(2*a);
        double x2= (-b-(Math.sqrt(d)))/(2*a);
        if(d>0.0){
            System.out.print("It has real and unequal roots!"+" The roots are: "+x1+"and "+x2);
        }
        else if(d==0.0){
            System.out.print("Both the roots are equal."+"The roots is: "+x1);
        }
        else{
            System.out.print("It has unequal and imaginary roots!! Do you want the roots to be displayed? (Y/N): ");
            String res = s.next().toUpperCase();
            if(res.equals("Y")){
                double real_part = -b/2*a;
                double imaginary_part= (Math.sqrt(-d))/2*a;
                System.out.println("The 1st root is: "+real_part+"+"+imaginary_part);
                System.out.println("The 2nd root is: "+real_part+"-"+imaginary_part);
            }
            else if(res.equals("N")){
                System.exit(0);
            }
            else
            {
                System.out.println("Wrong choice! Please enter 'Y' or 'N' ");
            }
        }
        s.close();
    }
}