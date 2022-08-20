// An array is a set of elements arranged in rows.
package java.Arrays;

public class Arrays {
    public static void main(String[] args) {
      String[] androidVersions = new String[17];
      String days[] = new String[7];
  
      String cities[][] = new String[4][2];
  
      int numbers[][][] = new int[4][2][2];
      int numbers4[][][][] = new int[4][2][2][9];
  
      // ----------------------------------- //
      androidVersions[0] = "Apple Pie";
      androidVersions[1] = "Banana Bread";
      androidVersions[2] = "Cupcake";
      androidVersions[3] = "Donut";
  
      for (int i = 0; i <= 3; i++) {
        System.out.println(androidVersions[i]);
      }
  
      // ----------------------------------- //
      cities[0][0] = "Colombia";
      cities[0][1] = "Medellin";
      cities[1][0] = "Colombia";
      cities[1][1] = "Bogota";
      cities[2][0] = "Mexico";
      cities[2][1] = "Guadalajara";
      cities[3][0] = "Mexico";
      cities[3][1] = "CDMX";
  
      /* <BEFORE>
          System.out.println(cities[0][0]);
          System.out.println(cities[0][1]);
          System.out.println(cities[1][0]);
          System.out.println(cities[1][1]);
          System.out.println(cities[2][0]);
          System.out.println(cities[2][1]);
          System.out.println(cities[3][0]);
          System.out.println(cities[3][1]);
      */
  
      // <AFTER>
      for (int i = 0; i < cities.length; i++) {
        for (int j = 0; j < cities[i].length; j++) {
          System.out.println(cities[i][j]);
        }
      }
    }
  }
  