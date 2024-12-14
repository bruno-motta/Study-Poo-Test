package Fail;

public class Carro {
    private String mark;
    private String model;
    private int year;
    private int currentsSpeed = 0;

    public int getCurrentsSpeed() {
        return currentsSpeed;
    }

    public void setCurrentsSpeed(int currentsSpeed) {
        this.currentsSpeed = currentsSpeed;
    }


    public void accelerate(int speedCar){
        currentsSpeed += speedCar;
    }

    public void breakeer (int breakCar){
        currentsSpeed -= breakCar;
    }

    public void space(){
        System.out.println(" ");
    }






}
