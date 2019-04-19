package Examples.OOP.Others.class_use.nested_class_staticheskiiVlozeniiClass;

import Examples.OOP.Others.class_use.inner_class.sozdanie_Ekzemplara_Vnutrenneho_Classa_new2.Contents;
import Examples.OOP.Others.class_use.inner_class.sozdanie_Ekzemplara_Vnutrenneho_Classa_new2.Destination;

// Vlozenii (staticheskii vnutrennii) class.

public class Parcel11 {

    private static class ParcelContents implements Contents{

        private int i = 11;

        @Override
        public int value() {
            return i;
        }
    }

    protected static class ParcelDestination implements Destination{

        private String label;
        private ParcelDestination(String wherTo){
            label = wherTo;
        }

        @Override
        public String readLabel() {
            return label;
        }

        public static void f(){}
        static int x = 10;

        static class AnotherLevel{
            public static void f(){}
            static int x = 10;
        }
    }

    public static Destination destination(String s){
        return new ParcelDestination(s);
    }

    public static Contents contents(){
        return new ParcelContents();
    }

    public static void main(String[] args) {
        Contents c = contents();
        Destination d = destination("Tanzania!");
    }
}
