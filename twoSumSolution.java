package Coding;
// Bruto force
class twoSumSolution {
    public static String twoSum(int[] nums, int target) {
        int n = nums.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if((nums[i]+nums[j])==target && i!=j) {
                    return "["+i+","+ j+"]";
                }
             }
        }
        return "";
    }
    public static void main(String[] args){
        int[] arr ={2,7,1};
        int tar = 8;
        System.out.println(twoSum(arr, tar));

    }
}