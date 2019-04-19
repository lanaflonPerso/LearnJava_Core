package OOP.Others.class_use.vidu_vlozenix_classov;

public class A { // нормальный класс

    static class B {} // статический вложенный класс


    class C {} // внутренний класс

    void f() {
        class D {} // локальный внутренний класс
    }

    void g() {
        // анонимный класс
        Base bref = new Base() {  void method1() {}   };
    }
}
