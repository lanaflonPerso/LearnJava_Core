package Examples.OOP.Others.zamikanie_vnytrennim_classom;

//Esli vaw class dolzen vizivat metod incrementIncrementable()
//po-dryhomy, neobxodimo ispolzovat vnytrennii class:

public class Callee2 extends MyIncrement{
    private int i = 0;
    public void incrementMyIncrement(){
        super.incrementMyIncrement();
        i++;
        System.out.println(i);
    }
    private class Closure implements Incrementable{

        @Override
        public void incrementIncrementable() {
            //Ykazuvaem metod vnewnoho class, inache
            // voznikaet bezkonechnaya recursia:
//            incrementIncrementable();
            incrementMyIncrement();
        }
    }
    Incrementable getCallbackReference(){
        return new Closure();
    }
}
