public class MyString {
    public static void main(String[] args) {
        System.out.println("Testing lowercase:");
        System.out.println("UnHappy : " + lowerCase("UnHappy"));
        System.out.println("This costs 15 Sheksls : " + lowerCase("This costs 15 Sheksls"));
        System.out.println("TLV : " + lowerCase("TLV"));
        System.out.println("lowercase : " + lowerCase("lowercase"));

        System.out.println("Testing contains:");
        System.out.println(contains("unhappy", "happy")); // true
        System.out.println(contains("happy", "unhappy")); // false
        System.out.println(contains("historical", "story")); // false
        System.out.println(contains("psychology", "psycho")); // true
        System.out.println(contains("personality", "son")); // true
        System.out.println(contains("personality", "dad")); // false
        System.out.println(contains("resignation", "sign")); // true
    }

    /** Returns the lowercase version of the given string. */
    public static String lowerCase(String str) {
        for (int i = 0; i < str.length(); i++) {
            if ( ((int) str.charAt(i)) >= 65 && ((int) str.charAt(i)) <= 90) { // obv the uppercase chars in unicode are between 65 and 90
                str = str.substring(0, i) + ( (char) ((int) str.charAt(i) + 32) ) + str.substring(i + 1); // and unicode lowercase are uppercase + 32 
            }
        }
        return str;
    }

    /** If str1 contains str2, returns true; otherwise returns false. */
    public static boolean contains(String str1, String str2) {
        for (int i = 0; i < str1.length(); i++) {
            int tmpi = i;
            if (str1.length() - tmpi < str2.length()) {
                return false;
            }
            for (int j = 0; j < str2.length(); j++) {
                if (str1.charAt(tmpi) == str2.charAt(j)) {
                    tmpi++;
                }
                else {
                    break;
                }
                if ( j >= (str2.length()-1) || tmpi >= (str1.length()-1) ) {
                    return true;
                }
            }
        }
        return str2.length() == 0; // empty strings are "contained" in all strings ygm
    }
}
