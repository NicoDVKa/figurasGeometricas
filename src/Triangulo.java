import java.util.Arrays;
import java.util.Objects;

public class Triangulo extends  Figura{

    private double lado1;
    private double lado2;
    private double lado3;

    public Triangulo(String color, double lado1, double lado2, double lado3) {
        super(color);
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    @Override
    public double calcularArea() {
        if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {
            // Calcular el semiperímetro
            double s = (lado1 + lado2 + lado3) / 2;

            // Aplicar la fórmula de Herón
            double area = Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3));
            return area;
        } else {
            // Los lados no forman un triángulo válido
            return -1;
        }
    }

    @Override
    public double calcularPerimetro() {
        return lado1 + lado2 + lado3;
    }

    @Override
    public int hashCode() {
        final int primo = 31;

        int resultado = primo *  (super.getColor() != null ? super.getColor().hashCode() : 0);

            
        double[] lados = {lado1,lado2,lado3};
        
        Arrays.sort(lados);

        long temp = 0;
        for (double lado: lados) {
            temp = Double.doubleToLongBits(lado);
            resultado = primo * resultado + (int) (temp ^ (temp >>> 32));
        }

        return resultado;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Triangulo otroTriangulo = (Triangulo) obj;

        double[] ladosActuales = {lado1, lado2, lado3};
        double[] ladosOtro = {otroTriangulo.lado1, otroTriangulo.lado2, otroTriangulo.lado3};

        Arrays.sort(ladosActuales);
        Arrays.sort(ladosOtro);

        return Arrays.equals(ladosActuales, ladosOtro) && Objects.equals(super.getColor(), otroTriangulo.getColor());
    }


}
