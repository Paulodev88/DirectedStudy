package Predicate;

import Predicate.Entities.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Program {

    public static void main(String[] args) {

        List<Product> list =  new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.00));
        list.add(new Product("HD Case", 80.00));

        //Lambda
        //list.removeIf(x -> x.getPrice() >= 100);

        //Predicate
        Predicate<Product> pred = p -> p.getPrice() >= 100.00;
        list.removeIf(pred);

        // com clase
        //list.removeIf(new ProductPredicate());


        for (Product p : list){
            System.out.println(p);
        }

    }
}
