package org.example.String;

public class WordCapitlize {
    public static void Reveres(String s) {
        String[] words = s.split(" ");
        StringBuilder word = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            String sentence = words[i];

            StringBuilder revesrChar = new StringBuilder(sentence).reverse();

            String capi = revesrChar.substring(0, 1).toUpperCase()+revesrChar.substring(1);


            word.append(capi);
            if (i > 0) {
                word.append(" ");
            }
        }
        System.out.println(word.toString());
    }

    public static void main(String[] args) {
        String str = "hello world! I am coding";
        Reveres(str);
    }
}
