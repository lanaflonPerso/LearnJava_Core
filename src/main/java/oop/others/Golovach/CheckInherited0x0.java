package YouTube_Channels.Golovach_Courses.Java_Core_December_2013.Core_OOP_2_December_2013;

import java.util.ArrayList;
import java.util.List;

public class CheckInherited0x0 {
    public static void main(String[] args) {
        List<Parent> parents = new ArrayList<>();
        parents.add(new ChilderA());
        parents.add(new ChilderB());
        parents.add(new ChilderC());

        for(Parent p : parents){
            p.methodNoStatic();
        }


        Parent parent = new ChilderA();
        parent.methodStatic();
    }
}

class Parent {

    public void methodNoStatic(){
        System.out.println("parent.methodNoStatic()");
    }

    public static void methodStatic(){
        System.out.println("Parent.methodStatic()");
    }
}

class ChilderA extends Parent {
    @Override
    public void methodNoStatic() {
        System.out.println("childerA.methodNoStatic()");
    }

    public static void methodStatic() {
        System.out.println("ChilderA.methodStatic()");
    }
}

class ChilderB extends Parent{
    @Override
    public void methodNoStatic() {
        System.out.println("childerB.methodNoStatic()");
    }
}

class ChilderC extends Parent{
    @Override
    public void methodNoStatic() {
        System.out.println("childerC.methodNoStatic()");
    }
}
