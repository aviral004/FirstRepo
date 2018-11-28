package test;
public class Test {
    public static boolean isPalindrome(String word) {
        String w = word.toLowerCase();  int count=0;
        int j=w.length()-1;
            for (int i =0;i<w.length()/2;i++,j--)
            {
            	System.out.println("i= "+i+w.charAt(i)+"    j= "+i+w.charAt(j));
                if (w.charAt(i)!=w.charAt(j))
                {
                   count++; 
                }
            }
                
        if( count > 0 )
        {
            return false;
        }
       else
        return true;
    }
    
    public static void main(String[] args) {
        System.out.println(Test.isPalindrome("Deleveled"));
    }
}