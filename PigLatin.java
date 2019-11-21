
public class PigLatin
{

    public static void main(String args[]){
        wordSeperator("a");
        wordSeperator("car");
        wordSeperator("I love starcraft");
        
    }

    public static void wordSeperator(String str){
        str=str+" ";
        int b=0;
        for(int i=0; i<str.length(); i++){
            
            if(str.charAt(i)==' '){
                String word=str.substring(b,i);
                System.out.print(pigLatin(word));
                b=i+1;
            }
        }
        System.out.println("");
    }

    public static String pigLatin(String word)
    {
        if(word.length()<2){
            return word+" ";
        }
        else{
            return word.substring(1,word.length())+word.charAt(0)+"ay ";
        }
    }
}

