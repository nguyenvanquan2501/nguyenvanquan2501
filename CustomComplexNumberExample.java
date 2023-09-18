import java.util.Scanner;

public class CustomComplexNumberExample {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) { 
        CustomComplexNumber a = new CustomComplexNumber(sc.nextInt(), sc.nextInt());
        CustomComplexNumber b = new CustomComplexNumber(sc.nextInt(), sc.nextInt());

        CustomComplexNumber sum = a.add(b);
        CustomComplexNumber product = a.multiply(b);

        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
    }
}

class CustomComplexNumber {
    private double real;
    private double imaginary;
    //private static final CustomComplexNumber I = new CustomComplexNumber(0, 1);

    public CustomComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public CustomComplexNumber add(CustomComplexNumber other) {
        double newReal = this.real + other.real;
        double newImaginary = this.imaginary + other.imaginary;
        return new CustomComplexNumber(newReal, newImaginary);
    }

    public CustomComplexNumber multiply(CustomComplexNumber other) {
        double newReal = this.real * other.real - this.imaginary * other.imaginary;
        double newImaginary = this.real * other.imaginary + this.imaginary * other.real;
        return new CustomComplexNumber(newReal, newImaginary);
    }

    @Override
    public String toString() {
        String realPart = real != 0 ? String.valueOf(real) : "";
        String imaginaryPart = "";

        if (imaginary != 0) {
            if (imaginary > 0) {
                imaginaryPart = " + " + imaginary + "i";
            } else {
                imaginaryPart = " - " + (-imaginary) + "i";
            }
        }

        if (real == 0 && imaginary == 0) {
            return "0";
        } else if (real == 0) {
            return imaginaryPart;
        } else if (imaginary == 0) {
            return realPart;
        }

        return realPart + imaginaryPart;
    }
}
