package primary.array;

public class exercise2 {
    public static int maxProfit(int[] prices)
    {
        // 由于当持有股票时需要出售方可再次购买股票
        // 因此实际上是计算数组相邻元素之差的最大解

        int[] differences = new int[prices.length - 1];

        for (int i = 0; i < prices.length - 1; i++)
        {
            int j = i + 1;

            // 计算数组所有相邻元素的差值
            differences[i] = prices[j] - prices[i];
        }

        // 选择最优方案
        int maxProfit = 0;
        for (int difference : differences)
        {
            if (difference > 0)
            {
                maxProfit += difference;
            }
        }

        return maxProfit;
    }

    public static void main(String[] args)
    {
        int[] test = {7, 1, 5, 3, 6, 4};

        System.out.println(maxProfit(test));
    }
}
