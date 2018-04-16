/**
 * Created by Atres on 22.04.2017.
 */
public class QuickSort {
    int quick[];
    long beginTime = 0l;
    long endTime = 0l;
    public QuickSort(Data data){
        quick = data.copyTab();
        beginTime = System.currentTimeMillis();
        sort(0,quick.length-1);
        endTime = System.currentTimeMillis();
        System.out.println("QuickSort: "+(endTime-beginTime));
    }
    private void sort(int x, int y) {
        int i = x;
        int j = y;
        int v = quick[(x+y)/2];
        do {
            while (quick[i]<v)
                i++;
            while (v< quick[j])
                j--;
            if (i<=j) {
                swap(i, j);
                i++;
                j--;
            }
        } while (i<=j);

        if (x < j) sort(x,j);
        if (i < y) sort(i,y);
    }
    private void swap(int index1, int index2){
        int temp = quick[index1];
        quick[index1] = quick[index2];
        quick[index2] = temp;
    }
}
