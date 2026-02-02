public class exam1 {
    public static void main(String[] args) {
        
        for(int i=1;i<10;i++){
            for(int j=1;j<10;j++){
                int a =i*j;
                if(a<10){
                    System.out.print("0"+a+" ");
                }else{
                    System.out.print(a+" ");
                }
            }System.out.println();
        }
    }
    
}
