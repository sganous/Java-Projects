public class StackRunner
{
   public static void main(String[] args)
   {
      Stack<Character> stk1 = new Stack<Character>();
      stk1.push('1');
      stk1.push('2');
      stk1.push('3');
      stk1.push('4');
      while (!stk1.empty())
      {
         System.out.println(stk1.pop());
      }
   }
}