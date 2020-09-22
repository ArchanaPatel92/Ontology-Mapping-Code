//http://www.semanticweb.org/user/ontologies/2019/4/untitled-ontology-17
//http://www.semanticweb.org/shubham/ontologies/2019/2/untitled-ontology-10
//F:\\terrorist2.owl
import java.awt.Frame;
import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import java.awt.*;
import javax.swing.JComboBox;
import java.awt.event.*;
import javax.swing.JOptionPane;
//import org.apache.axis.types.URI;
 
public class jjjj extends JFrame implements ActionListener {
     
     TextField t;
     Frame f,f1;
     Label x3,l3;
     Label x,x1,x2;
     JComboBox jcb;
     double n;
     double m,e,k;
     String s,item;
     boolean flag;
     JComboBox  t1,t2,t3;
    
    public jjjj()   
    {
        JTabbedPane jtp = new JTabbedPane();
        getContentPane().add("Center", jtp);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        query qry=new query();
        qry.call();
        jtp.addTab("Quering Answering", qry);
        jtp.addTab("About", new about11());
    }   
    
    public void fun2()
    {
           
            f=new JFrame();
            f.setBackground(Color.lightGray);
            f.setLayout(null);
            f.setSize(700,700);
            f.setVisible(true);
            
            
            jcb=new JComboBox();
            jcb.setSelectedItem(null);
            jcb.addItem("STUDENT");//VLP
            jcb.addItem("BUSNESSMEN");//LP
            jcb.addItem("NORMAL USER");//MP
            jcb.addItem("VIP PERSON");//VHP
            jcb.addItem("TEACHER");//HP
            
            
            Label l=new Label("ENTER YOUR PROFESSION : ");
            l3=new Label("");
            Button b =new Button("SUBMIT");
            
           l.setBounds(50,100,100,80);
           jcb.setBounds(50,150,100,20);
           b.setBounds(50,200,100,20);
           
           f.add(jcb);
           f.add(l);
           f.add(l3);
           f.add(b);
           b.addActionListener(this);
           
           if(false)
            fun(); 
    }
    
    public static void main(String[] args)  
    {
        jjjj j=new jjjj();
        Frame f= new Frame();
        j.fun2();     
    }
    
    public static void fun()
    {
         jjjj tp = new jjjj();
        //tp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //tp.setVisible(true);
        //tp.setSize(700,700); 
        //tp.setLayout(new GridBagLayout());
        //tp.pack(); 
    }
    
