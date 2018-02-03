package 数学函数绘制软件;

import java.awt.BasicStroke;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Panel;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import java.awt.geom.Line2D;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
@SuppressWarnings("serial")
public class face extends JFrame implements ItemListener ,ActionListener {
	 
	public int ilale=0;
	public int oldmouseX,oldmouseY;
	public int newmouseX,newmouseY;

	JPanel sizep1=new JPanel();  //控制面板

	JMenu b1=new JMenu ("file       ");
	JMenu b2=new JMenu("tool");
	
	
	public  JLabel zuobiao=new JLabel("  坐标：");

	JTextField txt1=new JTextField(2);
	JTextField txt2=new JTextField(2);
	JTextField txt3=new JTextField(2);
	JTextField txt4=new JTextField(2);
	
	JLabel zhixian1=new JLabel("Ax+By+C=0");
	JLabel zhixian2=new JLabel("A=");
	JLabel zhixian3=new JLabel("B=");
	JLabel zhixian4=new JLabel("C=");
	
	JLabel mihanshu1=new JLabel("Y=X^a");
	JLabel mihanshu2=new JLabel("a=");
	
	JLabel zhishu1=new JLabel("Y=A^X");
	JLabel zhishu2=new JLabel("A=");
	
	JLabel duishu1=new JLabel("Y=Log(a)X");
	JLabel duishu2=new JLabel("a=");
	
	JLabel zhengxian1=new JLabel("Y=Asin(wX+f)+h");
	JLabel zhengxian2=new JLabel("A=");
	JLabel zhengxian3=new JLabel("w=");
	JLabel zhengxian4=new JLabel("f=π*");
	JLabel zhengxian5=new JLabel("h=");
	
	JLabel yuxian1=new JLabel("Y=Acos(wX+f)+h");
	JLabel yuxian2=new JLabel("A=");
	JLabel yuxian3=new JLabel("w=");
	JLabel yuxian4=new JLabel("f=π*");
	JLabel yuxian5=new JLabel("h=");
	
	JLabel zhengqie1=new JLabel("Y=Atan(wX+f)+h");
	JLabel zhengqie2=new JLabel("A=");
	JLabel zhengqie3=new JLabel("w=");
	JLabel zhengqie4=new JLabel("f=π*");
	JLabel zhengqie5=new JLabel("h=");
	
	JLabel paowuxianX1=new JLabel("X=A*Y2+B*Y+C");
	JLabel paowuxianX2=new JLabel("A=");
	JLabel paowuxianX3=new JLabel("B=");
	JLabel paowuxianX4=new JLabel("C=");
	
	JLabel paowuxianY1=new JLabel("Y=A*X^2+B*+C");
	
	JLabel shuangquxianX1=new JLabel("X2/a2-Y2/b2=1");//双曲线X型，就是焦点在X轴
	JLabel shuangquxianX2=new JLabel("a2=");
	JLabel shuangquxianX3=new JLabel("b2=");
	
	JLabel shuangquxianY1=new JLabel("Y2/a2-X2/b2=1");//双曲线Y型，就是焦点在Y轴
	JLabel shuangquxianY2=new JLabel("a2=");
	JLabel shuangquxianY3=new JLabel("b2=");
	
	
	JLabel tuoyuanX1=new JLabel("X2/a2+Y2/b2=1");//椭圆X型，就是焦点在X轴
	JLabel tuoyuanX2=new JLabel("a2=");
	JLabel tuoyuanX3=new JLabel("b2=");
	
	JLabel tuoyuanY1=new JLabel("Y2/a2+X2/b2=1");//椭圆Y型，就是焦点在Y轴
	JLabel tuoyuanY2=new JLabel("a2=");
	JLabel tuoyuanY3=new JLabel("b2=");
	
	JButton jb1=new JButton("绘制直线");
	JButton jb2=new JButton("绘制幂函数");
	JButton jb3=new JButton("绘制指数函数");
	JButton jb4=new JButton("绘制对数函数");
	JButton jb5=new JButton("绘制正弦函数");
	JButton jb6=new JButton("绘制余弦函数");
	JButton jb7=new JButton("绘制正切函数");
	JButton jb8=new JButton("绘制X型抛物线");
	JButton jb9=new JButton("绘制Y型抛物线");
	JButton jb10=new JButton("绘制X型双曲线");
	JButton jb11=new JButton("绘制Y型双曲线");
	JButton jb12=new JButton("绘制X型椭圆");
	JButton jb13=new JButton("绘制Y型椭圆");
	
	
	 public MyCanvas canvas;
	 

	 
	 public final static int SCREEN_WIDTH = 
				Toolkit.getDefaultToolkit().getScreenSize().width;
	public final static int SCREEN_HEIGHT = 
				Toolkit.getDefaultToolkit().getScreenSize().height;
	face()
	{	
		super.setTitle("SMatlab");
		setResizable(false);
		setVisible(true);
		setLayout(null);
		this.setBackground(Color.gray);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds((SCREEN_WIDTH-720)/2,(SCREEN_HEIGHT-650)/2,720,650);
		JMenuBar b0=new JMenuBar();
		setJMenuBar(b0);
		JMenuItem size1=new JMenuItem("直线");
		JMenuItem size2=new JMenuItem("幂函数");
		JMenuItem size3=new JMenuItem("指数函数");
		JMenuItem size4=new JMenuItem("对数函数");
		JMenu size5=new JMenu("三角函数");
		JMenuItem j51=new JMenuItem("正弦函数");
		JMenuItem j52=new JMenuItem("余弦函数");
		JMenuItem j53=new JMenuItem("正切函数");	 
		JMenu size6=new JMenu("抛物线图形");
		JMenuItem j61=new JMenuItem("X型抛物线");
		JMenuItem j62=new JMenuItem("Y型抛物线");
		JMenu size7=new JMenu("双曲线图像");
		JMenuItem j71=new JMenuItem("X型双曲线");
		JMenuItem j72=new JMenuItem("Y型双曲线");
		JMenu size8=new JMenu("椭圆");
		JMenuItem j81=new JMenuItem("X型椭圆");
		JMenuItem j82=new JMenuItem("Y型椭圆");
		JMenuItem set1=new JMenuItem("设置颜色");
		JMenu set2=new JMenu("设置粗细");
		JMenuItem j11=new JMenuItem("标准");
		JMenuItem j12=new JMenuItem("加粗");
		add(b0);
	
		b0.add(b1);
	
	    b0.add(b2);
	
	    
		b2.add(set1);
		b2.add(set2);
		b1.add(size1);
		b1.add(size2);
		b1.add(size3);
		b1.add(size4);
		b1.add(size5);
		b1.add(size6);
		b1.add(size7);
		b1.add(size8);
		size5.add(j51);
		size5.add(j52);
		size5.add(j53);
		size6.add(j61);
		size6.add(j62);
		size7.add(j71);
		size7.add(j72);
		size8.add(j81);
		size8.add(j82);
		set2.add(j11);
		set2.add(j12);
	    this.add(sizep1);
		sizep1.setBounds(0, 25, 720, 120);
		sizep1.setBackground(Color.white);
		sizep1.setLayout(null);
		canvas = new MyCanvas();//画布
		this.add(canvas);
		canvas.setBounds(0, 150, 720, 500);//画布位置（0，length0）大小720*500	
		sizep1.add(zuobiao);
		zuobiao.setBounds(560, 80, 160, 30);
	    validate();
	    size1.addActionListener (this);
	    size2.addActionListener (this);
	    size3.addActionListener (this);
 	    size4.addActionListener (this);
	    size5.addActionListener (this);
	    size6.addActionListener (this);
	    size7.addActionListener (this);
	    size8.addActionListener (this);
	    set1.addActionListener(this);
	    j11.addActionListener(this);
	    j12.addActionListener(this);
	    j51.addActionListener(this);
		j52.addActionListener(this);
		j53.addActionListener(this);
		j61.addActionListener(this);
		j62.addActionListener(this);
		j71.addActionListener(this);
		j72.addActionListener(this);
		j81.addActionListener(this);
		j82.addActionListener(this);
	    requestFocus();
	}
   public void zhixiansize()
   {
	    ilale=1; 	
	    sizep1.removeAll();
		sizep1.add(zhixian1);
		zhixian1.setBounds(180, 30, 100, 50);
		sizep1.add(zhixian2);
		zhixian2.setBounds(280, 0, 80, 30);
		sizep1.add(zhixian3);
		zhixian3.setBounds(280, 40, 80, 30);
		sizep1.add(zhixian4);
		zhixian4.setBounds(280, 80, 80, 30);	
		sizep1.add(txt1);
		txt1.setBounds(360, 0, 80, 30);
		sizep1.add(txt2);
		txt2.setBounds(360, 40, 80, 30);
		sizep1.add(txt3);
		txt3.setBounds(360, 80, 80, 30);
		
		sizep1.add(jb1);
		jb1.setBounds(500, 40, 100, 30);
		jb1.addActionListener(this);
		
		sizep1.add(zuobiao);
		zuobiao.setBounds(560, 80, 160, 30);
		sizep1.updateUI();
		validate();	
		
   }
   public void mihanshusize()//幂函数
   {
	    ilale=2; 
	    sizep1.removeAll();
		sizep1.add(mihanshu1);
		mihanshu1.setBounds(180, 40, 100, 30);
		sizep1.add(mihanshu2);
		mihanshu2.setBounds(280, 40, 80, 30);
			
		sizep1.add(txt1);
		txt1.setBounds(360, 40, 80, 30);
		
		sizep1.add(jb2);
		jb2.setBounds(500, 40, 100, 30);
		jb2.addActionListener(this);
		
		sizep1.requestFocus();
		sizep1.add(zuobiao);
		zuobiao.setBounds(560, 80, 160, 30);
		sizep1.updateUI();
		validate();	
		
   }
   public void zhishusize()//指数函数
   {
	    ilale=3; 
	    sizep1.removeAll();
		sizep1.add(zhishu1);
		zhishu1.setBounds(180, 40, 100, 30);
		sizep1.add(zhishu2);
		zhishu2.setBounds(280, 40, 80, 30);
			
		sizep1.add(txt1);
		txt1.setBounds(360, 40, 80, 30);
		
		sizep1.add(jb3);
		jb3.setBounds(500, 40, 120, 30);
		jb3.addActionListener(this);
		
		sizep1.requestFocus();
		sizep1.add(zuobiao);
		zuobiao.setBounds(560, 80, 160, 30);
		sizep1.updateUI();
		validate();	
		
   }
   public void duishusize()//对数函数
   {
	    ilale=4; 	
	    sizep1.removeAll();
		sizep1.add(duishu1);
		duishu1.setBounds(180, 40, 100, 30);
		sizep1.add(duishu2);
		duishu2.setBounds(280, 40, 80, 30);
		
		sizep1.add(txt1);
		txt1.setBounds(360, 40, 80, 30);
	
		
		sizep1.add(jb4);
		jb4.setBounds(500, 40, 120, 30);
		jb4.addActionListener(this);
		
		sizep1.add(zuobiao);
		zuobiao.setBounds(560, 80, 160, 30);
		sizep1.updateUI();
		validate();	
		
   }
   public void zhengxiansize()//正弦函数
   {
	    ilale=5; 	
	    sizep1.removeAll();
		sizep1.add(zhengxian1);
		zhengxian1.setBounds(150, 30, 100, 50);
		sizep1.add(zhengxian2);
		zhengxian2.setBounds(280, 0, 80, 25);
		sizep1.add(zhengxian3);
		zhengxian3.setBounds(280, 25, 80, 25);
		sizep1.add(zhengxian4);
		zhengxian4.setBounds(280, 50, 80, 25);	
		sizep1.add(zhengxian5);
		zhengxian5.setBounds(280, 75, 80, 25);
		sizep1.add(txt1);
		txt1.setBounds(360, 0, 80, 25);
		sizep1.add(txt2);
		txt2.setBounds(360, 25, 80, 25);
		sizep1.add(txt3);
		txt3.setBounds(360, 50, 80, 25);
		sizep1.add(txt4);
		txt4.setBounds(360, 75, 80, 25);
		
		sizep1.add(jb5);
		jb5.setBounds(500, 40, 100, 30);
		jb5.addActionListener(this);
		
		sizep1.add(zuobiao);
		zuobiao.setBounds(560, 80, 160, 30);
		sizep1.updateUI();
		validate();	
   }
   
