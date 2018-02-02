public class OneAway {

    public static void main(String[] args) {

        System.out.println("Replacement:"+replacement("pale", "bale"));
        System.out.println("one Edit:"+oneEdit("bole", "bfe"));
    }

    static boolean replacement(String str1, String str2) {
        int replace = -1;
        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();
        if (str1.length() != str2.length())
            return false;
        for (int i = 0; i < str1.length(); i++) {
            if (ch1[i] != ch2[i])
                replace++;
            if (replace > 0)
                break;
        }
        return replace == 0 ? true : false;
    }

    static boolean oneEdit(String str1, String str2) {
        if (str1.length() != (str2.length() + 1)) {
         System.out.println("inside if");
            return false;
        }
            int index1 = 0;
        int index2 = 0;
        while (index1 < str1.length() && index2 < str2.length()) {
            if (str1.charAt(index1) != str2.charAt(index2)) {
                if (index1 != index2)
                    return false;
                index1++;
            } else {
                index1 ++;
                index2 ++;
            }
        }

    return true;
    }
}