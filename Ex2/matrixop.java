import java.util.*;
class matrixop{
    static Scanner sc= new Scanner(System.in);
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("1) Matrix multiplication 2) Matrix rotation 3) Matrix transpose");
        System.out.print("Enter your choice: ");
        int ch= sc.nextInt();
        int r,c;
        switch(ch){
            case 1:
            System.out.println("Matrix 1: ");
            System.out.print("No. of rows: ");
            int r1= sc.nextInt();
            System.out.print("No. of cols: ");
            int c1= sc.nextInt();
            int mat1[][]= new int[r1][c1];
            getMatrix(mat1, r1, c1);
            System.out.println("Matrix 2: ");
            System.out.print("No. of rows: ");
            int r2= sc.nextInt();
            System.out.print("No. of cols: ");
            int c2= sc.nextInt();
            int mat2[][]= new int[r2][c2];
            getMatrix(mat2, r2, c2);
            multiplyMatrices(mat1, mat2, r1, c1, r2, c2);
            break;
            case 2:
            System.out.print("No. of rows: ");
            r= sc.nextInt();
            System.out.print("No. of cols: ");
            c= sc.nextInt();
            int mat[][]= new int[r][c];
            getMatrix(mat, r, c);
            System.out.println("Input matrix: ");
            displayMatrix(mat,r,c);
            System.out.println("Rotated 90 deg:");
            rotateMatrix(mat, r, c);
            break;
            case 3:
            System.out.print("No. of rows: ");
            r= sc.nextInt();
            System.out.print("No. of cols: ");
            c= sc.nextInt();
            int arr[][]= new int[r][c];
            getMatrix(arr, r, c);
            System.out.println("Input matrix: ");
            displayMatrix(arr,r,c);
            System.out.println("Transpose:");
            transposeMatrix(arr, r, c);
            break;
        }
        
    }
    static void displayMatrix(int arr[][], int m, int n){
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    static void getMatrix(int arr[][], int m, int n){
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print("Enter element "+i+", "+j+": ");
                arr[i][j]= sc.nextInt();
            }
        }
    }
    static void rotateMatrix(int arr[][], int m, int n){
        for(int i=n-1;i>=0;i--){
            for(int j=0;j<m;j++){
                System.out.print(arr[j][i]+" ");
            }
            System.out.println();
        }
    }
    static void transposeMatrix(int arr[][], int m, int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(arr[j][i]+" ");
            }
            System.out.println();
        }
    }
    static void multiplyMatrices(int arr1[][], int arr2[][], int m1, int n1, int m2, int n2){
        if(n1!=m2){
            System.out.println("Multiplication not possible!");
            return;
        }
        int res[][]= new int[m1][n2];
        for(int i=0;i<m1;i++){
            for(int j=0;j<n2;j++){
                for(int k=0;k<m2;k++){
                    res[i][j]+= arr1[i][k]*arr2[k][j];
                }
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }
    }
}