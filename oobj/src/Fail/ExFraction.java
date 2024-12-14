package Fail;

public class ExFraction {

    public static void main(String[] args) {
       Fraction f = new Fraction();
       f.set(2, 4);
       f.show();

       Fraction f2 = new Fraction();
       f2.set(3, 6);
       f2.show();

       Fraction f3 = f.multiply(f2);

       f3.show();

    }
}
