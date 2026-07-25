<<<<<<< HEAD
class friendparing{
    public static int pair(int n){
        if(n==1 ||n==2){
            return n;
        }
        int fnm1=pair(n-1);
        int fnm2=pair(n-2);
        int pairways=(n-1)*fnm2;
        int total=fnm1+pairways;
        return total;
    }
    public static void main(String args[]) {
        int n=3;
        System.out.println(pair(n));
    }

=======
class friendparing{
    public static int pair(int n){
        if(n==1 ||n==2){
            return n;
        }
        int fnm1=pair(n-1);
        int fnm2=pair(n-2);
        int pairways=(n-1)*fnm2;
        int total=fnm1+pairways;
        return total;
    }
    public static void main(String args[]) {
        int n=3;
        System.out.println(pair(n));
    }

>>>>>>> de66126e9b5449bb124927709b0285bd5f0f6eb5
}