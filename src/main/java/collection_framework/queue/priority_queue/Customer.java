package collection_framework.queue.priority_queue;

public class Customer {

    private int id;
    private String name;

    public Customer(int i, String n){
        this.id=i;
        this.name=n;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

}
