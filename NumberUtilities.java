


public class NumberUtilities {

    public static String getRange(int stop) {
        String range = "";
        for (int i = 0; i < stop; i++)
        range += i;
       
       
        return range;
    }

    public static String getRange(int start, int stop) {
       String range = "";
       for (int i = start; i < stop; i++)
       range += i;
        return(range);
    }


    public static String getRange(int start, int stop, int step) {
        String range ="";
        for (int i = start; i < stop; i+=step)
        range += i;
        return range;
      
    }

    public static String getEvenNumbers(int start, int stop) {
        String evens ="";
        for (int i = start; i < stop; i++){
          if (i%2 ==0){
            evens += i;
          }
        }   
        return evens;

    }
    public static String getOddNumbers(int start, int stop) {
        String odds ="";
        for (int i = start; i < stop; i++){
            if (i%2 == 1){
             odds += i;
          }
         }
        return odds;    
        
    }

    public static String getExponentiations(int start, int stop, int exponent) {
        String range = "";
        int power = 1;
        for (int i = start; i <= stop; i++){
            power = 1;
            for ( int j = 1; j <= exponent; j++){
                power *= i;}
                range += power;
            }
        return range;
    }
}
