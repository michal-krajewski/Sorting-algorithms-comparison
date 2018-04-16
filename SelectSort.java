/**
 * Created by Atres on 22.04.2017.
 */
public class SelectSort {
    int select[];
    long beginTime = 0l;
    long endTime = 0l;
    public SelectSort(Data data){
        select = data.copyTab();
    }
    public void sort(){
        int min;
        int minvalue;
        beginTime = System.currentTimeMillis();
        for(int i=0; i < select.length-1; i++){
            min=i;
            minvalue = select[min];
            for (int j=i+1;j<select.length;j++) {
                if (select[j] < minvalue) {
                    min = j;
                }
            }
            swap(i, min);
        }
        endTime = System.currentTimeMillis();
        System.out.println("SelectSort: "+(endTime-beginTime));
    }
    private void swap(int index1, int index2){
        int temp = select[index1];
        select[index1] = select[index2];
        select[index2] = temp;
    }
}
