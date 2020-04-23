package com.learn.javaFundamental;

import java.io.*;

public class TulisFile {
    public static void main(String[] args) throws IOException {
        String outputSource = "src/com/learn/javaFundamental/resources/names2.csv";

        FileWriter fileWriter = new FileWriter(outputSource);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Masukkan apa yg ingin kamu tulis : (tulis EXIT untuk mengahiri) : ");

        String data;
        while((data = bufferedReader.readLine()) != null){
            if("exit".equalsIgnoreCase(data)){
                break;
            }
            fileWriter.write(data);
            fileWriter.write("\r\n");
        }
        fileWriter.close();


        // tampilkan datanya

        System.out.println("saatnya menampilkan data : ");
        FileReader fileReader = new FileReader("src/com/learn/javaFundamental/resources/names2.csv");
        BufferedReader bufferedReaderOutput = new BufferedReader(fileReader);
        String dataOutput = bufferedReader.readLine();
        while (dataOutput != null){
            System.out.println(dataOutput);
            dataOutput = bufferedReaderOutput.readLine();
        }
        bufferedReaderOutput.close();
    }
}
