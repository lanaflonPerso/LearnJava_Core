package Examples.OOP.Others.class_use.anonymous_class.anonimnie_vnutrenie_class;

// Ispolzovanie "inicializacii ekzempliara" dlya vipolnenia
// konstryirovania v anonimnom vnytrennom classe.

import Examples.OOP.Others.class_use.inner_class.sozdanie_Ekzemplara_Vnutrenneho_Classa_new2.Destination;

public class Parcel10 {

    public Destination destination(final String dest, final float price){
        return new Destination() {
            private int cost;
            // Inicializacia ekzempliara dlya kazdoho obiekta:
            {
                cost = Math.round(price);
                if (cost > 100) System.out.println("Pereviwenie biydzeta!");
            }
            private String label = dest;
            @Override
            public String readLabel() { return label; }
        };
    }

    public static void main(String[] args) {
        Parcel10 p = new Parcel10();
        Destination d = p.destination("Tanzania", 101.395F);
    }
}
