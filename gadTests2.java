public class gadTests2 {

    public static void main(String[] args) {
        try {
            testBasicSuccessiveLinking();
            testSuccessiveLinkingWithEqualRanks();
            testSuccessiveLinkingWithOneNode();
            testSuccessiveLinkingAfterInserts();
            testLinksAndCutsAfterSuccessiveLinking();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void testBasicSuccessiveLinking() throws Exception {
        FibonacciHeap heap = new FibonacciHeap();
        heap.insert(10, "Node 1");
        heap.insert(5, "Node 2");
        heap.insert(15, "Node 3");
        heap.insert(30, "Node 4");
        heap.insert(20, "Node 5");

        int initialNumTrees = heap.numTrees();
        int initialTotalLinks = heap.totalLinks();
        int initialMinKey = heap.findMin().key;

        heap.successive_linking();

        // Verify number of trees
        if (heap.numTrees() != 1) {
            throw new Exception("Error: Number of trees is incorrect after successive_linking.");
        }

        // Verify total links
        if (heap.totalLinks() <= initialTotalLinks) {
            throw new Exception("Error: Total links not updated correctly.");
        }

        // Verify min node
        if (heap.findMin().key != Math.min(Math.min(10, 5), Math.min(15, Math.min(30, 20)))) {
            throw new Exception("Error: Minimum value in heap is incorrect after successive_linking.");
        }
    }

    private static void testSuccessiveLinkingWithEqualRanks() throws Exception {
        FibonacciHeap heap = new FibonacciHeap();
        heap.insert(10, "Node 1");
        heap.insert(20, "Node 2");
        heap.insert(5, "Node 3");
        heap.insert(25, "Node 4");

        heap.successive_linking();

        // Verify that the trees are correctly merged, and the root list is correct
        int numTreesAfterLinking = heap.numTrees();
        if (numTreesAfterLinking != 1) {
            throw new Exception("Error: Trees are not merged correctly after successive_linking.");
        }

        // Verify that the min node is correct after linking
        int minKeyAfterLinking = heap.findMin().key;
        if (minKeyAfterLinking != 5) {
            throw new Exception("Error: Minimum key not correctly updated after linking.");
        }
    }

    private static void testSuccessiveLinkingWithOneNode() throws Exception {
        FibonacciHeap heap = new FibonacciHeap();
        heap.insert(100, "Single Node");

        int numTreesBefore = heap.numTrees();
        int totalLinksBefore = heap.totalLinks();
        int minKeyBefore = heap.findMin().key;

        heap.successive_linking();

        // Check if only one tree exists and no links were made
        if (heap.numTrees() != 1) {
            throw new Exception("Error: Number of trees is incorrect with one node.");
        }
        if (heap.totalLinks() != totalLinksBefore) {
            throw new Exception("Error: Links should not change with one node.");
        }

        // Ensure the min key remains unchanged
        if (heap.findMin().key != minKeyBefore) {
            throw new Exception("Error: Minimum key changed with one node.");
        }
    }

    private static void testSuccessiveLinkingAfterInserts() throws Exception {
        FibonacciHeap heap = new FibonacciHeap();
        heap.insert(10, "Node 1");
        heap.insert(5, "Node 2");
        heap.insert(15, "Node 3");
        heap.insert(25, "Node 4");

        int numTreesBefore = heap.numTrees();
        int totalLinksBefore = heap.totalLinks();
        int minKeyBefore = heap.findMin().key;

        heap.insert(30, "Node 5");
        heap.successive_linking();

        // Check if the number of trees is updated
        if (heap.numTrees() != 1) {
            throw new Exception("Error: Number of trees is incorrect after successive_linking.");
        }

        // Check if the total number of links has increased
        if (heap.totalLinks() <= totalLinksBefore) {
            throw new Exception("Error: Total links did not increase after successive_linking.");
        }

        // Ensure the min key is correctly updated
        if (heap.findMin().key != 5) {
            throw new Exception("Error: Minimum key is incorrect after successive_linking.");
        }
    }

    private static void testLinksAndCutsAfterSuccessiveLinking() throws Exception {
        FibonacciHeap heap = new FibonacciHeap();
        heap.insert(5, "Node 1");
        heap.insert(10, "Node 2");
        heap.insert(15, "Node 3");
        heap.insert(30, "Node 4");
        heap.insert(20, "Node 5");

        int initialTotalLinks = heap.totalLinks();
        int initialTotalCuts = heap.totalCuts();

        heap.successive_linking();

        // Ensure the total number of links and cuts have been updated
        if (heap.totalLinks() <= initialTotalLinks) {
            throw new Exception("Error: Total links not updated correctly.");
        }
        if (heap.totalCuts() <= initialTotalCuts) {
            throw new Exception("Error: Total cuts not updated correctly.");
        }
    }
}
