class Matrix {
    int[][] a={{1,2},{3,4}},b={{5,6},{7,8}};
    static String matrixType="2x2";
    void calculate(){
        System.out.println(matrixType);
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                int sum=a[i][j]+b[i][j],sub=a[i][j]-b[i][j];
                System.out.println("Sum: "+sum+" Difference: "+sub);
            }
        }
    }
}
class Main {
    public static void main(String[] args){
        new Matrix().calculate();
    }
}