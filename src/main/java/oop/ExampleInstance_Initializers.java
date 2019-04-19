package Examples.OOP;

public class ExampleInstance_Initializers {
    public static void main(String[] args) {
        new Foo();
        new Foo();
        new Foo();
    }
}

class Foo {
    public Foo() {
        System.out.println("constructor called");
    }

    static {
        System.out.println("static initializer called");
    }

    {
        System.out.println("instance initializer called");
    }
}
