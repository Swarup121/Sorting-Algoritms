public class Slelectionsort {
    public static void sort(int a[])
    {
        for(int i =0;i<=a.length;i++)
        {
            int min =i;
            for(int j=i+1; j<a.length;j++)
            {
                if(a[j] < a[min])
                {
                    min=j;
                }
            }
            if(i != min)
            {
                int temp = a[i];
                a[i]=a[min];
                a[min]= temp;

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
