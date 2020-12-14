package com.company.Assignment3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CSVReader {
    private final File file;
    private Scanner in;

    public CSVReader(String file) {
        this.file = new File(file);
    }
    public int numberOfRows() {
        int rowCount = 0;
        try {
            in = new Scanner(this.file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        while (in.hasNextLine()) {
            rowCount++;
            in.nextLine();
        }
        in.close();
        return rowCount;
    }
    public int numberOfFields(int row) {
        String line = null;
        try {
            in = new Scanner(this.file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < row; i++) {
            if (in.hasNextLine())
                line = in.nextLine();
        }
        in.close();
        return (line.split(",(?=(?:[^\\\"]*\\\"[^\\\"]*\\\")*[^\\\"]*$)", -1)).length;//split all the values by comma
    }

    public String field(int row, int column) {
        String line = null;
        try {
            in = new Scanner(this.file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        for (int i = 0; i <= row; i++) {
            if (in.hasNextLine())
                line = in.nextLine();
        }

        in.close();

        String[] s = (line.split(",(?=(?:[^\\\"]*\\\"[^\\\"]*\\\")*[^\\\"]*$)", -1));
        return s[column];
    }
}
