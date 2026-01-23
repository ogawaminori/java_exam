
import java.time.LocalDateTime;
//import java.time.format.DateTimeFormatter;

public class Exam6 {
    public static void main(String[] args) {
        LocalDateTime localDateTime=LocalDateTime.of(1543,02,10,05,12);
        System.out.println("徳川家康の誕生日は"+localDateTime+"です");
        //DateTimeFormatter formatter=DateTimeFormatter.ofPattern("yyyy/MM/dd hh:mm");
        //System.out.println("徳川家康の誕生日は"+localDateTime.format(formatter)+"です");
    

        localDateTime=localDateTime.plusYears(1);
        localDateTime=localDateTime.plusMonths(2);
        localDateTime=localDateTime.plusDays(3);
        localDateTime=localDateTime.plusHours(4);
        localDateTime=localDateTime.plusMinutes(5);
        
        System.out.println("1年2ヶ月3日4時間5分後は"+localDateTime+"です");

    }
    
}
