public class gadTests {
    public static void main(String[] args) {
        // יצירת heap חדש
        FibonacciHeap heap = new FibonacciHeap();

        // הכנסת צמתים שונים
        heap.insert(10, "Node 1");
        heap.insert(5, "Node 2");
        heap.insert(15, "Node 3");
        heap.insert(30, "Node 4");
        heap.insert(20, "Node 5");
        //heap.printHeap();
        heap.successive_linking();
        //heap.printHeap();
        heap.insert(30, "Node 4");
        heap.insert(20, "Node 5");
        //heap.printHeap();
        heap.successive_linking();
        System.out.println("");
        heap.printHeap();
        heap.insert(2, "Node 4");
        heap.insert(20, "Node 5");
        heap.insert(30, "Node 4");
        heap.successive_linking();
        System.out.println("");
        heap.printHeap();
        heap.insert(1, "Node 5");
        heap.insert(1, "Node 5");
        heap.insert(30, "Node 4");
        heap.insert(20, "Node 5");
        heap.insert(20, "Node 5");
        heap.insert(20, "Node 5");
        heap.insert(20, "Node 5");
        heap.insert(20, "Node 5");
        heap.insert(20, "Node 5");heap.insert(20, "Node 5");
        heap.insert(20, "Node 5");
        heap.insert(20, "Node 5");heap.insert(20, "Node 5");
        heap.insert(20, "Node 5");heap.insert(20, "Node 5");heap.insert(20, "Node 5");heap.insert(20, "Node 5");
        heap.insert(20, "Node 5");heap.insert(20, "Node 5");
        heap.insert(20, "Node 5");
        heap.insert(20, "Node 5");heap.insert(20, "Node 5");
        heap.insert(20, "Node 5");heap.insert(20, "Node 5");
        heap.insert(20, "Node 5");
        heap.insert(20, "Node 5");
        heap.insert(20, "Node 5");
        heap.insert(20, "Node 5");
        heap.insert(20, "Node 5");heap.insert(20, "Node 5");
        heap.insert(20, "Node 5");

        System.out.println("");
        heap.successive_linking();
        heap.printHeap();



    }
}
