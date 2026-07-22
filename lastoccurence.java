class lastoccurence{
public static int countoccurence(int  arr[],int key,int n){
    if(n<0){
        return -1;
    }

if(arr[n]==key){
   
    return n;
}


return countoccurence(arr, key, n-1);
}
public static void main(String args[]){
    int arr[]={1,2,3,4,5,7,2,4,9,0,6,7,8,1,9};
  
    int key=6;
    System.out.println(countoccurence(arr, key, arr.length-1));
}
}
