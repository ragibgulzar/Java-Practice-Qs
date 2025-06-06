public class Patterns{


    static void RectangularStarPattern(int n){
      for(int i = 0; i < n; i++){
         for(int j = 0; j < n; j++){
             System.out.print("* ");
         }
         System.out.println();
      }
    }

    static void RightAngledTrianglePattern(int n){

      for(int i = 0; i < n; i++){
        for(int j = 0; j <= i; j++){
          System.out.print("* ");
        }
        System.out.println();
      }
    }


    static void RightAngledNumberPyramid(int n){

      for(int i = 1; i < n; i++){
        for(int j = 1; j <= i; j++){
          System.out.print(j+" ");
        }
        System.out.println();
      }
    }


    static void RightAngledNumberPyramid2(int n){

      
      for(int i = 1; i < n; i++){
        for(int j = 1; j <= i; j++){
          System.out.print(i+" ");
        }
        System.out.println();
      }

    }


  static void InvertedRightPyramid(int n){
    for(int i = n; i>= 0; i--){
      for(int j = i; j >=0; j--){
        System.out.print("* ");
      }
      System.out.println();
    }
  }

  static void InvertedNumberedRightPyramid(int n){
    for(int i = n; i> 0; i--){
      for(int j = i; j >0; j--){
        System.out.print(j + " ");
      }
      System.out.println();
    }
  }



    public static void main(String[] args) {
        
      int n = 5;

      RectangularStarPattern(n);

      System.out.println();

      RightAngledTrianglePattern(n);

      System.out.println();

      RightAngledNumberPyramid(n);

      System.out.println();
        
      RightAngledNumberPyramid2(n);

      System.out.println();

      InvertedRightPyramid(n);

      System.out.println();


      InvertedNumberedRightPyramid(n);

      System.out.println();
        
    }


    
}