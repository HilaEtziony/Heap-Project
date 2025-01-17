public class gadTests3 {
    public static void main(String[] args) {
        // יצירת heap חדש
        FibonacciHeap heap = new FibonacciHeap();

        FibonacciHeap.HeapNode node1 = heap.insert(8, "Node 1");
        FibonacciHeap.HeapNode node2 = heap.insert(3, "Node 2");
        FibonacciHeap.HeapNode node3 = heap.insert(5, "Node 3");
        FibonacciHeap.HeapNode node4 = heap.insert(5, "Node 4");
        FibonacciHeap.HeapNode node5 = heap.insert(5, "Node 5");
        FibonacciHeap.HeapNode node6 = heap.insert(1, "Node 6");
        FibonacciHeap.HeapNode node7 = heap.insert(10, "Node 7");
        FibonacciHeap.HeapNode node8 = heap.insert(5, "Node 8");
        FibonacciHeap.HeapNode node9 = heap.insert(7, "Node 9");
        FibonacciHeap.HeapNode node10 = heap.insert(18, "Node 10");
        FibonacciHeap.HeapNode node11 = heap.insert(30, "Node 12");
        FibonacciHeap.HeapNode node12 = heap.insert(40, "Node 13");
        FibonacciHeap.HeapNode node13 = heap.insert(50, "Node 14");
        FibonacciHeap.HeapNode node14 = heap.insert(60, "Node 15");
        FibonacciHeap.HeapNode node15 = heap.insert(70, "Node 16");
        FibonacciHeap.HeapNode node16 = heap.insert(80, "Node 17");
        FibonacciHeap.HeapNode node17 = heap.insert(90, "Node 18");
        FibonacciHeap.HeapNode node18 = heap.insert(100, "Node 19");

        // הדפסת heap לפני מחיקות
        System.out.println("Before delete 0:");
        heap.printHeap();
        System.out.println("TotalLinks: " + heap.TotalLinks);
        System.out.println("Totalcuts: " + heap.Totalcuts);
        System.out.println("Size: " + heap.Size);
        System.out.println("NumTrees: " + heap.NumTrees);
        System.out.println();  // שורת רווח

        // מחיקת צומת המינימלי
        System.out.println("Deleting the minimum node (key = 1):");
        heap.deleteMin();
        heap.printHeap();
        System.out.println("TotalLinks: " + heap.TotalLinks);
        System.out.println("Totalcuts: " + heap.Totalcuts);
        System.out.println("Size: " + heap.Size);
        System.out.println("NumTrees: " + heap.NumTrees);
        System.out.println();  // שורת רווח

        // מחיקת צומת נוסף (שרירותי)
        System.out.println("Deleting a random node with key 3:");
        FibonacciHeap.HeapNode nodeToDelete1 = heap.findMin().next.next;  // בוחרים צומת שרירותי
        heap.delete(nodeToDelete1);
        heap.printHeap();
        System.out.println("TotalLinks: " + heap.TotalLinks);
        System.out.println("Totalcuts: " + heap.Totalcuts);
        System.out.println("Size: " + heap.Size);
        System.out.println("NumTrees: " + heap.NumTrees);
        System.out.println();  // שורת רווח

        // מחיקת צומת נוסף (שרירותי)
        System.out.println("Deleting a random node with key 5:");
        FibonacciHeap.HeapNode nodeToDelete2 = heap.findMin().child.next;  // בוחרים צומת נוסף שרירותי
        heap.delete(nodeToDelete2);
        heap.printHeap();
        System.out.println("TotalLinks: " + heap.TotalLinks);
        System.out.println("Totalcuts: " + heap.Totalcuts);
        System.out.println("Size: " + heap.Size);
        System.out.println("NumTrees: " + heap.NumTrees);
        System.out.println();  // שורת רווח

        // מחיקת צומת נוסף (שרירותי)
        System.out.println("Deleting a random node with key 18:");
        FibonacciHeap.HeapNode nodeToDelete3 = heap.findMin().child.prev;  // בוחרים צומת נוסף שרירותי
        heap.delete(nodeToDelete3);
        heap.printHeap();
        System.out.println("TotalLinks: " + heap.TotalLinks);
        System.out.println("Totalcuts: " + heap.Totalcuts);
        System.out.println("Size: " + heap.Size);
        System.out.println("NumTrees: " + heap.NumTrees);
        System.out.println();  // שורת רווח

        // מחיקת צומת נוסף (שרירותי)
        System.out.println("Deleting a random node with key 5 min:");
        FibonacciHeap.HeapNode nodeToDelete4 = heap.findMin();  // בוחרים צומת נוסף שרירותי
        heap.delete(nodeToDelete4);
        heap.printHeap();
        System.out.println("TotalLinks: " + heap.TotalLinks);
        System.out.println("Totalcuts: " + heap.Totalcuts);
        System.out.println("Size: " + heap.Size);
        System.out.println("NumTrees: " + heap.NumTrees);
        System.out.println();  // שורת רווח

        // מחיקת צומת נוסף (שרירותי)
        System.out.println("Deleting a random node with key 90 min:");
        FibonacciHeap.HeapNode nodeToDelete5 = heap.findMin().next.child.child.child;  // בוחרים צומת נוסף שרירותי
        heap.delete(nodeToDelete5);
        heap.printHeap();
        System.out.println("TotalLinks: " + heap.TotalLinks);
        System.out.println("Totalcuts: " + heap.Totalcuts);
        System.out.println("Size: " + heap.Size);
        System.out.println("NumTrees: " + heap.NumTrees);
        System.out.println();  // שורת רווח

        // מחיקת צומת נוסף (שרירותי)
        System.out.println("Deleting a random node with key 30:");
        FibonacciHeap.HeapNode nodeToDelete6 = heap.findMin().next.child.prev;  // בוחרים צומת נוסף שרירותי
        heap.delete(nodeToDelete6);
        heap.printHeap();
        System.out.println("TotalLinks: " + heap.TotalLinks);
        System.out.println("Totalcuts: " + heap.Totalcuts);
        System.out.println("Size: " + heap.Size);
        System.out.println("NumTrees: " + heap.NumTrees);
        System.out.println();  // שורת רווח

        // מחיקת צומת נוסף (שרירותי)
        System.out.println("Deleting a random node with key 40:");
        FibonacciHeap.HeapNode nodeToDelete7 = heap.findMin().next.child.next;  // בוחרים צומת נוסף שרירותי
        heap.delete(nodeToDelete7);
        heap.printHeap();
        System.out.println("TotalLinks: " + heap.TotalLinks);
        System.out.println("Totalcuts: " + heap.Totalcuts);
        System.out.println("Size: " + heap.Size);
        System.out.println("NumTrees: " + heap.NumTrees);
        System.out.println();  // שורת רווח

        // מחיקת צומת נוסף (שרירותי)
        System.out.println("Deleting a random node with key 60:");
        FibonacciHeap.HeapNode nodeToDelete8 = heap.findMin().next.child;  // בוחרים צומת נוסף שרירותי
        heap.delete(nodeToDelete8);
        heap.printHeap();
        System.out.println("TotalLinks: " + heap.TotalLinks);
        System.out.println("Totalcuts: " + heap.Totalcuts);
        System.out.println("Size: " + heap.Size);
        System.out.println("NumTrees: " + heap.NumTrees);
        System.out.println();  // שורת רווח

        System.out.println("Deleting a random node with key min:");
        heap.deleteMin();
        heap.printHeap();
        System.out.println("TotalLinks: " + heap.TotalLinks);
        System.out.println("Totalcuts: " + heap.Totalcuts);
        System.out.println("Size: " + heap.Size);
        System.out.println("NumTrees: " + heap.NumTrees);
        System.out.println();  // שורת רווח



    }
}
