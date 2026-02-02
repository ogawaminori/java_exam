
import java.time.LocalDate;


public class exam3 {
    public static void main(String[] args) {
        LocalDate localDate=LocalDate.of(2000,1,1);
        int localDate1=localDate.getYear();

        if((localDate1+100)%100>=1){
            System.out.println(localDate1+"年は"+(localDate1/100+1)+"世紀です");
        }else if ((localDate1+100)%100==0){
            System.out.println(localDate1+"年は"+(localDate1/100)+"世紀です");
            
        }

        
    }
    
}
