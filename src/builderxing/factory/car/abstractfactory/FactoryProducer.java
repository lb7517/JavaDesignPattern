package builderxing.factory.car.abstractfactory;

/**
 * @author : lb
 * @date : 2020/9/4 16:24
 * @description : 工厂生产者
 */
public class FactoryProducer {

    /**
     * 采用普通范式 方式一:
     * */
    public static CarFactory getFactory(String type){
        if("Honda".equals(type)){
            return new HondaFactory();
        }else if("Toyota".equals(type)){
            return new ToyotaFactory();
        }else{
            return null;
        }
    }

    /**
     * 通过反射实例化对象 方式二:
     * */
    public static <T> T getFactoryReflect(Class<T> clazz) throws Exception {
        // 方式一：
//        return (T) Class.forName(clazz.getName()).newInstance();
        // 方式二:
        return clazz.getDeclaredConstructor().newInstance();
    }
}
