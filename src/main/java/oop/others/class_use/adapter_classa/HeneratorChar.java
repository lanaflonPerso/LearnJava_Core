package Examples.OOP.Others.class_use.adapter_classa;


public class HeneratorChar{
    private int cantidad;
    private static int  cout = 0;
    public HeneratorChar(){}

    public HeneratorChar(int cantidad){
        this.cantidad = cantidad;
    }
    private char[] chars = {'q', 'w','e', 'r', 't', 'y', 'u'};
    public char nextChar(){
        char c = 0;
        while (true){
            for (int i = cout; i < chars.length; i++) {
                c = chars[i];
                cout++;
                return c;
            }
        }
    }

}
