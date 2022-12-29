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
        displayInfo(information);
        displayInfoKey(information);
        displayInfoValue(information);
    }
    public static void displayInfo (Map < String, String > I) {
        for (Map.Entry<String, String> inform : I.entrySet()) {
            System.out.printf("Number: %s  Name: %s \n", inform.getKey(), inform.getValue());
        }
    }
    public static void displayInfoKey (Map < String, String > number) {
        Set<String> keys = number.keySet();
        System.out.println(keys);
    }

    public static void displayInfoValue (Map < String, String > name){
        Collection<String> values = name.values();
        System.out.println(values);
    }
}
