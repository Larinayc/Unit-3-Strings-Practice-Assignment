

class Question1PPAP
{
    static String object1;
    static String object2;
    
    public static void main(String args[])
    {
        verse("I have a pointer, I have a null");
        System.out.println("Uh! "+ object2 + object1);
        verse("I have a boomer, I have a okay");
        System.out.println("Uh! "+ object2 + object1);
    }

    public static void verse(String x)
    {
        System.out.println(x);
        int comma=x.indexOf(",");
        object1=x.substring(9,comma);
        object2=x.substring(20+object1.length()); 
    }
}

