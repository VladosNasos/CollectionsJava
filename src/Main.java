public class Main {
    public static void main(String[] args) {
        // List operations
        ListOperations listOps = new ListOperations();
        listOps.performOperations();

        // Set operations
        SetOperations setOps = new SetOperations(listOps.getList1(), listOps.getList2(), listOps.getList3());
        setOps.performOperations();

        // Map operations
        MapOperations mapOps = new MapOperations();
        mapOps.performOperations();

        // User operations
        UserOperations userOps = new UserOperations();
        userOps.performOperations();
    }
}
