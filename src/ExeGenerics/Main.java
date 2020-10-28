package  ExeGenerics;

import ExeGenerics.Entities.CalculationService;
import ExeGenerics.Entities.Product;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args) {

        String path = "/home/paulo/Documentos/product";
        List<Product> products = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(path))){

            String line = br.readLine();
            while (line!= null){
                String[] fields = line.split(",");
                products.add(new Product(fields[0], Double.parseDouble(fields[1])));
                line = br.readLine();
            }

            Product x = CalculationService.max(products);
            System.out.println("MAX: ");
            System.out.println(x);        }
        catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }

    }
}
