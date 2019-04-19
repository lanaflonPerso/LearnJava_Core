package OOP.Others.interfase_use.vlozenna_Interfeisov_i_clasov;

public interface E {
    interface G{
        void medodInterfeisaG();
    }
    // Izbitochnoe obiavlenie public
    public interface H{
        void metodInterfeisaH();
    }
    void metodIntrfeisaE();
    // Ne mozet bit private v vnytri interfase:
    //! private interfase I();
}