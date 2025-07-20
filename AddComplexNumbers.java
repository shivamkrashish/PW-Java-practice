// Main class
public class AddComplexNumbers {
    public static void main(String[] args) {
        Complex c1 = new Complex(3, 4);
        Complex c2 = new Complex(5, 6);

        Complex result = c1.add(c2);
        System.out.print("Sum = ");
        result.display();
    }
}
//Complex class
 class Complex {
    int real;
    int imag;
    // Constructor
    Complex(int r, int i) {
        real = r;
        imag = i;
    }
    // Add method
    Complex add(Complex other) {
        return new Complex(this.real + other.real, this.imag + other.imag);
    }
    // Display method
    void display() {
        System.out.println(real + " + " + imag + "i");
    }
}
