/**
 * Created by Atres on 22.04.2017.
 */
public class Bubblesort {
    int bubble[];
    long beginTime = 0l;
    long endTime = 0l;
    public Bubblesort(Data data){
            bubble = data.copyTab();
    }
    public void sort(){
        beginTime = System.currentTimeMillis();
        for(int j = bubble.length-1; j > 0; j--){
            for(int i = 0; i < j; i++){
                if(bubble[i] > bubble[i+1]){
                    swap(i, (i+1));
                }
            }
        }
        endTime = System.currentTimeMillis();
        System.out.println("BubbleSort: "+(endTime-beginTime));

    }
    private void swap(int index1, int index2){
        int temp = bubble[index1];
        bubble[index1] = bubble[index2];
        bubble[index2] = temp;
    }

}
