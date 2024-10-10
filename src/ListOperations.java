import java.util.*;

public class ListOperations {
    private ArrayList<String> list1;
    private ArrayList<String> list2;
    private List<String> list3;

    public void performOperations() {
        createList1();
        addArrayToList1();
        initializeList2();
        createList3();
        insertList3IntoList2();
        sortList2Descending();
        removeEverySecondElement();
        printList2();
    }

    private void createList1() {
        list1 = new ArrayList<>();
    }

    private void addArrayToList1() {
        String[] array = {"Apple", "Banana", "Cherry", "Date"};
        Collections.addAll(list1, array);
    }

    private void initializeList2() {
        list2 = new ArrayList<>(list1);
    }

    private void createList3() {
        list3 = Arrays.asList("Elderberry", "Fig", "Grape");
    }

    private void insertList3IntoList2() {
        int middle = list2.size() / 2;
        list2.addAll(middle, list3);
    }

    private void sortList2Descending() {
        Collections.sort(list2, Collections.reverseOrder());
    }

    private void removeEverySecondElement() {
        ListIterator<String> iterator = list2.listIterator();
        boolean remove = false;
        while (iterator.hasNext()) {
            iterator.next();
            if (remove) {
                iterator.remove();
            }
            remove = !remove;
        }
    }

    private void printList2() {
        System.out.println("List2 after deletions:");
        for (String item : list2) {
            System.out.println(item);
        }
    }

    // Getters for use in SetOperations
    public ArrayList<String> getList1() {
        return list1;
    }

    public ArrayList<String> getList2() {
        return list2;
    }

    public List<String> getList3() {
        return list3;
    }
}
