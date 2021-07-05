public class QUickSOrtv2 {
    void swap(int[]arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    int partition(int[]arr,int low,int high){
        int pi = arr[low];
        int i = low+1;
        int j = high;
        while(i<= j){
            while(i<= high && arr[i]<= pi){
                i++;
            }
            while(j >= low && arr[j] > pi){
                j--;
            }
            if(i <j){
                swap(arr,i,j);
            }
        }
        swap(arr,low,j);
        return j;
    }
    void QuickSort(int[] arr,int low,int high){
        if(low >high){
            return;
        }
        int Index = partition(arr, low, high);
        QuickSort(arr, low, Index-1);
        QuickSort(arr, Index+1, high);
        
    }
    void PrintArray(int[]arr,int size){
        for(int i = 0;i <size;i++){
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {4, 1, 3, 9, 7};
        int n = arr.length;

        QUickSOrtv2 ob = new QUickSOrtv2();

        ob.QuickSort(arr, 0, n-1);
        ob.PrintArray(arr, n);

    }

}
