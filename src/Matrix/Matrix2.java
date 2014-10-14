package Matrix;

import java.util.Scanner;

public class Matrix2 {

    
    private int n = 2;
    private int member[][] = new int[n][n];

   public static Matrix2 mul(Matrix2 a,Matrix2 b){
       return a.mul(b);
   }
   public Matrix2(){
       a = new int[SIZE][SIZE];
       for(int i=0;i<val.length;i++){
           for(int j=0;j<val.length;j++){
               a[i][j]=1;
           }
       }
   }
   public Matrix2(int[][] val){
       a = new int[SIZE][SIZE];
       for(int i=0;i<val.length;i++){
           for(int j=0;j<val.length;j++){
               a[i][j]=j[i][j];
           }
       }
   }
   public void set(int i,int j,int val){
       a[i][j]=val;
   }
   public int get(int i,int j){
       return a[i][j];
   }
   public void Input(){
       
   }
   public Matrix2 add(Matrix b){
       return new Matrix2();//send value of add in()
   }
   public Matrix2 sub(Matrix b){
       return new Matrix2();//send value of sub in()
   }
   public Matrix2 mul(Matrix b){
       return new Matrix2();//send value of mul in()
   }
   public void print Matrix2(){
       
   }
   public int vmul(int i,int j,Matrix b){
       return sum;//return sum of multiple matrix
   }
   
}
