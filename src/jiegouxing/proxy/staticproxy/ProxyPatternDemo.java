package jiegouxing.proxy.staticproxy;

public class ProxyPatternDemo {
    public static void main(String args[]){
        //交给代理
        System.out.println("我: 我要理财，对炒股不太懂");
        Financial financial = new FinancialManager();
        System.out.println("我: 找个理财经理更方便");
        financial.profile();
        System.out.println("我: 坐等着收钱");

        System.out.println("----------------------------");

        //我想自己炒股
        Financial financial1 = new Bank();
        financial1.profile();
    }
}
