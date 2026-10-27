class Solution {
    public String[] createGrid(int m, int n) {
        String[] grid = new String[m];
        //Initialize all cells with obstracles which is '#';
        char[][] mat = new char[m][n];
        for(int i=0;i<m;i++){
            Arrays.fill(mat[i], '#');
        }
        //Making the first row free;
        for(int j=0;j<n;j++){
            mat[0][j] = '.';
        }
        //Making last column free;
        for(int i=1;i<m;i++){
            mat[i][n-1] = '.';  
        }
        //Converting each row into string;
        for(int i=0;i<m;i++){
            grid[i] = new String(mat[i]);
        }
        return grid;
    }
}