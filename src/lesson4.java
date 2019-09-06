import java.text.SimpleDateFormat;
import java.util.Date;

public class lesson4 {
    public static void main(String[] args){
        Date hour = new Date();
        System.out.println(hour);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy: MM : dd \\  HH : mm");
        System.out.println(sdf.format(hour));
    }
}