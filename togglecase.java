import java.util.*;
class togglecase
{
    public void main()
    {
        Scanner SC=new Scanner(System.in);
        System.out.println("Enter a string");
        String S=SC.nextLine();
        String S2="";
        int length=S.length();
        for (int i=0;i<length;i++)
        {
          char ch=S.charAt(i);
          if (ch>='A' && ch<='Z')
          {
              ch=Character.toLowerCase(ch); 
          }
          else if (ch>='a' && ch<='z')
          {
              ch=Character.toUpperCase(ch);
          }
          S2=S2+ch;
        }
        System.out.println(S2);
    }
}
          