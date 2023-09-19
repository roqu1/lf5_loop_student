package palindrom;

public class Palindrom {
    public boolean isPalindrom(String text){
        String dividedTextSecond = text.substring((text.length()+1)/2);
        String dividedTextFirst = text.substring(0, text.length()/2);
        String reverseTextSecond = new StringBuffer(dividedTextSecond).reverse().toString();
        String result = "";
        for(int i = 0;i<=dividedTextFirst.length();i++){
            if(dividedTextFirst.charAt(i) == reverseTextSecond.charAt(i)){
                result += dividedTextFirst.charAt(i);
            } else {
                return false;
            }
        }

        return true;
    }
}