    public void actionPerformed(ActionEvent ex) 
    {
        try
        {
            if(ex.getActionCommand().equals("SUBMIT"))
            {

                setVisible(false);
                f1=new JFrame();  
                f1.setBackground(Color.lightGray);
                f1.setLayout(null);
                f1.setSize(700,700);
                
                item=(String)(jcb.getSelectedItem());
                System.out.println("selected item is "+item);
                if(item.equals("STUDENT")||item.equals("BUSNESSMEN")||item.equals("NORMAL USER")||item.equals("VIP PERSON")||item.equals("TEACHER"))
                {
                    
                    f1.setVisible(true); 
                    jcb.setSelectedItem(null);
                    
                    if(item.equals("STUDENT"))
                    {
                        System.out.println("inserted");
                        x=new Label("ENTER YOUR QUALIFICATION ");
                        x1=new Label("ENTER YUOR GRADES ");
                        x2=new Label("ENTER YOUR AGE");
                       System.out.println("inserted");
                    }
                    
                    t1=new JComboBox();
                    Button b1=new Button("DONE");
                    t2=new JComboBox();
                    t3=new JComboBox();
                    System.out.println("inserted");
                    if(item.equals("STUDENT")){
                    System.out.println("inserted");
                    t2.addItem("A+");t2.addItem("A");t2.addItem("B+");t2.addItem("B");t2.addItem("C");
                    t3.addItem("11");t3.addItem("12");t3.addItem("13");t3.addItem("14");t3.addItem("15");t3.addItem("16");t3.addItem("17");t3.addItem("18");t3.addItem("19");t3.addItem("20");
                    t1.addItem("UNDER SCHOOLS");t1.addItem("GRADUATED");t1.addItem("POST GRADUATED");
                    
                    }
                    else if(item.equals("VHP")){
                    t2.addItem("3");t2.addItem("4");t2.addItem("5");t2.addItem("6");t2.addItem("7");t2.addItem("8");
                    t3.addItem("0.25");t3.addItem("0.5");t3.addItem("1");t3.addItem("2");t3.addItem("4");
                    t1.addItem("0.7");t1.addItem("0.71");t1.addItem("0.72");t1.addItem("0.73");t1.addItem("0.74");t1.addItem("0.75");t1.addItem("0.76");t1.addItem("0.77");t1.addItem("0.78");t1.addItem("0.79");t1.addItem("0.8");}
               
                    else if(item.equals("LP")){
                    t2.addItem("1");t2.addItem("1.2");t2.addItem("0.5");t2.addItem("0.6");t2.addItem("8");
                    t3.addItem("0.25");t3.addItem("0.5");t3.addItem("1");t3.addItem("2");t3.addItem("4");
                    t1.addItem("0.4");t1.addItem("0.41");t1.addItem("0.42");t1.addItem("0.43");t1.addItem("0.44");}
                   
                    else if(item.equals("MP")){
                    t2.addItem("0.12");t2.addItem("0.8");t2.addItem("1");t2.addItem("1.5");t2.addItem("2");
                    t3.addItem("0.25");t3.addItem("0.5");t3.addItem("1");t3.addItem("2");t3.addItem("4");
                    t1.addItem("0.45");t1.addItem("0.46");t1.addItem("0.47");t1.addItem("0.48");t1.addItem("0.49");t1.addItem("0.50");t1.addItem("0.51");t1.addItem("0.52");t1.addItem("0.53");t1.addItem("0.54");}
                
                    else if(item.equals("HP")){
                    t2.addItem("1.5");t2.addItem("2");t2.addItem("3");t2.addItem("4");t2.addItem("5");
                    t3.addItem("0.25");t3.addItem("0.5");t3.addItem("1");t3.addItem("2");t3.addItem("4");
                    t1.addItem("0.55");t1.addItem("0.56");t1.addItem("0.57");t1.addItem("0.58");t1.addItem("0.59");t1.addItem("0.60");t1.addItem("0.61");t1.addItem("0.62");t1.addItem("0.63");t1.addItem("0.64");t1.addItem("0.65");t1.addItem("0.66");t1.addItem("0.67");t1.addItem("0.68");t1.addItem("0.69");}
                
                f1.add(x);
                f1.add(x1);
                f1.add(x2);
                f1.add(t1);
                f1.add(t2);
                f1.add(t3);
                f1.add(b1);
                System.out.println("inserted");
                x.setBounds(40,120,120,25);
                x1.setBounds(40,150,120,25);
                x2.setBounds(40,180,120,25);
                t1.setBounds(180,120,120,25);
                t2.setBounds(180,150,120,25);
                t3.setBounds(180,180,120,25);
                b1.setBounds(100,440,120,25); 
                System.out.println("inserted");
                b1.addActionListener(this);
                System.out.println("inserted");
                f.setVisible(false);
                System.out.println("inserted");
                flag=false;
           }
        else
        {
            JOptionPane.showMessageDialog(f,"nothing found");
            flag=true;
        }
        }
        else
        {
                /*System.out.println(1);
                String m1,m2,m3;
                m1=(String)t1.getSelectedItem();
                System.out.println(2);
                m2=(String)t2.getSelectedItem();
                System.out.println(1);
                m3=(String)t3.getSelectedItem();
                System.out.println(2);
                
                m=Double.parseDouble(m1);
                e=Double.parseDouble(m2);
                k=Double.parseDouble(m3);
                ontology.mek(m,e,k);
                */
            if(item.equals("STUDENT"))
            {
                System.out.println(t2.getSelectedItem());
                System.out.println(t1.getSelectedItem());
                System.out.println(t3.getSelectedItem());
                if(t2.getSelectedItem().equals("A+"))e=0.125;
                    else if(t2.getSelectedItem().equals("A"))e=0.25;
                    else if(t2.getSelectedItem().equals("B+"))e=0.5;
                    else if(t2.getSelectedItem().equals("B"))e=0.6;
                    else if(t2.getSelectedItem().equals("C"))e=0.8;
                    
                    if(t3.getSelectedItem().equals("UNDER SCHOOL"))k=1;
                    else if(t3.getSelectedItem().equals("GRADUATED"))k=0.25;
                    else if(t3.getSelectedItem().equals("POST GRADUATED"))k=0.5;
                    else if(t3.getSelectedItem().equals("PHD"))k=2;
                    
                    System.out.println((String)t3.getSelectedItem());
                    int d=Integer.parseInt((String)t3.getSelectedItem());
                    m=0.10+d/10;
                n= Math.ceil(Math.pow(5*(1-m),(e*k)));
                //fun();
                flag=false;
            }
            else if(item.equals("LP")&&(m>=0.4&&m<0.45)&&(e==0.5||e==0.6||e==0.8||e==1||e==1.2)&&(k==0.25||k==0.5||k==1||k==2||k==4))
            { 
                n= Math.ceil(Math.pow(5*(1-m),(e*k)));
                flag=false;
               // fun();
            }
            else if(item.equals("MP")&&(m>=0.45&&m<0.55)&&(e==0.8||e==1.5||e==2||e==1||e==1.2)&&(k==0.25||k==0.5||k==1||k==2||k==4))
            {
                n= Math.ceil(Math.pow(5*(1-m),(e*k)));
                //fun();   
                flag=false;
            }
            else if(item.equals("HP")&&(m>=0.55&&m<0.7)&&(e==3||e==1.5||e==2||e==4||e==5)&&(k==0.25||k==0.5||k==1||k==2||k==4))
            {
                n= Math.ceil(Math.pow(5*(1-m),(e*k)));
                //fun();
                flag=false;
            }
            else if(item.equals("VHP")&&(m>=0.7&&m<=0.8)&&(e==3||e==5||e==4||e==6||e==7||e==8)&&(k==0.25||k==0.5||k==1||k==2||k==4))
            {
                n= Math.ceil(Math.pow(5*(1-m),(e*k)));
                //fun();
                flag=false;
            }
            else
            {
                flag=true;
                 JOptionPane.showMessageDialog(f,"Type Of User Not Match");
            }
            //ontology.accesses=(int)n;
            if(!flag)
            {
                ontology.accesses=(int)(5);
                t1.setEnabled(false);            
                t2.setEnabled(false);
                t3.setEnabled(false);
                
                Button button=new Button("CONTINUE");
                Label path=new Label("Enter Your Question ");
                TextField t4=new TextField();
                f1.add(path);
                f1.add(t4);
                f1.add(button);
                path.setBounds(40,210,120,25);
                t4.setBounds(180,210,120,25);
                
                button.addActionListener((ActionEvent ae) -> {
                    
                    if(t4.getText().equals(""))
                    {
                        JOptionPane.showMessageDialog(f,"please enter all fields");
                    }
                   
                    String substr[]=new String[10];
                    substr[0]="terrorist";
                    substr[1]="terrorism";
                    substr[2]="Attack";
                    substr[3]="rakesh1";
                    substr[4]="ayush";
                    substr[5]="rakesh";
                    substr[6]="vishal";
                    substr[7]="vishal1";
                    substr[8]="vishal2";
                    
                    if(t4.getText().contains((substr[0]))||t4.getText().contains((substr[1]))||t4.getText().contains((substr[2])))
                        query.URL=substr[0];
                    else if(t4.getText().contains((substr[3]))||t4.getText().contains((substr[4]))||t4.getText().contains((substr[5])))
                        query.URL=substr[3];
                    else if(t4.getText().contains((substr[6]))||t4.getText().contains((substr[7]))||t4.getText().contains((substr[8])))
                        query.URL=substr[6];
                    
                    fun();
                    
                    if(!flag)
                     f1.setVisible(false);
                    
                    ontology.running();
                });
                
                //b1.setEnabled(false);
                
                button.setBounds(100,400,120,25);}
                System.out.println("value of n : "+n);
        }
        }
        catch(Exception e)
        {
            System.out.println(e);
            JOptionPane.showMessageDialog(f,"wrong input"+e);
        }
    }
}