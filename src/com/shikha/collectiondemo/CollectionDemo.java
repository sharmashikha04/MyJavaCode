package com.shikha.collectiondemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class CollectionDemo {

    public static void main(String[] args) {

        List<Integer> l = new ArrayList();

        l.add(1);
        l.add(2);

        Iterator itr=l.iterator();

        while (itr.hasNext()){

            System.out.println(itr.next());
        }

        System.out.println(l.remove(1));


        l=new LinkedList<>();

        l.add(1);
        l.add(2);

         itr=l.iterator();

        while (itr.hasNext())
        {

            System.out.println(itr.next());
        }

        System.out.println(l.remove(0));

    }

}
