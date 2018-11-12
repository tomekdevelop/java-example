public class testBreak {

    public static void main(String[] args) {
        String word = "abcdef";
        String result ="";

        System.out.println(word.charAt(2));

        for (int i = 0; i < word.length() ; i++) {

                if(i != word.charAt(2)){



                    result += word.charAt(i);
                }
        }

        System.out.println(result);

    }
}
