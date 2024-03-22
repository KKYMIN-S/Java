package Java_;

import java.util.Stack;

public class Stack_String {
    public static void main(String[] args){
        Stack<String> stack_str = new Stack<>();
        char ch = 'A';
        String str;
        for(int i = 0; i<5; i++){
            str = "" + ch;
            stack_str.push(str);
            System.out.println("after push(" + ch + "), stacj_str : " + stack_str);
            ch += 1;
        }
        for (int i = 0; i<5; i++){
            str = stack_str.pop();
            System.out.println("agter pop(" + str + "), stack_str : " + stack_str);
        }
    }
}
