package Examples.OOP.Others;

public class Prueba_De_Private {
    private int a;
    private Prueba_De_Private(int a){
        this.a = a;
        methodPrivate();
    }

    private void methodPrivate(){
        System.out.println("Metod Private");
    }


    static public Prueba_De_Private metodPublicStaticCrrearClase(int a){
        System.out.println("Metod Static Public");
    return new Prueba_De_Private(a);
    }

    public void NNmetodPublic(){
        System.out.println("Metod Public");
    }

}

class Da{
    Prueba_De_Private p = Prueba_De_Private.metodPublicStaticCrrearClase(2);
//    Prueba_De_Private pp = new Prueba_De_Private(1);
//    pp.mo



}
