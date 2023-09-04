public class Rectangulo extends Figura{
    private double base;
    private double altura;
    public Rectangulo(String color, double base, double altura) {
        super(color);
        this.altura = altura;
        this.base = base;
    }

    @Override
    public double calcularArea() {
        return base*altura;
    }

    @Override
    public double calcularPerimetro() {
        return base*2 + altura*2;
    }
}
