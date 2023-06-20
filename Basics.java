package LambdaExpressions;

//Functional interface (which has only one method in it)
interface lambda{
    void demo();
}

public class Basics {

    public static void main(String[] args) {

//        To use single line of code
//        lambda lambda = () -> System.out.println("Statement 1...");

//        To use multiple lines of code
        lambda lambda = () -> {
            System.out.println("Statement 1...");
            System.out.println("Statement 2...");
        };
        lambda.demo();
    }
}
