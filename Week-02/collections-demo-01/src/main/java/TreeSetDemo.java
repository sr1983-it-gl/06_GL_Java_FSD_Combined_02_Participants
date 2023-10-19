import java.util.TreeSet;

public class TreeSetDemo {

    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<String>();

        ts.add("Bangalore");
        ts.add("Gujarat");
        ts.add("Agra");
        ts.add("Ernakulam");
        ts.add("Mumbai");
        ts.add("Pune");
        ts.add("Delhi");
        
        System.out.println(ts);
        System.out.println(ts.subSet("Delhi", "Pune"));
    }
}