import java.util.*;

public class SetOperations {
    private Set<String> set1;
    private Set<String> set2;
    private List<String> list1;
    private List<String> list2;
    private List<String> list3;

    public SetOperations(List<String> list1, List<String> list2, List<String> list3) {
        this.list1 = list1;
        this.list2 = list2;
        this.list3 = list3;
    }

    public void performOperations() {
        createSet1();
        insertArbitraryStrings();
        insertListsIntoSet1();
        printSet(set1, "Set1 contents:");

        createSet2();
        insertListsIntoSet2();
        printSet(set2, "Set2 contents:");
    }

    private void createSet1() {
        set1 = new HashSet<>();
    }

    private void insertArbitraryStrings() {
        set1.add("Hello");
        set1.add("World");
    }

    private void insertListsIntoSet1() {
        set1.addAll(list1);
        set1.addAll(list2);
    }

    private void printSet(Set<String> set, String message) {
        System.out.println("\n" + message);
        for (String s : set) {
            System.out.println(s);
        }
    }

    private void createSet2() {
        set2 = new LinkedHashSet<>();
    }

    private void insertListsIntoSet2() {
        set2.addAll(list2);
        set2.addAll(list3);
    }
}
