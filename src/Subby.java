public class Subby {
    public static String subString(String word,int index){
        String subString = "";
        for (int i = index; i < word.length(); i++) {
            subString += word.charAt(i);
        }
        return subString;
    }
    public static void main(String[] args) {
        System.out.println(subString("Computer", 0));
        String word = "11100111";
        System.out.println(word.substring(3));

    }
}
