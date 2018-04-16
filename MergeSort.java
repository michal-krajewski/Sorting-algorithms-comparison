/**
 * Created by Atres on 22.04.2017.
 */
public class MergeSort {
    private int merge [];
    private int[] tempArray;
    long beginTime = 0l;
    long endTime = 0l;
    public MergeSort(Data data){
        merge = data.copyTab();
    }
    public void sort() {
        beginTime = System.currentTimeMillis();
        this.tempArray = new int[merge.length];
        mergesort(0, merge.length - 1);
        endTime = System.currentTimeMillis();
        System.out.println("MergeSort: "+(endTime-beginTime));
        /*for(int i: merge){
            System.out.println(i);
        }*/
    }
    private void mergesort(int left, int right) {
        if (left < right) {
            int middle = left + (right - left)/2;
            mergesort(left, middle);
            mergesort(middle + 1, right);
            merge(left, middle, right);
        }
    }
    private void merge(int low, int middle, int high) {
        for (int i = low; i <= high; i++) {
            tempArray[i] = merge[i];
        }
        int i = low;
        int j = middle + 1;
        //int k = low;
        while (i <= middle && j <= high) {
            if (tempArray[i] <= tempArray[j]) {
                merge[low] = tempArray[i];
                i++;
            } else {
                merge[low] = tempArray[j];
                j++;
            }
            //k++;
            low++;
        }
        while (i <= middle) {
            merge[low] = tempArray[i];
            low++;
            //k++;
            i++;
        }

    }
}
