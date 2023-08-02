public class InsertionSort {
    public static void insertionSort(int arr[],int n){
    for(int j=1;j<n;j++){
        int key=arr[j];
        int i=j-1;
        while(i >=0 && arr[i]>key){
            arr[i+1]=arr[i];
            i--;
        }
        arr[i+1]=key;
    }
         
    }


    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
     public static void main(String[] args) {
        int arr[]={4,7,5,1};
        int n=arr.length;
        insertionSort(arr, n);
        printArray(arr);
     }
}
