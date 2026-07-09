class Solution {
    public static int shipWithinDays(int[] weights, int days) {
        int low=Integer.MIN_VALUE;
        int high=0;

        for(int weight:weights){
            low=Math.max(weight,low);
            high+=weight;
        }

        while(low<high){
            int mid=low+(high-low)/2;
            if(isPossible(weights, mid, days)){
                high=mid;
            }
            else {
                low=mid+1;
            }
        }
        return low;


    }
    private static boolean isPossible(int[] weights,int capacity,int days){
        int requriedDays=1;
        int currentWeights=0;
        for(int weight:weights){
            if(currentWeights+weight>capacity){
                requriedDays++;
                currentWeights=weight;
            }
            else{
                currentWeights+=weight;
            }
        }
        if(requriedDays<=days){
            return true;
        }
        else {
            return false;
        }
    }
}