public class Main {

    public static void main(String[] args) {
        //int x = (2+2*2);
        //System.out.println(x);

        Data data = new Data();
        for(int i = 0; i < 3; i++) {
            switch (i){
                case 0: {
                    System.out.println("Random: ");
                    break;
                }
                case 1: {
                    System.out.println("Sorted (inc): ");
                    data.sorted();
                    break;
                }
                case 2: {
                    System.out.println("Sorted (dec): ");
                    data.reverseSorted();
                }
            }

            InsertSort insert = new InsertSort(data);
            insert.sort();
            Bubblesort bubble = new Bubblesort(data);
            bubble.sort();
            SelectSort select = new SelectSort(data);
            select.sort();
            QuickSort quick = new QuickSort(data);
            HeapSort heap = new HeapSort(data);
            heap.sort();
            MergeSort merge = new MergeSort(data);
            merge.sort();
            System.out.println();
        }
    }
}

