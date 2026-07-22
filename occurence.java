class occurence{
public static int countoccurence(int  arr[],int key,int n){
    if(n==arr.length){
        return -1;
    }

if(arr[n]==key){
   
    return n;
}


return countoccurence(arr, key, n+1);
}
public static void main(String args[]){
    int arr[]={1,2,3,4,5,6,7,8,9};
    int n=0;
    int key=8;
    System.out.println(countoccurence(arr, key, n));
}
}
