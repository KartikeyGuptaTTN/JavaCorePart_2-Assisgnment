
interface MathOperation {
    int operate(int a, int b);
}
class Calculator {
    
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    
    public static int multiply(int a, int b) {
        return a * b;
    }
}
public class SolutionQ2 {
    public static void main(String[] args) {
        Calculator calc = new Calculator();  

        
        MathOperation addition = calc::add;
        MathOperation subtraction = calc::subtract;

        
        MathOperation multiplication = Calculator::multiply;

        
        System.out.println( addition.operate(10, 5));       
        System.out.println(subtraction.operate(10, 5)); 
        System.out.println(multiplication.operate(10, 5)); 
    }
}
