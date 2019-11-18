
public class PigLatin
{
    public static void main(String args[]){
        pigLatin("car ");
        pigLatin("I love starcraft");
    }

    public static void pigLatin(String str)
    {
        String ans="";
        if(str.length()<=2){
            System.out.println(str);
        }
        else{
            for(int i=0; i<str.length()-1; i++){
                if(str.substring(i,i+1).equals("")){
                    ans=ans+str.substring(0,i)+str.charAt(0)+"ay ";
                }
            }
            System.out.println(ans);
            
        }
    }
}
