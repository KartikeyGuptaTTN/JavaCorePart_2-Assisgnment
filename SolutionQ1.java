interface Compare {
    boolean isGreater(int a, int b);
}


interface Increment {
    int increment(int num);
}

interface Concatenate {
    String join(String s1, String s2);
}

interface ToUpperCase {
    String convert(String str);
}




public class SolutionQ1 {
    public static void main(String[] args) {
        
        Compare compare = (a, b) -> a > b;
        System.out.println(compare.isGreater(10, 5)); 
        System.out.println(compare.isGreater(2, 8));  

        
        Increment inc = num -> num + 1;
        System.out.println(inc.increment(5)); 

        
        Concatenate concat = (s1, s2) -> s1 + s2;
        System.out.println(concat.join("Hello, ", "World!")); 

        
        ToUpperCase toUpper = str -> str.toUpperCase();
        System.out.println(toUpper.convert("hello")); 
    }
}
