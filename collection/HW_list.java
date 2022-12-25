package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HW_list {

    public static void main(String[] args) {

        List<Integer> digital = new ArrayList<>();
        digital.add(1);
        digital.add(2);
        digital.add(3);
        digital.add(4);
        digital.add(4);
        digital.add(5);
        digital.add(6);

        Set<Integer> set = new HashSet<Integer>(digital);
        System.out.println(set);
    }
}
