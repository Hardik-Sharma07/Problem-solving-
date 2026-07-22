class challenge {
    public static void main(String args[]){
        int digits[] = {2,3,4};
        int sum = 0;
        

        for(int y = 0; y < digits.length; y++){
            int multiple = (int)Math.pow(10, digits.length - 1 - y);
            sum = sum + digits[y] * multiple;
            
        }
        sum=sum+1;
      int temp=sum;
      int count=0;
      while(temp>0){
        temp=temp/10;
        count++;
      }
      int result[]=new int [count];
      for(int i=count-1;i>=0;i--){
        result[i]=sum%10;
        sum=sum/10;
        
      }
      System.out.print("[");
     for(int i=0;i<result.length;i++){
        System.out.print(result[i]);
          if(i < result.length - 1) 
            System.out.print(",");
     }
     System.out.print("]");
        
    }
}