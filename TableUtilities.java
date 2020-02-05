 

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        String range = "";
        for (int i = 1; i <= 5; i++){
            for ( int j = 1; j <= 5; j++){
               if (i*j < 10) 
               {range += "  "+ i*j +" |";}
               else if ((i*j >= 10) && (i*j < 100))
               {range += " " + i*j +" |";}
              
                }range += "\n"; 
        }
                return range;
    }

    public static String getLargeMultiplicationTable() {
        String range = "";
        for (int i = 1; i <= 10; i++){
            for ( int j = 1; j <= 10; j++){
               if (i*j < 10) 
               {range += "  "+ i*j +" |";}
               else if ((i*j >= 10) && (i*j < 100))
               {range += " " + i*j +" |";}
               else {
                   range += i*j + " |";}
                 
               
                }range += "\n"; 
        }
                return range;
    }

    public static String getMultiplicationTable(int tableSize) {
        String range = "";
        for (int i = 1; i <= tableSize; i++){
            for ( int j = 1; j <= tableSize; j++){
               if (i*j < 10) 
               {range += "  "+ i*j +" |";}
               else if ((i*j >= 10) && (i*j < 100))
               {range += " " + i*j +" |";}
               else {
                   range += i*j + " |";}
                 
               
                }range += "\n"; 
        }
                return range;
    }
}
