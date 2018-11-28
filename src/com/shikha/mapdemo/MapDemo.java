package com.shikha.mapdemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapDemo {

    public static void main(String[] args) {

        Map<Integer,String> m=new HashMap<>();


      System.out.println(m.put(1,"Shikha"));
      System.out.println(m.put(2,"golu"));
      System.out.println(m.put(3,"tolu"));


        Iterator<Integer> keyItr=m.keySet().iterator();

        while (keyItr.hasNext()){
            System.out.println(keyItr.next());
        }


        Iterator itr=m.entrySet().iterator();

        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }


}
