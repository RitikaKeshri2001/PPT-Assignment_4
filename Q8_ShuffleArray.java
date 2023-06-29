public class Q8_ShuffleArray {
    public static int[] shuffle(int[] nums, int n) {
        int l=0, i=0;
        int[] result = new int[nums.length];
        while(i<nums.length) {
            result[i++] = nums[l++];
            result[i++] = nums[n++];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {2,5,1,3,4,7};
        int n=3;
        int[] res = shuffle(nums, n);
        for(int i: res) {
            System.out.print(i+" ");
        }
    }
}
