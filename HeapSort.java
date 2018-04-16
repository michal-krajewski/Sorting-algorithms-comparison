/**
 * Created by Atres on 22.04.2017.
 */


public class HeapSort
{
    int heap[];
    long beginTime = 0l;
    long endTime = 0l;
    private int n;
    public HeapSort(Data data){
        heap = data.copyTab();

    }
    private void buildheap(){
        n = heap.length-1;
        for(int i=n/2;i>=0;i--){
            maxheap(i);
        }
    }
    private void maxheap(int i){
        int largest;
        int left=2*i;
        int right=2*i+1;
        if(left <= n && heap[left] > heap[i]){
            largest=left;
        }
        else{
            largest=i;
        }

        if(right <= n && heap[right] > heap[largest]){
            largest=right;
        }
        if(largest!=i){
            swap(i,largest);
            maxheap(largest);
        }
    }
    private void swap(int i, int j){
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }
    public void sort(){
        beginTime = System.currentTimeMillis();
        buildheap();

        for(int i=n;i>0;i--){
            swap(0, i);
            n=n-1;
            maxheap(0);
        }
        endTime = System.currentTimeMillis();
        System.out.println("HeapSort: "+(endTime-beginTime));
        /*for(int i: heap){
            System.out.println(i);
        }*/
    }
}
