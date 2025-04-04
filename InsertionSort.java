public class insertationsort {

    public static void sort(int a[])
    {
        for(int i=1;i<a.length;i++)
        {
            int key= a[i];
            int j=i-1;
             while(j>=0 && a[j] > key)
             {
                a[j+1]= a[j];
                j--;
             }
             a[j+1]=key;
        }
    }
    public static void main(String[] args) {
        int arr[] = {10, 15, 4, 44, 6, 5, 3, 12, 1};
        sort(arr);

        // Print sorted array
        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
