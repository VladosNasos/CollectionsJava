import java.util.*;

public class MapOperations {
    private LinkedHashMap<Integer, String> map1;
    private HashMap<Integer, String> map2;

    public void performOperations() {
        createMap1();
        addMonthsToMap1();
        printFirstAndLastMonth();
        replaceSixthMonth();
        createMap2();
        insertMap1IntoMap2();
        printMap(map1, "Map1 contents:");
        printMap(map2, "Map2 contents:");
        createMap3();
    }

    private void createMap1() {
        map1 = new LinkedHashMap<>();
    }

    private void addMonthsToMap1() {
        String[] months = {
                "January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"
        };
        for (int i = 0; i < months.length; i++) {
            map1.put(i, months[i]);
        }
    }

    private void printFirstAndLastMonth() {
        System.out.println("\nFirst month: " + map1.get(0));
        System.out.println("Last month: " + map1.get(11));
    }

    private void replaceSixthMonth() {
        map1.put(5, "VACATION");
        System.out.println("Updated month at position 5: " + map1.get(5));
    }

    private void createMap2() {
        map2 = new HashMap<>();
    }

    private void insertMap1IntoMap2() {
        map2.putAll(map1);
    }

    private void printMap(Map<Integer, String> map, String message) {
        System.out.println("\n" + message);
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

    private void createMap3() {
        Map<String, Set<String>> map3 = new HashMap<>();
        Set<String> contacts = new HashSet<>();
        contacts.add("123-456-7890"); // Mobile phone
        contacts.add("student@example.com"); // Email
        contacts.add("student.skype"); // Skype
        map3.put("John Doe", contacts);

        System.out.println("\nMap3 contents:");
        for (Map.Entry<String, Set<String>> entry : map3.entrySet()) {
            System.out.println("Student: " + entry.getKey());
            System.out.println("Contacts: " + entry.getValue());
        }
    }
}
