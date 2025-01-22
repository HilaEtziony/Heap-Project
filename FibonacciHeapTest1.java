import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Random;

class FibonacciHeapTest1 {

    @Test
    void testInsertAndFindMin() {
        FibonacciHeap heap = new FibonacciHeap();
        assertNull(heap.findMin(), "Heap should initially be empty");

        heap.insert(4, "four");
        heap.insert(2, "two");
        heap.insert(6, "six");

        assertEquals(2, heap.findMin().key, "Minimum should be 2");
        assertEquals(3, heap.size(), "Size should be 3 after insertions");
    }

    @Test
    void testDeleteMin() {
        FibonacciHeap heap = new FibonacciHeap();

        heap.insert(4, "four");
        heap.insert(2, "two");
        heap.insert(6, "six");

        heap.deleteMin();
        assertEquals(4, heap.findMin().key, "Minimum should be 4 after deleting minimum");
        assertEquals(2, heap.size(), "Size should decrease after deleteMin");

        heap.deleteMin();
        heap.deleteMin();
        assertNull(heap.findMin(), "Minimum should be null when heap is empty");
        assertEquals(0, heap.size(), "Size should be 0 when heap is empty");
    }

    @Test
    void testDecreaseKey() {
        FibonacciHeap heap = new FibonacciHeap();

        FibonacciHeap.HeapNode node = heap.insert(10, "ten");
        heap.insert(20, "twenty");

        heap.decreaseKey(node, 5);
        assertEquals(5, heap.findMin().key, "Minimum should be updated after decreaseKey");
        assertEquals(2, heap.size(), "Size should remain unchanged after decreaseKey");
    }

    @Test
    void testDelete() {
        FibonacciHeap heap = new FibonacciHeap();

        FibonacciHeap.HeapNode node1 = heap.insert(15, "fifteen");
        heap.insert(25, "twenty-five");
        heap.insert(5, "five");

        heap.delete(node1);
        assertEquals(2, heap.size(), "Size should decrease after deleting a node");
        assertEquals(5, heap.findMin().key, "Minimum should remain correct after deleting a non-minimum node");
    }

    @Test
    void testMeld() {
        FibonacciHeap heap1 = new FibonacciHeap();
        FibonacciHeap heap2 = new FibonacciHeap();

        heap1.insert(10, "ten");
        heap1.insert(30, "thirty");
        heap2.insert(5, "five");
        heap2.insert(15, "fifteen");

        heap1.meld(heap2);
        assertEquals(4, heap1.size(), "Size should be the sum of both heaps after meld");
        assertEquals(5, heap1.findMin().key, "Minimum should be the smallest key after meld");
    }

    @Test
    void testEdgeCases() {
        FibonacciHeap heap = new FibonacciHeap();

        assertNull(heap.findMin(), "Heap should return null for findMin when empty");
        assertEquals(0, heap.size(), "Empty heap size should be 0");

        FibonacciHeap.HeapNode node = heap.insert(1, "one");
        assertEquals(1, heap.size(), "Size should be 1 after a single insert");
        heap.delete(node);
        assertEquals(0, heap.size(), "Size should be 0 after deleting the only node");
        assertNull(heap.findMin(), "Minimum should be null after deleting the only node");

        // Edge case: Operations on empty heap
        heap.delete(null); // Should not throw an exception
        heap.meld(null); // Should not throw an exception
    }

    @Test
    void testNumTrees() {
        FibonacciHeap heap = new FibonacciHeap();

        heap.insert(10, "ten");
        heap.insert(20, "twenty");
        heap.insert(30, "thirty");

        assertEquals(3, heap.numTrees(), "Number of trees should equal the number of inserted nodes initially");

        heap.deleteMin();
        assertEquals(1, heap.numTrees(), "Number of trees should decrease after deleteMin consolidates the heap");
    }

    @Test
    void testStressTest() {
        FibonacciHeap heap = new FibonacciHeap();
        int nodeCount = 1000;
        FibonacciHeap.HeapNode[] nodes = new FibonacciHeap.HeapNode[nodeCount];

        // Insert nodes
        for (int i = 0; i < nodeCount; i++) {
            nodes[i] = heap.insert(i, "key" + i);
        }

        assertEquals(nodeCount, heap.size(), "Heap size should match the number of inserted nodes");

        // Decrease keys
        for (int i = 0; i < nodeCount; i++) {
            heap.decreaseKey(nodes[i], i / 2);
        }
        assertEquals(0, heap.findMin().key, "Minimum should be updated correctly after decreaseKey");

        // Delete nodes
        for (int i = 0; i < nodeCount; i++) {
            heap.delete(nodes[i]);
        }
        assertEquals(0, heap.size(), "Heap size should be 0 after deleting all nodes");
        assertNull(heap.findMin(), "Minimum should be null after deleting all nodes");
    }
}
