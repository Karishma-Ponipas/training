package com.navis.shipping;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Objects;

public class container implements Comparator {  //public class container implements Comparable- method will be compareTo
    String containerId;
    String containerStatus;
    int tareWeight;
    int payWeight;
    boolean damage;
    int seal;
    int isoType;

    public String getContainerId() {
        return containerId;
    }

    public void setContainerId(String containerId) {
        this.containerId = containerId;
    }

    public String getContainerStatus() {
        return containerStatus;
    }

    public void setContainerStatus(String containerStatus) {
        this.containerStatus = containerStatus;
    }

    public int getTareWeight() {
        return tareWeight;
    }

    public void setTareWeight(int tareWeight) {
        this.tareWeight = tareWeight;
    }

    public int getPayWeight() {
        return payWeight;
    }

    public void setPayWeight(int payWeight) {
        this.payWeight = payWeight;
    }

    public boolean isDamage() {
        return damage;
    }

    public void setDamage(boolean damage) {
        this.damage = damage;
    }

    public int getSeal() {
        return seal;
    }

    public void setSeal(int seal) {
        this.seal = seal;
    }

    public int getIsoType() {
        return isoType;
    }

    public void setIsoType(int isoType) {
        this.isoType = isoType;
    }

    @Override
    public String toString() {
        return "container{" +
                "containerId='" + containerId + '\'' +
                '}';
    }

    @Override
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

/*    public int compareTo(Object o)
    {
        container ref=(container) o;
        if(this.getContainerId().compareTo(ref.getContainerId())<0)
        return -1;
        else if(this.getContainerId().compareTo(ref.getContainerId())>0)
        return 1;
        else
        return 0;
    }    */

    @Override
    public boolean equals(Object o) {
        container ref=(container) o;
        return(this.getContainerId()==ref.getContainerId());
        /*if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        container container = (container) o;
        return Objects.equals(containerId, container.containerId);*/
    }

    @Override
    public int hashCode() {
        return Objects.hash(containerId);
    }

    public void setToChe(String cheId){
    }

}
