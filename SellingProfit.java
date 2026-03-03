package BestSell;
import java.util.Scanner;
public class SellingProfit {
public int maxprofit(int[] prices)
{
	int max=0;
	int profit=0;
	int buy=prices[0];
	for(int i=1;i<prices.length;i++)
	{
		if(buy>prices[i])
		{
			buy=prices[i];
		}
		else
		{
			profit= prices[i]-buy;
		}
		max=Math.max(max,profit);
	}
	return max;
}
  public static void main(String[] args)
 {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter number of days: ");
    int n = sc.nextInt();
    int[] prices = new int[n];
    System.out.println("Enter prices:");
    for (int i = 0; i < n; i++) 
    {
        prices[i] = sc.nextInt();
    }
    SellingProfit sp= new SellingProfit();
    int result = sp.maxprofit(prices);
    System.out.println("Maximum Profit: " + result);
    sc.close();
  }
}
