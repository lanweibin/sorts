package sorts.binarysearch;

public class BinarySearch {
    public static int binarySearch(int[] nums, int targer){
        int max = nums.length-1;
        int min = 0;
        int mid = (max + min)/2;

        while(nums[mid] != targer){
            if(nums[mid] > targer){
                max = mid -1;
            }else if(nums[mid] < targer){
                min = mid + 1;
            }

            mid = (min+max)/2;
            if(min>max){
                return  -1;
            }
        }
        return mid;
    }

    public static void main(String[] args) {
        int[] nums = {11,22,33,44,55,66};

       int a= binarySearch(nums,22);
       int b =  binarySearch(nums,44);
       int c = binarySearch(nums,88);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
