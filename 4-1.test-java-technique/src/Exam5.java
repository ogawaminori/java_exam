import java.time.LocalDate;

public class Exam5 {
    public static void main(String[] args) {
        LocalDate localDate =LocalDate.of(1999,10,16);
        
        int y=localDate.getYear();
        int M=localDate.getMonthValue();
        int d=localDate.getDayOfMonth();

        System.out.println("私の誕生日は"+y+"年"+M+"月"+d+"日です");

    }
    
}
