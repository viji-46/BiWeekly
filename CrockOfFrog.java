import java.util.Scanner;

public class CrockOfFrog 
{
    public static int minNumberOfFrogs(String croakOfFrogs)
    {
        int[] cnt = new int[5];
        int frogs = 0, max_frogs = 0;
        for (int i = 0; i < croakOfFrogs.length(); i++) 
        {
            char ch = croakOfFrogs.charAt(i);
            int n = "croak".indexOf(ch);
            if (n == -1) return -1;
            cnt[n]++;
            if (n == 0)
            {
                frogs++;
                max_frogs = Math.max(max_frogs, frogs);
            } 
            else 
            {
                cnt[n - 1]--;
                if (cnt[n - 1] < 0) return -1;
                if (n == 4) frogs--;
            }
        }
        return frogs == 0 ? max_frogs : -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter croak string:");
        String s = sc.nextLine();
        int result = minNumberOfFrogs(s);
        System.out.println("Output: " + result);
    }
}
