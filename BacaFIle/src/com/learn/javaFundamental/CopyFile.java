package com.learn.javaFundamental;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFile {
    public static void main(String[] args) throws IOException {
        String from = "src/com/learn/javaFundamental/resources/explore/explore1.csv";
        String to = "src/com/learn/javaFundamental/resources/toData.csv";

        FileReader fileReader = new FileReader(from);
        FileWriter fileWriter = new FileWriter(to);

        int data;
        while((data = fileReader.read())!= -1){
            fileWriter.write(data);
            fileWriter.flush();
        }

        fileReader.close();
        fileWriter.close();

        System.out.println("COPY FILE SUCCESSED");
    }
}
