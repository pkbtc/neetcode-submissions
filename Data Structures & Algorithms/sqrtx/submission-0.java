class Solution {
    public int mySqrt(int x) {
        int s=1;
        int e=x;
        int ans=0;
        while(s<=e){
            int mid=s+(e-s)/2;
            long sqr=(long)mid*mid;
            if(sqr==x){
                return mid;
            }
            else if(sqr<x){
                ans=mid;
                s=mid+1;
            }
            else {
                e=mid-1;
            }
        }
        return ans;
    }
}