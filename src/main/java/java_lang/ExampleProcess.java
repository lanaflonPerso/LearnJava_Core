package Examples.java_lang;

public class ExampleProcess {
    public static void main(String[] args) {
//--------------------------------------------------------------------------------------------------------------------
        Runtime r = Runtime.getRuntime();
        Process p = null;

        try {
            p = r.exec("zenmap");
        } catch (Exception e) {
            System.out.println("Error executing notepad.");
        }
//--------------------------------------------------------------------------------------------------------------------
    }
}
