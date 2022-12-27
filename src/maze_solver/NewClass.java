/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package maze_solver;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;

/**
 *
 * @author ROSHAN GUPTA
 */
public class NewClass extends JFrame{
    private int[][] maze=
   // {{0,1,1,1,0,0,0,0,0,0,0,1,1},
     {{1,1,1,1,1,1,1,1,1,1,1,1,1},
     {1,0,0,0,0,0,0,1,1,0,0,1,1},
     {1,1,0,0,1,1,1,1,1,0,1,0,1},
     {1,1,1,0,0,0,0,0,1,0,0,0,1},
     {1,1,0,1,0,0,1,0,1,0,1,1,1},
     {1,1,0,0,0,0,1,0,0,0,1,1,1},
     {1,1,1,0,0,0,1,1,1,0,0,0,1},
     {1,0,0,0,1,1,0,1,0,1,1,1,1},
     {1,1,1,0,1,1,0,1,0,0,0,1,1},
     {1,0,1,0,1,1,1,1,0,1,0,1,1},
     {1,1,1,0,0,0,0,0,0,1,0,0,1},
     {1,0,1,1,1,1,1,1,1,0,1,13,1},
     {1,1,1,1,1,1,1,1,1,1,1,1,1},
    };
    public List<Integer> path=new ArrayList<>();
    
    public NewClass(){
        setTitle("Maze Solver");
        setSize(640,480);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //DepthFirst.searchPath(maze, 0, 0, path);
        DepthFirst.searchPath(maze, 1, 1, path);
        System.out.println(path);
    }
    
    @Override
    public void paint(Graphics g){
        //for centralisation
        g.translate(50,50);
        super.paint(g);
        for(int i=0; i<maze.length; i++){
            for(int j=0; j<maze[0].length; j++){
                Color color;
                switch(maze[i][j]){
                    case 1:color=Color.BLACK;
                    break;
                    case 13: color=Color.RED;
                    break;
                    default: color=Color.WHITE;
                    break;
                }
                g.setColor(color);
                //to fill the each grid
                g.fillRect(30*i, 30*j, 30, 30);
                g.setColor(Color.RED);
                // for drawing boundary of each grid
                g.drawRect(30*i, 30*j, 30, 30);
            }
        }
        
        for(int i=0; i<path.size(); i+=2){
            int pathx=path.get(i);
            int pathy=path.get(i+1);
            System.out.println("X coordinates "+ pathx);
            System.out.println("Y coordinates "+ pathy);
            g.setColor(Color.BLUE);
            g.fillRect(30*pathx,  30*pathy, 30, 30);
        }
    }
    
    public static void main(String[] args){
        NewClass view=new NewClass();
        view.setVisible(true);
    }
}
