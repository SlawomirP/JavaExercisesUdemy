public class ThreadExMain {
    public static void main (String[] args){

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Test text");
                try {
                    Thread.sleep(3000);
                    System.out.println("Test text after 3s");
                } catch (InterruptedException e) {
                }
            }
        });
//        thread.start();

//        Timer timer = new Timer();
//        timer.run();

        JustThread p1 = new JustThread("Player 1");

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 1000; i++){
                    System.out.println("-- " + i + " --");
                }
//                System.out.println("Test text");
//                try {
//                    Thread.sleep(3000);
//                    System.out.println("Test text after 3s");
//                } catch (InterruptedException e) {
//                }
            }
        });
        t2.start(); p1.run();
    }
}
