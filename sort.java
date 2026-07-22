class java{
    public static boolean isSort(int arr[],int i){
        if(i==arr.length-1){
            return true;
        }
        else{
            return arr[i] <= arr[i+1] && isSort(arr, i+1);
        }
    }
    public static void main(String args[]){
        int arr[]={1,2,3,49,5};
        System.out.println(isSort(arr,0));
    }
}