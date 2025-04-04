public class Bubblesort {

    public static void sort(int[] a)
    {
        for(int i = 0; i< a.length-1; i++)
        {
            boolean iswap=false;
            for(int j=0;j<a.length-1-i;j++)
            {
                if(a[j]>a[j+1])
                {
                    int temp = a[j];
                    a[j]= a[j+1];
                    a[j+1] = temp;
                    iswap=true;
                }
            }
            if(!iswap)
            {
                return;
            }
        }
    }
    public static void main(String[] args) {
        int a[]= {4,5,3,8,2,1,9,8};
        sort(a);
        for(int x: a)
        {
            System.out.print(x+ " ");
        }
    }
}
