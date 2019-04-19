package Examples.OOP.Others.zamikanie_vnytrennim_classom;

public class Callee1  implements Incrementable {

    private int i = 0;

    @Override
    public void incrementIncrementable() {
        i++;
        System.out.println(i);
    }

}
