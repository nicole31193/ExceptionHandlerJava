package problem_2_Exception_Handler;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExceptionHandler {
    public static void main(String[] args) {
        try (Scanner console = new Scanner(System.in)) {
			System.out.print("Enter the input filename: ");
			String filename = console.nextLine();

			int sum = 0;
			int count = 0;

			try {
			    Scanner input = new Scanner(new File(filename));

			    while (input.hasNext()) {
			        try {
			            int number = Integer.parseInt(input.next());
			            sum += number;
			            count++;
			        } catch (NumberFormatException e) {
			            System.out.println("Invalid input detected and skipped.");
			        }
			    }

			    input.close();

			    if (count > 0) {
			        System.out.println("Average = " + (double) sum / count);
			    } else {
			        System.out.println("No valid integers to average.");
			    }

			} catch (FileNotFoundException e) {
			    System.out.println("File not found: " + filename);
			}
		}
    }
}
