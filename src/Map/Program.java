package Map;

import java.util.Map;
import java.util.TreeMap;

public class Program {

    public static void main(String[] args) {

        Map<String, String> cookies = new TreeMap<>();

        cookies.put("username", "maria");
        cookies.put("email", "maria@gmail.com");
        cookies.put("phone", "99711122");

        //sobreescreve o outro phone
        cookies.put("phone", "99711133");

        System.out.println("All cookies: ");
        for (String key : cookies.keySet()){
            System.out.println(key + ": " + cookies.get(key));
        }

        System.out.println("Contains phone? "+ cookies.containsKey("phone"));
    }
}
