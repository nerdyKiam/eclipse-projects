package MyGame;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;

public class AreaGenerator {
   public int map[][];///store brick 2D array...
   
   public int brickWidth;
   public int brickHeight;
   
   public AreaGenerator(int row,int col) {
	   main.g++;
	   map = new int[row][col]; /////array size get here;
	   
	   /////get full Rectangle area for bricks array by loop
	   
	   for(int i=0;i<map.length;i++) ////increassing map length == row
	   {
		   for(int j=0;j<map[0].length;j++) { /// col
			   map[i][j]=1;
		   }
	   }
	   //System.out.println("Col="+col);
	   //System.out.println("row="+row);
	   brickWidth=540/col;  //col = 7
	   brickHeight=150/row; //row = 3
	   
	   
	   //System.out.println("After brickWidth="+brickWidth);
	   //System.out.println("After brickWidth="+brickWidth);
	   
	   
   }
   
   
   public void draw(Graphics2D g) {
	   
	   for(int i=0;i<map.length;i++) //increassing map length
	   {
		   for(int j=0;j<map[0].length;j++) {
			   if(map[i][j]>0) {
				   
				   g.setColor(Color.white);
				   
				   ///Fill the Area Green color we get in array...
				   g.fillRect(j*brickWidth+80, i*brickHeight+50, brickWidth, brickHeight);   
				   g.setStroke(new BasicStroke(3));
				 ///Full Area Devided Constructor Value.....
				   g.setColor(Color.black);
				   g.drawRect(j*brickWidth+80, i*brickHeight+50, brickWidth, brickHeight);
			   }
			   
		   }
	   }
   }
   ///Creating Function recived arguments Action performed Functions class GameRun......
   
   public void setBrickValue(int value ,int row,int col) {
	   map[row][col]=value;//// here we get value 0...Line 240--250.....**********In GameRun Class....
   }
   
   
}

