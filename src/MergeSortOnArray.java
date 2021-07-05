public class MergeSortOnArray {
    
    void SplitSubroutine(int[] arr,int left,int right){
        if(left<right){
            int mid = left + (right-1)/2;
            SplitSubroutine(arr,left,mid);
            SplitSubroutine(arr,mid+1,right);

            merge(arr,left,mid,right);
        }
    }

    void merge(int[]arr,int left,int mid,int right){
        
    }
}
