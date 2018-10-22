package com.shikha.myio.fileio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class MyFileIODemo {

    public static void main(String[] s)throws Exception{

        FileReader fr=new FileReader(new File("src/resources/myfile.txt"));

        BufferedReader br=new BufferedReader(fr);

        System.out.println((char)br.read());

        System.out.println((char)br.read());

    }
}
