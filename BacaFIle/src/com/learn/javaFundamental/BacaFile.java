package com.learn.javaFundamental;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BacaFile {

    public static void main(String[] args) throws IOException {
        String fileLocation = "src/com/learn/javaFundamental/resources/names.csv";
        FileReader fileReader = new FileReader(fileLocation);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String data = bufferedReader.readLine();
        data = bufferedReader.readLine(); // untuk mengabaikan header nya

        System.out.println("+---------------------------------+");
        while (data != null){
            String[] siswa = data.split(",");
            System.out.println("| NISN  : " + siswa[0]);
            System.out.println("| Nama  : " + siswa[1]);
            System.out.println("| Email : " + siswa[2]);
            System.out.println();

            data = bufferedReader.readLine();
        }
        System.out.println("+---------------------------------+");
        bufferedReader.close();
    }
}
