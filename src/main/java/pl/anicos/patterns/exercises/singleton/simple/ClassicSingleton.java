package pl.anicos.patterns.exercises.singleton.simple;

public class ClassicSingleton {

    private static ClassicSingleton instance = null;

    private ClassicSingleton() {
        sleep();
    }

    public void getSomeThing() {
        // do something here
        System.out.println("I am here....");
    }

    public static ClassicSingleton getInstance() {
        if (instance == null) {
            instance = new ClassicSingleton();
        }
        return instance;
    }

    private static void sleep() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}