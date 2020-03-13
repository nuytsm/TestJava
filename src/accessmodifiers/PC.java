package Com.company;

import javax.swing.*;

public class PC {
    int ramgehuegen;
    int hddCapacity;

    public PC(){

    }

    public PC(int ramgehuegen){
        this.ramgehuegen = ramgehuegen;
    }


    public PC(int ramgehuegen, int hddCapacity) {
        this(ramgehuegen);
        this.hddCapacity = hddCapacity;
    }


}
