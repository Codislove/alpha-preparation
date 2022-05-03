package code;

public class StringReverse {
    public static void main(String[] args) {
        System.out.println(StringFormatter.reverseByStringBuilder("String to be reversed by StringBuilder"));
        System.out.println(StringFormatter.reverseThroughIterating("String to be reversed through iterating"));
    }
}

class StringFormatter {
    static String reverseByStringBuilder(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        return sb.toString();
    }

    static String reverseThroughIterating(String str) {
        char[] ch = str.toCharArray();
        StringBuilder rev = new StringBuilder();
        for (int i = ch.length - 1; i >= 0; i--) {
            rev.append(ch[i]);
        }
        return rev.toString();
    }
}
