package code;

public class RemoveSymbol {
    public static void main(String[] args) {
        String str = "abcdDCBab123";
        System.out.println("Source string is: " + str);

        System.out.println("String after Removing 'a' = " + str.replace("a", ""));

        System.out.println("String after Removing First 'a' = " + str.replaceFirst("ab", ""));

        System.out.println("String after replacing all small letters = " + str.replaceAll("([a-z])", ""));

        System.out.println();
        int position = 3;
        System.out.println("String after deleting symbol at position " + position);
        System.out.println(str.substring(0, position) + str.substring(position + 1));
    }
}
