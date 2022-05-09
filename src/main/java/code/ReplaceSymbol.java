package code;

public class ReplaceSymbol {
    public static void main(String[] args) {
        String s1="java is an objective oriented language";
        s1 = s1.replace('a','e'); //replaces all occurrences of 'a' to 'e'
        System.out.println(s1);

        String s2="it is a nice moment. Kiss!";
        String replaceString2=s2.replace("is","was");//replaces all occurrences of "is" to "was"
        System.out.println(replaceString2);

        String str = "The last string in the program";

        System.out.println(str);
        String target = null;

        // replacing null with Java. Hence, the NullPointerException is raised.
        str = str.replace(target, "Java");

        System.out.println(str);
    }
}
