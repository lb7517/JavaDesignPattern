package xingweixing.mediator;

public class MediatorPatterDemo {
    public static void main(String args[]){
        User robert = new User("Robert");
        User lb = new User("Liub");

        robert.sendMessage("Hi! Liub!");
        lb.sendMessage("Hello! Robert!");
    }
}
