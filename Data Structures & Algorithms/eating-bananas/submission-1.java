class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int min=1;
        int max=Integer.MIN_VALUE;
        for(int pile:piles){
            max=Math.max(pile,max);
        }
        int low=min;
        int high=max;
        while(low<high){
            int mid=low+(high-low)/2;
            if(isPossible(piles, mid, h)){
                high=mid;
            }
            else {
                low=mid+1;
            }
        }
        return low;

    }
    private boolean isPossible(int[] piles,int speed,int h){
        int totalHours=0;

        for(int pile:piles){
            totalHours=totalHours+(int)Math.ceil(((double)pile/speed)) ;
        }
        if(totalHours<=h){
            return true;
        }
        else {
            return false;
        }
    }
}
