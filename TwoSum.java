package com.briji.leetcode;

import java.util.Arrays;

public class TwoSum {

	//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

	public static void main(String[] args) {
		
		int [] nums = {2,7,11,15};
		int target = 9;
				
	int [] res = twoSum(nums, target);
	System.out.println("output is :" + res[0] +" : " +res[1] ) ;
		
	}

	public static int[] twoSum(int[] nums, int target) {

		// Arrays.asList(nums).stream().filter(n-> if(n+))
		
		for(int i = 0 ; i<nums.length-1 ; i++) {
			for(int j = nums.length-1; j>0 ; j--) {		
				if( (nums[i] + nums[j] == target) && (i!=j) ) {
					return new int[]{i, j};
				}
			}
		}
        return new int[0];
        
    }
	
}
