package misc;

import java.util.Arrays;


public class FilterTests {

    private static final String[] prefixesToRemove = new String[]{"#/CstmrCdtTrfInitn/", "#/", "#", "/"};
    private static final String[] suffixesToRemove = new String[]{"[0]"};


    private static String removeAdditionalDataAtBeginning(String text) {
        return
                Arrays.stream(prefixesToRemove)
                        .filter(prefix -> text.startsWith(prefix)).findFirst()
                        .map(prefix -> text.substring(prefix.length())).orElse(text);
    }

    private static String removeSuffixes(String text) {
        return
                Arrays.stream(suffixesToRemove)
                        .filter(suffix -> text.endsWith(suffix)).findFirst()
                        .map(suffix -> text.substring(0, text.indexOf(suffix))).orElse(text);
    }


    public static void main(String[] args) {

        String[] input = new String[]{"#/CstmrCdtTrfInitn/blaa", "#/blaa", "#blaa", "/blaa", "blaa blaa"};
        for (String text : input) {
            System.out.println(removeAdditionalDataAtBeginning(text));
        }

        System.out.println(removeSuffixes("blaa[0]"));
        System.out.println(removeSuffixes("blaa blaa"));
    }
}


