class power{
    public static int answer(int n ,int x){
        if (n==0){
            return 1;
        }
        else {
            return x*answer(n-1,x);
        } 

        }
        public static void main (String args[]){
            int x=5;
            int n=9;
            System.out.println(answer(n, x));
        }
    }
