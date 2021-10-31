package com.bridgelabz.linecomparision;

import java.util.Scanner;

public class line_compare {
    public static void main(String[] args) {
        //taking variables for co-ordinates of line 1

        int x1, x2, y1, y2;

        //taking user inputs for co-ordinates of line 1
        Scanner input = new Scanner(System.in);

        System.out.println("Enter coordinate of line-1\n" +
                "Enter x1 point");
        x1 = input.nextInt();
        System.out.println("Enter x2 point");
        x2 = input.nextInt();
        System.out.println("Enter y1 point");
        y1 = input.nextInt();
        System.out.println("Enter y2 point");
        y2 = input.nextInt();

        //computing length of line 1
        double length1 = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));

        //taking variables for co-ordinates of line 2
        int x3, x4, y3, y4;

        //taking user inputs for co-ordinates of line 2
        Scanner input2 = new Scanner(System.in);

        System.out.println("Enter coordinate of line-2\n" +
                "Enter x3 point");
        x3 = input2.nextInt();
        System.out.println("Enter x4 point");
        x4 = input2.nextInt();
        System.out.println("Enter y3 point");
        y3 = input2.nextInt();
        System.out.println("Enter y4 point");
        y4 = input2.nextInt();

        //computing length of line 2
        double length2 = Math.sqrt((x4 - x3) * (x4 - x3) + (y4 - y3) * (y4 - y3));

        //printing the lengths
        System.out.println("Length of line-1 " + "(" + x1 + "," + y1 + "),(" + x2 + "," + y2 + ") = " + length1);
        System.out.println("Length of line-2 " + "(" + x3 + "," + y3 + "),(" + x4 + "," + y4 + ") = " + length2);

        //comparing the lengths of lines
        if (length1 == length2) {
            System.out.println("The given lines are eual");
        } else {
            System.out.println("The given lines are not equal");
        }


    }
}
