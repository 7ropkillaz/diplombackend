package com.example.demo.service;

import com.example.demo.entity.PacientDto;
import org.springframework.stereotype.Service;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

@Service
public class XlsService {


    private String filename = "C:\\Users\\kusai\\Documents\\diagnoses.csv";


    public void createXls(Map<String, String> inputMap) {

        try {

            File fileTwo=new File(filename);
            FileOutputStream fos=new FileOutputStream(fileTwo);
            PrintWriter pw=new PrintWriter(fos);

            for(Map.Entry<String,String> m :inputMap.entrySet()){
                pw.println(m.getKey()+" "+m.getValue());
            }

            pw.flush();
            pw.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
