import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListDemo {

    public static void main(String[] args){
        List<Object> ls = new ArrayList<Object>();
        ls.add(null);
        ls.add(null);
        ls.add(null);

        System.out.println(ls.size());

        Set<Object> set = new HashSet<Object>();
        set.add(null);
        set.add(null);

        System.out.println(set.size());
    }
}
