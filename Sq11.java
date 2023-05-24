import java.util.ArrayList;

public class Sq11 {
    /*
    11. Declare global variables of your name, Add all your group names in list, using
for each loop iterate and print ONLY your name.
     */
    static String name="jignesh";

    public static void main(String[] args) {
        ArrayList<String> a =new ArrayList<>();
        a.add("jignesh");
        a.add("maulik");
        a.add("punam");
        a.add("falguni");
        a.add("mahesh");
        a.add("hemi");
        System.out.println("group names" + a);
  for (String b:a){
   if (a.contains(name)) {
          System.out.println("my name= " + name);
      }
  break;

    }

}
}
