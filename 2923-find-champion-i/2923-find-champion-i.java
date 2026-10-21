class Solution {
    public int findChampion(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int res = 0;
        for(int i=0;i<m;i++)
            {
                int count=0;
                for(int j=0;j<n;j++)
                    {
                        if(grid[i][j]==1)count++;
                    }
                if(count==n-1)
                {
                    res = i;
                    break;
                }
            }
        return res;
    }
}