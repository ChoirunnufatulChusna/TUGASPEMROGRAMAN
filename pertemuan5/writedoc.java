/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;

/**
 *
 * @author acer
 */
public class writedoc {
   
    
    public static void main(String[] args) throws FileNotFoundException, IOException{
       
        String teks = "UNU BLITAR";
        String outDocEn = "D://com.doc";
        XWPFDocument document = new XWPFDocument();
        FileOutputStream out = new FileOutputStream(new File(outDocEn));
        XWPFParagraph paragraph = document.createParagraph();
        XWPFRun run = paragraph.createRun();
        run.setText(teks);
        document.write(out);
        out.close();
        System.out.println("Generate DOC sukses");
        
    }

    }

    

