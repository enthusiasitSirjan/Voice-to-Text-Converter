package example.com.vtt;

/**
 * Created by Sirjan .
 */

class MakeCode_ {

    static String getCode(String word) {
        word = word.toLowerCase();
        if (word.contains(" ")) {
            word = word.replaceAll(" ", "_");
        }
        return word;
    }
}
