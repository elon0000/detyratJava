import java.util.ArrayList;
import java.util.Iterator;

public class Detyra1Iterator {

    public static void main(String[] args) {
        ArrayList  items =  new ArrayList();

        items.add("items 1 ");
        items.add("items 2 ");
        items.add("items 3 ");
        items.add("items 4 ");
        items.add("items 5 ");


        Iterator it = items.iterator();

        while (it.hasNext()){
            String str = (String)it.next();
            System.out.println(str);
        }
    }
}
