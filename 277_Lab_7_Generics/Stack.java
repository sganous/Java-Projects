import java.util.*;
/**
 * @author Sergey Ganous
 * @since 2/25/16
 * @param <E>
 * Ch 18 - Generic Lab
 */
public class Stack<E>
{
   private ArrayList<E> myList;
    
   public Stack()
   {
      myList = new ArrayList<E>();
   }

   public void push(E item)
   {
      myList.add(item);
   }

   public E pop()
   {
      E retItem = null;
      if (!myList.isEmpty())
      {
         retItem = myList.remove(myList.size() - 1);
      }
      return retItem;
   }

   public boolean  empty()
   {
      return myList.isEmpty();
   }
}


