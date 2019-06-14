package jiegouxing.proxy.cglibproxy;

public class Bank {
    private boolean hasExperience = false;

    Bank(){}

    Bank(boolean hasExperience){
        this.hasExperience = hasExperience;
    }

    public void profile() {
        if(!hasExperience){
            System.out.println("深交所: 清先学会股票知识");
            return;
        }
        System.out.println("深交所: 您可以炒股了");
    }
}
