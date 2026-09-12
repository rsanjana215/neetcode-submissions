class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[][] arr = new int[nums.length][2];

        for(int i=0;i<nums.length;i++){
            arr[i][0] = nums[i];
            arr[i][1] = i;
        }

        Arrays.sort(arr , Comparator.comparingInt(a -> a[0]));

        int ps = 0, pe = nums.length-1;
        while(ps < pe){
            int sum = arr[ps][0] + arr[pe][0];
            if(sum == target){
                return new int[]{Math.min(arr[ps][1], arr[pe][1]) , Math.max(arr[ps][1], arr[pe][1]) };
            }

            else if(sum < target){
                ps++;
            }
            else{
                pe--;
            }
        }

        return new int[0];
    }
}
