import java.util.ArrayList;
import java.util.Arrays;

public class exercise6
{


    public static int[] intersect(int[] nums1, int[] nums2)
    {
        if (nums1.length == 0)
            return nums2;
        if (nums2.length == 0)
            return nums1;

        // 先做个排序，让两个数组都变成有序数组
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        // 新建一个ArrayList数据结构，方便元素的添加和结果数组的构成
        ArrayList<Integer> list = new ArrayList<>();

        // 双指针处理
        for (int i = 0, j = 0; i < nums1.length && j < nums2.length;)
        {
            if (nums1[i] == nums2[j])
            {
                list.add(nums1[i]);
                i++;
                j++;
            }
            else if (nums1[i] > nums2[j])
            {
                j++;
            }
            else if (nums1[i] < nums2[j])
            {
                i++;
            }
        }

        int[] resultArray = new int[list.size()];

        for (int i = 0; i < resultArray.length; i++)
        {
            resultArray[i] = list.get(i);
        }

        return resultArray;
    }

    public static void main(String[] args)
    {
        int[] nums = {1,1,2,2,5};
        int[] arr = {2,3};

        System.out.println(Arrays.toString(intersect(nums, arr)));
    }
}
