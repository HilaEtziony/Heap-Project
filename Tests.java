public class Tests {
    public static void main(String[] args) {
        // check insert
        FibonacciHeap h = new FibonacciHeap();
        h.insert(5, "hila");
        h.insert(4, "fgfg");
        //h.printHeap();
        if (h.findMin().key != 4){
            System.out.println("problem with min");
        }
        if (h.totalCuts() != 0){
            System.out.println("problem total cuts");
        }
        if (h.totalLinks() != 0){
            System.out.println("problem total cuts");
        }
        if (h.size() != 2){
            System.out.println("problem size");
        }
        if (h.numTrees() != 2){
            System.out.println("problem numTrees");
        }
        if (h.min.next.key != 5){
            System.out.println("problem min next");
        }
        if (h.min.next.next.key != 4){
            System.out.println("problem min next next");
        }
        if (h.min.prev.key != 5){
            System.out.println("problem min prev");
        }
        if (h.min.prev.prev.key != 4){
            System.out.println("problem min prev prev");
        }
        FibonacciHeap h2 = new FibonacciHeap();
        h2.insert(10, "hila");
        h2.insert(6, "fgfg");
        if (h2.findMin().key != 6){
            System.out.println("problem with min");
        }
        h2.insert(1, "fgfg");
        if (h2.min.next.key != 10){
            System.out.println("problem min next key");
        }
        if (h2.min.prev.key != 6){
            System.out.println("problem min prev key");
        }
        if (h2.min.next.next.key != 6){
            System.out.println("problem min next next key");
        }
        if (h2.min.prev.prev.key != 10){
            System.out.println("problem min prev prev key");
        }
        //h2.printHeap();

        //check meld
        h.meld(h2);
        if (h.findMin().key != 1){
            System.out.println("problem with min");
        }
        if (h.totalCuts() != 0){
            System.out.println("problem total cuts");
        }
        if (h.totalLinks() != 0){
            System.out.println("problem total cuts");
        }
        if (h.size() != 5){
            System.out.println("problem size");
        }
        if (h.numTrees() != 5){
            System.out.println("problem numTrees");
        }
        //h.printHeap();
        if (h.min.prev.key != 5){
            System.out.println("problem min prev");
        }
        if (h.min.prev.next.key != 1){
            System.out.println("problem min prev next");
        }
        if (h.min.next.next.next.key != 4){
            System.out.println("problem min next next next");
        }
        if (h.min.next.next.next.prev.key != 6){
            System.out.println("problem next next next prev prev");
        }
        if (h.min.prev.prev.key != 4){
            System.out.println("problem min prev prev");
        }
        if (h.min.next.key != 10){
            System.out.println("problem min next");
        }

        h.printHeap();
        h.deleteMin();
        h.printHeap();
        FibonacciHeap.HeapNode node = h.min.child.child;
        System.out.println(h.totalCuts());
        h.decreaseKey(node,7);
        System.out.println(h.totalCuts());
        h.printHeap();
        if (h.min.key != 3){
            System.out.println("problem min");
        }


        h.insert(20, "g");
        h.insert(10, "dfs");
        h.insert(50,"h");
        h.insert(60, "g");
        h.insert(70, "dfs");
        h.insert(30,"h");
        h.insert(30,"h");
        h.printHeap();
        h.deleteMin();
        h.printHeap();


        System.out.println(h.min.child.child.key);
        System.out.println(h.min.child.child.next.key);
        System.out.println(h.min.child.child.next.next.key);
        System.out.println(h.totalCuts());
        h.decreaseKey(h.min.child.child,42);
        System.out.println(h.totalCuts());
        h.printHeap();
        h.decreaseKey(h.min.child.child,69);
        System.out.println(h.totalCuts());
        h.printHeap();
        System.out.println(h.min.key);

    }
}
