public class Palindrome {

    //Is palindrome?
    public static boolean isPalindrome(String str){
        String reverse = "";
        for(int i = str.length() - 1; i >= 0; i--)
        {
            reverse = reverse + str.charAt(i);
        }
        if(str.equals(reverse)){
            return true;
        }
        else{
            return false;
        }
    }

    //method will remove any substring in string
    public static String removeSubstring(String str, String subStr){
        String newStr = str.replace(subStr, "");
        return newStr;
    }

    //count the numbers of times of substrig in string
    public static int countSubstring(String str, String subStr){
        int count = 0;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == subStr.charAt(0)){
                if(str.substring(i, i + subStr.length()).equals(subStr)){
                    count++;
                }
            }
        }
        return count;
    }
}
