package Consumer;

import Consumer.Entities.Product;
import Consumer.Util.PriceUpdate;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        List<Product> list =  new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.00));
        list.add(new Product("HD Case", 80.00));


        //With class
        //list.forEach(new PriceUpdate());

        //With method
        //list.forEach(Product::staticPriceUpdate);

        //With method in main
        Consumer<Product> cons = p-> p.setPrice(p.getPrice() * 1.1);

        //With Lambda
        list.forEach(p-> p.setPrice(p.getPrice()* 1.1));


        list.forEach(System.out::println);
    }
}
