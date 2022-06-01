public class JustThread implements Runnable{

    private String name;

    public JustThread(String name){
        this.name = name;
    }
    public void run(){
        for (int i = 1; i <= 1000; i++){
            System.out.println("--" + name + "-- " + i + " --");
        }
    }
}
