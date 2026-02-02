import java.time.LocalDate;

public class exam4 {
    public static void main(String[] args) {
        LocalDate localdate=LocalDate.of(2000,1,1);

        int localdate1=localdate.getYear();

        if(localdate1%4==0 && localdate1%100!=0  ||localdate1%400==0){
            System.out.println(localdate1+"はうるう年です");
        }else{
            System.out.println(localdate1+"はうるう年ではありません");
        }
    }
    
}
