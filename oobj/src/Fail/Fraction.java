package Fail;

public class Fraction { //Classe
    int numerador;
    int denominador;


    void set(int n, int d){
        numerador = n;
        denominador = d;
    }

    Fraction multiply(Fraction f) {
        Fraction r = new Fraction();
        r.numerador = numerador * f.numerador;
        r.denominador = denominador * f.denominador;
        return r;

   }

   void show (){
       System.out.println(numerador + " / " + denominador);
   }

}
