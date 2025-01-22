import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Experiment {

    public static void main(String[] args) {
        test1();
        test2();
        test3();
    }

    public static void test1(){
        System.out.println("test1");
        for(int i=1; i<=5; i++){
            int n = (int) Math.pow(3, i+7);
            long sumElapsedTime = 0;
            long sumHeapSize = 0;
            long sumTotalLinks = 0;
            long sumTotalCuts = 0;
            long sumNumTrees = 0;

            for(int j=1; j<=20; j++){

                ArrayList<Integer> list = new ArrayList<Integer>();
                for(int k=1; k<=n; k++){
                    list.add(k);
                }
                Collections.shuffle(list);

                long startTime = System.currentTimeMillis();
                FibonacciHeap heap = new FibonacciHeap();
                for(int k=1; k<=n; k++){
                    heap.insert(list.get(k-1), "a");
                }
                heap.deleteMin();
                long endTime = System.currentTimeMillis();
                long elapsedTime = endTime - startTime;
                sumElapsedTime += elapsedTime;
                sumHeapSize += heap.size();
                sumTotalLinks += heap.totalLinks();
                sumTotalCuts += heap.totalCuts();
                sumNumTrees += heap.numTrees();
            }

            System.out.println("\n"+i);
            System.out.println(sumElapsedTime/20);
            System.out.println(sumHeapSize/20);
            System.out.println(sumTotalLinks/20);
            System.out.println(sumTotalCuts/20);
            System.out.println(sumNumTrees/20);

        }
    }

    public static void test2(){
        System.out.println("test2");
        for(int i=1; i<=5; i++){
            int n = (int) Math.pow(3, i+7);
            long sumElapsedTime = 0;
            long sumHeapSize = 0;
            long sumTotalLinks = 0;
            long sumTotalCuts = 0;
            long sumNumTrees = 0;

            for(int j=1; j<=20; j++){

                ArrayList<Integer> list = new ArrayList<Integer>();
                for(int k=1; k<=n; k++){
                    list.add(k);
                }
                Collections.shuffle(list);

                long startTime = System.currentTimeMillis();
                FibonacciHeap heap = new FibonacciHeap();
                for(int k=1; k<=n; k++){
                    heap.insert(list.get(k-1), "a");
                }
                for(int k=1; k<=(int)(n/2); k++){
                    heap.deleteMin();
                }
                long endTime = System.currentTimeMillis();
                long elapsedTime = endTime - startTime;
                sumElapsedTime += elapsedTime;
                sumHeapSize += heap.size();
                sumTotalLinks += heap.totalLinks();
                sumTotalCuts += heap.totalCuts();
                sumNumTrees += heap.numTrees();
            }

            System.out.println("\n"+i);
            System.out.println(sumElapsedTime/20);
            System.out.println(sumHeapSize/20);
            System.out.println(sumTotalLinks/20);
            System.out.println(sumTotalCuts/20);
            System.out.println(sumNumTrees/20);

        }
    }


    public static void test3(){
        System.out.println("test3");
        for(int i=1; i<=5; i++){
            int n = (int) Math.pow(3, i+7);
            long sumElapsedTime = 0;
            long sumHeapSize = 0;
            long sumTotalLinks = 0;
            long sumTotalCuts = 0;
            long sumNumTrees = 0;

            for(int j=1; j<=20; j++){

                ArrayList<Integer> list = new ArrayList<Integer>();
                for(int k=1; k<=n; k++){
                    list.add(k);
                }
                Collections.shuffle(list);

                FibonacciHeap.HeapNode[] pointers = new FibonacciHeap.HeapNode[n];
                long startTime = System.currentTimeMillis();
                FibonacciHeap heap = new FibonacciHeap();
                for(int k=0; k<n; k++){
                    int num = list.get(k);
                    FibonacciHeap.HeapNode new_node = heap.insert(num, "a");
                    pointers[num-1] = new_node;
                }
                heap.deleteMin();
                int block = (int)Math.pow(2, 5)-1;
                for(int k=(n-1); k>block; k--){
                    heap.delete(pointers[k]);
                }
                long endTime = System.currentTimeMillis();
                long elapsedTime = endTime - startTime;
                sumElapsedTime += elapsedTime;
                sumHeapSize += heap.size();
                sumTotalLinks += heap.totalLinks();
                sumTotalCuts += heap.totalCuts();
                sumNumTrees += heap.numTrees();
            }

            System.out.println("\n"+i);
            System.out.println(sumElapsedTime/20);
            System.out.println(sumHeapSize/20);
            System.out.println(sumTotalLinks/20);
            System.out.println(sumTotalCuts/20);
            System.out.println(sumNumTrees/20);

        }
    }

}
