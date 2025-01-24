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
        heap.insert(11, "Node 5");
        heap.insert(12, "Node 5");
        heap.insert(122, "Node 5");
        heap.insert(13, "Node 5");
        heap.insert(14, "Node 5");
        heap.insert(15, "Node 5");heap.insert(20, "Node 5");
        heap.insert(16, "Node 5");
        heap.insert(17, "Node 5");heap.insert(20, "Node 5");
        heap.insert(9, "Node 5");heap.insert(20, "Node 5");heap.insert(20, "Node 5");heap.insert(20, "Node 5");
        heap.insert(8, "Node 5");heap.insert(20, "Node 5");
        heap.insert(7, "Node 5");
        heap.insert(6, "Node 5");heap.insert(20, "Node 5");
        heap.insert(5, "Node 5");heap.insert(20, "Node 5");
        heap.insert(4, "Node 5");
        heap.insert(3, "Node 5");
        heap.insert(2, "Node 5");
        heap.insert(21, "Node 5");
        heap.insert(22, "Node 5");heap.insert(20, "Node 5");
        heap.insert(24, "Node 5");
        heap.insert(25, "Node 5");
        heap.insert(26, "Node 5");
        heap.insert(27, "Node 5");
        heap.insert(27, "Node 5");
        heap.insert(28, "Node 5");
        heap.insert(29, "Node 5");
        heap.insert(31, "Node 5");
        heap.insert(32, "Node 5");
        heap.insert(33, "Node 5");
        heap.insert(34, "Node 5");
        heap.insert(35, "Node 5");

        System.out.println("");
        heap.successive_linking();
        heap.printHeap();
        System.out.println("Heap Details:");
        System.out.println("Min node: " + (heap.findMin() != null ? "(" + heap.findMin().key + ", " + heap.findMin().info + ")" : "null"));
        System.out.println("Total number of trees: " + heap.numTrees());
        System.out.println("Total size (number of nodes): " + heap.size());
        System.out.println("Total number of cuts: " + heap.totalCuts());
        System.out.println("Total number of links: " + heap.totalLinks());



    }
}
