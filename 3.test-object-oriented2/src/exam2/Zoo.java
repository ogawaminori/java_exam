package exam2;

public class Zoo {
    public static void main(String[] args) {
        Sheep s = new Sheep();
        Horse h = new Horse();
        Goat g =new Goat();

        Animal[] animals ={s,h,g};
        for(Animal animal:animals){
            animal.cry();
        }
    }
    
}
