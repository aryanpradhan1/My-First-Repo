/**
 * Matthew S. and Aryan P.
 * 8/26/22
 * Mileage Program
 * Write a description where we are going to take some code notes
 * Who helped me:  
 */

import java.util.Scanner;
import java.text.NumberFormat;
/**
 * Write a description of class Mileage here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Mileage


{
     /**
     * main method
     * where we are going to code
     */
    public static void main(String[] args)
    {
        //Mileage Stuff
        
        Scanner scan = new Scanner (System.in);
        
        NumberFormat percent = NumberFormat.getPercentInstance();
        
        double OneWayDistance = 3;
        
        System.out.println ("How many days in total: ");
        double totalDays = scan.nextDouble();
        
        System.out.println ("How many work days: ");
        double workDays = scan.nextDouble();
        
        double workMiles = workDays * OneWayDistance * 2;
        
        System.out.println("Enter beginning mileage: ");
        double beginningMiles = scan.nextDouble();
        
        System.out.println ("Enter ending mileage: ");
        double endingMiles = scan.nextDouble();
        
        double milesTravelled = endingMiles - beginningMiles;
        double workFraction = workMiles / milesTravelled;
        double personalFraction = 1 - workFraction;
        
        System.out.printf("Personal fraction: %3s \n", percent.format(personalFraction));
        System.out.printf("Work fraction: %3s \n", percent.format(workFraction));
        
        // Calculate: workMiles = work days * one-way-distance * 2
        // Calculate: milesTravelled = ending miles - beginning miles
        // Calculate: workFraction = workMiles / milesTravelled
        // Calculate: personalFraction = 1 - workFraction
    }
}
