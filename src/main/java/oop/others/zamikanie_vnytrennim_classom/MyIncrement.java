package oop.others.zamikanie_vnytrennim_classom;

public class MyIncrement {

    public void incrementMyIncrement(){
        System.out.println("Druhaia operacia!");
    }

    public static void f(MyIncrement mi){
        mi.incrementMyIncrement();
    }
}
