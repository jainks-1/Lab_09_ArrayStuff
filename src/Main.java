 // Kaden Jain 3/14/2025

import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Random rand = new Random();

        int[] dataPoints = new int[100];

        // fill each element in the data array with a random number
        for (int i = 0; i < dataPoints.length; i++) {
            dataPoints[i] = rand.nextInt(100) + 1;
        }

        // print the array
        for(int i = 0; i < dataPoints.length; i++) {
            System.out.print(dataPoints[i] + " | ");
        }
        System.out.println("\n");

        // loop to calculate sum and average of values
        int sum = 0;
        double average = 0.0;
        for(int i = 0; i < dataPoints.length; i++){
            sum = sum + dataPoints[i];
        }
        average =  (double)sum/dataPoints.length;

        System.out.println("The average of the array is: " + average);
        System.out.println("The sum of the numbers is: " + sum);
        System.out.println();

        // prompt and input an int value between 1 and 100 from the user
        int userNum = 0;
        userNum = SafeInput.getRangedInt(in, "Please enter an integer: ", 1, 100);

        // find all userNum instances in array
        int count = 0;
        for (int num : dataPoints) {
            if (num == userNum) {
                count++;
            }
        }
        // Show result
        if (count > 0) {
            System.out.println("The number " + userNum + " was found " + count + " times in the array.");
        } else {
            System.out.println("The number " + userNum + " was not found in the array.");
        }

        // prompt and input an int value between 1 and 100 from the user
        int secondUserNum = 0;
        secondUserNum = SafeInput.getRangedInt(in, "\nPlease enter another integer: ", 1, 100);

        // find the first occurrence of secondUserNum in array
        int position = -1; // Default to not found
        for (int i = 0; i < dataPoints.length; i++) {
            if (dataPoints[i] == secondUserNum) {
                position = i; // Store the index where  value is found
                break; // Exit loop when value found
            }
        }
        // Show result
        if (position != -1) {
            System.out.println("The value " + secondUserNum + " was found at array index " + position + ".");
        } else {
            System.out.println("The value " + secondUserNum + " was not found in the array.");
        }

        // Initialize min and max with using first element
        int min = dataPoints[0];
        int max = dataPoints[0];

        // Loop to find min and max
        for (int i = 1; i < dataPoints.length; i++) {
            if (dataPoints[i] < min) {
                min = dataPoints[i]; // Updates min if a smaller value is found
            }
            if (dataPoints[i] > max) {
                max = dataPoints[i]; // Updates max if a larger value is found
            }
        }
        // Show results
        System.out.println("\nThe minimum value in the array is: " + min);
        System.out.println("The maximum value in the array is: " + max);

        System.out.println("\nAverage of the dataPoints array is: " + getAverage(dataPoints));

    }

    public static double getAverage(int values[])
    {
        int sum = 0;
        for(int i = 0; i < values.length; i++){
            sum = sum + values[i];
            // System.out.println(sum); shows each iteration of the sum for debugging
        }
        return (double)sum/values.length; // use (double) because dividing int by an int
    }

}