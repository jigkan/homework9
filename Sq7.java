import java.util.HashMap;

public class Sq7 {
    /*
      7. Create a HashMap object called people that will store String keys and Integer
   values: And use for each loop to iterate the value from Map.

     */
    public static void main(String[] args) {


        HashMap<String, Integer> people = new HashMap<>();
        people.put("Jignesh",3);
        people.put("Kiyan",5);
        people.put("Juhil",7);
        people.put("Jayesh",9);
        people.put("Heet",1);

        for(String s:people.keySet()) {
            System.out.println("Key= " +s + " values =" + people.get(s));
        }
        }





    }

