package Examples.OOP.Others.vnutrennii_class_i_sestema_ypravlenia;

//Obche dlya vdeho ypravliaiwchoho sobitia metodu

public abstract class Event {

    private long  eventTime;
    protected final long delayTime;

    public Event(long delayTime){
        this.delayTime = delayTime;
        start();
    }

    public void start(){  //S vozmoznosty perehryzki
        eventTime = System.nanoTime() + delayTime;
    }

    public boolean ready(){
        return System.nanoTime() >= eventTime;
    }

    public abstract void action();
}
