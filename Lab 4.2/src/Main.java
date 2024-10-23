import java.util.ArrayList;

/*
7. Создайте класс ComplexNumber, содержащий поля для действительной и мнимой частей. Реализуйте методы для возведения комплексного числа в целую степень.
 */
class ComplexNumber
{
    double real, imaginary;
    public  ComplexNumber(double real, double imaginary)
    {
        this.real = real;
        this.imaginary = imaginary;
    }
    public void exponentiation(Integer x)
    {
        ArrayList<Double> Ans;
        Ans = new ArrayList<>();
        double fi=Math.atan2(imaginary,real);
        double r=Math.sqrt(Math.pow(imaginary,2)+Math.pow(real,2));
        Ans.add(Math.pow(r,x)*Math.cos(x*fi));
        Ans.add(Math.pow(r,x)*Math.sin(x*fi));
        System.out.printf("Real: %.2f\n", Ans.get(0));
        System.out.printf("Imaginary: %.2f\n", Ans.get(1));
    }
}
class Main
{
    public static void main(String[] args)
    {
        ComplexNumber ComplexNumber1 = new ComplexNumber(3,7);
        ComplexNumber1.exponentiation(2);
    }
}