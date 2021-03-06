import java.awt.*;
import java.awt.event.*;

public class NTilesFrame extends Frame 
    {
        private class RestartButtonListener implements ActionListener 
        {   
            public void actionPerformed (ActionEvent e) 
            {   Game newGame = new Game();
                repaint();
            }
        }

        private class MouseKeeper extends MouseAdapter 
        {   
            public void mousePressed (MouseEvent e) 
            {   int x = e.getX();
                int y = e.getY();
                Game.mouseDown(x, y);
                repaint();
            }
        }

        public NTilesFrame() 
        {   setSize(600, 500);
            setTitle("15 Tiles Game");
            addMouseListener (new MouseKeeper());
            Button restartButton = new Button("New Game");
            restartButton.addActionListener(new RestartButtonListener());
            add("South", restartButton);
        }

        public void paint(Graphics g) 
        {   
			TileView tv = new WinTileView(g);
			Game.paint(tv);
        }
        
    }
