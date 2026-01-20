public class Student {
    int energy;

    void sleep(){
        energy=energy+50;
        System.out.println("寝ました。エネルギーが"+energy+"になりました。");
        if(energy==100){
            System.out.println("フルパワー！");
        }
    }

    void study(){
        energy=energy-30;
        if(energy<=0){
            energy=0;
        }

        System.out.println("勉強しました。エネルギーが"+energy+"になりました。");
        if(energy==0){
            System.out.println("寝てください。");

        }

        
        
    }
    
    Student(){}
    Student(int energy){
        this.energy=energy;

    }
    
    
}
