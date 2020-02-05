 

public class TriangleUtilities {

    public static String getRow(int numberOfStars) {
        String range = "";
        for (int i = 1; i <= numberOfStars; i++){
            range += "*";
        }    
        return range;
    }
    
    public static String getTriangle(int numberOfRows) {
        String range = "";
        for (int i = 1; i <= numberOfRows; i++){
            for ( int j = 1; j <= i; j++){
                range += "*";}
                  range += "\n";
          }
                return range;  
    }
    
    


    public static String getSmallTriangle() {
        String range = "";
        for (int i = 1; i <= 4 ; i++){
            for ( int j = 1; j <= i; j++){
                range += "*";}
                  range += "\n";
          }
                return range; 
    }

    public static String getLargeTriangle() {
        String range = "";
        for (int i = 1; i <= 9; i++){
            for ( int j = 1; j <= i; j++){
                range += "*";}
                  range += "\n";
          }
                return range; 
    }
}
