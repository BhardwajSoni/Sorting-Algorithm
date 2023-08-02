public class SelectionSort {
    public static void selectionSort(int arr[],int n){
        for(int i=0;i<n-1;i++){
            int minpos=i;
            for(int j=i+1;j<n;j++){
                if(arr[minpos]>arr[j]){
                     minpos=j;
                }
                
            }
            //swap
            int temp=arr[minpos];
            arr[minpos]=arr[i];
            arr[i]=temp;
        }
    }
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={2,4,9,5,7,3,1};
        int n=arr.length;
        selectionSort(arr, n);
        printArray(arr);
    }
}
