
public class DecimalBinaryConverter
{
    public static void main(String args[]){
        decimalBinaryConverter(2);
        decimalBinaryConverter(15);
    }

    public static void decimalBinaryConverter(int n)
    {
        String ans="";
        while(n>0){
            
            int r=n%2;
            n=n/2;
            
            ans=r+ans;
            
        }
        
        System.out.println(ans);
    }
}