   public void yuxiansize()//余弦函数
   {
	    ilale=6; 	
	    sizep1.removeAll();
		sizep1.add(yuxian1);
		yuxian1.setBounds(150, 30, 100, 50);
		sizep1.add(yuxian2);
		yuxian2.setBounds(280, 0, 80, 25);
		sizep1.add(yuxian3);
		yuxian3.setBounds(280, 25, 80, 25);
		sizep1.add(yuxian4);
		yuxian4.setBounds(280, 50, 80, 25);	
		sizep1.add(yuxian5);
		yuxian5.setBounds(280, 75, 80, 25);
		sizep1.add(txt1);
		txt1.setBounds(360, 0, 80, 25);
		sizep1.add(txt2);
		txt2.setBounds(360, 25, 80, 25);
		sizep1.add(txt3);
		txt3.setBounds(360, 50, 80, 25);
		sizep1.add(txt4);
		txt4.setBounds(360, 75, 80, 25);
		
		sizep1.add(jb6);
		jb6.setBounds(500, 40, 100, 30);
		jb6.addActionListener(this);
		
		sizep1.add(zuobiao);
		zuobiao.setBounds(560, 80, 160, 30);
		sizep1.updateUI();
		validate();	
   }
   
   public void zhengqiesize()//正切函数
   {
	    ilale=7; 	
	    sizep1.removeAll();
		sizep1.add(zhengqie1);
		zhengqie1.setBounds(150, 30, 100, 50);
		sizep1.add(zhengqie2);
		zhengqie2.setBounds(280, 0, 80, 25);
		sizep1.add(zhengqie3);
		zhengqie3.setBounds(280, 25, 80, 25);
		sizep1.add(zhengqie4);
		zhengqie4.setBounds(280, 50, 80, 25);	
		sizep1.add(zhengqie5);
		zhengqie5.setBounds(280, 75, 80, 25);
		sizep1.add(txt1);
		txt1.setBounds(360, 0, 80, 25);
		sizep1.add(txt2);
		txt2.setBounds(360, 25, 80, 25);
		sizep1.add(txt3);
		txt3.setBounds(360, 50, 80, 25);
		sizep1.add(txt4);
		txt4.setBounds(360, 75, 80, 25);
		
		sizep1.add(jb7);
		jb7.setBounds(500, 40, 100, 30);
		jb7.addActionListener(this);
		
		sizep1.add(zuobiao);
		zuobiao.setBounds(560, 80, 160, 30);
		sizep1.updateUI();
		validate();	
		
   }
	
   
   
   public void paowuxianXsize()
   {
	    ilale=8; 	
	    sizep1.removeAll();
		sizep1.add(paowuxianX1);
		paowuxianX1.setBounds(180, 30, 100, 50);
		sizep1.add(paowuxianX2);
		paowuxianX2.setBounds(280, 0, 80, 30);
		sizep1.add(paowuxianX3);
		paowuxianX3.setBounds(280, 40, 80, 30);
		sizep1.add(paowuxianX4);
		paowuxianX4.setBounds(280, 80, 80, 30);	
		sizep1.add(txt1);
		txt1.setBounds(360, 0, 80, 30);
		sizep1.add(txt2);
		txt2.setBounds(360, 40, 80, 30);
		sizep1.add(txt3);
		txt3.setBounds(360, 80, 80, 30);
		
		sizep1.add(jb8);
		jb8.setBounds(500, 40, 100, 30);
		jb8.addActionListener(this);
		
		sizep1.add(zuobiao);
		zuobiao.setBounds(560, 80, 160, 30);
		sizep1.updateUI();
		validate();	
		
   }
   
   
   public void paowuxianYsize()
   {
	    ilale=9; 	
	    sizep1.removeAll();
		sizep1.add(paowuxianY1);
		paowuxianY1.setBounds(180, 30, 100, 50);
		sizep1.add(paowuxianX2);
		paowuxianX2.setBounds(280, 0, 80, 30);
		sizep1.add(paowuxianX3);
		paowuxianX3.setBounds(280, 40, 80, 30);
		sizep1.add(paowuxianX4);
		paowuxianX4.setBounds(280, 80, 80, 30);	
		sizep1.add(txt1);
		txt1.setBounds(360, 0, 80, 30);
		sizep1.add(txt2);
		txt2.setBounds(360, 40, 80, 30);
		sizep1.add(txt3);
		txt3.setBounds(360, 80, 80, 30);
		
		sizep1.add(jb9);
		jb9.setBounds(500, 40, 100, 30);
		jb9.addActionListener(this);
		
		sizep1.add(zuobiao);
		zuobiao.setBounds(560, 80, 160, 30);
		sizep1.updateUI();
		validate();	
		
   }
   public void shuangquxianXsize()//双曲线X型
   {
	    ilale=10; 	
	    sizep1.removeAll();
		sizep1.add(shuangquxianX1);
		shuangquxianX1.setBounds(180, 40, 100, 30);
		sizep1.add(shuangquxianX2);
		shuangquxianX2.setBounds(280, 40, 80, 30);
		sizep1.add(shuangquxianX3);
		shuangquxianX3.setBounds(280, 80, 80, 30);
		sizep1.add(txt1);
		txt1.setBounds(360, 40, 80, 30);
		sizep1.add(txt2);
		txt2.setBounds(360, 80, 80, 30);
		
		sizep1.add(jb10);
		jb10.setBounds(500, 40, 120, 30);
		jb10.addActionListener(this);
		
		sizep1.add(zuobiao);
		zuobiao.setBounds(560, 80, 160, 30);
		sizep1.updateUI();
		validate();	
		
   }
   
   
   
   public void shuangquxianYsize()//双曲线Y型
   {
	    ilale=11; 	
	    sizep1.removeAll();
		sizep1.add(shuangquxianY1);
		shuangquxianY1.setBounds(180, 40, 100, 30);
		sizep1.add(shuangquxianY2);
		shuangquxianY2.setBounds(280, 40, 80, 30);
		sizep1.add(shuangquxianY3);
		shuangquxianY3.setBounds(280, 80, 80, 30);
		sizep1.add(txt1);
		txt1.setBounds(360, 40, 80, 30);
		sizep1.add(txt2);
		txt2.setBounds(360, 80, 80, 30);
		
		sizep1.add(jb11);
		jb11.setBounds(500, 40, 120, 30);
		jb11.addActionListener(this);
		
		sizep1.add(zuobiao);
		zuobiao.setBounds(560, 80, 160, 30);
		sizep1.updateUI();
		validate();	
		
   }
   
   
   public void tuoyuanXsize()//椭圆X型
   {
	    ilale=12; 	
	    sizep1.removeAll();
		sizep1.add(tuoyuanX1);
		tuoyuanX1.setBounds(180, 40, 100, 30);
		sizep1.add(tuoyuanX2);
		tuoyuanX2.setBounds(280, 40, 80, 30);
		sizep1.add(tuoyuanX3);
		tuoyuanX3.setBounds(280, 80, 80, 30);
		sizep1.add(txt1);
		txt1.setBounds(360, 40, 80, 30);
		sizep1.add(txt2);
		txt2.setBounds(360, 80, 80, 30);
		
		sizep1.add(jb12);
		jb12.setBounds(500, 40, 120, 30);
		jb12.addActionListener(this);
		
		sizep1.add(zuobiao);
		zuobiao.setBounds(560, 80, 160, 30);
		sizep1.updateUI();
		validate();	
		
   }
   
   public void tuoyuanYsize()//椭圆Y型
   {
	    ilale=13; 	
	    sizep1.removeAll();
		sizep1.add(tuoyuanY1);
		tuoyuanY1.setBounds(180, 40, 100, 30);
		sizep1.add(tuoyuanY2);
		tuoyuanY2.setBounds(280, 40, 80, 30);
		sizep1.add(tuoyuanY3);
		tuoyuanY3.setBounds(280, 80, 80, 30);
		sizep1.add(txt1);
		txt1.setBounds(360, 40, 80, 30);
		sizep1.add(txt2);
		txt2.setBounds(360, 80, 80, 30);
		
		sizep1.add(jb13);
		jb13.setBounds(500, 40, 120, 30);
		jb13.addActionListener(this);
		
		sizep1.add(zuobiao);
		zuobiao.setBounds(560, 80, 160, 30);
		sizep1.updateUI();
		validate();	
		
   }
   
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

