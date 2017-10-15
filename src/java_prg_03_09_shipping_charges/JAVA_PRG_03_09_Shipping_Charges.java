/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_prg_03_09_shipping_charges;

import javax.swing.JOptionPane;
/**
 *
 * @author bluebackdev
 * The Fast Freight Shipping Company charges the following rates:
 * 
 *      Weight of Package                           Rate per 500 Miles Shipped
 *      2 pounds or less                            $1.10
 *      Over 2 pounds but not more than 6 pounds    $2.20
 *      Over 6 pounds but not more than 10 pounds   $3.70
 *      Over 10 pounds                              $3.80
 * 
 * The shipping charges per 500 miles are not prorated. For example, if a
 * 2-pound package is shipped 550 miles, the charges would be $2.20. Write a
 * program that asks the user to enter the weight of a package and then
 * displays the shipping charges.
 * 
 * NOTE: I assume that this prompt forgot to mention getting user input on
 * distance to ship so I will be adding this to the code
 */
public class JAVA_PRG_03_09_Shipping_Charges {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declare static floats for package weight comparisons
        final float FLT_PACKAGE_WEIGHT_1 = 2.0f;
        final float FLT_PACKAGE_WEIGHT_2 = 6.0f;
        final float FLT_PACKAGE_WEIGHT_3 = 10.0f;
        
        // Declare static floats for shipping rates
        final float FLT_PACKAGE_RATE_1 = 1.1f;
        final float FLT_PACKAGE_RATE_2 = 2.2f;
        final float FLT_PACKAGE_RATE_3 = 3.7f;
        final float FLT_PACKAGE_RATE_4 = 3.8f;
        
        // Declare 500 miles constant as float to round to nearest number
        // Will add 1 to all shipping calculations to account for lack
        // of prorating
        final float FLT_DISTANCE_PER_RATE = 500;
        
        // Decalare user input of distance and package weight
        // and calculated total
        float fltUserDistance;
        float fltUserWeight;
        float fltCalculatedCost;
        
        // Declare strings to get user inputs and for output
        String strUserDistance;
        String strUserWeight;
        String strOutputMessage;
        
        // Declare int to hold shipping distance multiplier
        // intDistanceMultiplier = fltUserDistance / INT_DISTANCE_PER_RATE + 1
        // +1 to account for lost precision
        float fltDistanceMultiplier;
        
        // Prompt user and get inputs for distance and weight
        strUserDistance = JOptionPane.showInputDialog("Please enter the " +
                "distance\nyou are shipping your package.");
        strUserWeight = JOptionPane.showInputDialog("Please enter the " +
                "weight\nof the package you are shipping.");
        
        // Convert strings to float values
        fltUserDistance = Float.parseFloat(strUserDistance);
        fltUserWeight = Float.parseFloat(strUserWeight);
        
        if(fltUserWeight > 0 && fltUserWeight <= FLT_PACKAGE_WEIGHT_1)
        {
            fltDistanceMultiplier = fltUserDistance / FLT_DISTANCE_PER_RATE;
            // Calculate if distance is a multiple of 500, if whole number result,
            // then fltDistanceMultiplier is a multiple of 500 and no need to round
            // up to nearest whole number b/c no prorating
            if(fltDistanceMultiplier % 1 != 0)
            {
                fltDistanceMultiplier = (int)fltDistanceMultiplier + 1;
            }
            else if(fltDistanceMultiplier % 1 == 0)
            {
                fltDistanceMultiplier = (int)fltDistanceMultiplier;
            }
            else
            {
                JOptionPane.showMessageDialog(null, "ERROR CALCULATING " +
                        "DISTANCE MULTIPLIER");
            }
            fltCalculatedCost = fltDistanceMultiplier * FLT_PACKAGE_RATE_1;
        }
        else if(fltUserWeight > FLT_PACKAGE_WEIGHT_1 && fltUserWeight <= FLT_PACKAGE_WEIGHT_2)
        {
            fltDistanceMultiplier = fltUserDistance / FLT_DISTANCE_PER_RATE;
            // Calculate if distance is a multiple of 500, if whole number result,
            // then fltDistanceMultiplier is a multiple of 500 and no need to round
            // up to nearest whole number b/c no prorating
            if(fltDistanceMultiplier % 1 != 0)
            {
                fltDistanceMultiplier = (int)fltDistanceMultiplier + 1;
            }
            else if(fltDistanceMultiplier % 1 == 0)
            {
                fltDistanceMultiplier = (int)fltDistanceMultiplier;
            }
            else
            {
                JOptionPane.showMessageDialog(null, "ERROR CALCULATING " +
                        "DISTANCE MULTIPLIER");
            }
            fltCalculatedCost = fltDistanceMultiplier * FLT_PACKAGE_RATE_2;
        }
        else if(fltUserWeight > FLT_PACKAGE_WEIGHT_2 && fltUserWeight <= FLT_PACKAGE_WEIGHT_3)
        {
            fltDistanceMultiplier = fltUserDistance / FLT_DISTANCE_PER_RATE;
            // Calculate if distance is a multiple of 500, if whole number result,
            // then fltDistanceMultiplier is a multiple of 500 and no need to round
            // up to nearest whole number b/c no prorating
            if(fltDistanceMultiplier % 1 != 0)
            {
                fltDistanceMultiplier = (int)fltDistanceMultiplier + 1;
            }
            else if(fltDistanceMultiplier % 1 == 0)
            {
                fltDistanceMultiplier = (int)fltDistanceMultiplier;
            }
            else
            {
                JOptionPane.showMessageDialog(null, "ERROR CALCULATING " +
                        "DISTANCE MULTIPLIER");
            }
            fltCalculatedCost = fltDistanceMultiplier * FLT_PACKAGE_RATE_3;
        }
        else if(fltUserWeight > FLT_PACKAGE_WEIGHT_3)
        {
            fltDistanceMultiplier = fltUserDistance / FLT_DISTANCE_PER_RATE;
            // Calculate if distance is a multiple of 500, if whole number result,
            // then fltDistanceMultiplier is a multiple of 500 and no need to round
            // up to nearest whole number b/c no prorating
            if(fltDistanceMultiplier % 1 != 0)
            {
                fltDistanceMultiplier = (int)fltDistanceMultiplier + 1;
            }
            else if(fltDistanceMultiplier % 1 == 0)
            {
                fltDistanceMultiplier = (int)fltDistanceMultiplier;
            }
            else
            {
                JOptionPane.showMessageDialog(null, "ERROR CALCULATING " +
                        "DISTANCE MULTIPLIER");
            }
            fltCalculatedCost = fltDistanceMultiplier * FLT_PACKAGE_RATE_4;
        }
        else
        {
            JOptionPane.showMessageDialog(null, "ERROR CALCULATING " +
                    "PACKAGE SHIPPING COST");
            fltCalculatedCost = 0.0f;
        }
        
        // Format fltCalculated cost for dollar output
        strOutputMessage = String.format("The total calculated cost is: $%,.2f",
                fltCalculatedCost);
        
        // Error catch, in case something went really really wrong
        if(fltCalculatedCost != 0.0f)
        {
            JOptionPane.showMessageDialog(null, strOutputMessage);
        }
        else
        {
            JOptionPane.showMessageDialog(null, "ERROR CALCULATING SHIPPING COST");
        }
        
        // For JOptionPane
        System.exit(0);
    }
    
}
