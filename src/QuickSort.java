import java.util.*;
class QuickSort{
    public static void swap(int a,int b){
        int temp = a;
        a = b;
        b = temp;
    }
    public static int partition(int[]arr,int low,int high){
        int left = low;
        int right = high;
        int pivot = arr[low];
        while(left<right){
            do{
                left++;
            }
            while(arr[left] <= pivot);
            do{
                right--;

            }
            while(arr[right] >pivot);

            if(left < right){
                //swap(arr[left],arr[right]);
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
            
            
        }
        //swap(pivot,arr[right]);
        int temp = pivot;
        pivot = arr[right];
        arr[right] = temp;
        return right;
    }
    public static void quickSort(int[]arr,int low,int high){
        if(low<high){
            int pivot = partition(arr, low, high);
            quickSort(arr, low, pivot);
            quickSort(arr, pivot+1, high);
        }
    }
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {7,5,2,9,8,10};
        int n = arr.length;
        quickSort(arr,0,n-1);
        for(int i = 0;i <n;i++){
            System.out.println(arr[i]);
        }
    }
}