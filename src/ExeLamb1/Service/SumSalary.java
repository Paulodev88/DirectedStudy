package ExeLamb1.Service;

import ExeLamb1.Entities.Employee;

import java.util.List;
import java.util.function.Predicate;

public class SumSalary {

    public double sumSalary(List<Employee> list , Predicate<Employee> criteria) {

        double sum = 0;
        for (Employee emp : list){
            if (criteria.test(emp))
                sum += emp.getSalary();
        }


        return sum;
    }
}
