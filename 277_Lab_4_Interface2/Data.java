public class Data
{
   /**
      Computes the average of the measures of the given objects.
      @param objects an array of Measurable objects
      @return the average of the measures
   */
   public static Measurable smaller(Measurable[] obj)
   {
	  Measurable item = obj[0];
	  for(int i = 1;i<obj.length;i++){
      if(item.getMeasure() > obj[i].getMeasure())
	      {
	    	  item = obj[i];
	      }
	  }
	  return item;
   }
}
