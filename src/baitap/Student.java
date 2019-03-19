package baitap;

public class Student extends Preson{

    public void kiemtra(){
        int y,x=2019;
        y=x-getNamsinh();
        if(y>=18){
            System.out.println("Da du 18");
        }
        else {
            System.out.println("Chua du 18");
        }
    }

}
