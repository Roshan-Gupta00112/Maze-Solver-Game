/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package maze_solver;

import java.util.List;

/**
 *
 * @author Meteor
 */
public class DepthFirst {
    //in DFS we mark the visited node as vistsed like yes i have covered the node
    //for priniting a path a line so need to add x,y need arraylist
    public static boolean searchpath(int[][] maze, int x, int y, List<Integer> path){
        if(maze[y][x]==9){
            // 9 is the end(finish) value add those cordinates
            path.add(x);
            path.add(y);
            return true;       
        }
        //if ==0 moveR,L,T,B also need to check blocker
        if(maze[y][x]==0){
            // dont change its value once its visited
            maze[y][x]=2;// 2 is kepts as condition to mark as visited
            // x in down(row) and y in rightside(colums)
            //upwards direction
            int dx=-1;
            int dy=0;
            //recusion call to maze n change cordinates
            if (searchpath(maze, x+dx,y+dy,path)){
                path.add(x);
                path.add(y);
                return true;
            }
            //downwards
            dx=1;
            dy=0;
            if (searchpath(maze, x+dx,y+dy,path)){
                path.add(x);
                path.add(y);
                return true;
            }
            //left
            dx=0;
            dy=-1;
            if (searchpath(maze, x+dx,y+dy,path)){
                path.add(x);
                path.add(y);
                return true;
            }
            //right
            dx=0;
            dy=1;
            if (searchpath(maze, x+dx,y+dy,path)){
                path.add(x);
                path.add(y);
                return true;
            } 
        }
        //if value is not 9 and 0 then it will be 1 so return false
        return false;
    } 
}
