package exam1;

public class Exam {
    
    public static void main(String[] args) {
        SuperCar superCar =new SuperCar();
        EcoCar ecoCar =new EcoCar();

        superCar.setName("フェラーリ");
        ecoCar.setName("プリウス");

        superCar.putOnGas();
        superCar.run();
        ecoCar.putOnGas();
        ecoCar.run(); 
    }           
    
    
    

    
}
