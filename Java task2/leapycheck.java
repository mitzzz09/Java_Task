/*7. Write a Java program to find the number of days in a month.
Test Data
Input a month number: 2
Input a year: 2016

Expected Output :
February 2016 has 29 days */

import java.util.Scanner;
public class leapycheck{
    public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      String mname= " ";
      String res = " ";
      int no_of_days=0;
      System.out.print("Enter a month number: ");
      int month= s.nextInt();
      System.out.print("Enter the year: ");
      int year = s.nextInt();

      //month check
      switch(month){
        case 1:
        {
            mname ="January";
            no_of_days=31;
            break;
        }

        case 2:
        {
            mname="February";
            no_of_days=28;
            break;
        }

        case 3:
        {
            mname= "March";
            no_of_days=31;
            break;
        }

        case 4:
        {
            mname="April";
            no_of_days=30;
            break;
        }

        case 5:
        {
            mname= "May";
            no_of_days=31;
            break;
        }

        case 6:
        {
            mname= "June";
            no_of_days=30;
            break;
        }

        case 7:
        {
            mname= "July";
            no_of_days=31;
            break;
        }

        case 8:
        {
            mname= "August";
            no_of_days=31;
            break;
        }

        case 9:
        {
            mname= "September";
            no_of_days=30;
            break;
        }

        case 10:
        {
            mname= "October";
            no_of_days=31;
            break;
        }

        case 11:
        {
            mname= "November";
            no_of_days=30;
            break;
        }

        case 12:
        {
            mname="December";
            no_of_days=31;
            break;
        }

        default:
        {
            mname="Wrong number";
            break;
        }
      }

      //leap year check
      if(year%4==0 && year%4==0){
        res= "y";
      }
      else{
        res = "n";
      }


    if(res.equals("y")){
        if(month==2){
            no_of_days=29;
        }
    }

    System.out.print(mname+" "+year+" has "+no_of_days+" days");
    s.close();
        
    }
}