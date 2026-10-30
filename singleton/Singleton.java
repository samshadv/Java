public class Singleton {

    private Singleton() {
        System.out.println("Object created");
    }

    public static Singleton getInstance() {
        return InstanceHolder.INSTANCE;
    }

    private static class InstanceHolder {
        private static final Singleton INSTANCE = new Singleton();
    }
}