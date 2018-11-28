package com.shikha.mythread;

public class DemoIRCTC {

    public static void main(String[] args) {

        IRCTC irctcOBJ_1=new IRCTC("SHIKHA...");
        IRCTC irctcOBJ_2=new IRCTC("KUNAL...");


        for (int i=0;i<100;i++){
            Thread t =new Thread(irctcOBJ_1);
            t.start();

            t =new Thread(irctcOBJ_2);
            t.start();
        }



    }
}
