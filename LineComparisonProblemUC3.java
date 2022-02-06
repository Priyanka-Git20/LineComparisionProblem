package com.linecomparison;

import java.util.Scanner;

public class LineComparisonProblemUC3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Co-ordinates of first line
        System.out.print("Enter x1 co-ordinate of first point: ");
        int x1 = sc.nextInt();
        System.out.print("Enter y1 co-ordinate of first point: ");
        int y1 = sc.nextInt();
        System.out.print("Enter x2 co-ordinate of second point: ");
        int x2 = sc.nextInt();
        System.out.print("Enter y2 co-ordinate of second point: ");
        int y2 = sc.nextInt();

        //Computation
        Double Length_of_line1 = Math.sqrt((x2 - x1)^2 + (y2 - y1)^2);
        System.out.println("length of line is:" +Length_of_line1 );

        //Co-ordinates of second  line
        System.out.print("Enter x3 co-ordinate of first point: ");
        int x3 = sc.nextInt();
        System.out.print("Enter y3 co-ordinate of first point: ");
        int y3 = sc.nextInt();
        System.out.print("Enter x4 co-ordinate of second point: ");
        int x4 = sc.nextInt();
        System.out.print("Enter y4 co-ordinate of second point: ");
        int y4 = sc.nextInt();

        //Computation
        Double Length_of_line2 = Math.sqrt((x4 - x3)^2 + (y4 - y3)^2);
        System.out.println("length of line is:" +Length_of_line2 );
        int value = Length_of_line1.compareTo(Length_of_line2);
        if (value < 0)
        {
            System.out.println("Length of line1 is less than length of line2.");
        }
        else if(value > 0)
        {
            System.out.println("Length of line1 is greater than length of line2.");
        }
        else
        {
            System.out.println("Both the lines are equal.");
        }

    }
}
