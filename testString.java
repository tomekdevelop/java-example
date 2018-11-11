public class testString {


    public static void main(String[] args) {
        String firstWord = "Niep*dl*glosc";


        String newWord = "";


        for (int i = 0; i < firstWord.length(); i++) {

            if (firstWord.charAt(i) != '*') {
                newWord += firstWord.charAt(i);
            }else if (firstWord.charAt(i) == '*') {
                newWord += '_';


            }


        }

        System.out.println(newWord);


    }
}