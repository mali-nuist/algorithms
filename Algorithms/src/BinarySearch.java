import java.util.Arrays;

/******************************************************************************
 *  Name:    mali
 *  Date:    17-2-25
 *  Time:    下午1:28
 *  NetID:   mali
 *  Precept: N/A
 *
 *  Partner Name:    N/A
 *  Partner NetID:   N/A
 *  Partner Precept: N/A
 *
 *  Description: ${二分搜索　时间复杂度　排序好的　lgN; 未排序好的　NlgN}
 ******************************************************************************/
public class BinarySearch {

    public static boolean search (int[] array, int num) {
        // 完整拷贝一份　不然排序会影响原数组
        int[] arr = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            arr[i] = array[i];
        }
        // 排序
        Arrays.sort(arr);
        // 查找
        int lo = 0; //　查找数组部分的最小下标
        int hi = arr.length - 1; //查找数组部分的最大下标
        while (lo <= hi) { // 退出的情况要考虑清楚
            int mid = lo + (hi - lo) / 2;
            if (num < arr[mid]) hi = mid - 1;
            if (num > arr[mid]) lo = mid + 1;
            if (num == arr[mid]) {
                System.out.println(mid);
                return true;
            }
        }
        System.out.println(lo + " " + hi);
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        boolean exist = BinarySearch.search(arr,6);
        System.out.println(exist + " " );
    }
}
