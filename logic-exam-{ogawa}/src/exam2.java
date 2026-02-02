
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class exam2 {

    public static void main(String[] args) {
        
        LocalTime localTime=LocalTime.of(11,59,59);

        localTime=localTime.plusHours(0);
        localTime=localTime.plusMinutes(0);
        localTime=localTime.plusSeconds(1);

        System.out.println(localTime);

        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("hh時mm分ss秒です");
        System.out.println(localTime.format(formatter));
    }
    
}
