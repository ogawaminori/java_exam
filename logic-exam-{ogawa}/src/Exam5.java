public class Exam5 {
    public static void main(String[] args) {
        String[] sports={ "soccer", "baseball", "jogging", "jogging", "soccer", "surfing", "surfing", "soccer", "surfing", "baseball", "boxing", "surfing", "soccer", "surfing", "jogging", "boxing", "jogging", "baseball", "soccer", "soccer"};
        for(String sport:sports){
            int sum=0;
            if(sport.equals("socces")){
                for(int i=1;i<20;i++)
                sum=sum+i;
                
            }System.out.println(sum);

       
        
        }
    }
    
}
