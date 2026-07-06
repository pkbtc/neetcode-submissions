class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<operations.length;i++){
            if(operations[i].equals("+")){
                int a=st.pop();
                int b=st.peek();
                st.push(a);
                st.push(a+b);
            }
            else if(operations[i].equals("D")){
                int a=st.peek();
                st.push(2*a);
            }
            else if(operations[i].equals("C")){
                st.pop();
            }
            else {
                st.push(Integer.parseInt(operations[i]));
            }
        }
        int score=0;
        while(!st.isEmpty()){
            score+=st.pop();
        }
        return score;
    }
}