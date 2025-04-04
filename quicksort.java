public class quicksort {

    public static void sort(int a[], int start, int end)
    {
        if (start>=end) return;
        int i=start;
        int j=end;
        int pivot = a[(start + end) / 2];;
        while(i<=j)
        {
            while (a[i]<pivot) {
               i++; 
            }
            while (a[j]>pivot) {
                j--; 
             }
             if(i<=j)
             {
                int temp = a[i];
                a[i] = a[j];
                a[j]= temp;
                i++;
                j--;
             }
        }
        sort(a,start,j);
        sort(a,i,end);

    }
public static void main(String[] args) {
    int arr[] = {10, 15, 4, 44, 6, 5, 3, 12, 1};
        sort(arr, 0, arr.length - 1);

        // Print sorted array
        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
}

}