package sorts.insertionsort;

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
