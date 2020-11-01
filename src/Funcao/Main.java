package Funcao;

import Funcao.Ultil.ProductService;
import Funcao.Entities.Product;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Product> list =  new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.00));
        list.add(new Product("HD Case", 80.00));

        ProductService ps = new ProductService();

        double sum = ps.filteredSum(list, p-> p.getName().charAt(0)== 'T');

        list.forEach(System.out::println);
        System.out.println("Sum "+ sum);
    }
}
