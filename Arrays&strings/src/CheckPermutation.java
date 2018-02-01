class CheckPermutation {

    public static void main(String[]args)
    {

    System.out.println(permutation("rohit","rohit1"));
    }

    public static boolean permutation(String s, String t)
    {
        if(s.length() != t.length())
            return false;
        int[] letters = new int[128];
        char[] ch = s.toCharArray();
        for(char c: ch)
            letters[c]++;

        for(int i  = 0; i < t.length(); i++)
        {
          int ch1 = (int)t.charAt(i);
          letters[ch1]--;
          if(letters[ch1] < 0)
              return false;
        }
        return true;
    }
}
