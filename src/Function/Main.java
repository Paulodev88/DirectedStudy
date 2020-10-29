package Function;

import Function.Entities.UpCaseName;
import Function.Entities.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<Product> list =  new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.00));
        list.add(new Product("HD Case", 80.00));

        //With Class
        //List<String> names = list.stream().map(new UpCaseName()).collect(Collectors.toList());

        //With Lambda
        Function<Product, String> func = p -> p.getName().toUpperCase();
        List<String> names = list.stream().map(func).collect(Collectors.toList());


        list.forEach(System.out::println);
        names.forEach(System.out::println);
    }
}
