package ExeLamb1;

import ExeLamb1.Entities.Employee;
import ExeLamb1.Service.SumSalary;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter full file path: ");
        String path = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))){

            List<Employee> emp = new ArrayList<>();
            String line = br.readLine();

            while (line != null){

                String[] fields = line.split(",");
                emp.add(new Employee(fields[0], fields[1], Double.parseDouble(fields[2])));
                line = br.readLine();

            }

            System.out.println("Enter Salary: ");
            double sl = sc.nextDouble();
            System.out.println("Email of people whose salary is more then " + String.format("%.2f", sl));

            Comparator<String> comp = (s1,s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());

            List<String> emails = emp.stream().
                    filter(p -> p.getSalary() > sl).
                    map(p -> p.getEmail()).
                    sorted(comp).
                    collect(Collectors.toList());
            emails.forEach(System.out::println);



            SumSalary ss = new SumSalary();

            double sum = ss.sumSalary(emp, p -> p.getName().toUpperCase().charAt(0) == 'M');

            System.out.println("Sun of salary of people whose name starts with 'M': " + sum);

        }
        catch (IOException e){
            System.out.println("Error: "+ e.getMessage());
        }
    }
}
