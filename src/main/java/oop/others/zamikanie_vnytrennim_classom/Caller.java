package Examples.OOP.Others.zamikanie_vnytrennim_classom;

// Prosto realizem interface

public class Caller{
    private Incrementable callbackReference;
    Caller(Incrementable cbk){callbackReference = cbk;}
    void go(){callbackReference.incrementIncrementable();}
}
