import java.util.Arrays;

public class AnagramChecker {
    public static boolean areAnagrams(String str1, String str2) {
        // Remove whitespace and convert to lowercase for case-insensitive comparison
        String s1 = str1.replaceAll("\\s", "").toLowerCase();
        String s2 = str2.replaceAll("\\s", "").toLowerCase();

        // Check if lengths are different; if so, they can't be anagrams
        if (s1.length() != s2.length()) {
            return false;
        }

        // Convert strings to character arrays and sort them
        char[] charArray1 = s1.toCharArray();
        char[] charArray2 = s2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        // Compare the sorted arrays
        return Arrays.equals(charArray1, charArray2);
    }

    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";
        System.out.println(str1 + " and " + str2 + " are anagrams: " + areAnagrams(str1, str2));

        String str3 = "hello";
        String str4 = "world";
        System.out.println(str3 + " and " + str4 + " are anagrams: " + areAnagrams(str3, str4));

        String str5 = "Debit card";
        String str6 = "Bad credit";

        System.out.println(str5 + " and " + str6 + " are anagrams: " + areAnagrams(str5, str6));
    }
}