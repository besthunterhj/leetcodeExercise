import java.util.ArrayList;
import java.util.Arrays;

public class exercise7
{
    // 第一次写的，想复杂了
    public int[] plusOne(int[] digits) {

        int inputNum = 0;
        for (int i = 0; i < digits.length; i++)
        {
            int temp = digits[i];
            for (int j = digits.length - i; j > 1; j--)
            {
                temp = temp * 10;
            }
            inputNum += temp;
        }

        int result = inputNum + 1;
        String strResult = Integer.toString(result);

        char[] charArray = strResult.toCharArray();

        ArrayList<Integer> list = new ArrayList<>();
        for (char item : charArray)
        {
            int num = Integer.parseInt(String.valueOf(item));
            list.add(num);
        }

        int[] resultArray = new int[list.size()];

        for (int i = 0; i < list.size(); i++)
        {
            resultArray[i] = list.get(i);
        }

        return resultArray;
    }

    // 简易法，与10求余法
    public static int[] plusOne2(int[] digits)
    {
        for (int i = digits.length - 1; i >= 0; i--)
        {
            digits[i]++;

            // 判断与10求余的情况，如果余数不为0，证明无进位
            digits[i] = digits[i] % 10;

            // 因为首先判断的是个位数，若个位没有进位，那么不用管十位、百位，以此类推；如果个位进位了，要判断是否会导致十位数受到联动也进位了，以此类推
            if (digits[i] != 0)
            {
                return digits;
            }
        }

        // 如果数组所有元素都原本为9，那么这个数组会完成整个循环到达循环体外，因此这里需要针对这种情况
        int[] newArray = new int[digits.length + 1];
        // 因为数组所有元素都原本为9，因此返回的数组应该长度+1，且第0个元素要为1
        newArray[0] = 1;
        for (int i = 0; i < digits.length; i++)
        {
            newArray[i + 1] = digits[i];
        }
        return newArray;
    }

    public static void main(String[] args) {
        int[] test = {9,9};
        int[] result = plusOne2(test);
        System.out.println(Arrays.toString(result));
    }
}

