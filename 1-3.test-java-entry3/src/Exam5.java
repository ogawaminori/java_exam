public class Exam5 {
    public static void main(String[] args) {
        int result1 =addition(5, 3);
        int result2 =subtraction(5, 3);
        int result3 =multiplication(5, 3);
        int result4 =division(5, 3);
        int result5 =remainder(5, 3);

        System.out.println("足し算結果："+result1);
        System.out.println("引き算結果："+result2);
        System.out.println("掛け算結果："+result3);
        System.out.println("割り算結果："+result4);
        System.out.println("剰余算結果："+result5);


    }
    
    static int addition(int num1,int num2){
        int sum=num1+num2;
        return sum;

    }


    static int subtraction(int num1,int num2){
        int sum =num1-num2;
        return sum;
    }

    static int multiplication(int num1,int num2){
        int sum =num1*num2;
        return sum;
    }

    static int division(int num1,int num2){
        int sum =num1/num2;
        return sum;
    }

    static int remainder(int num1,int num2){
        int sum =num1 % num2;
        return sum;
    }



}
