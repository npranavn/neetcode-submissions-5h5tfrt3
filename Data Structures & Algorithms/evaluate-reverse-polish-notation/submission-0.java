class Solution {
    public int evalRPN(String[] tokens) {
       
        Stack<Integer> stack = new Stack<>();

       for(String s : tokens){
        if(s.equalsIgnoreCase("+") || s.equalsIgnoreCase("-")
        || s.equalsIgnoreCase("*") || s.equalsIgnoreCase("/")){
            int b = stack.pop();
            int a = stack.pop();

            if(s.equalsIgnoreCase("+")){
                stack.push(a+b);
            }
            if(s.equalsIgnoreCase("-")){
                stack.push(a-b);
            }
            if(s.equalsIgnoreCase("*")){
                stack.push(a*b);
            }
            if(s.equalsIgnoreCase("/")){
                stack.push(a/b);
            }
        }else{
            stack.push(Integer.parseInt(s));
        }
       }

       return stack.pop(); 

    }
}
