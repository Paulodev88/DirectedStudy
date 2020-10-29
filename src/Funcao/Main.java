package Funcao;

import Function.Entities.Product;

import java.util.ArrayList;
import java.util.List;
98154 xxx 5534

public class Main {

    public static void main(String[] args) {

        List<Product> list =  new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.00));
        list.add(new Product("HD Case", 80.00));

    }
}
