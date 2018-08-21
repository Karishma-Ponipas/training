package com.navis.generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
        public static void main(String args[]){
            //1. ref and instance are same
            Living l=new Living();
            Animal a=new Animal();
            Plant p=new Plant();
            Dog d=new Dog();

            //2.
            Living l1=new Animal();
            l1=new Plant();
            Living l2=new Plant();
            Living l3=new Dog();

            //3.
            // Animal a1=new Living();     not possible

            //4.
            Living lar[]=new Animal[2];

            //5.
            // ArrayList<Living> al=new ArrayList<Animal>();   does not accept it
            List<Animal> a1=new ArrayList<Animal>();
            a1.add(new Dog());
            a1.add(new Animal());
//            a1.add(new Plant());
//            a1.add(new Living());
            System.out.println(a1);
            method(a1);

            ArrayList<String> strlist=new ArrayList();
            method(strlist);

            List<Dog> a2=new ArrayList<Dog>();
            method1(a2);

        }

        static void method(List<?> list){ //or List<? extends Animal> list  ?-wildcard. so it can accept animal and its sub-classes
        }
        static void method1(List<? extends Animal> list){
            System.out.println(list.get(1)+"from method1()");
            //list.add(new Dog());
        }
        static void method2(List<? super Dog> list){
            list.add(new Dog());
        }
        //if you give method4(List list) it'll get type promoted to Object


}
