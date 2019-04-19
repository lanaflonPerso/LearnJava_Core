package OOP.Others.interfase_use.vlozenna_Interfeisov_i_clasov;

public class A {
    interface B{
        void metodInterfeisaB();
    }

    public class BImp implements B{
        @Override
        public void metodInterfeisaB() {
        }
    }

    private class BImp2 implements B{
        @Override
        public void metodInterfeisaB() {
        }
    }

    public interface C{
        void metodInterfeisaC();
    }

    class CImp implements C{
        @Override
        public void metodInterfeisaC() {
        }
    }

    private class CImp2 implements C{
        @Override
        public void metodInterfeisaC() {
        }
    }

    private interface D{
        void medodInterfeisaD();
    }

    private class DImp implements D{
        @Override
        public void medodInterfeisaD() {

        }
    }

    public class DImp2 implements D{
        @Override
        public void medodInterfeisaD() {

        }
    }

    public D getD(){return new DImp2();}
    private D dRef;
    public void receiveD(D d){
        dRef = d;
        dRef.medodInterfeisaD();
    }
}
