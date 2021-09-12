//https://leetcode.com/problems/path-with-maximum-gold
package com.company.shreya.GoldMaze;

public class maxGold {
    public static void main(String[] args) {
        maxGold gold = new maxGold();
        int[][] grid = new int[][]{
                {1,0,7},
                {2,0,6},
                {3,4,5},
                {0,3,0},
                {9,0,20}
        };
        int[][] test1 = new int[][]{{0,3,0}};
        System.out.println(gold.getMaximumGold(grid));
    }

    public int getMaximumGold(int[][] grid) {
        // iterate over all cells to determine max path. ek cell pakda and chod diya grid mein... decide directions and get me max gold.
        // for every cell i ll update the max gold.
        //rec(grid, cell_R, cell_C) -- returns the sum for that path
        int max=0;
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                max = Math.max(max, rec(grid, i, j));
            }
        }
        return max;
    }

    int rec(int[][] grid, int cr, int cc){
      
      // start the maze from this cell.
      // every direction it choses gets max gold and check if gold taken for left path was more or right or up or down from this point,
      // and accordingly discard or update path with max gold.
      // here we follow recursion bottom up style.. while returning return current cell gold + path.
      
        int tmp=0;
      // if 0 or visited then return from here with 0 gold
        if(grid[cr][cc]<=0)
            return 0;
        else {
          // this is done coz we cant visit same cell again
            tmp = grid[cr][cc];

            grid[cr][cc] = -1;
        }
        int path = 0;
        // 4 ways to move

        //up
        if(cr>0){
            path = Math.max(rec(grid, cr-1, cc), path);
        }

        // left
        if(cc>0){
            path = Math.max(rec(grid, cr, cc-1), path);
        }

        // down
        if(cr< grid.length-1){
            path = Math.max(rec(grid, cr+1, cc), path);
        }

        // right
        if(cc< grid[0].length-1){
            path = Math.max(rec(grid, cr, cc+1), path);
        }

        // reached dead end
        grid[cr][cc] = tmp;
        return path+grid[cr][cc];
    }
}
