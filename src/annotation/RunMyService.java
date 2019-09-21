package annotation;

import java.lang.reflect.Method;

public class RunMyService {
    public static  void main(String[] args) throws Exception{
        try {
    Class serv = Class.forName(MyService.class.getName());
        System.out.println("Аннотация  " + serv.getAnnotation(Version.class));
            MyService ser = new MyService();
            ser.setVertion(" 10.0 ");
            ser.setName(" Windows ");

Method show = MyService.class.getDeclaredMethod("thisClassInfo");
show.setAccessible(true);
show.invoke(ser);
        } catch ( Exception e ) {
            System.out.println (" Exception. " + e);
        }
    }

}
