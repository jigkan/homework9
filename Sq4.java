import java.util.ArrayList;
import java.util.Iterator;

public class Sq4 {
    /*
    4. Write a Java program to iterate through all elements in an array list using
Iterator.
     */
    public static void main(String[] args) {
        ArrayList<String> colour= new ArrayList<>();//Declare array
        colour.add("blue");
        colour.add("yellow");
        colour.add("white");
        colour.add("white");
        colour.add("yellow");
        colour.add(("blue"));

        //Iterating the list using Iterator
        Iterator<String> i= colour.iterator();
        while(i.hasNext()){
            System.out.println(i.next());

        }

    }
}
