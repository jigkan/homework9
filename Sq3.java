import java.util.ArrayList;

public class Sq3 {
    /*
    3. Write a Java program to create a new array list, add some colours(string) and
printout the collection using for each loop.
     */
    public static void main(String[] args) {
        ArrayList<String> colour = new ArrayList<>(); //way to declare an ArrayList
        colour.add("Green");
        colour.add("Yellow");
        colour.add("Blue");
        colour.add("red");
        colour.add("Black");
        for (String a : colour) {//print collection using for each loop
            System.out.println(a);

        }


    }
}