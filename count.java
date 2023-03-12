public class count_even_odd{
    public static void main(int n){
        int d,e=0,o=0;
        while(n!=0){
           d=n%10;
           n=n/10;
           if(d%2==0)
           ++e;
           else
           ++o;
        }
        System.out.println("even"+e);
        System.out.println("odd"+o);
        }
        
    }
