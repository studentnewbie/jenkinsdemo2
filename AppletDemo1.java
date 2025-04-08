import java.applet.*;
import java.awt.*;
/*<applet code="AppletDemo1.class"width="300"height="300"></applet>*/
public class AppletDemo1 extends Applet 
{
public void paint(Graphics g)
{
g.drawString("helloworld!",100,150);
g.drawLine(150,300,250,300);
g.drawLine(175,350,175,550);
g.setColor(Color.BLUE);
g.fillRect(200,400,100,150);
g.drawRect(300,350,200,200);
g.setColor(Color.RED);
g.fillOval(200,400,100,150);
g.setColor(Color.BLACK);
int x[]={200,300,200,300,200,300};
int y[]={250,350,250,350,250,350};
g.fillpolygon(x,y,6);
}
}

