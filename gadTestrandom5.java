import java.util.PriorityQueue;
import java.util.Random;

public class gadTestrandom5 {
    public static void main(String[] args) {
        // יצירת FibonacciHeap חדש
        FibonacciHeap heap = new FibonacciHeap();

        // יצירת אובייקט Random לצורך יצירת מספרים רנדומליים
        Random random = new Random();

        // הכנסת 500 איברים רנדומליים בין 1 ל-1000
        for (int i = 0; i < 1000; i++) {
            int randomNumber = random.nextInt(1000) + 1; // מספר רנדומלי בין 1 ל-1000
            heap.insert(randomNumber, "Info " + randomNumber);  // הוספת המספר ל-heap
        }
        System.out.println("TotalLinks: " + heap.TotalLinks);
        System.out.println("Totalcuts: " + heap.Totalcuts);
        System.out.println("Size: " + heap.Size);
        System.out.println("NumTrees: " + heap.NumTrees);

        // ביצוע 500 מחיקות של מינימום
        for (int i = 0; i < 1000; i++) {
            FibonacciHeap.HeapNode minNode = heap.findMin();
            System.out.println("Removed min: " + minNode.key); // הדפסת המינימום שנמחק

            heap.deleteMin(); // מחיקת המינימום
            heap.printHeap();
            System.out.println("TotalLinks: " + heap.TotalLinks);
            System.out.println("Totalcuts: " + heap.Totalcuts);
            System.out.println("Size: " + heap.Size);
            System.out.println("NumTrees: " + heap.NumTrees);
        }

        // הדפסת מצב ה-heap אחרי כל הפעולות
        System.out.println("Heap after 500 deleteMin operations:");
        heap.printHeap();
    }
}