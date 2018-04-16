import java.util.Arrays;
import java.util.Random;

/**
 * Created by Atres on 22.04.2017.
 */
public class Data {
    int tab[] = null;
    public Data(){
        tab = new int[25000];
        Random random = new Random();
        for(int i=0; i < tab.length; i++){
            tab[i] = random.nextInt(1000000);
        }
    }
    public int[] copyTab(){
        /*int newTab[] = new int[tab.length];
        for(int i=0; i < tab.length; i++){
            int temp = tab[i];
            newTab[i] = temp;
        }
        return newTab;
        */
        return Arrays.copyOf(tab, tab.length);
    }
    public void sorted(){
        for(int j = tab.length-1; j > 0; j--){
            for(int i = 0; i < j; i++){
                if(tab[i] > tab[i+1]){
                    int temp = tab[i];
                    tab[i] = tab[(i+1)];
                    tab[(i+1)] = temp;
                }
            }
        }
    }
    public void reverseSorted(){
        int temporary [] = copyTab();
        int j=0;
        for(int i = temporary.length-1; i >= 0; i--){
            tab[j] = temporary[i];
            j++;
        }
    }
}
