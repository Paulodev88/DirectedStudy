package ExeSet;

import ExeSet.Entites.LogEntry;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.*;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter file full path: ");
        String path = sc.nextLine();

        try(BufferedReader br = new BufferedReader(new FileReader(path))) {

            Set<LogEntry> set = new HashSet<>();
            String line = br.readLine();
            while (line != null){

                String[] field = line.split(" ");
                String username = field[0];
                Date moment = Date.from(Instant.parse(field[1]));
                set.add(new LogEntry(username, moment));
                line = br.readLine();

            }


            System.out.println("Total users: "+ set.size());

        }
        catch (IOException e){
            System.out.println("Error " + e.getMessage() );
        }
        sc.close();
    }
}