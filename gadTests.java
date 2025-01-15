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

        // הדפסת ההדפסה של heap
        System.out.println("Before successive_linking:");
        heap.printHeap();

        // ביצוע successive_linking
        heap.successive_linking();

        // הדפסת ההדפסה אחרי הקריאה ל-successive_linking
        System.out.println("After successive_linking:");
        heap.printHeap();

        // הוספת צמתים נוספים לבדוק את ההתנהגות של successive_linking
        heap.insert(12, "Node 6");
        heap.insert(18, "Node 7");

        System.out.println("Before second successive_linking:");
        heap.printHeap();

        // ביצוע successive_linking שוב
        heap.successive_linking();

        System.out.println("After second successive_linking:");
        heap.printHeap();
    }
}
