package ds.interesting.questions.questions;

/*
Question : Find the first non repeating character in a string. Time complexity should be O(n)

Example : "aaabbfddd"
Output : f
*/

public class firstNonRepeatingChar {
    public static void main(String[] args) {
        String str = "aaabbfddd";
        boolean t = false;
        int i;
        for(i = 0; i < str.length(); i ++)
            if(str.indexOf(str.charAt(i)) == str.lastIndexOf(str.charAt(i))) {
                t = true;
                break;
            }
        if(t)
            System.out.println(str.charAt(i));
        else
            System.out.println("-1");
    }
}
