public class Stage4RaceDemo {
    public static void main(String[] args) throws InterruptedException {
        final RaceSingleton[] seen = new RaceSingleton[2];
        Thread t1 = new Thread(() -> seen[0] = RaceSingleton.getInstance());
        Thread t2 = new Thread(() -> seen[1] = RaceSingleton.getInstance());
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("Objects created: " + RaceSingleton.createdCount());
        System.out.println("Same object  = ? " + (seen[0] == seen[1]));
    }
}