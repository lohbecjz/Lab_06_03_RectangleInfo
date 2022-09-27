/**
 * @author lohbecjz@mail.uc.edu
 */

import java.util.Scanner;

public class Lab_06_03_RectangleInfo
{
    public static void main(String[] args)
    {
        // Declare Variables
        double rectangleLength = 0;
        double rectangleWidth = 0;
        double rectangleArea = 0;
        double rectanglePerimeter = 0;
        double rectangleDiagonal = 0;
        String trash = "";
        Scanner in = new Scanner(System.in);

        // Prompt and input
        System.out.print("Enter the length of the rectangle: ");
        if(in.hasNextDouble())
        {
            rectangleLength = in.nextDouble();
            in.nextLine(); // clear the buffer
        }
        else
        {
            trash = in.nextLine();
            System.out.println(trash + " is not a valid number.");
            System.exit(0); // terminate the program
        }

        System.out.print("Enter the width of the rectangle: ");
        if(in.hasNextDouble())
        {
            rectangleWidth = in.nextDouble();
            in.nextLine(); // clear the buffer
        }
        else
        {
            trash = in.nextLine();
            System.out.println(trash + " is not a valid number.");
            System.exit(0); // terminate the program
        }

        // Process and output
        rectangleArea = rectangleLength * rectangleWidth;
        rectanglePerimeter = (2 * rectangleLength) + (2 * rectangleWidth);
        rectangleDiagonal = Math.sqrt(Math.pow(rectangleLength, 2) + Math.pow(rectangleWidth, 2));

        System.out.println("The area of the rectangle is: " + rectangleArea);
        System.out.println("The perimeter of the rectangle is: " + rectanglePerimeter);
        System.out.printf("The length of the diagonal is : %.2f", rectangleDiagonal);

    }
}