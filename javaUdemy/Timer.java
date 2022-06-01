public class Timer implements Runnable{

    public void run(){
        int i = 1;

        while (true){
            System.out.println("Working time: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
            i++;
        }
    }
}
