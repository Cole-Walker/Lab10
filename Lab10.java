package com.mycompany.lab10;
import java.util.Stack;

public class Lab10 
{
    public static void main(String[] args) 
    {
        Boolean test = isBalanced("(2+4) * 8 + ((3-1) + 7)");
        System.out.println(test);
    }
    public static boolean isBalanced(String expression)
    {
        char[] exp = expression.toCharArray();
        Stack<Character> stack = new Stack();
        
        for (int i = 0; i < exp.length; i++)
        {
            if (exp[i] == '(')
            {
                stack.push('(');
            }
            if (exp[i] == ')')
            {
                if (stack.isEmpty())
                {
                    return false;
                }
                stack.pop();
            }
        }
        
        if (stack.isEmpty())
        {
            return true;
        }
        return false;
    }
}
