package ch01.builder;
import java.awt.Graphics;
import javax.swing.JPanel;
public class DrawPanel extends JPanel {
    //draw an x from the corners of the panel
    public void paintComponent(Graphics g) {
        //call paintComponent to ensure the panel displays correctly
        super.paintComponent(g);

        int width = this.getWidth(); //total width
        int height = this.getHeight(); //total height
        int count = 1;
        int currWidthX = 0, currHeightX = height;
        int currWidthY = width, currHeightY = 0;

        while(count <= 15)
        {
            currWidthX += width / 15;
            currHeightX -= height / 15;

            //draw a line from the upper-left to the lower right
            g.drawLine(0, 0, currHeightX, currWidthX);
            g.drawLine(width, 0, currHeightX, currHeightX);
            g.drawLine(width, height, currHeightX, currWidthX);
            g.drawLine(0, height, currWidthX, currWidthX);

//            System.out.printf("Current Width: %d%nCurrent Height:%d%n", currWidth, currHeight);
            count++;
        }

        //draw a line from the lower-left to the upper-right
        //g.drawLine(0, height, width, 0);

        //g.drawOval(0, 0, 300, 400);
        //g.draw3DRect(200, 200, 400, 224, true);
    } //
} //end class DrawPanel
