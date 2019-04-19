package Examples.OOP.Others.klassu_vnytri_interfeisov;

public interface ClassInterfase {

    void howdy();

    class Test implements ClassInterfase{

        @Override
        public void howdy() {
            System.out.println("Hola!");
        }

        public static void main(String[] args) {
            new Test().howdy();
        }
    }
}