   if(e.getActionCommand().equals("直线"))
   {   
	   zhixiansize();
   }
   if(e.getActionCommand().equals("绘制直线"))
   {   
	   
	   double a=1,b=1;
	   if(txt1.getText().equals("")||txt2.getText().equals("")||txt3.getText().equals(""))
	     JOptionPane.showMessageDialog(null, "参数不能为空!" );
	   else
		   {
		   
	 	  a=Double.parseDouble(txt1.getText());
	 	  b=Double.parseDouble(txt2.getText());
	 	 
	 	   if(a*a+b*b==0)
			   JOptionPane.showMessageDialog(null, "参数A,B不能同时为0!" );
		   else   
			   canvas.repaint();
	 	  }
	   
   }
   if(e.getActionCommand().equals("X型椭圆"))
   {
	   tuoyuanXsize(); 
   }
   if(e.getActionCommand().equals("绘制X型椭圆"))
   {
	   if(txt1.getText().equals("")||txt2.getText().equals(""))
  	     JOptionPane.showMessageDialog(null, "参数不能为空!" );
  	   else
  		   {
  		      double a=Double.parseDouble(txt1.getText());
  		      double b=Double.parseDouble(txt2.getText());
  		      if(a>0&&b>0)
  			   canvas.repaint();
  		      else
  		       JOptionPane.showMessageDialog(null, "参数不能为非正数!" );  
  	 	  }
   }
   if(e.getActionCommand().equals("Y型椭圆"))
   {
	   tuoyuanYsize();
 
   }
   if(e.getActionCommand().equals("绘制Y型椭圆"))
   {
	   if(txt1.getText().equals("")||txt2.getText().equals(""))
  	     JOptionPane.showMessageDialog(null, "参数不能为空!" );
  	   else
  		   {
  		      double a=Double.parseDouble(txt1.getText());
  		      double b=Double.parseDouble(txt2.getText());
  		      if(a>0&&b>0)
  			   canvas.repaint();
  		      else
  		       JOptionPane.showMessageDialog(null, "参数不能为非正数!" );  
  	 	  }
   }
   if(e.getActionCommand().equals("幂函数"))
   {
	   mihanshusize();
	   

		
	validate();   
   }
   if(e.getActionCommand().equals("绘制幂函数"))
   {
	   double a=1;
	   if(txt1.getText().equals(""))
	     JOptionPane.showMessageDialog(null, "参数不能为空!" );
	   else
		   {
		   
	 	       a=Double.parseDouble(txt1.getText());	 	 
			   canvas.repaint();
	 	  }
   }
   if(e.getActionCommand().equals("正弦函数"))
   {
	   zhengxiansize();
	   double a=1;
	   if(txt1.getText().equals(""))
	     JOptionPane.showMessageDialog(null, "参数不能为空!" );
	   else
		   {
		   
	 	       a=Double.parseDouble(txt1.getText());	 	 
			   canvas.repaint();
	 	  }
	   validate();
	   
   }
   if(e.getActionCommand().equals("余弦函数"))
   {
	   yuxiansize();
	   canvas.repaint();
   }
   if(e.getActionCommand().equals("正切函数"))
   {
	   zhengqiesize();
	   canvas.repaint();
   }
   if(e.getActionCommand().equals("X型抛物线"))
   {
	   paowuxianXsize();
	
	   
	   
   }
   if(e.getActionCommand().equals("绘制X型抛物线"))
   {
	
	   if(txt1.getText().equals("")||txt2.getText().equals("")||txt3.getText().equals(""))
	     JOptionPane.showMessageDialog(null, "参数不能为空!" );
	   else
		   {
		     
			   canvas.repaint();
	 	  }
	   validate();
   }
   if(e.getActionCommand().equals("Y型抛物线"))
   {
	   paowuxianYsize();
   }
   if(e.getActionCommand().equals("绘制Y型抛物线"))
   {
	
	   if(txt1.getText().equals("")||txt2.getText().equals("")||txt3.getText().equals(""))
	     JOptionPane.showMessageDialog(null, "参数不能为空!" );
	   else
		   {
		     
			   canvas.repaint();
	 	  }
	   validate();
   }
     if(e.getActionCommand().equals("X型双曲线"))
   {
    	 shuangquxianXsize();
   }
     if(e.getActionCommand().equals("绘制X型双曲线"))
     {
    	 if(txt1.getText().equals("")||txt2.getText().equals(""))
    	     JOptionPane.showMessageDialog(null, "参数不能为空!" );
    	   else
    		   {
    		      double a=Double.parseDouble(txt1.getText());
    		      double b=Double.parseDouble(txt2.getText());
    		      if(a>0&&b>0)
    			   canvas.repaint();
    		      else
    		       JOptionPane.showMessageDialog(null, "参数不能为非正数!" );  
    	 	  }
     }
     if(e.getActionCommand().equals("Y型双曲线"))
     {
      	 shuangquxianYsize();
     }
     if(e.getActionCommand().equals("绘制Y型双曲线"))
     {
    	 if(txt1.getText().equals("")||txt2.getText().equals(""))
    	     JOptionPane.showMessageDialog(null, "参数不能为空!" );
    	   else
    		   {
    		      double a=Double.parseDouble(txt1.getText());
    		      double b=Double.parseDouble(txt2.getText());
    		      if(a>0&&b>0)
    			   canvas.repaint();
    		      else
    		       JOptionPane.showMessageDialog(null, "参数不能为非正数!" );  
    	 	  }
     }
    if(e.getActionCommand().equals("抛物线"))
   {
	
   }
    if(e.getActionCommand().equals("指数函数"))
   {
	   zhishusize();
	   canvas.repaint();
   }
    if(e.getActionCommand().equals("绘制指数函数"))
   {
	   double a=1;
	   if(txt1.getText().equals(""))
	     JOptionPane.showMessageDialog(null, "参数不能为空!" );
	   else
		   {
		       
	 	       a=Double.parseDouble(txt1.getText());	
	 	       if(a>0)
			   canvas.repaint();
	 	       else
	 	      JOptionPane.showMessageDialog(null, "参数a不能小于等于0!" ); 
	 	  }
   }
   else if(e.getActionCommand().equals("对数函数"))
   {
	   duishusize();
   }
   if(e.getActionCommand().equals("绘制对数函数"))
   {
	   double a=1;
	   if(txt1.getText().equals(""))
	     JOptionPane.showMessageDialog(null, "参数不能为空!" );
	   else
		   {
		       
	 	       a=Double.parseDouble(txt1.getText());	
	 	       if(a>0&&a!=1)
			   canvas.repaint();
	 	       else
	 	      JOptionPane.showMessageDialog(null, "参数a必须大于0且不等于1!" ); 
	 	  }
	 

		
	validate();   
   }
   if(e.getActionCommand().equals("绘制正弦函数"))
   {
	   if(txt1.getText().equals("")||txt2.getText().equals("")||txt3.getText().equals("")||txt4.getText().equals(""))
	     JOptionPane.showMessageDialog(null, "参数不能为空!" );
	   else
		   {
		   
			   canvas.repaint();
	 	  }
   }
   if(e.getActionCommand().equals("绘制余弦函数"))
   {
	   if(txt1.getText().equals("")||txt2.getText().equals("")||txt3.getText().equals("")||txt4.getText().equals(""))
		     JOptionPane.showMessageDialog(null, "参数不能为空!" );
		   else
			   {
			   
				   canvas.repaint();
		 	  }
   }
   if(e.getActionCommand().equals("绘制正切函数"))
   {
	   if(txt1.getText().equals("")||txt2.getText().equals("")||txt3.getText().equals("")||txt4.getText().equals(""))
		     JOptionPane.showMessageDialog(null, "参数不能为空!" );
		   else
			   {
			   
				   canvas.repaint();
		 	  }
   }

