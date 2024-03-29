package Examples.Multithreading.Ispolzovanie_Executors;

import Examples.Multithreading.Opredilenie_Zadach.LiftOff;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FixedThreadPool {
    public static void main(String[] args) {

        // Constructor argument is number of threads:
        ExecutorService exec = Executors.newFixedThreadPool(5);

        for(int i = 0; i < 5; i++) exec.submit(new LiftOff());

        exec.shutdown();
    }
}
