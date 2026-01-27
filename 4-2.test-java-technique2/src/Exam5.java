public class Exam5 {
    public static void main(String[] args) {
       ShoppingCart shoppingCart=new ShoppingCart() ;

       Item item=setName("アナと雪の女王");
       Item item=setPrice(3000);

      System.out.println(shoppingCart.getTotalPrice());
      System.out.println(shoppingCart.getAveragePrice());
     


       


       

    }

    private static Item setName(String string) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setName'");
    }
    
}
