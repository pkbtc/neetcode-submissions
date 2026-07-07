class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<asteroids.length;i++){
            if(st.isEmpty() || asteroids[i]>0){
                st.push(asteroids[i]);
            }
            else {
                while(!st.isEmpty()){
                    int top=st.peek();
                    if(top<0){
                        st.push(asteroids[i]);
                        break;
                    }
                    int modVal=Math.abs(asteroids[i]);
                    if(modVal==top){
                        st.pop();
                        break;
                    }
                    else if(top>modVal){
                        break;
                    }
                    else {
                        st.pop();
                        if(st.isEmpty()){
                            st.push(asteroids[i]);
                            break;
                        }
                    }
                }
            }
        }
        int[] ans=new int[st.size()];
        for(int i=ans.length-1;i>=0;i--){
            ans[i]=st.pop();
        }
        return ans;
    }
}