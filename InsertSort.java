/**
 * Created by Atres on 22.04.2017.
 */
public class InsertSort {
    int insert[];
    long beginTime = 0l;
    long endTime = 0l;
    public InsertSort(Data data){
        insert = data.copyTab();
    }
    public void sort()
    {
        beginTime = System.currentTimeMillis();
        for (int i=1; i<insert.length; i++)
        {
            for (int j=0; j<i; j++)
            {
                if (insert[j]>insert[i])
                    insert(j, i);
            }
        }
        endTime = System.currentTimeMillis();
        System.out.println("InsertSort: "+(endTime-beginTime));
    }
    public void move(int from, int to) {
        for (int i=to; i>from; i--) {
            insert[i] = insert[i-1];
        }
    }
    public void insert(int index, int value)
    {
        int temp=insert[value];
        move(index, value);
        insert[index]=temp;
    }
}