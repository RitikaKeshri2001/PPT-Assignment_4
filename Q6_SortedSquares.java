public class Q6_SortedSquares {
    public static int[] sortedSquares(int[] nums) {
        int l = 0, r = nums.length-1, n = nums.length-1;
        int result[] = new int[nums.length];
        while(l <= r) {
            if(nums[l]*nums[l] >= nums[r]*nums[r]) {
                result[n] = nums[l]*nums[l];
                l++;
            } else {
                result[n] = nums[r] * nums[r];
                r--;
            }
            n--;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {-4,-1,0,3,10};
        int[] sq = sortedSquares(nums);
        for(int i=0; i<sq.length; i++) {
            System.out.print(sq[i] + " ");
        }
        System.out.println();
    }
}
