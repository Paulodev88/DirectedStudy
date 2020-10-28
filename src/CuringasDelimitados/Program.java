package CuringasDelimitados;

import CuringasDelimitados.Entities.Circle;
import CuringasDelimitados.Entities.Retangle;
import CuringasDelimitados.Entities.Shape;

import java.util.ArrayList;
import java.util.List;

public class Program {

    public static void main(String[] args) {

        List<Shape> myShapes = new ArrayList<>();
        myShapes.add(new Retangle(3.0, 2.0));
        myShapes.add(new Circle(2.0));

        System.out.println("Total area: "+ String.format("%.2f", totalArea(myShapes)));


    }

    public static double totalArea(List<? extends Shape> list) {
        double sum = 0.0;
        for (Shape s : list) {
            sum += s.area();
        }
        return sum;
    }
}
