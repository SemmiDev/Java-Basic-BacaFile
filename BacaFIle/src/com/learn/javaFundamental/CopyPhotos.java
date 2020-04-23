package com.learn.javaFundamental;

import java.io.*;

public class CopyPhotos {
    public static void main(String[] args) throws IOException {
        // silahkan import terlebih dahulu foto2 ke dalam folder resources
        String from = "src/com/learn/javaFundamental/resources/lightroom.jpeg";
        String from2 = "src/com/learn/javaFundamental/resources/teman.jpeg";

        String to = "src/com/learn/javaFundamental/resources/explore/lightroom.jpeg";
        String to2 = "src/com/learn/javaFundamental/resources/explore/teman.jpeg";

        FileInputStream fileInputStream = new FileInputStream(from);
        FileInputStream fileInputStream2 = new FileInputStream(from2);

        FileOutputStream fileOutputStream = new FileOutputStream(to);
        FileOutputStream fileOutputStream2 = new FileOutputStream(to2);



        int data;
        while( (data = fileInputStream.read())!= -1){
            fileOutputStream.write(data);
            fileOutputStream.flush();
        }

        while( (data = fileInputStream2.read())!= -1){
            fileOutputStream2.write(data);
            fileOutputStream2.flush();
        }

        fileInputStream.close();
        fileOutputStream.close();

        fileInputStream2.close();
        fileOutputStream2.close();

        System.out.println("COPY PHOTOS SUCCESSED");
    }
}
