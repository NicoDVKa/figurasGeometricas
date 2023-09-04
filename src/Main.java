// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Triangulo triangulo1 = new Triangulo("red",4,5,3);
        Triangulo triangulo2 = new Triangulo("red",4,3,5);
        Triangulo triangulo3 = new Triangulo("red",5,4,3);

        System.out.println(triangulo1.hashCode());
        System.out.println(triangulo2.hashCode());
        System.out.println(triangulo3.hashCode());

        System.out.println(triangulo1.equals(triangulo2));
        System.out.println(triangulo3.equals(triangulo2));
    }
}