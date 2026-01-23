public class Exam3 {
    public static void main(String[] args) {
        try {
            Class.forName("jang.lang.NotFounfClass");
        } catch (ClassNotFoundException e) {
            System.out.println("例外が発生しました！");
           
        }

    }
    
}
