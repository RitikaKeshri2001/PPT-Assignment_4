public class Q5_ArrangingCoins {
    public static int arrangeCoins(int n) {
        long l=1;
        long r=n;
        while(l<=r){
            long m=(l+r)/2;
            long mcoin=(m*(m+1)/2);
            if(mcoin==n){
                return (int) m;
            }
            else if(mcoin>n){
                r=m-1;
            }
            else
            {
                l=m+1;
            }
        }
        return (int) r;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(arrangeCoins(n));
    }
}
