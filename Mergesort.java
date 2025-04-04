public class Mergesort
{
    public static void sort(int a[])
    {
        if(a.length==1)
        return;
        int[] left = new int[a.length/2];
        int[] right = new int[a.length-left.length];
        int i = 0;
        int j=0;
        while(i<left.length)
        {
            left[i] = a[i];
            i++;
        }
        while(j<right.length)
        {
            right[j] = a[i];
            i++;
            j++;
        }
        sort(left);
        sort(right);
        Merge(left,right,a);
    }
    public static void Merge(int a[], int b[], int c[])
    {
        int i=0,j=0,k=0;
        while(i<a.length && j<b.length){
            if(a[i] < b[j])
        {
            c[k++] = a[i++];
        }
        else
        {
            c[k++]=b[j++];
        }
    }
        while(i<a.length)
        {
            c[k++]= a[i++];
        }
        while(j<b.length)
        {
            c[k++]= b[j++];
        }

        }
        
    public static void main(String[] args) {
        int arr[]= {11,4,15,7,8,55,13,21};
        sort(arr);
        System.out.println("The sorted Array is:");
        for(int x : arr)
        {
            System.out.print(x +" ");
        }
    }
}