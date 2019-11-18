
public class palindrome
{

    public static void main(String args[])
    {
        palindrome("racecar");
        palindrome("A man, a plan, a canal: Panama.");
        palindrome("Amy, must I jujitsu my ma?");
        palindrome("baby");
    }

    public static void palindrome(String str)
    {
        int x=str.length();
        String p="";
        for(int i=0; i<x; i++){
            if(Character.isLetter(str.charAt(i))){
                p=p+str.charAt(i);
            }
        }
        int y=p.length();
        int a=0;
        for(int i=0; i<=y/2; i++){
            if(p.charAt(i)==p.charAt(y-i-1)){
                a++;
            }
        }
        if(a==0){
            System.out.println(str+" is not a palindrome");
        }
        else{
            System.out.println("<"+ str+ ">"+" is a palindrome");
        }
    }

}
