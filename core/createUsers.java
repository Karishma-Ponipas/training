package com.navis.core;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class createUsers {

    public static void main(String args[]){

        User user1= new User("karishma","abc@gmail.com");
        User user2=new User("xyz","xyz@gmail.com");
        User user3=new User("hello","hello@gmail.com");
        User user4=new User("hey","hey@gmail.com");
        User user5=new User("abc","abcd@gmail.com");

        //user userArray[]=new user[5];
        ArrayList<User> list=new ArrayList<>();   //or ArrayList<User> list=new ArrayList<User>(); LHS-ArrayList<User>- reference type RHS- instance type <>-type inference operator
        //or List<User> list2=new ArrayList<>();
        //or Collection<User> coll=new ArrayList<>();

        //list.add(new String("hello"));
        list.add(user1);
        list.add(user2);
        list.add(user3);
        list.add(user4);
        list.add(4,user5); //can specify the index to place it there
        //list.add(new Integer("10"));
        //list.add(new Double("10.50"));

        List<User> sublist=list.subList(0,3);
      /* System.out.println("List before "+list.size());
        System.out.println("Sublist before "+sublist.size());*/
        sublist.add(new User("kli","opi@gmail.com"));
/*        System.out.println("List after "+list.size());
        System.out.println("Sublist after "+sublist.size());*/

        sublist.remove(0);

        System.out.println(list.size());
        System.out.println(sublist.size());


        //user ref=list.get(2);
        Object oref=list.get(2);
        System.out.println(oref);
        // to use user ref=list.get(); we need to give ArrayList<user> list=new ArrayList();
        //otherwise if you give ArrayList list=new ArrayList(); it'll get type promoted to Object. So should use Object oref=list.get(2);
        if(list.get(0) instanceof User) {
            User ref = (User) list.get(0);
            System.out.println(ref.getUsername());
        }
        //list.add(new String("hello"));  siblings are incompatible in java

        Iterator<User> iter=list.iterator(); //similar to for each loop Enumerator
        while(iter.hasNext()){
            System.out.println(iter.next().getUsername());
        }
    for(User i: list){
        System.out.println(i.getUsername());
        System.out.println(i.getMailid());
    }
    for(int j=0;j<list.size();j++)
        System.out.println(list.get(j));
    }
}
