package Generics.Main;

import Generics.Entities.PrintService;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        PrintService<Integer> ps = new PrintService<>();

        System.out.print("How many value? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++){
            Integer value = sc.nextInt();
            ps.addValue(value);
        }

        ps.print();
        System.out.println(" First " + ps.first());
    }
}
