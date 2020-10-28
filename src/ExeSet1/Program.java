package ExeSet1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Set<Integer> a = new HashSet<>();
        Set<Integer> b = new HashSet<>();
        Set<Integer> c = new HashSet<>();
        Set<Integer> total = new HashSet<>();

        System.out.print("How many students for curse A: ");
        int value = sc.nextInt();
        for (int i = 0; i < value; i++){
            int mat = sc.nextInt();
            a.add(mat);
        }

        System.out.print("How many students for curse B: ");
        value = sc.nextInt();
        for (int i = 0; i < value; i++){
            int mat = sc.nextInt();
            b.add(mat);
        }

        System.out.print("How many students for curse C: ");
        value = sc.nextInt();
        for (int i = 0; i < value; i++){
            int mat = sc.nextInt();
            c.add(mat);
        }

        total.addAll(a);
        total.addAll(b);
        total.addAll(c);

        System.out.println("Total Students: "+ total.size());
    }
}
