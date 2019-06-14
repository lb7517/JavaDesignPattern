package jiegouxing.proxy.dynamicproxy1;

public class Bank implements Financial {
    private boolean hasExperience = false;

    Bank(){}

    Bank(boolean hasExperience){
        this.hasExperience = hasExperience;
    }

    @Override
    public String profile() {
        if(!hasExperience){
            System.out.println("深交所: 清先学会股票知识");
            return "fail";
        }
        System.out.println("深交所: 您可以炒股了");
        return "success";
    }
}
