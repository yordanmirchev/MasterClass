package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Chalanges {

    public static void main(String[] args) {

        String challenge1 = "I want a bike.";
        System.out.println(challenge1.matches("^I want a bike.$"));

        String challenge2 = "I want a ball.";
        System.out.println(challenge1.matches("I want a b[a-z]{3}."));
        System.out.println(challenge2.matches("I want a b[a-z]{3}."));

        System.out.println(challenge1.matches("I want a (ball|bike)."));
        System.out.println(challenge2.matches("I want a (ball|bike)."));

        // with a pattern
        Pattern challenge2Pattern = Pattern.compile("I want a b\\w{3}.");
        Matcher challenge2Matcher = challenge2Pattern.matcher(challenge1);
        System.out.println(challenge2Matcher.matches());
        challenge2Matcher = challenge2Pattern.matcher(challenge2);
        System.out.println(challenge2Matcher.matches());

        System.out.println();
        String challenge4 = "Replace all blanks with underscores.";
        System.out.println(challenge4.replaceAll(" ", "_"));
        System.out.println(challenge4.replaceAll("\\s", "_"));

        System.out.println("\nChalange567\n");
        String challenge5 = "aaabccccccccdddefffg";
        System.out.println(challenge5.matches("[abcdefg]+"));
        System.out.println(challenge5.matches("[a-g]+"));

        String challenge6 = "aaabccccccccdddefffg";
        // complete match
        System.out.println(challenge6.matches("^a{3}bc{8}d{3}ef{3}g$"));
        // to confifrm we can use replace
        System.out.println(challenge6.replaceAll("^a{3}bc{8}d{3}ef{3}g$", "REPLACED"));

        System.out.println();
        String chalange7 = "abcd.135";
        System.out.println(chalange7.matches("\\w+.\\d+"));


        // get only digits following pattern from chalange7
        System.out.println("\nChalange8\n");
        String chalange8 = "abcd.135uvqz.7tzik.999";
        String chalange8regex = "\\w+.(\\d+)";
        Pattern chalange8PAttern = Pattern.compile(chalange8regex);
        Matcher chalange8Mattcher = chalange8PAttern.matcher(chalange8);

        // Group 0 is the whole char sequence, group 1 is our text group
        while (chalange8Mattcher.find()) {
            System.out.println("Occurrence: " + chalange8Mattcher.group(1));
        }

        // get only digits following pattern from chalange8, this time we have special symbols \t \n
        System.out.println("\nChalange9\n");
        String chalange9 = "abcd.135\tuvqz.7\ttzik.999\n";
        Pattern chalange9PAttern = Pattern.compile("\\w+.(\\d+)\\s");
        Matcher chalange9Mattcher = chalange9PAttern.matcher(chalange9);

        // Group 0 is the whole char sequence, group 1 is our text group
        while (chalange9Mattcher.find()) {
            System.out.println("Occurrence: " + chalange9Mattcher.group(1));
        }

        // Print start and end
        System.out.println("\nChalange10\n");
        String chalange10 = "abcd.135\tuvqz.7\ttzik.999\n";
        Pattern chalange10PAttern = Pattern.compile("\\w+.(\\d+)\\s");
        Matcher chalange10Mattcher = chalange10PAttern.matcher(chalange10);

        // Group 0 is the whole char sequence, group 1 is our text group
        while (chalange10Mattcher.find()) {
            System.out.println("Occurrence start: " + chalange10Mattcher.start(1) + " end: " + (chalange10Mattcher.end(1) - 1));
        }

        // Extract from curly braces
        System.out.println("\nChalange11\n");
        String chalange11 = "{0, 2}, {0, 5}, {1, 3}, {3, 17}, {5, 119}";
        //Pattern chalange11PAttern = Pattern.compile("\\{(\\d+, \\d+)\\}");
        // We use ? to turn * into lazy quantifier so we match only the group,
        // if removed will match till the last }
        Pattern chalange11PAttern = Pattern.compile("\\{(.*?)\\}");
        Matcher chalange11Mattcher = chalange11PAttern.matcher(chalange11);

        // Group 0 is the whole char sequence, group 1 is our text group
        while (chalange11Mattcher.find()) {
            System.out.println("Occurrence: " + chalange11Mattcher.group(1));
        }


        //  Validate 5 digit zip code
        System.out.println("\nChalange12\n");
        String chalange12 = "11111";
        System.out.println(chalange12.matches("^\\d{5}$") ? "Valid" : "Invalid ");


        //  Validate 5-4 digit zip code
        System.out.println("\nChalange13\n");
        String chalange13 = "11111-1234";
        System.out.println(chalange13.matches("^\\d{5}-\\d{4}$") ? "Valid" : "Invalid ");

        //  Validate 5 or 5-4 digit zip code
        System.out.println("\nChalange14\n");
        String[] chalange14 = {"11111", "11111-1234", "123-12345", "1234"};

        for (String code : chalange14) {
            //System.out.println("code: " + code + " is " + (code.matches("^\\d{5}(-\\d{4}){0,1}$") ? "Valid" : "Invalid "));
            // ? after the group indicates it could be 0 or 1 occurrence
            System.out.println("code: " + code + " is " + (code.matches("^\\d{5}(-\\d{4})?$") ? "Valid" : "Invalid "));
        }

    }

}
