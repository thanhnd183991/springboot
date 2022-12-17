package com.example.be;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.Normalizer;
import java.util.Scanner;
import java.util.regex.Pattern;

import static org.junit.jupiter.api.Assertions.*;

class CodeTest {
     String convert(String s) {
         String temp = Normalizer.normalize(s, Normalizer.Form.NFD);
         Pattern pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
         return pattern.matcher(temp)
                                    .replaceAll("")
                                    .replace("đ", "d")
                                    .replace('Đ','D')
                                    .replaceAll("[^a-zA-Z0-9\\s_]", "-");
     }


    @Test
    void test(){
        try {
            File myObj = new File("/home/thanh/Documents/Viettel/fakestring.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                if(data != null && !data.equals("")){
                    System.out.println(data + " \n=====> convert <========\n " + convert(data));
                }
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

}