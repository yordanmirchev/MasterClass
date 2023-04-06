package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        String string = "I am a string. Yes, I am.";
        System.out.println(string);
        String yourStream = string.replaceAll("I", "You");
        System.out.println(yourStream);

        System.out.println("\n");
        String alphaNumeric = "abcdeeeF12Ghiiiijkl99z";
        System.out.println(alphaNumeric.replaceAll(".", "Y"));
        System.out.println(alphaNumeric.replaceAll("^abcdeee", "YYY"));
        System.out.println(alphaNumeric.matches("^hello"));
        System.out.println(alphaNumeric.matches("^abcdeee"));
        System.out.println(alphaNumeric.matches("^abcdeeeF12Ghiiiijkl99z"));

        System.out.println("\n");
        System.out.println(alphaNumeric.replaceAll("ijkl99z$", "THE END"));

        System.out.println("\n");
        System.out.println(alphaNumeric.replaceAll("[aei]", "X"));
        System.out.println(alphaNumeric.replaceAll("[aei][Fj]", "X"));

        System.out.println("\n");
        System.out.println("harry".replaceAll("[Hh]arry", "Harry"));

        System.out.println("\n");
        // Negate char , when used in brackets
        System.out.println(alphaNumeric.replaceAll("[^ej]", "X"));
        System.out.println(alphaNumeric.replaceAll("[abcdef345678]", "X"));
        System.out.println(alphaNumeric.replaceAll("[a-f3-8]", "X"));

        System.out.println("\n");
        System.out.println(alphaNumeric.replaceAll("[a-fA-F3-8]", "X"));
        // case insensitive, for unicode (?iu)
        System.out.println(alphaNumeric.replaceAll("(?i)[a-f3-8]", "X"));

        System.out.println("\n");
        System.out.println(alphaNumeric.replaceAll("[0-9]", "X"));
        System.out.println(alphaNumeric.replaceAll("\\d", "X"));
        // replace non Digits \\D
        System.out.println(alphaNumeric.replaceAll("\\D", "X"));

        System.out.println("\n");
        String hasWhiteSpace = "I have blanks and\ta tab, and also a newline\n";
        System.out.println(hasWhiteSpace);
        // remove all spaces and tabs
        System.out.println(hasWhiteSpace.replaceAll("\\s", ""));
        // Replace tab only
        System.out.println(hasWhiteSpace.replaceAll("\t", ""));
        // Replace all non-whiteSpace chars, only \t \n are left
        System.out.println(hasWhiteSpace.replaceAll("\\S", ""));

        System.out.println("\n");
        //replace all whiteSpace chars
        System.out.println(hasWhiteSpace.replaceAll("\\w", "X"));
        //replace all non-whiteSpace chars
        System.out.println(hasWhiteSpace.replaceAll("\\W", "X"));

        System.out.println("\n");
        //replace word boundry with X
        System.out.println(hasWhiteSpace.replaceAll("\\b", "X"));

        System.out.println("\n");
        //Quantifiers
        alphaNumeric = "abcDeeeF12Ghhiiiijkl99z";
        System.out.println(alphaNumeric.replaceAll("^abcDeee", "YYY"));
        System.out.println(alphaNumeric.replaceAll("^abcDe{3}", "YYY"));
        // one or more 'e'
        System.out.println(alphaNumeric.replaceAll("^abcDe+", "YYY"));
        // zero or more 'e'
        System.out.println(alphaNumeric.replaceAll("^abcDe*", "YYY"));
        // 2 to 5 'e'
        System.out.println(alphaNumeric.replaceAll("^abcDe{2,5}", "YYY"));
        //replace all 'h', followed by any 'i', followed by 'j'
        System.out.println(alphaNumeric.replaceAll("h+i*j", "Y"));


        System.out.println("");
        StringBuilder htmlText = new StringBuilder("<h1My Heading</h1>>");
        htmlText.append("<h2>Sub heading</h2>");
        htmlText.append("<p>First paragraph.</p>");
        htmlText.append("<p>Second paragraph.</p>");
        htmlText.append("<h2>Summary.</h2>");
        htmlText.append("<h2></h2>");
        htmlText.append("<p>Here's the summary.</p>");


        //Patterns

        String h2Pattern = ".*h2.*";
        Pattern pattern = Pattern.compile(h2Pattern);
        Matcher matcher = pattern.matcher(htmlText);
        System.out.println(matcher.matches());

        // Matcher has internal state and oncce find , on previous row, we need to reset it to find another.
        matcher.reset();
        int count = 0;
        while (matcher.find()) {
            count++;
            System.out.println("Occurrence " + count + " : " + matcher.start() + " to " + matcher.end());
        }

        // * is greedy quantifier, it will continue looking for mathcng chars , till it runs out
        // ? is lazy quantifier, it will look for as small match as possible.
        // If we add it, this will turn * to lazy quantifier and we will match only to the first <h2> after the initial match.
        String h2GroupPattern = "(<h2>.*?</h2>)";


        Pattern groupPattern = Pattern.compile(h2GroupPattern);
        Matcher groupMatcher = groupPattern.matcher(htmlText);
        System.out.println(groupMatcher.matches());
        groupMatcher.reset();

        // Group 0 is the whole char sequence, group 1 is our group
        while (groupMatcher.find()) {
            System.out.println("Occurrence: " + groupMatcher.group(1));
        }

        System.out.println();
        // if we don't want empty tags we can use + instead of * , one or more
        // We have three groups
        String h2textGroupPattern = "(<h2>)(.+?)(</h2>)";
        Pattern h2TextPattern = Pattern.compile(h2textGroupPattern);
        Matcher h2TextMatcher = h2TextPattern.matcher(htmlText);

        // Group 0 is the whole char sequence, group 2 is our text group
        while (h2TextMatcher.find()) {
            System.out.println("Occurrence: " + h2TextMatcher.group(2));
        }

        System.out.println();
        //And or , not operators
        System.out.println("harry".replaceAll("[H|h]arry", "Larry"));
        String tvTest = "tstvtkt";
        // find all t not followed by v
        // This will match all execpt the last t
        // as the ^ require that the char is followed by another char, as t is last it won't match
        // String tNotVRegEx = "t[^v]";
        // Instead we can use look ahead not ! operatorm the
        // look ahead () does not actually include the match , we only match the the
        String tNotVRegEx = "t(?!v)"; // negative, !, look ahead
        Pattern tNotPattern = Pattern.compile(tNotVRegEx);
        Matcher tnotMatcher = tNotPattern.matcher(tvTest);
        // positive look ahead would be t(?=v) ; t followed by v ,
        // again the v is not included

        count = 0;
        while (tnotMatcher.find()) {
            count++;
            System.out.println("Occurance " + count + " : " + tnotMatcher.start() + " to " + tnotMatcher.end());
        }

        System.out.println();
        // Phone number validatior
        String phonePattern =  "^([\\(]{1}[0-9]{3}[\\)]{1}[ ]{1}[0-9]{3}[\\-]{1}[0-9]{4})$";
        String phone1 = "1234567890";  // Shouldn't match
        String phone2 = "(123) 456-7890"; // match
        String phone3 = "123 456-7890"; // Shouldn't match
        String phone4 = "(123)456-7890"; // Shouldn't match

        System.out.println("phone1 = " + phone1.matches(phonePattern));
        System.out.println("phone2 = " + phone2.matches(phonePattern));
        System.out.println("phone3 = " + phone3.matches(phonePattern));
        System.out.println("phone4 = " + phone4.matches(phonePattern));

        System.out.println();
        // Amex card validator
        String amexNumberPAttern = "^4[0-9]{12}([0-9]{3})?$";
        String visa1 = "4444444444444"; // should match
        String visa2 = "5444444444444"; // shouldn't match
        String visa3 = "4444444444444444";  // should match
        String visa4 = "4444";  // shouldn't match

        System.out.println("visa1 " + visa1.matches(amexNumberPAttern));
        System.out.println("visa2 " + visa2.matches(amexNumberPAttern));
        System.out.println("visa3 " + visa3.matches(amexNumberPAttern));
        System.out.println("visa4 " + visa4.matches(amexNumberPAttern));



    }
}
