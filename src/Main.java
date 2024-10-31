import java.io.FilterOutputStream;

public class Main {
    public static void main(String[] args) {
        ComplexNumber c1 = new ComplexNumber(2, 3);
        ComplexNumber c2 = new ComplexNumber(1, -2);

        System.out.println("c1: " + c1);
        System.out.println("c2: " + c2);

        System.out.println("c1 + c2: " + c1.add(c2));
        System.out.println("c1 - c2: " + c1.sub(c2));
        System.out.println("c1 * c2: " + c1.mul(c2));
        System.out.println("c1 / c2: " + c1.div(c2));

        System.out.println("Модуль c1: " + c1.modulus());

        System.out.println("c1 == c2: " + c1.equals(c2));
    }
}