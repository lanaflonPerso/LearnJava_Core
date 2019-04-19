package Examples.OOP.Others.mozno_li_peropredilit_vnutrennii_class;

// Pravelnoe nasledovanie Vnutrenoho classa

class Egg2{
    protected class Yolk{

        public Yolk (){
            System.out.println("Egg2.Yolk()");
        }

        public void f(){
            System.out.println("Egg2.Yolk.q()");
        }
    }

    private Yolk y = new Yolk();
    public Egg2(){
        System.out.println("Constructor classa Egg2 new Egg2()");
    }

    public void  insertYolk(Yolk yy){ y = yy; }
    public void g(){y.f();}
}

public class BigEgg2 extends Egg2{

    public class Yolk extends Egg2.Yolk{

        public Yolk(){
            System.out.println("BigEgg2.Yolk()");
        }

        public void f(){
            System.out.println("BiggEgg2.Yolk.q()");
        }
    }

    public BigEgg2(){
        insertYolk(new Yolk());
    }

    public static void main(String[] args) {
        Egg2 e2 = new BigEgg2();
        e2.g();
    }
}
