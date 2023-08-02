public class BubbleSort{
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void bubbleSort(int arr[],int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        printArray(arr);


    }
     
    public static void main(String[] args) {
        int arr[]={5,-4,3,9,8,0,0,2,1};
        int n=arr.length;
        bubbleSort(arr, n);
    }
}