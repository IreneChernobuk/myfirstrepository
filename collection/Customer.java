package collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class Customer {
    public static void main(String[] args) {

        Map<String, String> information = new HashMap<String, String>();
        information.put("80296538488", "Gloria");
        information.put("80338576934", "Silvia");
        information.put("80445444321", "Misha");
        information.put("80385723225", "Masha");
        information.put("80291112223", "Poma");
        information.put("80295684323", "Anna");
        information.put("80344345366", "Luba");
        information.put("80245444321", "Ira");
        information.put("80295445499", "Alex");
        information.put("80335444321", "Sara");
        information.put("80182300400", "Polina");
    }
    public static void D (Map < String, String > information) {
        for (Map.Entry<String, String> inform : information.entrySet()) {
            System.out.printf("Number: %s  Name: %s \n", inform.getKey(), inform.getValue());
        }
    }
    public static void DD (Map < String, String > information) {
        Set<String> keys = information.keySet();
        System.out.println(keys);
    }

    public static void DDD (Map < String, String > information){
        Collection<String> values = information.values();
        System.out.println(values);
    }
}
