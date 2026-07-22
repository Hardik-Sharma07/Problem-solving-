class Solution {
    public int[] plusOne(int[] digits) {
        int sum=0;
        int value=0;
        int multiple=0; 
        int x=0;
        for(int i=0;i<digits.length;i++){

        digits[i]= x;
    for(int y=0;y<digits.length;y++){
        multiple=10^y;
        sum=sum+x*multiple;
            }
        }
        return sum;
    }
}