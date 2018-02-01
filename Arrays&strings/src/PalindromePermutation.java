public class PalindromePermutation {

    public static void main(String[]args)
    {
        String name = "tact coa";
        System.out.println(isPermutationOfPalindrome(name));
    }
    static boolean isPermutationOfPalindrome(String phrase) {
         int countOdd = 0;
         int[] table = new int[Character.getNumericValue('z') - Character.getNumericValue('a') + 1];
        for (char c : phrase.toCharArray()) {
             int x = getCharNumber(c);
             if (x != -1) {
                 table[x]++;
                 if (table[x] % 2 == 1) {
                     countOdd++;
                     } else {
                     countOdd--;
                     }
             }
        }
        System.out.println(countOdd);
         return countOdd <= 1;
         }
    static int getCharNumber(Character c) {
        int a= Character.getNumericValue('a');
         int z = Character.getNumericValue('z');
         int val= Character.getNumericValue(c);
         if (a<= val && val<= z) {
             return val - a;
             }
         return -1;
         }
}


