import java.util.ArrayList;

public class Sq5 {
    /*
    5. Write a Java program to test an array list is empty or not. Define array list with
underground tube names
     */
    public static void main(String[] args) {
        ArrayList<String> tube= new ArrayList<>();
        tube.add("Piccadily");
        tube.add("District");
        tube.add("Metropolitan");
        tube.add("Northern");
        tube.add("Jubilee");
        tube.add("Hammersmith");
        tube.add("Victoria");
        tube.add("Central");
        System.out.println("array list with underground tube names " + tube);
        System.out.println("check list is empty or not = "+tube.isEmpty());
        tube.removeAll(tube);
        System.out.println("after removal =" +tube);
        System.out.println("check list is empty or not = " +tube.isEmpty());



    }
}
