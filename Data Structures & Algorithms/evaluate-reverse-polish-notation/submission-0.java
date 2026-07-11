class Solution {
    public int evalRPN(String[] tokens) {
        Stack<String> st=new Stack<>();
        for(String s:tokens){
            if(s.matches("-?\\d+")){
                st.push(s);
            }else{
                int num2=Integer.parseInt(st.pop());
                int num1=Integer.parseInt(st.pop());
                if(s.equals("+")){
                    int num=num1+num2;
                    String s1 = String.valueOf(num);
                    st.push(s1);
                }else if(s.equals("-")){
                    int num=num1-num2;
                    String s1 = String.valueOf(num);
                    st.push(s1);
                }else if(s.equals("*")){
                     int num=num1*num2;
                     String s1 = String.valueOf(num);
                    st.push(s1);
                }
                else{
                    int num=num1/num2;
                    String s1 = String.valueOf(num);
                    st.push(s1);
                }
                
            }

        }
        return Integer.parseInt(st.pop());
    }
}
