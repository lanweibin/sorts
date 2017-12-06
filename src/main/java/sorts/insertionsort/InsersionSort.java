package sorts.insertionsort;

/**
 * 工作原理是通过构建有序序列，
 * 对于未排序数据，在已排序序列中从后向前扫描，找到相应位置并插入
 */
public class InsersionSort {
    public static void insertionSort(int[] nums){
        for (int i = 1; i < nums.length; i++) {
            int temp = nums[i];
            int j = 0;

            for (j = i - 1; j >= 0; j--) {
                if(nums[j] >temp){
                    nums[j+1] = nums[j];
                }else {
                    break;
                }

            }

            if(nums[j+1] != temp){
                nums[j+1] = temp;
            }

        }
    }


    public static void main(String[] args) {
        int[] nums = {34,4,56,17,90,65};
        insertionSort(nums);

        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);

        }
    }
}
