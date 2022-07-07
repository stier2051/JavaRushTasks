package com.javarush.task.task18.task1814;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* 
UnsupportedFileName
*/

public class TxtInputStream extends FileInputStream {

    public TxtInputStream(String fileName) throws IOException, UnsupportedFileNameException {
        super(fileName);
        int lastIndexOf = fileName.lastIndexOf(".") + 1;
        String ext = fileName.substring(lastIndexOf);
        if (!ext.equals("txt")) {
            super.close();
            throw new UnsupportedFileNameException();
        }
    }


    public static void main(String[] args) throws FileNotFoundException, UnsupportedFileNameException, IOException {
        String fName = "E:\\java_project\\files for tasks\\err.png";
        TxtInputStream inputStream = new TxtInputStream(fName);
    }
}

