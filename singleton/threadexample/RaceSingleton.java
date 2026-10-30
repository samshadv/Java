import java.util.concurrent.atomic.AtomicInteger;

class RaceSingleton {
    private static RaceSingleton instance;
    private static final AtomicInteger created = new AtomicInteger();

    private RaceSingleton() {
        created.incrementAndGet();
    }

    public static int createdCount() {
        return created.get();
    }

    public static RaceSingleton getInstance() {
        if (instance == null) {
            pause();
            instance = new RaceSingleton();
        }
        return instance;
    }

    private static void pause() {
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}