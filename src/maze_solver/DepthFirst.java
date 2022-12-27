/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package maze_solver;

import java.util.List;

/**
 *
 * @author ROSHAN GUPTA
 */
public class DepthFirst {
    public static boolean searchPath(int[][]maze, int x, int y, List<Integer> path){
      if(maze[x][y]==13){ 
          path.add(x);
          path.add(y);
          return true;
      }
      if(maze[x][y]==0){
          maze[x][y]=2;
          
          // Upward Direction
          int dx=-1;
          int dy=0;
          if(searchPath(maze, x+dx, y+dy, path)){
              path.add(x);
              path.add(y);
              return true;
          }
          // Downward Direction
          dx=1;
          dy=0;
          if(searchPath(maze, x+dx, y+dy, path)){
              path.add(x);
              path.add(y);
              return true;
          }
          //Left Direction
          dx=0;
          dy=-1;
          if(searchPath(maze, x+dx, y+dy, path)){
              path.add(x);
              path.add(y);
              return true;
          }
          // Right Direction
          dx=0;
          dy=1;
          if(searchPath(maze, x+dx, y+dy, path)){
              path.add(x);
              path.add(y);
              return true;
          }
          
      }
      
      return false;
    }
}
