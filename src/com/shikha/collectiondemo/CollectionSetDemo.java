package com.shikha.collectiondemo;

import java.util.*;

public class CollectionSetDemo {

    public static void main(String[] args) {

      /*  Set<Integer> hashset= new HashSet<>();

        System.out.println(hashset.add(10));
        System.out.println(hashset.add(10));*/

      Set<Integer> t=new TreeSet<>();

        t.add(10);
        t.add(11);

        Iterator itr=t.iterator();
      //  ListIterator litr=t.listIterator();

        while (itr.hasNext()){
            System.out.println(itr.next());
        }


     /*   Set<Student> s=new LinkedHashSet<>();

        Student sob1=new Student();     sob1.setName("kunal");  sob1.setRollno(1);
        Student sob2=sob1;//=new Student();     sob2.setName("kunal"); sob2.setRollno(1);

        System.out.println(s.add(sob1));
        System.out.println(s.add(sob2));*/




    }
}
