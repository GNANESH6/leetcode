class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix.length, m=matrix[0].length, k=0;
        int[][] d=new int[n][m];
        for(int i=n-1;i>-1;i--){
            for(int j=0;j<m;j++){
                d[j][k]=matrix[i][j];
            }
            k++;
        }
        for(int i=0;i<n;i++)
            for(int j=0;j<m;j++)
                matrix[i][j]=d[i][j];
                
    }
}