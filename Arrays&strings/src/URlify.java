public class URlify {
    public static void main(String[]args)
    {

    }
    public static void replcaeCharacter(char[] str, int len)
    {
        int spaces = 0;
        for(int i= 0; i < len; i++)
        {
            if(str[i]==' ')
                spaces++;
        }
        int newIndex = len + 2*spaces;
        if(newIndex < str.length)
            str[newIndex] = '\0';

       for(int i = newIndex -1; i >= 0; i--)
       {
           if(str[i] == ' '){
               str[newIndex-1] = '0';
               str[newIndex-2] = '2';
               str[newIndex-3] = '%';
               newIndex = newIndex - 3;

           }
           else{
               str[newIndex -1] = str[i];
               newIndex -- ;
           }
       }
    }
}
