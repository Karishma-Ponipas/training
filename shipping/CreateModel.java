package com.navis.shipping;

import java.util.*;

public class CreateModel {
    public static void main(String args[]){
        che cheRef=new che();
        che cheRef1=new che();
        che cheRef2=new che();
        che cheRef3=new che();
        che cheRef4=new che();

        che dup=cheRef;  //refer to one object in memory
        System.out.println(dup.equals(cheRef));
        System.out.println(dup==cheRef);

        container contRef=new container();
        contRef.setContainerId("101");
        container contRef1=new container();
        contRef1.setContainerId("102");
        container contRef2=new container();
        contRef2.setContainerId("102");
        container contRef3=new container();
        contRef3.setContainerId("104");
        container contRef4=new container();
        contRef4.setContainerId("105");

        HashSet<container> containerSet= new HashSet<>();  //avoid duplicates using equals and hashcode.


        containerSet.add(contRef);
        containerSet.add(contRef1);
        containerSet.add(contRef2);
        containerSet.add(contRef3);
        containerSet.add(contRef3);
        containerSet.add(contRef4);

        System.out.println(containerSet);
        System.out.println(containerSet.contains(contRef));


        vessel vesRef=new vessel();
        vessel vesRef1=new vessel();
        vessel vesRef2=new vessel();
        vessel vesRef3=new vessel();
        vessel vesRef4=new vessel();

        TreeSet<String> tree=new TreeSet<>();
        tree.add("orange");
        tree.add("pink");
        tree.add("green");
        tree.add("red");
        tree.add("blue");

        System.out.println(tree);

        TreeSet<container> treeSet= new TreeSet<>(new ComparatorIDComparator());

        treeSet.add(contRef);
        treeSet.add(contRef1);
        treeSet.add(contRef2);
        treeSet.add(contRef3);
        treeSet.add(contRef4);

        System.out.println(treeSet.size());



        HashMap<String,String> pairs=new HashMap<>();
        pairs.put("Rose","Jack");
        pairs.put("Abc","Xyz");
        pairs.put("Romeo","Juliet");

        //methods to access 1.key
        System.out.println(pairs.get("Rose"));
        //2.get all keys
        Set keys=pairs.keySet();
       System.out.println(keys);
       //3.get all values
        Collection values=pairs.values();
        System.out.println(values);
        //4. all key value pairs
        Set entries=pairs.entrySet();
        System.out.println(entries);
        //5.iteration
        Iterator iter=keys.iterator();
        while(iter.hasNext())
            System.out.println(pairs.get(iter.next()));
        System.out.println(Collections.min(containerSet,new ComparatorIDComparator()));  //if we use comparable then new comparatorid.. not needed
        System.out.println(Collections.max(containerSet,new ComparatorIDComparator()));

        List coll=new ArrayList(containerSet);
        System.out.println(Collections.binarySearch(coll,contRef1,new ComparatorIDComparator()));
    }
}
