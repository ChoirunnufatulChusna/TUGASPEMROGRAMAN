/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author acer
 */
public class txtfilee {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        String fileName = "D://input.txt";
        String baris = null;
        
        FileReader fileReaderjoss
                = new FileReader(fileName);
        
        BufferedReader bufferedReader
                = new BufferedReader(fileReaderjoss);
        
        while ((baris = bufferedReader.readLine()) != null) {
            System.out.println(baris);
        }
        bufferedReader.close();
    }
    
}
