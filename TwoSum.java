package leetCode;

public class TwoSum {

	public static int[] twoSum(int[] nums,int target) {
		for(int i=0;i<nums.length;i++) {
			for(int j=i+1;j<nums.length;j++) {
				if(nums[i]+nums[j]==target) {
				
					System.out.print(" "+i+" "+j);
					return new int[] {i,j};
				}
			}
			
		}
		return new int[] {};
	}
	public static void main(String[]args) {
		int[] nums= {3,2,4};
		twoSum(nums,6);
	
	}

}
