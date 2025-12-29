/*
Subarrays of an array! 
*/

class prog71{
    public static void printSubArrays(int[] nums , int i , String temp)
    {
        if(i==nums.length) return;
        temp = temp + Integer.toString(nums[i]);
        temp +=" ";
        System.out.println("["+temp+"]");
        printSubArrays(nums,i+1,temp);
    }
    public static void generateSubArrays(int[] nums , int idx)
    {
        if (idx==nums.length) return;
        printSubArrays(nums,idx,new String(""));
        generateSubArrays(nums,idx+1);
    }
    public static void main(String args[])
    {
        int nums[] = {1,2,3,4};
        generateSubArrays(nums , 0);
    }
}