package LambdaExpressions;

import java.util.function.IntPredicate;

public class Predicates {

    public static void main(String[] args) {

//        When lambda expression is not used with predicate
        /*IntPredicate lessThan18 = new IntPredicate() {
            @Override
            public boolean test(int value) {
                if (value < 18){
                    return true;
                }
                else{
                return false;
                }
            }
        };*/

        IntPredicate lessThan18 = i -> i < 18;
        IntPredicate MoreThan10 = i -> i > 10;

//        To check the output of a single predicate
        System.out.println(lessThan18.test(17));

//        To compare multiple predicates
        System.out.println(lessThan18.and(MoreThan10).test(11));

//        Comparing predicates by using method call
        new Predicates().demo(11 , lessThan18 , MoreThan10);
    }

    public void demo(int x , IntPredicate lessThan18 , IntPredicate MoreThan10){
        if (lessThan18.and(MoreThan10).test(11)){
            System.out.println("The value is between 10 and 18");
        }
        else{
            System.out.println("Invalid input");
        }
    }
}
