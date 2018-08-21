package com.navis.shipping;

import java.util.Comparator;

public class ComparatorIDComparator implements Comparator {

    public int compare(Object o1, Object o2) {
        container c1=(container) o1;
        container c2=(container) o2;
        if(c1.getContainerId().compareTo(c2.getContainerId())<0)
            return -1;
        else if(c1.getContainerId().compareTo(c2.getContainerId())>0)
            return 1;
        else
            return 0;
    }
}
