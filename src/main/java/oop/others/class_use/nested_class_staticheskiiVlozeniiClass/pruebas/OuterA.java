package Examples.OOP.Others.class_use.nested_class_staticheskiiVlozeniiClass.pruebas;

public class OuterA {
    public String i = "w";
    public static String ii = "ww";

    static class Inner{
        // Z staticheskoho vnytrenoho classa mozna obrawchatsa
        // tolko k staticheskim dannim zovnisnoho classa.
        // ! public String string1 = i;   owibka
        public String string = ii;
        public void f(){

        }
    }
}
