package Examples.OOP.Others.class_use.inner_class.vukorestannia_Thiss;

public class DotThis {

    void f(){ System.out.println("DotThis.q()"); }

    public class Inner{

        public DotThis outer(){
            return DotThis.this;
            // this bez ytochnenia sootvectvyet obekty Inner
        }
    }

    public Inner inner(){ return new Inner(); }

    public static void main(String[] args) {
        DotThis dt = new DotThis();
        DotThis.Inner dti = dt.inner();
        dti.outer().f();
    }
}