   if(e.getActionCommand().equals("设置颜色"))
   {
	   Color c;
	   c=canvas.getColor();
	   Color PColor = JColorChooser.showDialog(this, "请选择函数图形颜色", c);
	   canvas.setColor(PColor);
	   canvas.repaint();
   }
    if(e.getActionCommand().equals("标准"))
   {
    	float o=1;
    	canvas.setlinewidth(o);
    
    	canvas.repaint();
		
   }
    if(e.getActionCommand().equals("加粗"))
    {
    	float o=1;
    	o=canvas.getlinewidth();
    	o++;
    	canvas.setlinewidth(o);
     	canvas.repaint();
    	
    }

}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  new face();

	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	class MyCanvas extends Canvas implements MouseMotionListener,MouseListener,MouseWheelListener

	{
		
		//定位画布中心为原点720*500
		public int originX1,originY1;//左上
		public int originX2,originY2;//右上
		public int originX3,originY3;//右下
		public int originX4,originY4;//左下
		public int length;       //每单位的像素
		public Color color=Color.red;
		public float linewidth=1;   //函数线宽度
		public void setColor(Color c)
		{
			color=c;
		}
		public Color getColor()
		{
			return color;
		}
		public void setlength(int l)
		{
             length=l;
		}
		public void setlinewidth(float l)
		{
			linewidth=l;
		}
		public float getlinewidth()
		{
			return linewidth;
		}
		public void setorigin(int l,int m)
		{
			originX1=l;
			originY1=m;
			originX2 = originX1+1;
			originY2 = originY1;
			originX3 = originX1+1;
			originY3 = originY1+1;
			originX4 = originX1;
			originY4 = originY1+1;
		}
		public int getoriginX()
		{
            return originX1;
		}
		public int getoriginY()
		{
            return originY1;
		}
		public int getlength()
		{
            return length;
		}
		public MyCanvas() 
		{
			/*主要思路
			 * 坐标轴X,Y用2个像素单位，网格用1个像素单位，所以说原点有4个，从左上角顺时针依次是O1,O2,O3,O4
			 * 即下面的originX1，originY1,originX2，originY2，originX3,originY3，originX4,originY4
			 * 
			 * */
			originX1 = 360;
			originY1 = 250;
			originX2 = originX1+1;
			originY2 = originY1;
			originX3 = originX1+1;
			originY3 = originY1+1;
			originX4 = originX1;
			originY4 = originY1+1;
			this.addMouseMotionListener(this); //注册监听器MouseMotionListener
			this.addMouseWheelListener(this);
			this.addMouseListener(this);
		    length=15; 
		}
		
		
		//画布所有显示的内容放在这里
		public void paint(Graphics g) {
			
			  Graphics2D g_2d=(Graphics2D)g;
			  g_2d.setColor(Color.black);
		      g_2d.fillRect(originX1, 0, 2, 500);//画坐标轴Y
			  g_2d.fillRect(0, originY1, 720, 2);//画坐标轴x
			  
			 
			  int i=originX1-length;int j=originY1-length;///O1区域网格
		      for(;i>=0;i-=length)     //竖线
		      {
		    	  g_2d.setColor(Color.gray);
		    	  g_2d.drawLine(i, 0, i, originY1);
		      }
		      for(;j>=0;j-=length)    //横线
		      {
		    	  g_2d.setColor(Color.gray);
		    	  g_2d.drawLine(0, j, originX1, j);
		      }                                     /// O1区域网格
		    	  
		    	  
		      i=originX2+length; j=originY2-length;//O2区域网格
		      for(;i<=720;i+=length)   //竖线
		      {
		    	  g_2d.setColor(Color.gray);
		    	  g_2d.drawLine(i, 0, i, originY2);
		      }
		      for(;j>=0;j-=length)    //横线
		      {
		    	  g_2d.setColor(Color.gray);
		    	  g_2d.drawLine(originX2, j, 720, j);
		      }                                      ////O2区域网格
		      
		      
		      i=originX3+length; j=originY3+length;//O3区域网格
		      for(;i<=720;i+=length)   //竖线
		      {
		    	  g_2d.setColor(Color.gray);
		    	  g_2d.drawLine(i,originY3, i, 500);
		      }
		      for(;j<=500;j+=length)    //横线
		      {
		    	  g_2d.setColor(Color.gray);
		    	  g_2d.drawLine(originX3, j, 720, j);
		      }                                        ////O3区域网格
		      
		      
		      i=originX4-length; j=originY4+length;//O4区域网格
		      for(;i>=0;i-=length)   //竖线
		      {
		    	  g_2d.setColor(Color.gray);
		    	  g_2d.drawLine(i,originY4, i, 500);
		      }
		      for(;j<=500;j+=length)    //横线
		      {
		    	  g_2d.setColor(Color.gray);
		    	  g_2d.drawLine(originX4, j, 0, j);
		      }                                     ////区域O4网格
		   
		      Line2D line;
		      BasicStroke bs;
		    if(ilale==1)//ilale==1画直线
		      {
		    		
		    	  double a,b,c;
		    	  a=Double.parseDouble(txt1.getText());
		    	  b=Double.parseDouble(txt2.getText());
		    	  c=Double.parseDouble(txt3.getText());
		    	  if(a==0)//则函数的形式是y=常数的形式
		    	  {
		    		  double d=-(c/b);//y=常数的形式，且常熟为d
		    		   if(d<0)//因为d<0，则c/b>0,也就是说c/b是d的绝对值
		    		          
		    		  
		    		  {
		    			  int y=(int)((c/b)*length+originY3);//d对应的Y轴的像素
		    			  g_2d.setColor(color);
		    			  line=new  Line2D.Double(0, y, 720, y);//画布是（X轴）720*（y轴）500
		    			
		    			  bs = new BasicStroke(linewidth,BasicStroke.CAP_BUTT,BasicStroke.JOIN_BEVEL);//设置线条
		    			  
		    			  g_2d.setStroke(bs); //设置线条。
		    		      g_2d.draw(line); 
		    		  }
		    		  else//因为d>0，则c/b<0,
		    		  {
		    			  int y=(int)(originY2-d*length);//d对应的Y轴的像素
		    			  g_2d.setColor(color);
		    			 
		    			  line=new  Line2D.Double(0, y, 720, y);
		    			
			    		 bs = new BasicStroke(linewidth,BasicStroke.CAP_BUTT,BasicStroke.JOIN_BEVEL);//设置线条
			    			  
		    			  g_2d.setStroke(bs); //设置线条。
		    		      g_2d.draw(line); 
		    		  }
		    	  }//a==0
		    	  else //a!=0
		    	  {
		    		   if(b==0)//函数形式为x=常熟的形式
		    		   {
		    			   double d=-(c/a);//x=常数的形式，且常熟为d
				    		  if(d<0)        //常数在y轴左边
				    		  {
				    			  int x=(int)(originX4-(c/a)*length);
				    			  g_2d.setColor(color);
				    			
				    			  line=new  Line2D.Double(x, 0, x, 500);
				    			  bs = new BasicStroke(linewidth,BasicStroke.CAP_BUTT,BasicStroke.JOIN_BEVEL);
				    			  g_2d.setStroke(bs); //设置线条。
				    		      g_2d.draw(line); 
				    			  
				    		  }
				    		  else     //常数在y轴右边
				    		  {
				    			  int x=(int)(originX2+d*length);
				    			  g_2d.setColor(color);
				    			 
				    			  line=new  Line2D.Double(x, 0, x, 500);
				    			  bs = new BasicStroke(linewidth,BasicStroke.CAP_BUTT,BasicStroke.JOIN_BEVEL);
				    			  g_2d.setStroke(bs); //设置线条。
				    		      g_2d.draw(line); 
				    		  }
		    		   }//b==0
		    		   else //b!=0   则函数为y=kx+b的形式        （720-originX2）/length
		    		   {
		    			   /*主要思路：
		    			    *  任意两个相邻像素先转化为对应得数值，即自变量x,根据函数求出y数值，再转化为yy像素
		    			    * 
		    			    * */
		    			   double kk=0,bb=0;//分别是斜率和截距
		    			   double y1,y2,l,m;//
		    			   int yy1,yy2;//
		    			   
		    			   kk=-(a/b);//斜率
		    			   bb=-(c/b);//截距
		    			  		    			  
		    			   for(l=0,m=1;m<originX1;l++,m++)//画x轴左边
		 		    	  {
		 		    		 y1=(-(originX1-l)/length)*kk+bb;
		 		    		 y2=(-(originX1-m)/length)*kk+bb;
		 		    	    
		 		    		 if(y1>0&&y2>0)
		 		    		 {
		 		    			 yy1=(int)(originY1-(y1*length));
		 		    			 yy2=(int)(originY1-(y2*length));
		 		  		   	 }
		 		    		 else if(y1>0&&y2<0)
		 		    		 {
		 		    			 yy1=(int)(originY1-(y1*length));
		 		    			 yy2=(int)(originY3+(-y2*length));
		 		    		 }
		 		    		 else if(y1<0&&y2>0)
		 		    		 {
		 		    			 yy1=(int)(originY1+(-y1*length));
		 		    			 yy2=(int)(originY3-(y2*length));
		 		    		 }
		 		    		 else
		 		    	     {
		 		    			 yy1=(int)(originY1+(-y1*length));
		 		    			 yy2=(int)(originY3+(-y2*length));
		 		    	     }
		 		    		 g_2d.setColor(color);
		 		    		
		 		    		line=new  Line2D.Double((int)l, yy1, (int) m, yy2);
		 		    		 bs = new BasicStroke(linewidth,BasicStroke.CAP_BUTT,BasicStroke.JOIN_BEVEL);
			    			  g_2d.setStroke(bs); //设置线条。
			    		      g_2d.draw(line); 
		 		    		
		 		    	  }
		 		    	
		 		    	
		    			   
		    			   
		    			   
		    			   /*因为坐标轴为2个像素单位，则需要把坐标轴单独讨论，单独画*/
		    			   
		 		    	  g_2d.setColor(color);
		 		    	  if(bb>=0)
		 		    	  {
		 		    		 line=new  Line2D.Double(originX1,(int) (originY1-(bb*length)), originX2, (int) (originY1-(bb*length)));
		 		    	  }
		 		    	  else
		 		    		 line=new  Line2D.Double(originX1,(int) (originY3+(-bb*length)), originX2, (int) (originY3+(-bb*length)));
		 		    	  
		 		    	  bs = new BasicStroke(linewidth,BasicStroke.CAP_BUTT,BasicStroke.JOIN_BEVEL);
		    			  g_2d.setStroke(bs); //设置线条。
		    		      g_2d.draw(line); 
		 		    	
		 		    	    
		    		      
		    		      
		    		      
		    		      
		    		      
		 		    	  for(l=originX2,m=l+1;m<721;l++,m++)//画x轴右边
		 		    	  {
		 			    		 y1=((l-originX1)/length)*kk+bb;
			 		    		 y2=((m-originX1)/length)*kk+bb;
		 			    		 if(y1>0&&y2>0)
		 			    		 {
		 			    			 yy1=(int)(originY1-(y1*length));
		 			    			 yy2=(int)(originY1-(y2*length));
		 			  		   	 }
		 			    		 else if(y1>0&&y2<0)
		 			    		 {
		 			    			 yy1=(int)(originY1-(y1*length));
		 			    			 yy2=(int)(originY3+(-y2*length));
		 			    		 }
		 			    		 else if(y1<0&&y2>0)
		 			    		 {
		 			    			 yy1=(int)(originY1+(-y1*length));
		 			    			 yy2=(int)(originY3-(y2*length));
		 			    		 }
		 			    		 else
		 			    	     {
		 			    			 yy1=(int)(originY1+(-y1*length));
		 			    			 yy2=(int)(originY3+(-y2*length));
		 			    	     }
		 			    		 g_2d.setColor(color);
		 			    		
		 			    		 line=new  Line2D.Double((int)l, yy1, (int) m, yy2);
		 			    		 bs = new BasicStroke(linewidth,BasicStroke.CAP_BUTT,BasicStroke.JOIN_BEVEL);
				    			  g_2d.setStroke(bs); //设置线条。
				    		      g_2d.draw(line); 
		 		    	  }
		    		   }  //b!=0
		    	  }//a!=0
		    	  
		    	  
		      }//ilale==1画直线
		    
		    
		    
		    
		    
		      if(ilale==2)//ilale==2画幂函数
		      {
		    	 
		    	  double a,y1,y2,l,m;
		    	  int yy1,yy2;//像素
		    	  a=Double.parseDouble(txt1.getText());
		    	  
		    	  for(l=0,m=1;m<originX1;l++,m++)//x轴左边
		    	  {
		    		 y1=Math.pow(-(originX1-l)/length, a);
		    		 y2=Math.pow(-(originX1-m)/length, a);
		    	
		    		 if(y1>0&&y2>0)
		    		 {
		    			 yy1=(int)(originY1-(y1*length));
		    			 yy2=(int)(originY1-(y2*length));
		  		   	 }
		    		 else if(y1>0&&y2<0)
		    		 {
		    			 yy1=(int)(originY1-(y1*length));
		    			 yy2=(int)(originY3+(-y2*length));
		    		 }
		    		 else if(y1<0&&y2>0)
		    		 {
		    			 yy1=(int)(originY1+(-y1*length));
		    			 yy2=(int)(originY3-(y2*length));
		    		 }
		    		 else
		    	     {
		    			 yy1=(int)(originY1+(-y1*length));
		    			 yy2=(int)(originY3+(-y2*length));
		    	     }
		    		 g_2d.setColor(color);
		    		 if(yy1>0&&yy1<500&yy2>0&&yy2<500)
		    		 {
		    		 line=new  Line2D.Double((int)l, yy1, (int) m, yy2);
		    		 bs = new BasicStroke(linewidth,BasicStroke.CAP_BUTT,BasicStroke.JOIN_BEVEL);
	    			  g_2d.setStroke(bs); //设置线条。
	    		      g_2d.draw(line); 
	    		      }
		    		
		    	  }
		    	  if(a>=0)
		    	  {
		    	  g_2d.setColor(color);
		    	  
		    	  line=new  Line2D.Double(originX1, (int)Math.pow(0, a), originX2, (int)Math.pow(0, a));
		    	  bs = new BasicStroke(linewidth,BasicStroke.CAP_BUTT,BasicStroke.JOIN_BEVEL);
    			  g_2d.setStroke(bs); //设置线条。
    		      g_2d.draw(line); 
		    	
		    	  }
		    	  for(l=originX2,m=l+1;m<721;l++,m++)
		    	  {
		    		     y1=Math.pow((l-originX1)/length, a);
			    		 y2=Math.pow((m-originX1)/length, a);
			    		 
			    		 if(y1>0&&y2>0)
			    		 {
			    			 yy1=(int)(originY1-(y1*length));
			    			 yy2=(int)(originY1-(y2*length));
			  		   	 }
			    		 else if(y1>0&&y2<0)
			    		 {
			    			 yy1=(int)(originY1-(y1*length));
			    			 yy2=(int)(originY3+(-y2*length));
			    		 }
			    		 else if(y1<0&&y2>0)
			    		 {
			    			 yy1=(int)(originY1+(-y1*length));
			    			 yy2=(int)(originY3-(y2*length));
			    		 }
			    		 else
			    	     {
			    			 yy1=(int)(originY1+(-y1*length));
			    			 yy2=(int)(originY3+(-y2*length));
			    	     }
			    		 g_2d.setColor(color);
			    		 if(yy1>0&&yy1<500&yy2>0&&yy2<500)
			    		 {
			    			 line=new  Line2D.Double((int)l, yy1, (int) m, yy2);
			    		 bs = new BasicStroke(linewidth,BasicStroke.CAP_BUTT,BasicStroke.JOIN_BEVEL);
		    			  g_2d.setStroke(bs); //设置线条。
		    		      g_2d.draw(line); 
			    		 }
		    	  }
		      }//ilale==2画幂函数
		      if(ilale==3)//ilale==3画指数函数
		      {   
		    	  
		    	  double a,y1,y2,l,m;
		    	  int yy1,yy2;//像素
		    	  a=Double.parseDouble(txt1.getText());
		    	  
		    	  for(l=0,m=1;m<originX1;l++,m++)//x轴左边
		    	  {
		    		 y1=Math.pow(a,-(originX1-l)/length);
		    		 y2=Math.pow(a,-(originX1-m)/length);
		    	
		    		 if(y1>0&&y2>0)
		    		 {
		    			 yy1=(int)(originY1-(y1*length));
		    			 yy2=(int)(originY1-(y2*length));
		  		   	 }
		    		 else if(y1>0&&y2<0)
		    		 {
		    			 yy1=(int)(originY1-(y1*length));
		    			 yy2=(int)(originY3+(-y2*length));
		    		 }
		    		 else if(y1<0&&y2>0)
		    		 {
		    			 yy1=(int)(originY1+(-y1*length));
		    			 yy2=(int)(originY3-(y2*length));
		    		 }
		    		 else
		    	     {
		    			 yy1=(int)(originY1+(-y1*length));
		    			 yy2=(int)(originY3+(-y2*length));
		    	     }
		    		 g_2d.setColor(color);
		    		 if(yy1>0&&yy1<500&yy2>0&&yy2<500)
		    		 {
		    		 line=new  Line2D.Double((int)l, yy1, (int) m, yy2);
		    		 bs = new BasicStroke(linewidth,BasicStroke.CAP_BUTT,BasicStroke.JOIN_BEVEL);
	    			  g_2d.setStroke(bs); //设置线条。
	    		      g_2d.draw(line); 
		    		 }
		    	  }
		    	 
		    	  {
		    	  g_2d.setColor(color);
		    	  
		    	  line=new  Line2D.Double(originX1, (originY1+length), originX2, (originY1+length));
		    	  bs = new BasicStroke(linewidth,BasicStroke.CAP_BUTT,BasicStroke.JOIN_BEVEL);
    			  g_2d.setStroke(bs); //设置线条。
    		      g_2d.draw(line); 
		    	
		    	  }
		    	  for(l=originX2,m=l+1;m<721;l++,m++)
		    	  {
		    		     y1=Math.pow(a,(l-originX1)/length);
			    		 y2=Math.pow(a,(m-originX1)/length);
			    		 
			    		 if(y1>0&&y2>0)
			    		 {
			    			 yy1=(int)(originY1-(y1*length));
			    			 yy2=(int)(originY1-(y2*length));
			  		   	 }
			    		 else if(y1>0&&y2<0)
			    		 {
			    			 yy1=(int)(originY1-(y1*length));
			    			 yy2=(int)(originY3+(-y2*length));
			    		 }
			    		 else if(y1<0&&y2>0)
			    		 {
			    			 yy1=(int)(originY1+(-y1*length));
			    			 yy2=(int)(originY3-(y2*length));
			    		 }
			    		 else
			    	     {
			    			 yy1=(int)(originY1+(-y1*length));
			    			 yy2=(int)(originY3+(-y2*length));
			    	     }
			    		 g_2d.setColor(color);
			    		 if(yy1>0&&yy1<500&yy2>0&&yy2<500)
			    		 {
			    		 line=new  Line2D.Double((int)l, yy1, (int) m, yy2);
			    		 bs = new BasicStroke(linewidth,BasicStroke.CAP_BUTT,BasicStroke.JOIN_BEVEL);
		    			  g_2d.setStroke(bs); //设置线条。
		    		      g_2d.draw(line); 
			    		 }
		    	  }
		    
		      }//ilale==3画指数函数
		      if(ilale==4)//ilale==4画对数函数
		      {
		    	 
		    	  double a,y1,y2,l,m;
		    	  int yy1,yy2;//像素
		    	  a=Double.parseDouble(txt1.getText());
		    	  
		    	  for(l=originX2,m=l+1;m<721;l++,m++)
		    	  {
		    		     y1=Math.log((l-originX1)/length)/Math.log(a);
			    		 y2=Math.log((m-originX1)/length)/Math.log(a);
			    		 
			    		 if(y1>0&&y2>0)
			    		 {
			    			 yy1=(int)(originY1-(y1*length));
			    			 yy2=(int)(originY1-(y2*length));
			  		   	 }
			    		 else if(y1>0&&y2<0)
			    		 {
			    			 yy1=(int)(originY1-(y1*length));
			    			 yy2=(int)(originY3+(-y2*length));
			    		 }
			    		 else if(y1<0&&y2>0)
			    		 {
			    			 yy1=(int)(originY1+(-y1*length));
			    			 yy2=(int)(originY3-(y2*length));
			    		 }
			    		 else
			    	     {
			    			 yy1=(int)(originY1+(-y1*length));
			    			 yy2=(int)(originY3+(-y2*length));
			    	     }
			    		 g_2d.setColor(color);
			    		 if(yy1>0&&yy1<500&yy2>0&&yy2<500)
			    		 {
			    		 line=new  Line2D.Double((int)l, yy1, (int) m, yy2);
			    		 bs = new BasicStroke(linewidth,BasicStroke.CAP_BUTT,BasicStroke.JOIN_BEVEL);
		    			  g_2d.setStroke(bs); //设置线条。
		    		      g_2d.draw(line); 
			    		 }
		    	  }
		     
		      }//ilale==4画对数函数
		      if(ilale==5)//ilale==5画正弦函数
		      {
		    	  
		    	
		    	  double A,w,f,h,y1,y2,l,m;
		    	  int yy1,yy2;//像素
		    	  A=Double.parseDouble(txt1.getText());
		    	  w=Double.parseDouble(txt2.getText());
		    	  f=Double.parseDouble(txt3.getText());
		    	  h=Double.parseDouble(txt4.getText());
		    	  
		    	  for(l=0,m=1;m<originX1;l++,m++)//x轴左边
		    	  {
		    		 y1=A*Math.sin(w*(-(originX1-l)/length)+Math.PI*f)+h;
		    		 y2=A*Math.sin(w*(-(originX1-m)/length)+Math.PI*f)+h;
		    	
		    		 if(y1>0&&y2>0)
		    		 {
		    			 yy1=(int)(originY1-(y1*length));
		    			 yy2=(int)(originY1-(y2*length));
		  		   	 }
		    		 else if(y1>0&&y2<0)
		    		 {
		    			 yy1=(int)(originY1-(y1*length));
		    			 yy2=(int)(originY3+(-y2*length));
		    		 }
		    		 else if(y1<0&&y2>0)
		    		 {
		    			 yy1=(int)(originY1+(-y1*length));
		    			 yy2=(int)(originY3-(y2*length));
		    		 }
		    		 else
		    	     {
		    			 yy1=(int)(originY1+(-y1*length));
		    			 yy2=(int)(originY3+(-y2*length));
		    	     }
		    		 g_2d.setColor(color);
		    		 if(yy1>0&&yy1<500&yy2>0&&yy2<500)
		    		 {
		    		 line=new  Line2D.Double((int)l, yy1, (int) m, yy2);
		    		 bs = new BasicStroke(linewidth,BasicStroke.CAP_BUTT,BasicStroke.JOIN_BEVEL);
	    			  g_2d.setStroke(bs); //设置线条。
	    		      g_2d.draw(line); 
		    		 }
		    		
		    	  }
		    	 
		    	 
		    	  g_2d.setColor(color);
		    	  if(A*Math.sin(Math.PI*f)+h>=0)
		    	      line=new  Line2D.Double(originX1, (int)(originY1-(A*Math.sin(Math.PI*f)+h)*length), originX2, (int)(originY1-(A*Math.sin(Math.PI*f)+h)*length));
		    	  else
		    		  line=new  Line2D.Double(originX1, (int)(originY3+(-(A*Math.sin(Math.PI*f)+h)*length)), originX2, (int)(originY3+(-(A*Math.sin(Math.PI*f)+h)*length)));  
		    	  bs = new BasicStroke(linewidth,BasicStroke.CAP_BUTT,BasicStroke.JOIN_BEVEL);
    			  g_2d.setStroke(bs); //设置线条。
    		      g_2d.draw(line); 
		    	  
		    	  for(l=originX2,m=l+1;m<721;l++,m++)
		    	  {
		    		     y1=A*Math.sin((w*(l-originX1)/length)+Math.PI*f)+h;
			    		 y2=A*Math.sin((w*(m-originX1)/length)+Math.PI*f)+h;
		    		    
			    		 
			    		 if(y1>0&&y2>0)
			    		 {
			    			 yy1=(int)(originY1-(y1*length));
			    			 yy2=(int)(originY1-(y2*length));
			  		   	 }
			    		 else if(y1>0&&y2<0)
			    		 {
			    			 yy1=(int)(originY1-(y1*length));
			    			 yy2=(int)(originY3+(-y2*length));
			    		 }
			    		 else if(y1<0&&y2>0)
			    		 {
			    			 yy1=(int)(originY1+(-y1*length));
			    			 yy2=(int)(originY3-(y2*length));
			    		 }
			    		 else
			    	     {
			    			 yy1=(int)(originY1+(-y1*length));
			    			 yy2=(int)(originY3+(-y2*length));
			    	     }
			    		 g_2d.setColor(color);
			    		 if(yy1>0&&yy1<500&yy2>0&&yy2<500)
			    		 {
			    		 line=new  Line2D.Double((int)l, yy1, (int) m, yy2);
			    		 bs = new BasicStroke(linewidth,BasicStroke.CAP_BUTT,BasicStroke.JOIN_BEVEL);
		    			  g_2d.setStroke(bs); //设置线条。
		    		      g_2d.draw(line); 
			    		 }
		    	  }
		    	  
		    	  
		    	  
		      }//ilale==5画正弦函数
		      if(ilale==6)//ilale==6画余弦函数
		      {
		    	  double A,w,f,h,y1,y2,l,m;
		    	  int yy1,yy2;//像素
		    	  A=Double.parseDouble(txt1.getText());
		    	  w=Double.parseDouble(txt2.getText());
		    	  f=Double.parseDouble(txt3.getText());
		    	  h=Double.parseDouble(txt4.getText());
		    	  
		    	  for(l=0,m=1;m<originX1;l++,m++)//x轴左边
		    	  {
		    		 y1=A*Math.cos(w*(-(originX1-l)/length)+Math.PI*f)+h;
		    		 y2=A*Math.cos(w*(-(originX1-m)/length)+Math.PI*f)+h;
		    	
		    		 if(y1>0&&y2>0)
		    		 {
		    			 yy1=(int)(originY1-(y1*length));
		    			 yy2=(int)(originY1-(y2*length));
		  		   	 }
		    		 else if(y1>0&&y2<0)
		    		 {
		    			 yy1=(int)(originY1-(y1*length));
		    			 yy2=(int)(originY3+(-y2*length));
		    		 }
		    		 else if(y1<0&&y2>0)
		    		 {
		    			 yy1=(int)(originY1+(-y1*length));
		    			 yy2=(int)(originY3-(y2*length));
		    		 }
		    		 else
		    	     {
		    			 yy1=(int)(originY1+(-y1*length));
		    			 yy2=(int)(originY3+(-y2*length));
		    	     }
		    		 g_2d.setColor(color);
		    		 if(yy1>0&&yy1<500&yy2>0&&yy2<500)
		    		 {
		    		 line=new  Line2D.Double((int)l, yy1, (int) m, yy2);
		    		 bs = new BasicStroke(linewidth,BasicStroke.CAP_BUTT,BasicStroke.JOIN_BEVEL);
	    			  g_2d.setStroke(bs); //设置线条。
	    		      g_2d.draw(line); 
		    		 }
		    	  }
		    	 
		    	 
		    	  g_2d.setColor(color);
		    	  
		    	  if(A*Math.cos(Math.PI*f)+h>=0)
		    	      line=new  Line2D.Double(originX1, (int)(originY1-(A*Math.cos(Math.PI*f)+h)*length), originX2, (int)(originY1-(A*Math.cos(Math.PI*f)+h)*length));
		    	  else
		    		  line=new  Line2D.Double(originX1, (int)(originY3+(-(A*Math.cos(Math.PI*f)+h)*length)), originX2, (int)(originY3+(-(A*Math.cos(Math.PI*f)+h)*length)));  
		    	  bs = new BasicStroke(linewidth,BasicStroke.CAP_BUTT,BasicStroke.JOIN_BEVEL);
    			  g_2d.setStroke(bs); //设置线条。
    		      g_2d.draw(line); 
		    	  
		    	  for(l=originX2,m=l+1;m<721;l++,m++)
		    	  {
		    		     y1=A*Math.cos((w*(l-originX1)/length)+Math.PI*f)+h;
			    		 y2=A*Math.cos((w*(m-originX1)/length)+Math.PI*f)+h;
		    		    
			    		 
			    		 if(y1>0&&y2>0)
			    		 {
			    			 yy1=(int)(originY1-(y1*length));
			    			 yy2=(int)(originY1-(y2*length));
			  		   	 }
			    		 else if(y1>0&&y2<0)
			    		 {
			    			 yy1=(int)(originY1-(y1*length));
			    			 yy2=(int)(originY3+(-y2*length));
			    		 }
			    		 else if(y1<0&&y2>0)
			    		 {
			    			 yy1=(int)(originY1+(-y1*length));
			    			 yy2=(int)(originY3-(y2*length));
			    		 }
			    		 else
			    	     {
			    			 yy1=(int)(originY1+(-y1*length));
			    			 yy2=(int)(originY3+(-y2*length));
			    	     }
			    		 g_2d.setColor(color);
			    		 if(yy1>0&&yy1<500&yy2>0&&yy2<500)
			    		 {
			    		 line=new  Line2D.Double((int)l, yy1, (int) m, yy2);
			    		 bs = new BasicStroke(linewidth,BasicStroke.CAP_BUTT,BasicStroke.JOIN_BEVEL);
		    			  g_2d.setStroke(bs); //设置线条。
		    		      g_2d.draw(line); 
			    		 }
		    	  }
		    	  
		    	  
		    	  
		      }//ilale==6画正弦函数
		      if(ilale==7)//ilale==7画正切函数
		      {
		    	 
		    	  double A,w,f,h,y1,y2,l,m;
		    	  int yy1,yy2;//像素
		    	  A=Double.parseDouble(txt1.getText());
		    	  w=Double.parseDouble(txt2.getText());
		    	  f=Double.parseDouble(txt3.getText());
		    	  h=Double.parseDouble(txt4.getText());
		    	  
		    	  for(l=0,m=1;m<originX1;l++,m++)//x轴左边
		    	  {
		    		 y1=A*Math.tan(w*(-(originX1-l)/length)+Math.PI*f)+h;
		    		 y2=A*Math.tan(w*(-(originX1-m)/length)+Math.PI*f)+h;
		    	
		    		 if(y1>0&&y2>0)
		    		 {
		    			 yy1=(int)(originY1-(y1*length));
		    			 yy2=(int)(originY1-(y2*length));
		  		   	 }
		    		 else if(y1>0&&y2<0)
		    		 {
		    			 yy1=(int)(originY1-(y1*length));
		    			 yy2=(int)(originY3+(-y2*length));
		    		 }
		    		 else if(y1<0&&y2>0)
		    		 {
		    			 yy1=(int)(originY1+(-y1*length));
		    			 yy2=(int)(originY3-(y2*length));
		    		 }
		    		 else
		    	     {
		    			 yy1=(int)(originY1+(-y1*length));
		    			 yy2=(int)(originY3+(-y2*length));
		    	     }
		    		 g_2d.setColor(color);
		    		 if(yy1>0&&yy1<500&yy2>0&&yy2<500)
		    		 {
		    		 line=new  Line2D.Double((int)l, yy1, (int) m, yy2);
		    		 bs = new BasicStroke(linewidth,BasicStroke.CAP_BUTT,BasicStroke.JOIN_BEVEL);
	    			  g_2d.setStroke(bs); //设置线条。
	    		      g_2d.draw(line); 
		    		 }
		    	  }
		    	 
		    	 
		    	  g_2d.setColor(color);
		    	  
		    	  if(A*Math.tan(Math.PI*f)+h>=0)
		    	      line=new  Line2D.Double(originX1, (int)(originY1-(A*Math.tan(Math.PI*f)+h)*length), originX2, (int)(originY1-(A*Math.tan(Math.PI*f)+h)*length));
		    	  else
		    		  line=new  Line2D.Double(originX1, (int)(originY3+(-(A*Math.tan(Math.PI*f)+h)*length)), originX2, (int)(originY3+(-(A*Math.tan(Math.PI*f)+h)*length)));  
		    	  bs = new BasicStroke(linewidth,BasicStroke.CAP_BUTT,BasicStroke.JOIN_BEVEL);
    			  g_2d.setStroke(bs); //设置线条。
    		      g_2d.draw(line); 
		    	  
		    	  for(l=originX2,m=l+1;m<721;l++,m++)
		    	  {
		    		     y1=A*Math.tan((w*(l-originX1)/length)+Math.PI*f)+h;
			    		 y2=A*Math.tan((w*(m-originX1)/length)+Math.PI*f)+h;
		    		    
			    		 
			    		 if(y1>0&&y2>0)
			    		 {
			    			 yy1=(int)(originY1-(y1*length));
			    			 yy2=(int)(originY1-(y2*length));
			  		   	 }
			    		 else if(y1>0&&y2<0)
			    		 {
			    			 yy1=(int)(originY1-(y1*length));
			    			 yy2=(int)(originY3+(-y2*length));
			    		 }
			    		 else if(y1<0&&y2>0)
			    		 {
			    			 yy1=(int)(originY1+(-y1*length));
			    			 yy2=(int)(originY3-(y2*length));
			    		 }
			    		 else
			    	     {
			    			 yy1=(int)(originY1+(-y1*length));
			    			 yy2=(int)(originY3+(-y2*length));
			    	     }
			    		 g_2d.setColor(color);
			    		 if(yy1>0&&yy1<500&yy2>0&&yy2<500)
			    		 {
			    		 line=new  Line2D.Double((int)l, yy1, (int) m, yy2);
			    		 bs = new BasicStroke(linewidth,BasicStroke.CAP_BUTT,BasicStroke.JOIN_BEVEL);
		    			  g_2d.setStroke(bs); //设置线条。
		    		      g_2d.draw(line); 
			    		 }
		    	  }
		    	  
		      }//ilale==7画正切函数
		      if(ilale==8)//ilale==8X型抛物线
		      {
		    	  
		    	  double a,b,c,x1,x2,l,m;
		    	  int xx1,xx2;//像素
		    	  a=Double.parseDouble(txt1.getText());
		    	  b=Double.parseDouble(txt2.getText());
		    	  c=Double.parseDouble(txt3.getText());
		    	 
		    	  
		    	  for(l=0,m=1;m<originY1;l++,m++)//x轴上边
		    	  {
		    		 x1=a*((originY1-l)/length)*((originY1-l)/length)+b*((originY1-l)/length)+c;
		    		 x2=a*((originY1-m)/length)*((originY1-m)/length)+b*((originY1-m)/length)+c;
		    		 
		    	
		    		 if(x1>0&&x2>0)
		    		 {
		    			 xx1=(int)(originX2+(x1*length));
		    			 xx2=(int)(originX2+(x2*length));
		  		   	 }
		    		 else if(x1>0&&x2<0)
		    		 {
		    			 xx1=(int)(originX2+(x1*length));
		    			 xx2=(int)(originX1-(-x2*length));
		    		 }
		    		 else if(x1<0&&x2>0)
		    		 {
		    			 xx1=(int)(originX1-(-x1*length));
		    			 xx2=(int)(originX2+(x2*length));
		    		 }
		    		 else
		    	     {
		    			 xx1=(int)(originX1-(-x1*length));
		    			 xx2=(int)(originX1-(-x2*length));
		    	     }
		    		 g_2d.setColor(color);
		    		 if(xx1>0&&xx1<720&xx2>0&&xx2<720)
		    		 {
		    		 line=new  Line2D.Double(xx1, (int)l, xx2, (int)m);
		    		 bs = new BasicStroke(linewidth,BasicStroke.CAP_BUTT,BasicStroke.JOIN_BEVEL);
	    			  g_2d.setStroke(bs); //设置线条。
	    		      g_2d.draw(line); 
		    		 }
		    		
		    	  }
		    	 
		    	 
		    	  g_2d.setColor(color);
		    	 
		    	  if(c>=0)
 		    	  {
 		    		 line=new  Line2D.Double((int)(originX2+(c*length)),originY1,(int)(originX2+(c*length)),originY3);
 		    	  }
 		    	  else
 		    		 line=new  Line2D.Double((int)(originX1-(-c*length)),originY1,(int)(originX1-(-c*length)),originY3);
		    	  bs = new BasicStroke(linewidth,BasicStroke.CAP_BUTT,BasicStroke.JOIN_BEVEL);
    			  g_2d.setStroke(bs); //设置线条。
    		      g_2d.draw(line); 
		    	  
		    	  for(l=originY3,m=l+1;m<501;l++,m++)
		    	  {
		    		  x1=a*(-(l-originY1)/length)*(-(l-originY1)/length)+b*(-(l-originY1)/length)+c;
			    	  x2=a*(-(m-originY1)/length)*(-(m-originY1)/length)+b*(-(m-originY1)/length)+c;
			    		 
			    	
			    		 if(x1>0&&x2>0)
			    		 {
			    			 xx1=(int)(originX2+(x1*length));
			    			 xx2=(int)(originX2+(x2*length));
			  		   	 }
			    		 else if(x1>0&&x2<0)
			    		 {
			    			 xx1=(int)(originX2+(x1*length));
			    			 xx2=(int)(originX1-(-x2*length));
			    		 }
			    		 else if(x1<0&&x2>0)
			    		 {
			    			 xx1=(int)(originX1-(-x1*length));
			    			 xx2=(int)(originX2+(x2*length));
			    		 }
			    		 else
			    	     {
			    			 xx1=(int)(originX1-(-x1*length));
			    			 xx2=(int)(originX1-(-x2*length));
			    	     }
			    		 g_2d.setColor(color);
			    		 if(xx1>0&&xx1<720&xx2>0&&xx2<720)
			    		 {
			    		 line=new  Line2D.Double(xx1,(int)l,xx2,(int) m);
			    		 bs = new BasicStroke(linewidth,BasicStroke.CAP_BUTT,BasicStroke.JOIN_BEVEL);
		    			  g_2d.setStroke(bs); //设置线条。
		    		      g_2d.draw(line); 
			    		 }
		    	  }
		    	  
		      }//ilale==8画X型抛物线函数
		      
		      
		      
		      
		      
		      
		      
		      
		      
		      if(ilale==9)//ilale==9Y型抛物线
		      {
		    	  
		    	  double a,b,c,y1,y2,l,m;
		    	  int yy1,yy2;//像素
		    	  a=Double.parseDouble(txt1.getText());
		    	  b=Double.parseDouble(txt2.getText());
		    	  c=Double.parseDouble(txt3.getText());
		    	 
		    	  
		    	  for(l=0,m=1;m<originX1;l++,m++)//x轴上边
		    	  {
		    		 y1=a*(-(originX1-l)/length)*(-(originX1-l)/length)+b*(-(originX1-l)/length)+c;
		    		 y2=a*(-(originX1-m)/length)*(-(originX1-m)/length)+b*(-(originX1-m)/length)+c;
		    		 
		    	
		    		 if(y1>0&&y2>0)
		    		 {
		    			 yy1=(int)(originY1-(y1*length));
		    			 yy2=(int)(originY1-(y2*length));
		  		   	 }
		    		 else if(y1>0&&y2<0)
		    		 {
		    			 yy1=(int)(originY2-(y1*length));
		    			 yy2=(int)(originY1+(-y2*length));
		    		 }
		    		 else if(y1<0&&y2>0)
		    		 {
		    			 yy1=(int)(originY3+(-y1*length));
		    			 yy2=(int)(originY2-(y2*length));
		    		 }
		    		 else
		    	     {
		    			 yy1=(int)(originY1+(-y1*length));
		    			 yy2=(int)(originY1+(-y2*length));
		    	     }
		    		 g_2d.setColor(color);
		    		 if(yy1>0&&yy1<500&yy2>0&&yy2<500)
		    		 {
		    		 line=new  Line2D.Double((int)l,yy1, (int)m,yy2);
		    		 bs = new BasicStroke(linewidth,BasicStroke.CAP_BUTT,BasicStroke.JOIN_BEVEL);
	    			  g_2d.setStroke(bs); //设置线条。
	    		      g_2d.draw(line); 
		    		 }
		    		
		    	  }
		    	 
		    	 
		    	  g_2d.setColor(color);
		    	 
		    	  if(c>=0)
 		    	  {
 		    		 line=new  Line2D.Double(originX1,(int)(originY2-(c*length)),originX2, (int) (originY2-(c*length)));
 		    	  }
 		    	  else
 		    		 line=new  Line2D.Double(originX1,(int) (originY3+(-c*length)), originX2, (int) (originY3+(-c*length)));
		    	  bs = new BasicStroke(linewidth,BasicStroke.CAP_BUTT,BasicStroke.JOIN_BEVEL);
    			  g_2d.setStroke(bs); //设置线条。
    		      g_2d.draw(line); 
		    	  
    		      
    		      
    		      
		    	  for(l=originX2,m=l+1;m<721;l++,m++)
		    	  {
		    		  y1=a*((l-originX2)/length)*((l-originX2)/length)+b*((l-originX2)/length)+c;
			    	  y2=a*((m-originX2)/length)*((m-originX2)/length)+b*((m-originX2)/length)+c;
			    		 
			    	
			    		 if(y1>0&&y2>0)
			    		 {
			    			 yy1=(int)(originY1-(y1*length));
			    			 yy2=(int)(originY1-(y2*length));
			  		   	 }
			    		 else if(y1>0&&y2<0)
			    		 {
			    			 yy1=(int)(originY1-(y1*length));
			    			 yy2=(int)(originY1+(-y2*length));
			    		 }
			    		 else if(y1<0&&y2>0)
			    		 {
			    			 yy1=(int)(originY1+(-y1*length));
			    			 yy2=(int)(originY1-(y2*length));
			    		 }
			    		 else
			    	     {
			    			yy1=(int)(originY1+(-y1*length));
			    			 yy2=(int)(originY1+(-y2*length));
			    	     }
			    		 g_2d.setColor(color);
			    		 if(yy1>0&&yy1<501&yy2>0&&yy2<501)
			    		 {
			    		 line=new  Line2D.Double((int)l,yy1,(int) m,yy2);
			    		 bs = new BasicStroke(linewidth,BasicStroke.CAP_BUTT,BasicStroke.JOIN_BEVEL);
		    			  g_2d.setStroke(bs); //设置线条。
		    		      g_2d.draw(line); 
			    		 }
		    	  }
		    	  
		      }//ilale==9画Y型抛物线函数
		      
		      if(ilale==10)//ilale==10画X型双曲线函数
		      {
		    	  double a=Double.parseDouble(txt1.getText());
    		      double b=Double.parseDouble(txt2.getText());
    		      double x1,x2,l,m;
		    	  int xx1,xx2;//像素
		    	
    		      
    		      for(l=0,m=1;m<originY1;l++,m++)//x轴上边
		    	  {
		    		 x1=Math.sqrt(a/b*((originY1-l)/length)*((originY1-l)/length)+a);
		    		 x2=Math.sqrt(a/b*((originY1-m)/length)*((originY1-m)/length)+a);
		    		 
		    			 xx1=(int)(originX2+(x1*length));
		    			 xx2=(int)(originX2+(x2*length));
		  		   	
		    		 g_2d.setColor(color);
		    		 if(xx1>0&&xx1<720&xx2>0&&xx2<720)
		    		 {
		    		 line=new  Line2D.Double(xx1, (int)l, xx2, (int)m);
		    		 bs = new BasicStroke(linewidth,BasicStroke.CAP_BUTT,BasicStroke.JOIN_BEVEL);
	    			  g_2d.setStroke(bs); //设置线条。
	    		      g_2d.draw(line); 
		    		 }
		    		
		    	  }
		    	 
		    	 
		    	  g_2d.setColor(color);
		    	 
 		    		 line=new  Line2D.Double((int) (originX2+(Math.sqrt(a)*length)),originY1, (int) (originX2+(Math.sqrt(a)*length)),originY3);
 		    	  
		    	  bs = new BasicStroke(linewidth,BasicStroke.CAP_BUTT,BasicStroke.JOIN_BEVEL);
    			  g_2d.setStroke(bs); //设置线条。
    		      g_2d.draw(line); 
		    	  
		    	  for(l=originY3,m=l+1;m<501;l++,m++)
		    	  {
		    		  x1=Math.sqrt(a/b*(-(l-originY1)/length)*(-(l-originY1)/length)+a);
			    	  x2=Math.sqrt(a/b*(-(m-originY1)/length)*(-(m-originY1)/length)+a);
			    		
			    			 xx1=(int)(originX2+(x1*length));
			    			 xx2=(int)(originX2+(x2*length));
			  		   
			    		 g_2d.setColor(color);
			    		 if(xx1>0&&xx1<720&xx2>0&&xx2<720)
			    		 {
			    		 line=new  Line2D.Double(xx1,(int)l,xx2,(int) m);
			    		 bs = new BasicStroke(linewidth,BasicStroke.CAP_BUTT,BasicStroke.JOIN_BEVEL);
		    			  g_2d.setStroke(bs); //设置线条。
		    		      g_2d.draw(line); 
			    		 }
			    		 
		    	  }	 
			    		 
			    		 
			    		 
			    		  for(l=0,m=1;m<originY1;l++,m++)//x轴上边
				    	  {
				    		 x1=-Math.sqrt(a/b*((originY1-l)/length)*((originY1-l)/length)+a);
				    		 x2=-Math.sqrt(a/b*((originY1-m)/length)*((originY1-m)/length)+a);
				    		 
				    			 xx1=(int)(originX1-(-x1*length));
				    			 xx2=(int)(originX1-(-x2*length));
				  		   	
				    		 g_2d.setColor(color);
				    		 if(xx1>0&&xx1<720&xx2>0&&xx2<720)
				    		 {
				    		 line=new  Line2D.Double(xx1, (int)l, xx2, (int)m);
				    		 bs = new BasicStroke(linewidth,BasicStroke.CAP_BUTT,BasicStroke.JOIN_BEVEL);
			    			  g_2d.setStroke(bs); //设置线条。
			    		      g_2d.draw(line); 
				    		 }
				    		
				    	  }
				    	 
				    	 
				    	  g_2d.setColor(color);
				    	 
		 		    		 line=new  Line2D.Double((int) (originX1-(Math.sqrt(a)*length)),originY1,(int)(originX1-(Math.sqrt(a)*length)),originY3);
		 		    	  
				    	  bs = new BasicStroke(linewidth,BasicStroke.CAP_BUTT,BasicStroke.JOIN_BEVEL);
		    			  g_2d.setStroke(bs); //设置线条。
		    		      g_2d.draw(line); 
				    	  
				    	  for(l=originY3,m=l+1;m<500;l++,m++)
				    	  {
				    		  x1=-Math.sqrt(a/b*(-(l-originY1)/length)*(-(l-originY1)/length)+a);
					    	  x2=-Math.sqrt(a/b*(-(m-originY1)/length)*(-(m-originY1)/length)+a);
					    		
					    			 xx1=(int)(originX1-(-x1*length));
					    			 xx2=(int)(originX1-(-x2*length));
					  		   
					    		 g_2d.setColor(color);
					    		 if(xx1>0&&xx1<720&xx2>0&&xx2<720)
					    		 {
					    		 line=new  Line2D.Double(xx1,(int)l,xx2,(int) m);
					    		 bs = new BasicStroke(linewidth,BasicStroke.CAP_BUTT,BasicStroke.JOIN_BEVEL);
				    			  g_2d.setStroke(bs); //设置线条。
				    		      g_2d.draw(line); 
					    		 }
		    	          }
    		   
    		     
		    	  
		      }//ilale==10画X型双曲线函数
		      
		      
		      
		      if(ilale==11)//ilale==11画Y型双曲线函数
		      {
		    	  double a=Double.parseDouble(txt1.getText());
    		      double b=Double.parseDouble(txt2.getText());
    		      double y1,y2,l,m;
		    	  int yy1,yy2;//像素
		    	
    		      
    		      for(l=0,m=1;m<originX1;l++,m++)//x轴上边
		    	  {
		    		 y1=Math.sqrt(a/b*((originX1-l)/length)*((originX1-l)/length)+a);
		    		 y2=Math.sqrt(a/b*((originX1-m)/length)*((originX1-m)/length)+a);
		    		 
		    			 yy1=(int)(originY1-(y1*length));
		    			 yy2=(int)(originY1-(y2*length));
		  		   	
		    		 g_2d.setColor(color);
		    		 if(yy1>0&&yy1<500&yy2>0&&yy2<500)
		    		 {
		    		 line=new  Line2D.Double((int)l,yy1,(int)m,yy2);
		    		 bs = new BasicStroke(linewidth,BasicStroke.CAP_BUTT,BasicStroke.JOIN_BEVEL);
	    			  g_2d.setStroke(bs); //设置线条。
	    		      g_2d.draw(line); 
		    		 }
		    		
		    	  }
		    	 
		    	 
		    	  g_2d.setColor(color);
		    	 
 		    		 line=new  Line2D.Double(originX1,(int)(originY1-(Math.sqrt(a)*length)), originX2,(int)(originY1-(Math.sqrt(a)*length)));
 		    	  
		    	  bs = new BasicStroke(linewidth,BasicStroke.CAP_BUTT,BasicStroke.JOIN_BEVEL);
    			  g_2d.setStroke(bs); //设置线条。
    		      g_2d.draw(line); 
		    	  
		    	  for(l=originX3,m=l+1;m<721;l++,m++)
		    	  {
		    		  y1=Math.sqrt(a/b*((l-originX2)/length)*((l-originX2)/length)+a);
			    	  y2=Math.sqrt(a/b*((m-originX2)/length)*((m-originX2)/length)+a);
			    		
			    			 yy1=(int)(originY2-(y1*length));
			    			 yy2=(int)(originY2-(y2*length));
			  		   
			    		 g_2d.setColor(color);
			    		 if(yy1>0&&yy1<500&yy2>0&&yy2<500)
			    		 {
			    		 line=new  Line2D.Double((int)l,yy1,(int)m,yy2);
			    		 bs = new BasicStroke(linewidth,BasicStroke.CAP_BUTT,BasicStroke.JOIN_BEVEL);
		    			  g_2d.setStroke(bs); //设置线条。
		    		      g_2d.draw(line); 
			    		 }
			    		 
		    	  }	 
			    		 
			    		 
			    		  for(l=0,m=1;m<originX1;l++,m++)//x轴上边
				    	  {
				    		 y1=-Math.sqrt(a/b*(-(originX1-l)/length)*(-(originX1-l)/length)+a);
				    		 y2=-Math.sqrt(a/b*(-(originX1-m)/length)*(-(originX1-m)/length)+a);
				    		 
				    			 yy1=(int)(originY3+(-y1*length));
				    			 yy2=(int)(originY3+(-y2*length));
				  		   	
				    		 g_2d.setColor(color);
				    		 if(yy1>0&&yy1<500&yy2>0&&yy2<500)
				    		 {
				    		 line=new  Line2D.Double((int)l,yy1,(int)m,yy2);
				    		 bs = new BasicStroke(linewidth,BasicStroke.CAP_BUTT,BasicStroke.JOIN_BEVEL);
			    			  g_2d.setStroke(bs); //设置线条。
			    		      g_2d.draw(line); 
				    		 }
				    		
				    	  }
				    	 
				    	 
				    	  g_2d.setColor(color);
				    	 
		 		    		 line=new  Line2D.Double(originX1,(int) (originY3+(Math.sqrt(a)*length)),originX2,(int)(originY3+(Math.sqrt(a)*length)));
		 		    	  
				    	  bs = new BasicStroke(linewidth,BasicStroke.CAP_BUTT,BasicStroke.JOIN_BEVEL);
		    			  g_2d.setStroke(bs); //设置线条。
		    		      g_2d.draw(line); 
				    	  
				    	  for(l=originX2,m=l+1;m<721;l++,m++)
				    	  {
				    		  y1=-Math.sqrt(a/b*(-(l-originX2)/length)*(-(l-originX2)/length)+a);
					    	  y2=-Math.sqrt(a/b*(-(m-originX2)/length)*(-(m-originX2)/length)+a);
					    		
					    			 yy1=(int)(originY3+(-y1*length));
					    			 yy2=(int)(originY3+(-y2*length));
					  		   
					    		 g_2d.setColor(color);
					    		 if(yy1>0&&yy1<500&yy2>0&&yy2<500)
					    		 {
					    		 line=new  Line2D.Double((int)l,yy1,(int) m,yy2);
					    		 bs = new BasicStroke(linewidth,BasicStroke.CAP_BUTT,BasicStroke.JOIN_BEVEL);
				    			  g_2d.setStroke(bs); //设置线条。
				    		      g_2d.draw(line); 
					    		 }
		    	          }
    		   
    		     
		    	  
		      }//ilale==11画Y型双曲线函数
		      
		      
		      if(ilale==12)////ilale==12画X型椭圆
		      {
		    	  double a=Double.parseDouble(txt1.getText());
    		      double b=Double.parseDouble(txt2.getText());
    		      double y1,y2,l,m;
		    	  int yy1,yy2;//像素
		    	
    		      
    		      for(l=0,m=1;m<originX1;l++,m++)//x轴上边
		    	  {
		    		 y1=Math.sqrt(b-(b/a*((originX1-l)/length)*((originX1-l)/length)));
		    		 y2=Math.sqrt(b-(b/a*((originX1-m)/length)*((originX1-m)/length)));
		    		 
		    			 yy1=(int)(originY1-(y1*length));
		    			 yy2=(int)(originY1-(y2*length));
		  		   	
		    		 g_2d.setColor(color);
		    		 if(yy1>0&&yy1<500&yy2>0&&yy2<500)
		    		 {
		    		 line=new  Line2D.Double((int)l,yy1,(int)m,yy2);
		    		 bs = new BasicStroke(linewidth,BasicStroke.CAP_BUTT,BasicStroke.JOIN_BEVEL);
	    			  g_2d.setStroke(bs); //设置线条。
	    		      g_2d.draw(line); 
		    		 }
		    		
		    	  }
		    	 
		    	 
		    	  g_2d.setColor(color);
		    	 
 		    		 line=new  Line2D.Double(originX1,(int)(originY1-(Math.sqrt(b)*length)), originX2,(int)(originY1-(Math.sqrt(b)*length)));
 		    	  
		    	  bs = new BasicStroke(linewidth,BasicStroke.CAP_BUTT,BasicStroke.JOIN_BEVEL);
    			  g_2d.setStroke(bs); //设置线条。
    		      g_2d.draw(line); 
		    	  
		    	  for(l=originX3,m=l+1;m<721;l++,m++)
		    	  {
		    		  y1=Math.sqrt(b-(b/a*((l-originX2)/length)*((l-originX2)/length)));
			    	  y2=Math.sqrt(b-(b/a*((m-originX2)/length)*((m-originX2)/length)));
			    		
			    			 yy1=(int)(originY2-(y1*length));
			    			 yy2=(int)(originY2-(y2*length));
			  		   
			    		 g_2d.setColor(color);
			    		 if(yy1>0&&yy1<500&yy2>0&&yy2<500)
			    		 {
			    		 line=new  Line2D.Double((int)l,yy1,(int)m,yy2);
			    		 bs = new BasicStroke(linewidth,BasicStroke.CAP_BUTT,BasicStroke.JOIN_BEVEL);
		    			  g_2d.setStroke(bs); //设置线条。
		    		      g_2d.draw(line); 
			    		 }
			    		 
		    	  }	 
			    		 
			    		 
			    		  for(l=0,m=1;m<originX1;l++,m++)//x轴上边
				    	  {
				    		 y1=-Math.sqrt(b-(b/a*(-(originX1-l)/length)*(-(originX1-l)/length)));
				    		 y2=-Math.sqrt(b-(b/a*(-(originX1-m)/length)*(-(originX1-m)/length)));
				    		 
				    			 yy1=(int)(originY3+(-y1*length));
				    			 yy2=(int)(originY3+(-y2*length));
				  		   	
				    		 g_2d.setColor(color);
				    		 if(yy1>0&&yy1<500&yy2>0&&yy2<500)
				    		 {
				    		 line=new  Line2D.Double((int)l,yy1,(int)m,yy2);
				    		 bs = new BasicStroke(linewidth,BasicStroke.CAP_BUTT,BasicStroke.JOIN_BEVEL);
			    			  g_2d.setStroke(bs); //设置线条。
			    		      g_2d.draw(line); 
				    		 }
				    		
				    	  }
				    	 
				    	 
				    	  g_2d.setColor(color);
				    	 
		 		    		 line=new  Line2D.Double(originX1,(int) (originY3+(Math.sqrt(b)*length)),originX2,(int)(originY3+(Math.sqrt(b)*length)));
		 		    	  
				    	  bs = new BasicStroke(linewidth,BasicStroke.CAP_BUTT,BasicStroke.JOIN_BEVEL);
		    			  g_2d.setStroke(bs); //设置线条。
		    		      g_2d.draw(line); 
				    	  
				    	  for(l=originX2,m=l+1;m<721;l++,m++)
				    	  {
				    		  y1=-Math.sqrt(b-(b/a*(-(l-originX2)/length)*(-(l-originX2)/length)));
					    	  y2=-Math.sqrt(b-(b/a*(-(m-originX2)/length)*(-(m-originX2)/length)));
					    		
					    			 yy1=(int)(originY3+(-y1*length));
					    			 yy2=(int)(originY3+(-y2*length));
					  		   
					    		 g_2d.setColor(color);
					    		 if(yy1>0&&yy1<500&yy2>0&&yy2<500)
					    		 {
					    		 line=new  Line2D.Double((int)l,yy1,(int) m,yy2);
					    		 bs = new BasicStroke(linewidth,BasicStroke.CAP_BUTT,BasicStroke.JOIN_BEVEL);
				    			  g_2d.setStroke(bs); //设置线条。
				    		      g_2d.draw(line); 
					    		 }
		    	          }
    		   
		      }////ilale==12画X型椭圆
		      
		      
		      
		      if(ilale==13)//ilale==13画Y型椭圆
		      {
		    	  
		    	  double a=Double.parseDouble(txt1.getText());
    		      double b=Double.parseDouble(txt2.getText());
    		      double x1,x2,l,m;
		    	  int xx1,xx2;//像素
		    	
    		      
    		      for(l=0,m=1;m<originY1;l++,m++)//x轴上边
		    	  {
		    		 x1=Math.sqrt(b-(b/a*((originY1-l)/length)*((originY1-l)/length)));
		    		 x2=Math.sqrt(b-(b/a*((originY1-m)/length)*((originY1-m)/length)));
		    		 
		    			 xx1=(int)(originX2+(x1*length));
		    			 xx2=(int)(originX2+(x2*length));
		  		   	
		    		 g_2d.setColor(color);
		    		 if(xx1>0&&xx1<720&xx2>0&&xx2<720)
		    		 {
		    		 line=new  Line2D.Double(xx1, (int)l, xx2, (int)m);
		    		 bs = new BasicStroke(linewidth,BasicStroke.CAP_BUTT,BasicStroke.JOIN_BEVEL);
	    			  g_2d.setStroke(bs); //设置线条。
	    		      g_2d.draw(line); 
		    		 }
		    		
		    	  }
		    	 
		    	 
		    	  g_2d.setColor(color);
		    	 
 		    		 line=new  Line2D.Double((int) (originX2+(Math.sqrt(b)*length)),originY1, (int) (originX2+(Math.sqrt(b)*length)),originY3);
 		    	  
		    	  bs = new BasicStroke(linewidth,BasicStroke.CAP_BUTT,BasicStroke.JOIN_BEVEL);
    			  g_2d.setStroke(bs); //设置线条。
    		      g_2d.draw(line); 
		    	  
		    	  for(l=originY3,m=l+1;m<501;l++,m++)
		    	  {
		    		  x1=Math.sqrt(b-(b/a*(-(l-originY1)/length)*(-(l-originY1)/length)));
			    	  x2=Math.sqrt(b-(b/a*(-(m-originY1)/length)*(-(m-originY1)/length)));
			    		
			    			 xx1=(int)(originX2+(x1*length));
			    			 xx2=(int)(originX2+(x2*length));
			  		   
			    		 g_2d.setColor(color);
			    		 if(xx1>0&&xx1<720&xx2>0&&xx2<720)
			    		 {
			    		 line=new  Line2D.Double(xx1,(int)l,xx2,(int) m);
			    		 bs = new BasicStroke(linewidth,BasicStroke.CAP_BUTT,BasicStroke.JOIN_BEVEL);
		    			  g_2d.setStroke(bs); //设置线条。
		    		      g_2d.draw(line); 
			    		 }
			    		 
		    	  }	 
			    		 
			    		 
			    		 
			    		  for(l=0,m=1;m<originY1;l++,m++)//x轴上边
				    	  {
			    			  x1=-Math.sqrt(b-(b/a*((originY1-l)/length)*((originY1-l)/length)));
					    	  x2=-Math.sqrt(b-(b/a*((originY1-m)/length)*((originY1-m)/length)));
				    		 
				    			 xx1=(int)(originX1-(-x1*length));
				    			 xx2=(int)(originX1-(-x2*length));
				  		   	
				    		 g_2d.setColor(color);
				    		 if(xx1>0&&xx1<720&xx2>0&&xx2<720)
				    		 {
				    		 line=new  Line2D.Double(xx1, (int)l, xx2, (int)m);
				    		 bs = new BasicStroke(linewidth,BasicStroke.CAP_BUTT,BasicStroke.JOIN_BEVEL);
			    			  g_2d.setStroke(bs); //设置线条。
			    		      g_2d.draw(line); 
				    		 }
				    		
				    	  }
				    	 
				    	 
				    	  g_2d.setColor(color);
				    	 
		 		    		 line=new  Line2D.Double((int) (originX1-(Math.sqrt(b)*length)),originY1,(int)(originX1-(Math.sqrt(b)*length)),originY3);
		 		    	  
				    	  bs = new BasicStroke(linewidth,BasicStroke.CAP_BUTT,BasicStroke.JOIN_BEVEL);
		    			  g_2d.setStroke(bs); //设置线条。
		    		      g_2d.draw(line); 
				    	  
				    	  for(l=originY3,m=l+1;m<500;l++,m++)
				    	  {
				    		  x1=-Math.sqrt(b-(b/a*(-(l-originY1)/length)*(-(l-originY1)/length)));
					    	  x2=-Math.sqrt(b-(b/a*(-(m-originY1)/length)*(-(m-originY1)/length)));
					    		
					    			 xx1=(int)(originX1-(-x1*length));
					    			 xx2=(int)(originX1-(-x2*length));
					  		   
					    		 g_2d.setColor(color);
					    		 if(xx1>0&&xx1<720&xx2>0&&xx2<720)
					    		 {
					    		 line=new  Line2D.Double(xx1,(int)l,xx2,(int) m);
					    		 bs = new BasicStroke(linewidth,BasicStroke.CAP_BUTT,BasicStroke.JOIN_BEVEL);
				    			  g_2d.setStroke(bs); //设置线条。
				    		      g_2d.draw(line); 
					    		 }
		    	          }
    		   
    		     
		    	  
		      }//ilale==13画Y型椭圆
		      
		      
		      
		}	//end paint
		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			int l,m;
			newmouseX=e.getX();
			newmouseY=e.getY();
			
			if(newmouseX>=oldmouseX&&newmouseY>=oldmouseY)
			{
				l=getoriginX();
				m=getoriginY();
				l=(newmouseX-oldmouseX)+l;
				m=(newmouseY-oldmouseY)+m;
				setorigin(l,m);
				canvas.repaint();
			
			}
			else if(newmouseX<oldmouseX&&newmouseY>=oldmouseY)
			{
				l=getoriginX();
				m=getoriginY();
				l=(newmouseX-oldmouseX)+l;
				m=(newmouseY-oldmouseY)+m;
				setorigin(l,m);
				canvas.repaint();
				
			}
			else if(newmouseX>=oldmouseX&&newmouseY<oldmouseY)
			{
				l=getoriginX();
				m=getoriginY();
				l=(newmouseX-oldmouseX)+l;
				m=(newmouseY-oldmouseY)+m;
				setorigin(l,m);
				canvas.repaint();
			
			}
			else 
			{
				l=getoriginX();
				m=getoriginY();
				l=(newmouseX-oldmouseX)+l;
				m=(newmouseY-oldmouseY)+m;
				setorigin(l,m);
				canvas.repaint();
			
			}
		}
		@Override
		public void mouseDragged(MouseEvent e) {
			// TODO Auto-generated method stub
		     
		}
		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		public void mouseWheelMoved(MouseWheelEvent  e) {
	        // TODO Auto-generated method stub
	        if(e.getWheelRotation()==-1)
	        {
	            int ll=0;
	            ll=getlength();
	            ll+=1;
	            setlength(ll);
	            canvas.repaint();
	           
	        }
	        if(e.getWheelRotation()==1)
	        {
	        	int ll=0;
	        	ll=getlength();
	            ll-=1;
	            if(ll>0)
	            setlength(ll);
	            canvas.repaint();
	          
	        }
	    }
		@Override
		public void mouseMoved(MouseEvent e) {
			// TODO Auto-generated method stub
			double x=e.getX();
			double y=e.getY();
			if(x==originX1||x==originX2)
			{
				x=0;
				if(y>0&&y<originY1)
				{
					y=(originY1-y)/length ;
				}
				else if(y==originY1||y==originY3)
				{
					y=0;
				}
				else
					y=-(y-originY3)/length;
			}
			else if(y==originY1||y==originY3)
			{
				y=0;
				if(x>0&&x<originX1)
				{
					x=-(originX1-x)/length;
				}
				else if(x==originX1||x==originX2)
				{
					x=0;
				}
				else
					x=(x-originX2)/length;
			}
			else if(x<originX1&&y<originY1&&x>0&&y>0)
			{
				x=(originX1-x)/length;
				y=(originY1-y)/length;
				x=-x;
				
			}
			else if(x>originX2&&y<originY2&&y>0)
			{
				x=(x-originX2)/length;
				y=(originY2-y)/length;
				
			}
			else if(x>originX3&&y>originY3)
			{
				x=(x-originX3)/length;
				y=(y-originY3)/length;
				y=-y;
			}
			else if(x<originX4&&y>originY4&&x>0)
			{
				x=(originX4-x)/length;
				y=(y-originY4)/length;
				x=-x;
				y=-y;
			}
			DecimalFormat df=new DecimalFormat("0.00");  
			double xx=new Double(df.format(x).toString()); 
			double yy=new Double(df.format(y).toString()); 
			String s = "坐标 : X="+""+xx+","+"  Y = "+yy;
			zuobiao.setText(s);
		}

		

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			oldmouseX=e.getX();
			oldmouseY=e.getY();
		}

		

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		     
		}

	
	
		
	}	//end class MyCanvas






