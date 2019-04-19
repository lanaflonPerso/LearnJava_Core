package Examples.OOP.Others.interfase_use.staticheskie_y_default_metodu_v_intefeise;

public class MyDataImpl implements MyData{
    public boolean isNull(String str) {
        System.out.println("Проверяем на null");

        return str == null ? true : false;
    }

    public static void main(String args[]){
        MyDataImpl obj = new MyDataImpl();
        obj.print("");
        obj.isNull("abc");
    }
}
