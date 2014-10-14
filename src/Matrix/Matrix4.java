package Matrix;

public class Matrix4 {


    private int n = 2;
    private Matrix2[][] member = new Matrix2[2][2];
    private int amember[][] = new int[4][4]; // For Method toString

    
    public Matrix4() {
        for (int i = 0; i < member.length; i++) {
            for (int j = 0; j < member.length; j++) {
                member[i][j] = new Matrix2();
            }
        }
    }

    
    public void Input() {
        //input value in matrix
    }

    // Add two 4*4 Matrix
    public static Matrix4 add(Matrix4 a, Matrix4 b) {
      
     //return value of add
    }

   
    public static Matrix4 sub(Matrix4 a, Matrix4 b) {
      //return value of sub
    }

   
    public static Matrix4 mul(Matrix4 a, Matrix4 b) {
       //return value of multiple
    }

  public void print Matrix4(){
       
   }
    
}
