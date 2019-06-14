package jiegouxing.facade;

public class FacadePatternDemo {
    public static void main(String args[]){
        FacadeComputer facadeComputer = new FacadeComputer();
        facadeComputer.start();
        System.out.println("----------------------------");
        facadeComputer.shutdown();

        String a ;
    }
}
