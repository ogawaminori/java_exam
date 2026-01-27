import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ShoppingCart extends LinkedList {

    List<Item>itemlist;

    ShoppingCart(){
        itemlist=new ArrayList();
    }


    public int getTotalPrice(){
        int total=0;
        for(Item item:itemlist){
            total=total+item.getPrice();
        }return total;

    }

    public int getAveragePrice(){
        return getTotalPrice()/size();
    }


    public List<Item> getItemlist() {
        return itemlist;
    }


    public void setItemlist(List<Item> itemlist) {
        this.itemlist = itemlist;
    }

    
    
}
