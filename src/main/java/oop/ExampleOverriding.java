package advanced;

public class ExampleOverriding {
    void method(Parent p) {
        System.out.println("parent");
    }
    void method(Child c) {
        System.out.println("child");
    }
    public static void main(String[] args) {
        ExampleOverriding object = new ExampleOverriding();
        object.method(null);
        object.equals(null);
    }
}
class Parent {

}
class Child extends Parent {

}


