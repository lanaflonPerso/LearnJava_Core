package Examples.OOP;

// Demonstrate instanceof operator.
class A {
    int i, j;
}
class B {
    int i, j;
}
class C extends A {
    int k;
}
class D extends A {
    int k;
}
public class ExampleInstanceOf {
    public static void main(String args[]) {
//---------------------------------------------------------------------------------------------------------------------
        A age = new A();
        B b = new B();
        C c = new C();
        D d = new D();
        if(age instanceof A) System.out.println("age is instance of A");

        if(b instanceof B) System.out.println("b is instance of B");

        if(c instanceof C) System.out.println("c is instance of C");

        if(c instanceof A) System.out.println("c can be cast to A");

        if(age instanceof C) System.out.println("age can be cast to C");

        System.out.println();

        // compare types of derived types
        A ob;
        ob = d; // A reference to d
        System.out.println("ob now refers to d");

        if(ob instanceof D) System.out.println("ob is instance of D");
        System.out.println();

        ob = c; // A reference to c
        System.out.println("ob now refers to c");

        if(ob instanceof D)
            System.out.println("ob can be cast to D");
        else
            System.out.println("ob cannot be cast to D");
        if(ob instanceof A)
            System.out.println("ob can be cast to A");
        System.out.println();

        // all objects can be cast to Object
        if(age instanceof Object) System.out.println("age may be cast to Object");

        if(b instanceof Object) System.out.println("b may be cast to Object");

        if(c instanceof Object) System.out.println("c may be cast to Object");

        if(d instanceof Object) System.out.println("d may be cast to Object");
//---------------------------------------------------------------------------------------------------------------------
        /*НА ЗАМЕТКУ! Если в приведенном ниже выражении переменная х содержит пустое значение
        null, исключение не будет сгенерировано, но лишь возвратится логическое значение false.*/
        System.out.println();
        System.out.println(null instanceof A);
//---------------------------------------------------------------------------------------------------------------------
    }
}
