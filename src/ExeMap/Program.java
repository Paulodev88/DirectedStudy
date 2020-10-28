package ExeMap;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter file full path: ");
        String path = sc.nextLine();

        Map<String, Integer> voting = new TreeMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            String file = br.readLine();

            while (file != null){

                String[] fields = file.split(",");
                String name = fields[0];
                Integer value = Integer.parseInt(fields[1]);
                if (voting.containsKey(name))
                        value += voting.get(name);

                voting.put(name, value);
                file = br.readLine();
            }

            System.out.println("");
            for (String n : voting.keySet()){
                System.out.println(n + ": "+ voting.get(n));
            }

        }
        catch (IOException e){
            System.out.println("Error "+ e.getMessage());
        }

    }
}
