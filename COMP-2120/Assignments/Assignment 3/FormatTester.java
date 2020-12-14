package com.company.Assignment3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FormatTester {
    public static void main(String[] args) {
        // defining file names. make sure you have saved the Numbers.txt file in
        // the project directory
        String inputFile = "Numbers.txt";
        String outputFile = "FormattedNumbers.txt";
        try {
            // opening input file
            Scanner scanner = new Scanner(new File(inputFile));
            // opening output file writer
            PrintWriter writer = new PrintWriter(new File(outputFile));
            String text = "";
            // reading all text from input file to a variable
            while (scanner.hasNext()) {
                text += scanner.nextLine() + " ";
            }
            // splitting by white space to create an array of numbers in String
            // format
            String[] numbersText = text.split(" ");
            // defining an integer array and converting each and every number in
            // String format to integer format. Assuming the file is in valid
            // format
            int[] numbers = new int[numbersText.length];
            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = Integer.parseInt(numbersText[i]);
            }
            // creating a DefaultFormatter object
            NumberFormatter formatter = new DefaultFormatter();
            writer.print("Default format: ");
            // looping through the numbers, formatting them, writing to output
            // file
            for (int i = 0; i < numbers.length; i++) {
                writer.append(formatter.format(numbers[i]) + " ");
            }
            writer.println();
            // re initializing formatter to be DecimalSeperatorFormatter
            formatter = new DecimalSeparatorFormatter();
            writer.print("Decimal format: ");
            // looping, formatting and writing formatted values to output file
            for (int i = 0; i < numbers.length; i++) {
                writer.append(formatter.format(numbers[i]) + " ");
            }
            writer.println();
            // re initializing formatter to be AccountingFormatter
            formatter = new AccountingFormatter();
            writer.print("Accounting format: ");
            for (int i = 0; i < numbers.length; i++) {
                writer.append(formatter.format(numbers[i]) + " ");
            }
            writer.println();
            // re initializing formatter to be BaseFormatter with base 8
            formatter = new BaseFormatter(8);
            writer.print("Base 8 format: ");
            for (int i = 0; i < numbers.length; i++) {
                writer.append(formatter.format(numbers[i]) + " ");
            }
            writer.println();
            // re initializing formatter to be BaseFormatter with base 2
            formatter = new BaseFormatter(2);
            writer.print("Base 2 format: ");
            for (int i = 0; i < numbers.length; i++) {
                writer.append(formatter.format(numbers[i]) + " ");
            }
            writer.println();
            writer.close();
            System.out.println("Output has been saved to " + outputFile);
        } catch (FileNotFoundException e) {
            //file not found, means you did not follow the instructions carefully
            System.out.println(e.getMessage());
            System.out.println("Make sure you have the file in "
                    + "root directory of your project. "
                    + "\nIf you are running program from commandline, "
                    + "make sure Numbers.txt file is in the same folder as this Java program exists");
        }
    }
}

