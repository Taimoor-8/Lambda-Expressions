package LambdaExpressions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class data{
    private String name;

    public data(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "data{" +
                "name='" + name + '\'' +
                '}';
    }
}

public class Collections_Lambda {

    public static void main(String[] args) {

        List <data> list = new ArrayList<>();
        list.add(new data("Taimoor"));
        list.add(new data("Adnan"));
        list.add(new data("Awais"));
        list.add(new data("Ibrahim"));

        new Collections_Lambda().printList(list);

//        Sorting based on natural order
//        list.sort((data d1, data d2) -> d1.getName().compareTo(d2.getName()));

//        Sorting based on length
        list.sort((data d1 , data d2) -> {
            if (d1.getName().length() < d2.getName().length()){
                return -1;
            }
            else if (d1.getName().length() > d2.getName().length()) {
                return 1;
            }
            else {
                return 0;
            }
        });

        System.out.println();

        new Collections_Lambda().printList(list);
    }

    public void printList(List <data> list){
        for (data element : list){
            System.out.println(element.getName());
        }
    }
}
