package ��ѧ�����������;

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

	JPanel sizep1=new JPanel();  //�������

	JMenu b1=new JMenu ("file       ");
	JMenu b2=new JMenu("tool");
	
	
	public  JLabel zuobiao=new JLabel("  ���꣺");

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
	JLabel zhengxian4=new JLabel("f=��*");
	JLabel zhengxian5=new JLabel("h=");
	
	JLabel yuxian1=new JLabel("Y=Acos(wX+f)+h");
	JLabel yuxian2=new JLabel("A=");
	JLabel yuxian3=new JLabel("w=");
	JLabel yuxian4=new JLabel("f=��*");
	JLabel yuxian5=new JLabel("h=");
	
	JLabel zhengqie1=new JLabel("Y=Atan(wX+f)+h");
	JLabel zhengqie2=new JLabel("A=");
	JLabel zhengqie3=new JLabel("w=");
	JLabel zhengqie4=new JLabel("f=��*");
	JLabel zhengqie5=new JLabel("h=");
	
	JLabel paowuxianX1=new JLabel("X=A*Y2+B*Y+C");
	JLabel paowuxianX2=new JLabel("A=");
	JLabel paowuxianX3=new JLabel("B=");
	JLabel paowuxianX4=new JLabel("C=");
	
	JLabel paowuxianY1=new JLabel("Y=A*X^2+B*+C");
	
	JLabel shuangquxianX1=new JLabel("X2/a2-Y2/b2=1");//˫����X�ͣ����ǽ�����X��
	JLabel shuangquxianX2=new JLabel("a2=");
	JLabel shuangquxianX3=new JLabel("b2=");
	
	JLabel shuangquxianY1=new JLabel("Y2/a2-X2/b2=1");//˫����Y�ͣ����ǽ�����Y��
	JLabel shuangquxianY2=new JLabel("a2=");
	JLabel shuangquxianY3=new JLabel("b2=");
	
	
	JLabel tuoyuanX1=new JLabel("X2/a2+Y2/b2=1");//��ԲX�ͣ����ǽ�����X��
	JLabel tuoyuanX2=new JLabel("a2=");
	JLabel tuoyuanX3=new JLabel("b2=");
	
	JLabel tuoyuanY1=new JLabel("Y2/a2+X2/b2=1");//��ԲY�ͣ����ǽ�����Y��
	JLabel tuoyuanY2=new JLabel("a2=");
	JLabel tuoyuanY3=new JLabel("b2=");
	
	JButton jb1=new JButton("����ֱ��");
	JButton jb2=new JButton("�����ݺ���");
	JButton jb3=new JButton("����ָ������");
	JButton jb4=new JButton("���ƶ�������");
	JButton jb5=new JButton("�������Һ���");
	JButton jb6=new JButton("�������Һ���");
	JButton jb7=new JButton("�������к���");
	JButton jb8=new JButton("����X��������");
	JButton jb9=new JButton("����Y��������");
	JButton jb10=new JButton("����X��˫����");
	JButton jb11=new JButton("����Y��˫����");
	JButton jb12=new JButton("����X����Բ");
	JButton jb13=new JButton("����Y����Բ");
	
	
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
		JMenuItem size1=new JMenuItem("ֱ��");
		JMenuItem size2=new JMenuItem("�ݺ���");
		JMenuItem size3=new JMenuItem("ָ������");
		JMenuItem size4=new JMenuItem("��������");
		JMenu size5=new JMenu("���Ǻ���");
		JMenuItem j51=new JMenuItem("���Һ���");
		JMenuItem j52=new JMenuItem("���Һ���");
		JMenuItem j53=new JMenuItem("���к���");	 
		JMenu size6=new JMenu("������ͼ��");
		JMenuItem j61=new JMenuItem("X��������");
		JMenuItem j62=new JMenuItem("Y��������");
		JMenu size7=new JMenu("˫����ͼ��");
		JMenuItem j71=new JMenuItem("X��˫����");
		JMenuItem j72=new JMenuItem("Y��˫����");
		JMenu size8=new JMenu("��Բ");
		JMenuItem j81=new JMenuItem("X����Բ");
		JMenuItem j82=new JMenuItem("Y����Բ");
		JMenuItem set1=new JMenuItem("������ɫ");
		JMenu set2=new JMenu("���ô�ϸ");
		JMenuItem j11=new JMenuItem("��׼");
		JMenuItem j12=new JMenuItem("�Ӵ�");
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
		canvas = new MyCanvas();//����
		this.add(canvas);
		canvas.setBounds(0, 150, 720, 500);//����λ�ã�0��length0����С720*500	
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
   public void mihanshusize()//�ݺ���
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
   public void zhishusize()//ָ������
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
   public void duishusize()//��������
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
   public void zhengxiansize()//���Һ���
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
   
   public void yuxiansize()//���Һ���
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
   
   public void zhengqiesize()//���к���
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
   public void shuangquxianXsize()//˫����X��
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
   
   
   
   public void shuangquxianYsize()//˫����Y��
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
   
   
   public void tuoyuanXsize()//��ԲX��
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
   
   public void tuoyuanYsize()//��ԲY��
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

   if(e.getActionCommand().equals("ֱ��"))
   {   
	   zhixiansize();
   }
   if(e.getActionCommand().equals("����ֱ��"))
   {   
	   
	   double a=1,b=1;
	   if(txt1.getText().equals("")||txt2.getText().equals("")||txt3.getText().equals(""))
	     JOptionPane.showMessageDialog(null, "��������Ϊ��!" );
	   else
		   {
		   
	 	  a=Double.parseDouble(txt1.getText());
	 	  b=Double.parseDouble(txt2.getText());
	 	 
	 	   if(a*a+b*b==0)
			   JOptionPane.showMessageDialog(null, "����A,B����ͬʱΪ0!" );
		   else   
			   canvas.repaint();
	 	  }
	   
   }
   if(e.getActionCommand().equals("X����Բ"))
   {
	   tuoyuanXsize(); 
   }
   if(e.getActionCommand().equals("����X����Բ"))
   {
	   if(txt1.getText().equals("")||txt2.getText().equals(""))
  	     JOptionPane.showMessageDialog(null, "��������Ϊ��!" );
  	   else
  		   {
  		      double a=Double.parseDouble(txt1.getText());
  		      double b=Double.parseDouble(txt2.getText());
  		      if(a>0&&b>0)
  			   canvas.repaint();
  		      else
  		       JOptionPane.showMessageDialog(null, "��������Ϊ������!" );  
  	 	  }
   }
   if(e.getActionCommand().equals("Y����Բ"))
   {
	   tuoyuanYsize();
 
   }
   if(e.getActionCommand().equals("����Y����Բ"))
   {
	   if(txt1.getText().equals("")||txt2.getText().equals(""))
  	     JOptionPane.showMessageDialog(null, "��������Ϊ��!" );
  	   else
  		   {
  		      double a=Double.parseDouble(txt1.getText());
  		      double b=Double.parseDouble(txt2.getText());
  		      if(a>0&&b>0)
  			   canvas.repaint();
  		      else
  		       JOptionPane.showMessageDialog(null, "��������Ϊ������!" );  
  	 	  }
   }
   if(e.getActionCommand().equals("�ݺ���"))
   {
	   mihanshusize();
	   

		
	validate();   
   }
   if(e.getActionCommand().equals("�����ݺ���"))
   {
	   double a=1;
	   if(txt1.getText().equals(""))
	     JOptionPane.showMessageDialog(null, "��������Ϊ��!" );
	   else
		   {
		   
	 	       a=Double.parseDouble(txt1.getText());	 	 
			   canvas.repaint();
	 	  }
   }
   if(e.getActionCommand().equals("���Һ���"))
   {
	   zhengxiansize();
	   double a=1;
	   if(txt1.getText().equals(""))
	     JOptionPane.showMessageDialog(null, "��������Ϊ��!" );
	   else
		   {
		   
	 	       a=Double.parseDouble(txt1.getText());	 	 
			   canvas.repaint();
	 	  }
	   validate();
	   
   }
   if(e.getActionCommand().equals("���Һ���"))
   {
	   yuxiansize();
	   canvas.repaint();
   }
   if(e.getActionCommand().equals("���к���"))
   {
	   zhengqiesize();
	   canvas.repaint();
   }
   if(e.getActionCommand().equals("X��������"))
   {
	   paowuxianXsize();
	
	   
	   
   }
   if(e.getActionCommand().equals("����X��������"))
   {
	
	   if(txt1.getText().equals("")||txt2.getText().equals("")||txt3.getText().equals(""))
	     JOptionPane.showMessageDialog(null, "��������Ϊ��!" );
	   else
		   {
		     
			   canvas.repaint();
	 	  }
	   validate();
   }
   if(e.getActionCommand().equals("Y��������"))
   {
	   paowuxianYsize();
   }
   if(e.getActionCommand().equals("����Y��������"))
   {
	
	   if(txt1.getText().equals("")||txt2.getText().equals("")||txt3.getText().equals(""))
	     JOptionPane.showMessageDialog(null, "��������Ϊ��!" );
	   else
		   {
		     
			   canvas.repaint();
	 	  }
	   validate();
   }
     if(e.getActionCommand().equals("X��˫����"))
   {
    	 shuangquxianXsize();
   }
     if(e.getActionCommand().equals("����X��˫����"))
     {
    	 if(txt1.getText().equals("")||txt2.getText().equals(""))
    	     JOptionPane.showMessageDialog(null, "��������Ϊ��!" );
    	   else
    		   {
    		      double a=Double.parseDouble(txt1.getText());
    		      double b=Double.parseDouble(txt2.getText());
    		      if(a>0&&b>0)
    			   canvas.repaint();
    		      else
    		       JOptionPane.showMessageDialog(null, "��������Ϊ������!" );  
    	 	  }
     }
     if(e.getActionCommand().equals("Y��˫����"))
     {
      	 shuangquxianYsize();
     }
     if(e.getActionCommand().equals("����Y��˫����"))
     {
    	 if(txt1.getText().equals("")||txt2.getText().equals(""))
    	     JOptionPane.showMessageDialog(null, "��������Ϊ��!" );
    	   else
    		   {
    		      double a=Double.parseDouble(txt1.getText());
    		      double b=Double.parseDouble(txt2.getText());
    		      if(a>0&&b>0)
    			   canvas.repaint();
    		      else
    		       JOptionPane.showMessageDialog(null, "��������Ϊ������!" );  
    	 	  }
     }
    if(e.getActionCommand().equals("������"))
   {
	
   }
    if(e.getActionCommand().equals("ָ������"))
   {
	   zhishusize();
	   canvas.repaint();
   }
    if(e.getActionCommand().equals("����ָ������"))
   {
	   double a=1;
	   if(txt1.getText().equals(""))
	     JOptionPane.showMessageDialog(null, "��������Ϊ��!" );
	   else
		   {
		       
	 	       a=Double.parseDouble(txt1.getText());	
	 	       if(a>0)
			   canvas.repaint();
	 	       else
	 	      JOptionPane.showMessageDialog(null, "����a����С�ڵ���0!" ); 
	 	  }
   }
   else if(e.getActionCommand().equals("��������"))
   {
	   duishusize();
   }
   if(e.getActionCommand().equals("���ƶ�������"))
   {
	   double a=1;
	   if(txt1.getText().equals(""))
	     JOptionPane.showMessageDialog(null, "��������Ϊ��!" );
	   else
		   {
		       
	 	       a=Double.parseDouble(txt1.getText());	
	 	       if(a>0&&a!=1)
			   canvas.repaint();
	 	       else
	 	      JOptionPane.showMessageDialog(null, "����a�������0�Ҳ�����1!" ); 
	 	  }
	 

		
	validate();   
   }
   if(e.getActionCommand().equals("�������Һ���"))
   {
	   if(txt1.getText().equals("")||txt2.getText().equals("")||txt3.getText().equals("")||txt4.getText().equals(""))
	     JOptionPane.showMessageDialog(null, "��������Ϊ��!" );
	   else
		   {
		   
			   canvas.repaint();
	 	  }
   }
   if(e.getActionCommand().equals("�������Һ���"))
   {
	   if(txt1.getText().equals("")||txt2.getText().equals("")||txt3.getText().equals("")||txt4.getText().equals(""))
		     JOptionPane.showMessageDialog(null, "��������Ϊ��!" );
		   else
			   {
			   
				   canvas.repaint();
		 	  }
   }
   if(e.getActionCommand().equals("�������к���"))
   {
	   if(txt1.getText().equals("")||txt2.getText().equals("")||txt3.getText().equals("")||txt4.getText().equals(""))
		     JOptionPane.showMessageDialog(null, "��������Ϊ��!" );
		   else
			   {
			   
				   canvas.repaint();
		 	  }
   }

   if(e.getActionCommand().equals("������ɫ"))
   {
	   Color c;
	   c=canvas.getColor();
	   Color PColor = JColorChooser.showDialog(this, "��ѡ����ͼ����ɫ", c);
	   canvas.setColor(PColor);
	   canvas.repaint();
   }
    if(e.getActionCommand().equals("��׼"))
   {
    	float o=1;
    	canvas.setlinewidth(o);
    
    	canvas.repaint();
		
   }
    if(e.getActionCommand().equals("�Ӵ�"))
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
		
		//��λ��������Ϊԭ��720*500
		public int originX1,originY1;//����
		public int originX2,originY2;//����
		public int originX3,originY3;//����
		public int originX4,originY4;//����
		public int length;       //ÿ��λ������
		public Color color=Color.red;
		public float linewidth=1;   //�����߿��
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
			/*��Ҫ˼·
			 * ������X,Y��2�����ص�λ��������1�����ص�λ������˵ԭ����4���������Ͻ�˳ʱ��������O1,O2,O3,O4
			 * �������originX1��originY1,originX2��originY2��originX3,originY3��originX4,originY4
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
			this.addMouseMotionListener(this); //ע�������MouseMotionListener
			this.addMouseWheelListener(this);
			this.addMouseListener(this);
		    length=15; 
		}
		
		
		//����������ʾ�����ݷ�������
		public void paint(Graphics g) {
			
			  Graphics2D g_2d=(Graphics2D)g;
			  g_2d.setColor(Color.black);
		      g_2d.fillRect(originX1, 0, 2, 500);//��������Y
			  g_2d.fillRect(0, originY1, 720, 2);//��������x
			  
			 
			  int i=originX1-length;int j=originY1-length;///O1��������
		      for(;i>=0;i-=length)     //����
		      {
		    	  g_2d.setColor(Color.gray);
		    	  g_2d.drawLine(i, 0, i, originY1);
		      }
		      for(;j>=0;j-=length)    //����
		      {
		    	  g_2d.setColor(Color.gray);
		    	  g_2d.drawLine(0, j, originX1, j);
		      }                                     /// O1��������
		    	  
		    	  
		      i=originX2+length; j=originY2-length;//O2��������
		      for(;i<=720;i+=length)   //����
		      {
		    	  g_2d.setColor(Color.gray);
		    	  g_2d.drawLine(i, 0, i, originY2);
		      }
		      for(;j>=0;j-=length)    //����
		      {
		    	  g_2d.setColor(Color.gray);
		    	  g_2d.drawLine(originX2, j, 720, j);
		      }                                      ////O2��������
		      
		      
		      i=originX3+length; j=originY3+length;//O3��������
		      for(;i<=720;i+=length)   //����
		      {
		    	  g_2d.setColor(Color.gray);
		    	  g_2d.drawLine(i,originY3, i, 500);
		      }
		      for(;j<=500;j+=length)    //����
		      {
		    	  g_2d.setColor(Color.gray);
		    	  g_2d.drawLine(originX3, j, 720, j);
		      }                                        ////O3��������
		      
		      
		      i=originX4-length; j=originY4+length;//O4��������
		      for(;i>=0;i-=length)   //����
		      {
		    	  g_2d.setColor(Color.gray);
		    	  g_2d.drawLine(i,originY4, i, 500);
		      }
		      for(;j<=500;j+=length)    //����
		      {
		    	  g_2d.setColor(Color.gray);
		    	  g_2d.drawLine(originX4, j, 0, j);
		      }                                     ////����O4����
		   
		      Line2D line;
		      BasicStroke bs;
		    if(ilale==1)//ilale==1��ֱ��
		      {
		    		
		    	  double a,b,c;
		    	  a=Double.parseDouble(txt1.getText());
		    	  b=Double.parseDouble(txt2.getText());
		    	  c=Double.parseDouble(txt3.getText());
		    	  if(a==0)//��������ʽ��y=��������ʽ
		    	  {
		    		  double d=-(c/b);//y=��������ʽ���ҳ���Ϊd
		    		   if(d<0)//��Ϊd<0����c/b>0,Ҳ����˵c/b��d�ľ���ֵ
		    		          
		    		  
		    		  {
		    			  int y=(int)((c/b)*length+originY3);//d��Ӧ��Y�������
		    			  g_2d.setColor(color);
		    			  line=new  Line2D.Double(0, y, 720, y);//�����ǣ�X�ᣩ720*��y�ᣩ500
		    			
		    			  bs = new BasicStroke(linewidth,BasicStroke.CAP_BUTT,BasicStroke.JOIN_BEVEL);//��������
		    			  
		    			  g_2d.setStroke(bs); //����������
		    		      g_2d.draw(line); 
		    		  }
		    		  else//��Ϊd>0����c/b<0,
		    		  {
		    			  int y=(int)(originY2-d*length);//d��Ӧ��Y�������
		    			  g_2d.setColor(color);
		    			 
		    			  line=new  Line2D.Double(0, y, 720, y);
		    			
			    		 bs = new BasicStroke(linewidth,BasicStroke.CAP_BUTT,BasicStroke.JOIN_BEVEL);//��������
			    			  
		    			  g_2d.setStroke(bs); //����������
		    		      g_2d.draw(line); 
		    		  }
		    	  }//a==0
		    	  else //a!=0
		    	  {
		    		   if(b==0)//������ʽΪx=�������ʽ
		    		   {
		    			   double d=-(c/a);//x=��������ʽ���ҳ���Ϊd
				    		  if(d<0)        //������y�����
				    		  {
				    			  int x=(int)(originX4-(c/a)*length);
				    			  g_2d.setColor(color);
				    			
				    			  line=new  Line2D.Double(x, 0, x, 500);
				    			  bs = new BasicStroke(linewidth,BasicStroke.CAP_BUTT,BasicStroke.JOIN_BEVEL);
				    			  g_2d.setStroke(bs); //����������
				    		      g_2d.draw(line); 
				    			  
				    		  }
				    		  else     //������y���ұ�
				    		  {
				    			  int x=(int)(originX2+d*length);
				    			  g_2d.setColor(color);
				    			 
				    			  line=new  Line2D.Double(x, 0, x, 500);
				    			  bs = new BasicStroke(linewidth,BasicStroke.CAP_BUTT,BasicStroke.JOIN_BEVEL);
				    			  g_2d.setStroke(bs); //����������
				    		      g_2d.draw(line); 
				    		  }
		    		   }//b==0
		    		   else //b!=0   ����Ϊy=kx+b����ʽ        ��720-originX2��/length
		    		   {
		    			   /*��Ҫ˼·��
		    			    *  ������������������ת��Ϊ��Ӧ����ֵ�����Ա���x,���ݺ������y��ֵ����ת��Ϊyy����
		    			    * 
		    			    * */
		    			   double kk=0,bb=0;//�ֱ���б�ʺͽؾ�
		    			   double y1,y2,l,m;//
		    			   int yy1,yy2;//
		    			   
		    			   kk=-(a/b);//б��
		    			   bb=-(c/b);//�ؾ�
		    			  		    			  
		    			   for(l=0,m=1;m<originX1;l++,m++)//��x�����
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
			    			  g_2d.setStroke(bs); //����������
			    		      g_2d.draw(line); 
		 		    		
		 		    	  }
		 		    	
		 		    	
		    			   
		    			   
		    			   
		    			   /*��Ϊ������Ϊ2�����ص�λ������Ҫ�������ᵥ�����ۣ�������*/
		    			   
		 		    	  g_2d.setColor(color);
		 		    	  if(bb>=0)
		 		    	  {
		 		    		 line=new  Line2D.Double(originX1,(int) (originY1-(bb*length)), originX2, (int) (originY1-(bb*length)));
		 		    	  }
		 		    	  else
		 		    		 line=new  Line2D.Double(originX1,(int) (originY3+(-bb*length)), originX2, (int) (originY3+(-bb*length)));
		 		    	  
		 		    	  bs = new BasicStroke(linewidth,BasicStroke.CAP_BUTT,BasicStroke.JOIN_BEVEL);
		    			  g_2d.setStroke(bs); //����������
		    		      g_2d.draw(line); 
		 		    	
		 		    	    
		    		      
		    		      
		    		      
		    		      
		    		      
		 		    	  for(l=originX2,m=l+1;m<721;l++,m++)//��x���ұ�
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
				    			  g_2d.setStroke(bs); //����������
				    		      g_2d.draw(line); 
		 		    	  }
		    		   }  //b!=0
		    	  }//a!=0
		    	  
		    	  
		      }//ilale==1��ֱ��
		    
		    
		    
		    
		    
		      if(ilale==2)//ilale==2���ݺ���
		      {
		    	 
		    	  double a,y1,y2,l,m;
		    	  int yy1,yy2;//����
		    	  a=Double.parseDouble(txt1.getText());
		    	  
		    	  for(l=0,m=1;m<originX1;l++,m++)//x�����
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
	    			  g_2d.setStroke(bs); //����������
	    		      g_2d.draw(line); 
	    		      }
		    		
		    	  }
		    	  if(a>=0)
		    	  {
		    	  g_2d.setColor(color);
		    	  
		    	  line=new  Line2D.Double(originX1, (int)Math.pow(0, a), originX2, (int)Math.pow(0, a));
		    	  bs = new BasicStroke(linewidth,BasicStroke.CAP_BUTT,BasicStroke.JOIN_BEVEL);
    			  g_2d.setStroke(bs); //����������
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
		    			  g_2d.setStroke(bs); //����������
		    		      g_2d.draw(line); 
			    		 }
		    	  }
		      }//ilale==2���ݺ���
		      if(ilale==3)//ilale==3��ָ������
		      {   
		    	  
		    	  double a,y1,y2,l,m;
		    	  int yy1,yy2;//����
		    	  a=Double.parseDouble(txt1.getText());
		    	  
		    	  for(l=0,m=1;m<originX1;l++,m++)//x�����
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
	    			  g_2d.setStroke(bs); //����������
	    		      g_2d.draw(line); 
		    		 }
		    	  }
		    	 
		    	  {
		    	  g_2d.setColor(color);
		    	  
		    	  line=new  Line2D.Double(originX1, (originY1+length), originX2, (originY1+length));
		    	  bs = new BasicStroke(linewidth,BasicStroke.CAP_BUTT,BasicStroke.JOIN_BEVEL);
    			  g_2d.setStroke(bs); //����������
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
		    			  g_2d.setStroke(bs); //����������
		    		      g_2d.draw(line); 
			    		 }
		    	  }
		    
		      }//ilale==3��ָ������
		      if(ilale==4)//ilale==4����������
		      {
		    	 
		    	  double a,y1,y2,l,m;
		    	  int yy1,yy2;//����
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
		    			  g_2d.setStroke(bs); //����������
		    		      g_2d.draw(line); 
			    		 }
		    	  }
		     
		      }//ilale==4����������
		      if(ilale==5)//ilale==5�����Һ���
		      {
		    	  
		    	
		    	  double A,w,f,h,y1,y2,l,m;
		    	  int yy1,yy2;//����
		    	  A=Double.parseDouble(txt1.getText());
		    	  w=Double.parseDouble(txt2.getText());
		    	  f=Double.parseDouble(txt3.getText());
		    	  h=Double.parseDouble(txt4.getText());
		    	  
		    	  for(l=0,m=1;m<originX1;l++,m++)//x�����
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
	    			  g_2d.setStroke(bs); //����������
	    		      g_2d.draw(line); 
		    		 }
		    		
		    	  }
		    	 
		    	 
		    	  g_2d.setColor(color);
		    	  if(A*Math.sin(Math.PI*f)+h>=0)
		    	      line=new  Line2D.Double(originX1, (int)(originY1-(A*Math.sin(Math.PI*f)+h)*length), originX2, (int)(originY1-(A*Math.sin(Math.PI*f)+h)*length));
		    	  else
		    		  line=new  Line2D.Double(originX1, (int)(originY3+(-(A*Math.sin(Math.PI*f)+h)*length)), originX2, (int)(originY3+(-(A*Math.sin(Math.PI*f)+h)*length)));  
		    	  bs = new BasicStroke(linewidth,BasicStroke.CAP_BUTT,BasicStroke.JOIN_BEVEL);
    			  g_2d.setStroke(bs); //����������
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
		    			  g_2d.setStroke(bs); //����������
		    		      g_2d.draw(line); 
			    		 }
		    	  }
		    	  
		    	  
		    	  
		      }//ilale==5�����Һ���
		      if(ilale==6)//ilale==6�����Һ���
		      {
		    	  double A,w,f,h,y1,y2,l,m;
		    	  int yy1,yy2;//����
		    	  A=Double.parseDouble(txt1.getText());
		    	  w=Double.parseDouble(txt2.getText());
		    	  f=Double.parseDouble(txt3.getText());
		    	  h=Double.parseDouble(txt4.getText());
		    	  
		    	  for(l=0,m=1;m<originX1;l++,m++)//x�����
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
	    			  g_2d.setStroke(bs); //����������
	    		      g_2d.draw(line); 
		    		 }
		    	  }
		    	 
		    	 
		    	  g_2d.setColor(color);
		    	  
		    	  if(A*Math.cos(Math.PI*f)+h>=0)
		    	      line=new  Line2D.Double(originX1, (int)(originY1-(A*Math.cos(Math.PI*f)+h)*length), originX2, (int)(originY1-(A*Math.cos(Math.PI*f)+h)*length));
		    	  else
		    		  line=new  Line2D.Double(originX1, (int)(originY3+(-(A*Math.cos(Math.PI*f)+h)*length)), originX2, (int)(originY3+(-(A*Math.cos(Math.PI*f)+h)*length)));  
		    	  bs = new BasicStroke(linewidth,BasicStroke.CAP_BUTT,BasicStroke.JOIN_BEVEL);
    			  g_2d.setStroke(bs); //����������
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
		    			  g_2d.setStroke(bs); //����������
		    		      g_2d.draw(line); 
			    		 }
		    	  }
		    	  
		    	  
		    	  
		      }//ilale==6�����Һ���
		      if(ilale==7)//ilale==7�����к���
		      {
		    	 
		    	  double A,w,f,h,y1,y2,l,m;
		    	  int yy1,yy2;//����
		    	  A=Double.parseDouble(txt1.getText());
		    	  w=Double.parseDouble(txt2.getText());
		    	  f=Double.parseDouble(txt3.getText());
		    	  h=Double.parseDouble(txt4.getText());
		    	  
		    	  for(l=0,m=1;m<originX1;l++,m++)//x�����
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
	    			  g_2d.setStroke(bs); //����������
	    		      g_2d.draw(line); 
		    		 }
		    	  }
		    	 
		    	 
		    	  g_2d.setColor(color);
		    	  
		    	  if(A*Math.tan(Math.PI*f)+h>=0)
		    	      line=new  Line2D.Double(originX1, (int)(originY1-(A*Math.tan(Math.PI*f)+h)*length), originX2, (int)(originY1-(A*Math.tan(Math.PI*f)+h)*length));
		    	  else
		    		  line=new  Line2D.Double(originX1, (int)(originY3+(-(A*Math.tan(Math.PI*f)+h)*length)), originX2, (int)(originY3+(-(A*Math.tan(Math.PI*f)+h)*length)));  
		    	  bs = new BasicStroke(linewidth,BasicStroke.CAP_BUTT,BasicStroke.JOIN_BEVEL);
    			  g_2d.setStroke(bs); //����������
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
		    			  g_2d.setStroke(bs); //����������
		    		      g_2d.draw(line); 
			    		 }
		    	  }
		    	  
		      }//ilale==7�����к���
		      if(ilale==8)//ilale==8X��������
		      {
		    	  
		    	  double a,b,c,x1,x2,l,m;
		    	  int xx1,xx2;//����
		    	  a=Double.parseDouble(txt1.getText());
		    	  b=Double.parseDouble(txt2.getText());
		    	  c=Double.parseDouble(txt3.getText());
		    	 
		    	  
		    	  for(l=0,m=1;m<originY1;l++,m++)//x���ϱ�
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
	    			  g_2d.setStroke(bs); //����������
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
    			  g_2d.setStroke(bs); //����������
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
		    			  g_2d.setStroke(bs); //����������
		    		      g_2d.draw(line); 
			    		 }
		    	  }
		    	  
		      }//ilale==8��X�������ߺ���
		      
		      
		      
		      
		      
		      
		      
		      
		      
		      if(ilale==9)//ilale==9Y��������
		      {
		    	  
		    	  double a,b,c,y1,y2,l,m;
		    	  int yy1,yy2;//����
		    	  a=Double.parseDouble(txt1.getText());
		    	  b=Double.parseDouble(txt2.getText());
		    	  c=Double.parseDouble(txt3.getText());
		    	 
		    	  
		    	  for(l=0,m=1;m<originX1;l++,m++)//x���ϱ�
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
	    			  g_2d.setStroke(bs); //����������
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
    			  g_2d.setStroke(bs); //����������
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
		    			  g_2d.setStroke(bs); //����������
		    		      g_2d.draw(line); 
			    		 }
		    	  }
		    	  
		      }//ilale==9��Y�������ߺ���
		      
		      if(ilale==10)//ilale==10��X��˫���ߺ���
		      {
		    	  double a=Double.parseDouble(txt1.getText());
    		      double b=Double.parseDouble(txt2.getText());
    		      double x1,x2,l,m;
		    	  int xx1,xx2;//����
		    	
    		      
    		      for(l=0,m=1;m<originY1;l++,m++)//x���ϱ�
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
	    			  g_2d.setStroke(bs); //����������
	    		      g_2d.draw(line); 
		    		 }
		    		
		    	  }
		    	 
		    	 
		    	  g_2d.setColor(color);
		    	 
 		    		 line=new  Line2D.Double((int) (originX2+(Math.sqrt(a)*length)),originY1, (int) (originX2+(Math.sqrt(a)*length)),originY3);
 		    	  
		    	  bs = new BasicStroke(linewidth,BasicStroke.CAP_BUTT,BasicStroke.JOIN_BEVEL);
    			  g_2d.setStroke(bs); //����������
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
		    			  g_2d.setStroke(bs); //����������
		    		      g_2d.draw(line); 
			    		 }
			    		 
		    	  }	 
			    		 
			    		 
			    		 
			    		  for(l=0,m=1;m<originY1;l++,m++)//x���ϱ�
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
			    			  g_2d.setStroke(bs); //����������
			    		      g_2d.draw(line); 
				    		 }
				    		
				    	  }
				    	 
				    	 
				    	  g_2d.setColor(color);
				    	 
		 		    		 line=new  Line2D.Double((int) (originX1-(Math.sqrt(a)*length)),originY1,(int)(originX1-(Math.sqrt(a)*length)),originY3);
		 		    	  
				    	  bs = new BasicStroke(linewidth,BasicStroke.CAP_BUTT,BasicStroke.JOIN_BEVEL);
		    			  g_2d.setStroke(bs); //����������
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
				    			  g_2d.setStroke(bs); //����������
				    		      g_2d.draw(line); 
					    		 }
		    	          }
    		   
    		     
		    	  
		      }//ilale==10��X��˫���ߺ���
		      
		      
		      
		      if(ilale==11)//ilale==11��Y��˫���ߺ���
		      {
		    	  double a=Double.parseDouble(txt1.getText());
    		      double b=Double.parseDouble(txt2.getText());
    		      double y1,y2,l,m;
		    	  int yy1,yy2;//����
		    	
    		      
    		      for(l=0,m=1;m<originX1;l++,m++)//x���ϱ�
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
	    			  g_2d.setStroke(bs); //����������
	    		      g_2d.draw(line); 
		    		 }
		    		
		    	  }
		    	 
		    	 
		    	  g_2d.setColor(color);
		    	 
 		    		 line=new  Line2D.Double(originX1,(int)(originY1-(Math.sqrt(a)*length)), originX2,(int)(originY1-(Math.sqrt(a)*length)));
 		    	  
		    	  bs = new BasicStroke(linewidth,BasicStroke.CAP_BUTT,BasicStroke.JOIN_BEVEL);
    			  g_2d.setStroke(bs); //����������
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
		    			  g_2d.setStroke(bs); //����������
		    		      g_2d.draw(line); 
			    		 }
			    		 
		    	  }	 
			    		 
			    		 
			    		  for(l=0,m=1;m<originX1;l++,m++)//x���ϱ�
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
			    			  g_2d.setStroke(bs); //����������
			    		      g_2d.draw(line); 
				    		 }
				    		
				    	  }
				    	 
				    	 
				    	  g_2d.setColor(color);
				    	 
		 		    		 line=new  Line2D.Double(originX1,(int) (originY3+(Math.sqrt(a)*length)),originX2,(int)(originY3+(Math.sqrt(a)*length)));
		 		    	  
				    	  bs = new BasicStroke(linewidth,BasicStroke.CAP_BUTT,BasicStroke.JOIN_BEVEL);
		    			  g_2d.setStroke(bs); //����������
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
				    			  g_2d.setStroke(bs); //����������
				    		      g_2d.draw(line); 
					    		 }
		    	          }
    		   
    		     
		    	  
		      }//ilale==11��Y��˫���ߺ���
		      
		      
		      if(ilale==12)////ilale==12��X����Բ
		      {
		    	  double a=Double.parseDouble(txt1.getText());
    		      double b=Double.parseDouble(txt2.getText());
    		      double y1,y2,l,m;
		    	  int yy1,yy2;//����
		    	
    		      
    		      for(l=0,m=1;m<originX1;l++,m++)//x���ϱ�
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
	    			  g_2d.setStroke(bs); //����������
	    		      g_2d.draw(line); 
		    		 }
		    		
		    	  }
		    	 
		    	 
		    	  g_2d.setColor(color);
		    	 
 		    		 line=new  Line2D.Double(originX1,(int)(originY1-(Math.sqrt(b)*length)), originX2,(int)(originY1-(Math.sqrt(b)*length)));
 		    	  
		    	  bs = new BasicStroke(linewidth,BasicStroke.CAP_BUTT,BasicStroke.JOIN_BEVEL);
    			  g_2d.setStroke(bs); //����������
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
		    			  g_2d.setStroke(bs); //����������
		    		      g_2d.draw(line); 
			    		 }
			    		 
		    	  }	 
			    		 
			    		 
			    		  for(l=0,m=1;m<originX1;l++,m++)//x���ϱ�
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
			    			  g_2d.setStroke(bs); //����������
			    		      g_2d.draw(line); 
				    		 }
				    		
				    	  }
				    	 
				    	 
				    	  g_2d.setColor(color);
				    	 
		 		    		 line=new  Line2D.Double(originX1,(int) (originY3+(Math.sqrt(b)*length)),originX2,(int)(originY3+(Math.sqrt(b)*length)));
		 		    	  
				    	  bs = new BasicStroke(linewidth,BasicStroke.CAP_BUTT,BasicStroke.JOIN_BEVEL);
		    			  g_2d.setStroke(bs); //����������
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
				    			  g_2d.setStroke(bs); //����������
				    		      g_2d.draw(line); 
					    		 }
		    	          }
    		   
		      }////ilale==12��X����Բ
		      
		      
		      
		      if(ilale==13)//ilale==13��Y����Բ
		      {
		    	  
		    	  double a=Double.parseDouble(txt1.getText());
    		      double b=Double.parseDouble(txt2.getText());
    		      double x1,x2,l,m;
		    	  int xx1,xx2;//����
		    	
    		      
    		      for(l=0,m=1;m<originY1;l++,m++)//x���ϱ�
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
	    			  g_2d.setStroke(bs); //����������
	    		      g_2d.draw(line); 
		    		 }
		    		
		    	  }
		    	 
		    	 
		    	  g_2d.setColor(color);
		    	 
 		    		 line=new  Line2D.Double((int) (originX2+(Math.sqrt(b)*length)),originY1, (int) (originX2+(Math.sqrt(b)*length)),originY3);
 		    	  
		    	  bs = new BasicStroke(linewidth,BasicStroke.CAP_BUTT,BasicStroke.JOIN_BEVEL);
    			  g_2d.setStroke(bs); //����������
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
		    			  g_2d.setStroke(bs); //����������
		    		      g_2d.draw(line); 
			    		 }
			    		 
		    	  }	 
			    		 
			    		 
			    		 
			    		  for(l=0,m=1;m<originY1;l++,m++)//x���ϱ�
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
			    			  g_2d.setStroke(bs); //����������
			    		      g_2d.draw(line); 
				    		 }
				    		
				    	  }
				    	 
				    	 
				    	  g_2d.setColor(color);
				    	 
		 		    		 line=new  Line2D.Double((int) (originX1-(Math.sqrt(b)*length)),originY1,(int)(originX1-(Math.sqrt(b)*length)),originY3);
		 		    	  
				    	  bs = new BasicStroke(linewidth,BasicStroke.CAP_BUTT,BasicStroke.JOIN_BEVEL);
		    			  g_2d.setStroke(bs); //����������
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
				    			  g_2d.setStroke(bs); //����������
				    		      g_2d.draw(line); 
					    		 }
		    	          }
    		   
    		     
		    	  
		      }//ilale==13��Y����Բ
		      
		      
		      
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
			String s = "���� : X="+""+xx+","+"  Y = "+yy;
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






