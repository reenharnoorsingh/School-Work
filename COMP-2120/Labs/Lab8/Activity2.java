import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Activity2 {
        public String inputFileName, outputFileName, type, data;// To store the input file, output file name, type of
        // data in that file, and the oder of sorting
        public char order;

        public void readFromFile()// method to read data from file
        {
                String line;
                data = "";
                try (BufferedReader br = new BufferedReader(
                                new InputStreamReader(new FileInputStream(inputFileName)))) {
                        while ((line = br.readLine()) != null)// reading till end of file
                        {
                                data += line + "\n";// storing the data of file in "data"
                        }
                } catch (Exception e) {
                        System.out.println("Exception!!!!\n" + e);
                }
        }

        public void sorting() throws Exception {
                String[] values = data.split("\\n");// creating a string array from the values read from the file.
                PrintWriter writer = new PrintWriter(outputFileName);// for writing to the file
                if (data.startsWith("Integer"))// for integer data type
                {
                        ArrayList<Integer> list1 = new ArrayList<Integer>();// creating an ArrayList
                        for (int i = 0; i < values.length; i++) {
                                try {
                                        list1.add(Integer.parseInt(values[i])); // converting the strings to integer and
                                        // adding them in the ArrayList
                                } catch (Exception e) {
                                }
                        }
                        if (order == 'a')// sorting in ascending order
                                Collections.sort(list1);
                        else// sorting in descending order
                                Collections.sort(list1, Collections.reverseOrder());

                        writer.println("Integer, " + list1.size());

                        for (Integer a : list1) {
                                writer.println(a);
                        }

                } else if (data.startsWith("Float"))// for float data type
                {
                        ArrayList<Float> list1 = new ArrayList<Float>();
                        for (int i = 1; i < values.length; i++) {
                                try {
                                        list1.add(Float.parseFloat(values[i]));
                                } catch (Exception e) {
                                }
                        }
                        if (order == 'a')
                                Collections.sort(list1);
                        else
                                Collections.sort(list1, Collections.reverseOrder());

                        writer.println("Float, " + list1.size());

                        for (Float a : list1) {
                                writer.println(a);
                        }
                } else if (data.startsWith("Double"))// for double data type
                {
                        ArrayList<Double> list1 = new ArrayList<Double>();
                        for (int i = 1; i < values.length; i++) {
                                try {
                                        list1.add(Double.parseDouble(values[i]));
                                } catch (Exception e) {
                                }
                        }
                        if (order == 'a')
                                Collections.sort(list1);
                        else
                                Collections.sort(list1, Collections.reverseOrder());

                        writer.println("Double, " + list1.size());

                        for (Double a : list1) {
                                writer.println(a);
                        }
                } else// for everything else
                {
                        ArrayList<String> list1 = new ArrayList<String>();
                        for (int i = 1; i < values.length; i++) {
                                list1.add(values[i]);
                        }

                        if (order == 'a')
                                Collections.sort(list1);
                        else
                                Collections.sort(list1, Collections.reverseOrder());

                        writer.println(values[0] + ", " + list1.size());

                        for (String a : list1) {
                                writer.println(a);
                        }

                }

                writer.close();

        }
        public static void main(String[] args) throws Exception {
                Activity2 a2 = new Activity2();

                a2.inputFileName = args[0];
                a2.outputFileName = args[1];
                a2.order = args[2].charAt(0);

                a2.readFromFile();
                a2.sorting();
        }


}