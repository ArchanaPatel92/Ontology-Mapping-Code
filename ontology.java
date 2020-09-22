//in open owl : com.hp.hpl.jena.sparql.engine.ResultSetStream@6a846219
//in open owl : com.hp.hpl.jena.sparql.engine.ResultSetStream@561b75ee

//inside in :org.apache.jena.atlas.web.TypedInputStream@4ed9a323
//in open owl : com.hp.hpl.jena.sparql.engine.ResultSetStream@2d1e8b14


import java.awt.*;
import java.awt.event.*;
import java.lang.Math;
import javax.swing.JComboBox;
import javax.swing.JComboBox;
import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class ontology implements ActionListener
{
    
    JLabel l[],l3[];
    JTextField t[],tf[];
    char arrays[][]=new char[1][20];
    private static DecimalFormat df = new DecimalFormat("0.00");
    JTextField t2[];
    static String unless[]=new String[10];
    static JLabel l1;
    JComboBox jcb[],t3[];
    static String subclassof,prefix,subclassnames;
    double ans,min=1.0;
    static double mins=1.0;
    char array[]=new char[25];
    JButton v1,v2,b3;
    static double lambda[]=new double[25];
    static double arr[]=new double[25];
    static int flags=0,access=1,accesses=0,cont,subclasscount;
    static String subclassname[]=new String[25];
    String qname;
    boolean allow=true,error,error1,tru,gya;
    double dbl,xy;
    JButton btn,b1,b;
    String classes;
    String property[];
    JComboBox jb;
    ArrayList<String> myList;
    static String properties[][]=new String[10][];
    static String values[][]=new String[10][];
    String value[],queryString;
    static String list1[],list2[];
    int x,count=0;
    static int go;
    static double m,ef,k;
    static int loops,cnt=0,f1,countingofexception=-1,counters,CL,X,noOfPropeties;
    JFrame f,f3;
    JPanel panel1,panel2,panel3,panel4;
    JLabel lbl;
    
    
    public static void function(String property[],String value[],int x,int loop)
    {
        
        loops=loop;
        properties[loop]=new String[x];
        values[loop]=new String[x];
        System.out.println("in function value of x is : "+x);
        noOfPropeties=x;
        
        for(int y=0;y<x;y++)
        {
            System.out.println(property[y]+"   "+value[y]);
            properties[loop][y]=property[y];
            values[loop][y]=value[y];
        }
        System.out.println("in function :"+subclasscount);
        System.out.println("in function :"+properties[0].length);
        System.out.println("in function :"+loop);
        System.out.println("in function :"+access);
        
        if(loop==subclasscount-1||access==1)
        {
            ontology objct=new ontology();
            objct.fun();
        }
        else
        {
            return;
        }
    }
    

    //accessing value of M,E,K for identifiacation of user type
    public static void mek(double x,double y,double z)//
    {
        m=x;
        ef=y;
        k=z;
    }
    

    public static void running()
    {
        query qury=new query();
            System.out.println(query.Thing);
            //FOR THE FIRST NODE ONLY
            if(!query.Thing)
            {
                query.queryString ="PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>\n" +
                "PREFIX owl: <http://www.w3.org/2002/07/owl#>\n" +
                "PREFIX xsd: <http://www.w3.org/2001/XMLSchema#>\n" +
                "PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>\n" +
                "SELECT ?subject ?object\n" +
                "	WHERE { ?subject rdfs:subClassOf ?object }" ;
                qury.queryRunner();
                
                query.queryString ="PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>\n" +
                "PREFIX owl: <http://www.w3.org/2002/07/owl#>\n" +
                "PREFIX xsd: <http://www.w3.org/2001/XMLSchema#>\n" +
                "PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>\n" +
                "PREFIX my:<"+query.prefixs.trim()+"#>\n" +
                "SELECT ?subject ?object\n" +
                "	WHERE { ?subject rdfs:subClassOf ?object }" ;
                qury.queryRunner();
                
                query.Thing=true;
                query.onto=false;
                
            query.queryString =   "PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>\n" +
                "PREFIX owl: <http://www.w3.org/2002/07/owl#>\n" +
                "PREFIX xsd: <http://www.w3.org/2001/XMLSchema#>\n" +
                "PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>\n" +
                "PREFIX my:<"+query.prefixs.trim()+"#>\n" +
                "SELECT distinct ?property (str(?value) AS ?Value)\n" +
                "WHERE { my:"+query.mainclass+" ?property ?value.}" ;
                qury.queryRunner();
            }
            //ALWAYS EXECUTES ON CLICKING THE BUTTON EXECUTES
            if(ontology.access==1)
                ontology.subclasscount=0;
            
            for(qury.loop=0;qury.loop<ontology.subclasscount;qury.loop++)
            {
                System.out.println("ALWAYS EXECUTES "+ontology.subclasscount);
                System.out.println(query.mainclass);
                query.queryString =   "PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>\n" +
                "PREFIX owl: <http://www.w3.org/2002/07/owl#>\n" +
                "PREFIX xsd: <http://www.w3.org/2001/XMLSchema#>\n" +
                "PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>\n" +
                "PREFIX my:<"+query.prefixs.trim()+"#>\n" +
                "SELECT distinct ?property (str(?value) AS ?Value)\n" +
                "WHERE { my:"+ontology.subclassname[qury.loop]+" ?property ?value.}" ;
            
                query.onto=false;
                qury.queryRunner();
            }
    }
    //identify minimum value from all level's lambda or their respective values
    public static double min()
    {
        double x=2.0;
       for(int c=0;c<cont;c++)
        {
            if(x>lambda[c]&&lambda[c]!=0)
            x=lambda[c];
        }
       if(mins<x)
           x=mins;
        return x;
    }
            
    
    public static void assigns(double dd,int cnts)
    {
        System.out.println("inside assign");
        System.out.println(dd+" "+cnts);
        cont=cnts;
        arr[cont++]=dd;
        System.out.println(cont);
    }
    

    //creating dynamic page to take input of every property from user to identify the correct node 
    public void fun()
    {
        System.out.println("in fun"+subclasscount);
        System.out.println("in fun"+properties[0].length);
        int y=0;
        String str;
        System.out.println("\n"+1);
        
        
        //creating array list of unique properties of any level
        myList=new ArrayList<String>(10);
        
        if(access==1)
        {
            for(int loop2=0;loop2<properties[0].length;loop2++)
            if(!myList.contains(properties[0][loop2]))
                myList.add(properties[0][loop2]);
        }
        
        for(int loop1=0;loop1<subclasscount;loop1++)
        {
            for(int loop2=0;loop2<properties[loop1].length;loop2++)
            if(!myList.contains(properties[loop1][loop2]))
                myList.add(properties[loop1][loop2]);
        }
        
        System.out.println("myList is :"+myList);
        
        l=new JLabel[myList.size()];
        jcb=new JComboBox[myList.size()];
        t2=new JTextField[myList.size()];
        b=new JButton("OK");
        b1=new JButton("MORE SPECIFIC");
        f=new JFrame();
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        l1=new JLabel();
        
      
        
        System.out.println("\n"+3);
        //if node have no property
        
        this.f=f;
        f.setBackground(Color.lightGray);
        f.setLayout(null);
        f.setSize(1200,800);
        f.setVisible(true); 
        
        panel1=new JPanel();
        panel1.setBackground(Color.cyan);
        panel1.add(b);
        panel1.setBounds(0,0,700,800);
        panel2 = new JPanel();
        panel2.setBackground(Color.orange);
        panel2.setBounds(0, 800, 700, 800);
        panel1.add(b1);
        panel1.setLayout(null);
        panel2.setLayout(null);
        f.add(panel1);
        f.add(panel2);
        
        System.out.println("\n"+5);
        btn=new JButton("GO..");
        lbl=new JLabel();
        b1.setBounds(150,650,100,20);
        b.setBounds(250,650,100,20);
        lbl.setBounds(250,550,150,25);
        btn.setBounds(350,650,100,20);
        System.out.println("access value is :"+access);
        
        if(access==1)
        {
            subclasscount=1;
        }//if root node then make subclasscount as 1 for entering to these loops
        
        int sum=0,arsize=0;
        btn.addActionListener(this);
       
            //printing list items
            for(String o: myList)
                System.out.println(o);
            
            //arraylist to insert non repeated items 
            ArrayList <String>mylist=new ArrayList<String>();
            
            for(int i=0;i<subclasscount;i++)
            {
                System.out.println("properties[i].length : "+properties[i].length);
                for(int j=0;j<properties[i].length;j++)
                {
                    System.out.println("properties[i][j]) : "+properties[i][j]+" mylist "+mylist);
                    if(!mylist.contains(properties[i][j]))
                    {
                        mylist.add(properties[i][j]);
                        l[arsize]=new JLabel();
                        jcb[arsize]=new JComboBox();
                        System.out.println("in combined frame :"+values[i][j]+" "+properties[i][j]);
                        jcb[arsize].addItem(values[i][j]);
                        jcb[arsize].addItem("None");
                        panel1.add(jcb[arsize]);
                        l[arsize].setText(properties[i][j]);
                        panel1.add(l[arsize]);
                        l[arsize].setBounds(50,(arsize+1)*40,120,20);
                        jcb[arsize].setBounds(200,(arsize+1)*40,120,20);
                        arsize++;
                    }
                    else
                    {
                        System.out.println("myList.indexOf(properties[i][j]) "+myList.indexOf(properties[i][j])+"value[i][j]"+(values[i][j]));
                        jcb[myList.indexOf(properties[i][j])].addItem(values[i][j]);
                    }
                }
            }
            if(access==1)
            {
                System.out.println("yes i came here : ");
                JLabel jl=new JLabel();
                jl.setBounds(800,150,150,40);
                jl.setText("No Recenet Updates : ");
                f.add(jl);
            }
            else
            {
                System.out.println("recent updates are"+list1.length+" "+list2.length);
                JLabel jl=new JLabel();
                jl.setBounds(800,50,150,40);
                jl.setText("recent updates are : ");
                f.add(jl);
                JLabel jll1[]=new JLabel[list1.length];
                JLabel jll2[]=new JLabel[list1.length];
                for(int lop=0;lop<list1.length;lop++)
                {
                    jll1[lop]=new JLabel();
                    jll2[lop]=new JLabel();
                    jll1[lop].setBounds(800,(lop+2)*50,150,40);
                    jll2[lop].setBounds(1000,(lop+2)*50,150,40);
                    jll1[lop].setText(list1[lop]);
                    jll2[lop].setText(list2[lop]);
                    f.add(jll1[lop]);
                    f.add(jll2[lop]);
                }
            }
            b.addActionListener(this);
            b1.addActionListener(this);
    }
    
    
    public static void main(String a[])
    {
        JFrame f= new JFrame();
        f.setLocationRelativeTo(null);
    }
    

    //while there is sibling is available
    public void fun1(String str[],int x)
    {
        subclasscount=x;
        System.out.println("chlo kbi to aaya"+x);
        
        if(x==0)
            l1.setText(query.mainclass);
        //subclasses names are assigned to subclassname array
        for(int z=0;z<x;z++)
        {
            System.out.println(str[z]);
            cnt=x-1;
            query.mainclass=str[z];
            System.out.println(str[z]);
            subclassname[z]=str[z];
        }
    }
    
    
    public static void assign(String ss,int no)
    {
        unless[no]=ss;
        JFrame f= new JFrame();
        f.setLocationRelativeTo(null);
        countingofexception=no;
    }
    
    
    public void actionPerformed(ActionEvent e)
    {
        //when OK button is clicked
        
        for(int x=0;x<cont;x++)
        {
            System.out.println(subclassname[x]);
        }
        
        if(e.getActionCommand().equals("OK"))
        {
            
            boolean brk=false;
            System.out.println("\nin okkk");
            for(int q=0;q<subclasscount;q++)
                System.out.println(subclassname[q]);
            System.out.println("\n");
            System.out.println("cont equals:"+cont);
            count=0;
            System.out.println(query.queryString);
            System.out.println("shi bola : \n"+query.results);
            System.out.println("panel value is :"+x+" access "+access+" properties length"+properties[0].length);
            
            if(access==1)
                subclasscount=1;
            
            //if none is selected then printing please enter all fields
            for(int j=0;j<subclasscount;j++)
            {
                int count=0,x;
                System.out.println(properties[j].length);
                for( x=0;x<properties[j].length;x++)
                {
                    System.out.println((String)jcb[myList.indexOf(properties[j][x])].getSelectedItem()+" "+values[j][x]);
                    String stringAtIndx=(String)(jcb[myList.indexOf(properties[j][x])].getSelectedItem());
                    
                    if(!stringAtIndx.equals(values[j][x]))
                    {
                        break;
                    }
                }
                //if any node's all values found then ask about there surity from user
                System.out.println("x is "+x+" properties length "+properties[j].length);
                
                if(x==properties[j].length)
                {
                    subclassnames=subclassname[j];
                    
                    for(String xx:myList)
                        System.out.println(xx);
                    
                    tf=new JTextField[x];
                    System.out.println("before");
                    
                    for(int loop=0;loop<x;loop++)
                    {
                        System.out.println(properties[j][loop]);
                        System.out.println((myList.indexOf(properties[j][loop])+1));
                        tf[loop]=new JTextField("Enter Text .....");
                        if(tf[loop].getText().equals("Enter Text ....."))
                            tf[loop].setText("");
                        tf[loop].setBounds(450,((myList.indexOf(properties[j][loop])+1)*40),120,20);
                        panel1.add(tf[loop]);
                    }
                    
                    System.out.println("after");
                    
                    for(int loop=0;loop<myList.size();loop++)
                    {
                        l[loop].setEnabled(false);
                        jcb[loop].setEnabled(false);
                    }
                    
                    panel1.add(btn);
                    panel1.add(lbl);
                    brk=true;
                
                }
                
                System.out.println("\nassiginig j value to go\n"+j);
                go=j;
                
                if(brk)
                    break;
            }
            
            System.out.print("\nvalue of "+access);
            System.out.println("count : "+count+" x : "+x);
            //when all values are matched with combo box
            /*if(count==x)
            {
                gya=true;
                //disabling buttons
                b1.setEnabled(false);
                b.setEnabled(false);
                for(int cd=0;cd<x;cd++){
                    //disabling all combo box of that node
                f.add(t2[0][cd]);
                jcb[0][cd].setEnabled(false);
                }
                //adding two more buttons for correct and incorrect ans.
                f.add(btn);
                f.add(lbl);
                btn.addActionListener((ActionEvent rr)->{
                    error=false;
                    error1=false;
                    for(int cd=0;cd<x;cd++)
                    {
                        //checking that every field is filled or not
                        if(t2[cd][0].getText().equals("")){
                            error1=true;
                            break;}
                        //checking surety of user must be greater than .88
                        double d=Double.parseDouble(t2[0][cd].getText());
                        if(d<0.88)
                         error=true;
                    }
                    //displaying correct message to user
                    if(error){
                        error=false;
                            JOptionPane.showMessageDialog(f,"cant allow less than 88% ");}
                    else if(error1){
                         error1=false;
                            JOptionPane.showMessageDialog(f,"enter all fields");}
                    //if ther is no error
                    else{
                       
                    for(int cd=0;cd<x;cd++)
                    {
                        double d=Double.parseDouble(t2[0][cd].getText());
                        //taking minimum value from every textField and assign it to min veriable
                        if(min>d){
                            min=d;
                            mins=min;}
                    tru=true;
                    }}
                    // if tru is true then taking a properties and get values of delta and unless
                    if(tru){
                 qname="PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>\n" +
                 "PREFIX owl: <http://www.w3.org/2002/07/owl#>\n" +
                 "PREFIX xsd: <http://www.w3.org/2001/XMLSchema#>\n" +
                 "PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>\n" +
                  "PREFIX my:<"+prefix.trim()+"#>\n" +
                  "SELECT distinct ?property (str(?value) AS ?Value)\n" +
                  "WHERE { my:"+query.mainclass.trim()+" ?property ?value.}";
                query q=new query();
                q.queryName(qname);
                query.b=true;
                q.queryRunner();
                query.b=false;
                   char arr[]=query.results.toCharArray();
                   int i=0;
                       countingofexception=0;
                   while(i<arr.length-10)
                   {
                       if(arr[i+3]=='u'&&arr[i+4]=='n'&&arr[i+5]=='l'&&arr[i+6]=='e'&&arr[i+7]=='s'&&arr[i+8]=='s'&&arr[i]=='m'&&arr[i+1]=='y')
                       {
                           int j=9;
                           while(arr[i+j]!='"')
                               j++;
                           j++;
                           int c=j;
                           while(arr[j+i]!='"')
                           arrays[0][j-c]=arr[i+j++];
                           String s=new String(arrays[0]);
                           unless[countingofexception++]=s;
                           i=i+j;
                       }
                        if(arr[i]=='d'&&arr[i+1]=='e'&&arr[i+2]=='l'&&arr[i+3]=='t'&&arr[i+4]=='a')
                         {
                             int j=6;
                             while(arr[i+j]!='"')
                                 j++;
                             j++;
                             int c=j;
                             while(arr[i+j]!='"')
                             {
                                 array[j-c]=arr[i+j];
                                 j++;
                             }
                             i=i+j;
                             if(cont>0)
                                   lambda[cont-1]=this.arr[cont-1];
                             String ne=new String(array);
                             System.out.print(Double.parseDouble(ne));
                             double dd=Double.parseDouble(ne);
                             ontology.assigns(dd,counters++);
                         }     
                        i++;
                  }
                v1=new Button("CORRECT");
                v2=new Button("NOT CORRECT");
                if(access>=1){
                f.add(v1);
                f.add(v2);}
                v1.setBounds(150,630,80,50);
                v2.setBounds(240,630,100,50);
                v1.addActionListener(this);
                v2.addActionListener(this);
                double u=min();
                for(int v=0;v<4;v++)
                    System.out.print(lambda[v]);
                     if(cont>0)
                    ans=u*lambda[cont-1];
                     System.out.println("U : "+u+" cont "+cont);
                    ans*=100;
                    btn.setEnabled(false);
                    JOptionPane.showMessageDialog(f,df.format(ans)+"% "+query.mainclass);
                }});
            }*/
            //else if(access==1)
              //      JOptionPane.showMessageDialog(f,"nothing found");
            //when values does not match
            
            
            System.out.println("cont: "+cont);
            
            for(int x=1;x<=cont;x++)
                System.out.println("hmmm : "+subclassname[x]);
            
            if(!gya)
            {
                System.out.println("!gya ");
                
                for(int z=0;z<countingofexception;z++)
                    unless[z]="";
                count=0;
                //while sibling is available
                
                if(cnt>=1)
                {
                    query.mainclass=subclassname[cnt-1];
                }
                    cnt--;
                    //f.setVisible(false);
                    flags=0;
                    query.xyz();
                    System.out.println("in gya : "+subclassname[go]);
            }
        }
        
        //when More Specific button is clicked
        else if(e.getActionCommand().equals("MORE SPECIFIC"))
        {
           
            boolean no_permission=false;
            System.out.println("\nin more specific");
            
            for(int q=0;q<subclasscount;q++)
                System.out.println(subclassname[q]);
            
            System.out.println("\n");
            
            System.out.println("cont equals:"+cont);
              count=0;
              int j;
            
              if(access==1)
                subclasscount=1;
            
              for(j=0;j<subclasscount;j++)
              {
                  System.out.println("in more specific :"+subclassname[j]+"property count length"+properties[j].length);
              }
            
            for(j=0;j<subclasscount;j++)
            {
               int x;
                for( x=0;x<properties[j].length;x++)
                {
                    System.out.println((String)jcb[myList.indexOf(properties[j][x])].getSelectedItem()+" "+values[j][x]);
                    String stringAtIndx=(String)(jcb[myList.indexOf(properties[j][x])].getSelectedItem());
                    
                    if(!stringAtIndx.equals(values[j][x]))
                    {
                        break;
                    }
                }
                
                if(x==properties[j].length)
                {
                    System.out.println("in more specific: "+subclassname[j]);
                    subclassnames=subclassname[j];
                    break;
                }
            }
            go=j;
            if(j==subclasscount)
                JOptionPane.showMessageDialog(f,"enter correct fields for more specific ans....");
            
            
            ///when values does not matched(more specific)
            
            ///when all values matched(more specific)
            else 
            {   
                
                System.out.println("grand total : "+subclassname[j]);
                System.out.println("access :"+access);
                System.out.println("Xm : "+countingofexception);
                CL++;
                
                xy=Math.ceil(countingofexception*(1.0-(1.0-m)*(Math.pow((double)((CL+1)/accesses),(double)(ef/k)))));
                
                if(cont>0)
                lambda[cont-1]=this.arr[cont-1];
                
                System.out.println("access "+access+" : accesses"+accesses);
                
                if(access<accesses)
                {
                    for(int z=1;z<=countingofexception;z++)
                    System.out.println(unless[z].trim());
                    query.onto=true;
                    //SUBCLASSES FINDING QUERY FOR GOING MORE SPECIFIC
                    
                    subclassnames=subclassname[j];
                    if(access==1)
                        subclassnames=query.mainclass;
                    
                    System.out.println("subclass names : "+subclassnames);
                    
                    qname="PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>\n" +
                    "PREFIX owl: <http://www.w3.org/2002/07/owl#>\n" +
                    "PREFIX xsd: <http://www.w3.org/2001/XMLSchema#>\n" +
                    "PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>\n" +
                    "PREFIX my:<"+prefix.trim()+"#>\n" +
                    "SELECT ?subClass WHERE { ?subClass rdfs:subClassOf my:"+subclassnames+" . }" ;
                    flags=1;
                    
                    query.xyz();
                    query q=new query();
                    System.out.println("in more specific in subclass query :"+qname);
                    q.queryName(qname);
                    query.b=false;
                    query.onto=true;
                    q.queryRunner();
                    System.out.println("cont" + cont);
                    
                    if(cont>0)
                    System.out.println(lambda[cont-1]+"     "+arr[cont-1]);
            }
            else
            {
                no_permission=true;
                JOptionPane.showMessageDialog(f,"no permission");
                countingofexception=0;
            }
            
            if(countingofexception>0&&query.X!=1)//if node has more subclasses to visit then only ask for couting of exception and go further
            {
                    JLabel l3[]=new JLabel[countingofexception];
                    t3=new JComboBox[countingofexception];
                    
                    f3=new JFrame();
                    f3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    f3.setBackground(Color.lightGray);
                    f3.setSize(1200,800);
                    f3.setLayout(null);
                    f3.setVisible(true);
                    
                    JLabel l9=new JLabel("Enter Values Of Exception");
                    l9.setBackground(Color.yellow);
                    l9.setBounds(100,30,150,25);
                    f3.add(l9);
                    
                    for(int c=0;c<countingofexception&&c<xy;c++)
                    {
                        System.out.println(unless[c+1]);
                        l3[c]=new JLabel(unless[c+1]);
                        t3[c]=new JComboBox();
                        t3[c].addItem("yes");
                        t3[c].addItem("no");
                        f3.add(l3[c]);
                        f3.add(t3[c]);
                        l3[c].setBounds(100,(c+2)*40,50,25);
                        t3[c].setBounds(180,(c+2)*40,50,25);
                    }
                    b3=new JButton("OKK");
                    b3.addActionListener(this);
                    panel1.add(b3);
                    b3.setBounds(150,300,50,25);
            }
                access++;
            }
            if(!no_permission)
            {
                System.out.println("in no permissions :");
                f.setVisible(false);
                list1=new String[properties[go].length];
                list2=new String[properties[go].length];
                System.out.println("creating copy");
                for(int lop=0;lop<properties[go].length;lop++)
                {
                    System.out.println(properties[go][lop]+" "+values[go][lop]);
                    list1[lop]=(properties[go][lop]);
                    list2[lop]=(values[go][lop]);
                }
                System.out.println("list length : "+list1.length);
                running();
            }
        }
        
        else if(e.getActionCommand().equals("CORRECT"))
        {
            f.setVisible(false);
            System.exit(0);
        }
        
        else if(e.getActionCommand().equals("NOT CORRECT"))
        {
                if(countingofexception>0)
                {
                    f.setVisible(false);
                    JLabel l3[]=new JLabel[countingofexception];
                    t3=new JComboBox[countingofexception];
                    f3=new JFrame();
                    f3.setLocationRelativeTo(null);
                    f3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    f3.setBackground(Color.lightGray);
                    JLabel l9=new JLabel("Enter Values Of Exception");
                    l9.setBackground(Color.yellow);
                    l9.setBounds(100,30,150,25);
                    f3.add(l9);
                    f3.setSize(1200,800);
                    f3.setLayout(null);
                    f3.setVisible(true);
                    for(int c=0;c<countingofexception;c++)
                    {
                        l3[c]=new JLabel(unless[c+1]);
                        t3[c]=new JComboBox();
                        t3[c].addItem("yes");
                        t3[c].addItem("no");
                        f3.add(l3[c]);
                        f3.add(t3[c]);
                        l3[c].setBounds(100,(c+2)*40,50,25);
                        t3[c].setBounds(180,(c+2)*40,50,25);
                    }
                    b3=new JButton("OKK");
                    b3.addActionListener(this);
                    f3.add(b3);
                    b3.setBounds(150,300,50,25);
            }
            else
            {
                if(access==1)
                    JOptionPane.showMessageDialog(f,"nothing found");
                else
                    JOptionPane.showMessageDialog(f,"100 % "+subclassof);
            }
        }
        
        else if(e.getActionCommand().equals("OKK"))
        {
                        int z;
                        System.out.println("aya to tha yrrrrrr");
                        System.out.println(countingofexception+ "    "+xy);
                  
                        for(z=0;z<countingofexception&&z<xy;z++)
                        {
                            String tj=(String)t3[z].getSelectedItem();
                            if(!(tj.equals("yes")))
                            break;
                        }
                        
                        //if all values of exception matched then z==countingofexception
                        System.out.println(countingofexception+ "    "+xy+"    "+z);
                        
                        if(z==countingofexception)
                        {
                            for(int c=1;c<=countingofexception;c++)
                            {
                                    f3.setVisible(false);
                                    unless[c]=unless[c].trim();
                                    qname="PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>\n" +
                                   "PREFIX owl: <http://www.w3.org/2002/07/owl#>\n" +
                                   "PREFIX xsd: <http://www.w3.org/2001/XMLSchema#>\n" +
                                   "PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>\n" +
                                   "PREFIX my:<"+prefix.trim()+"#>\n" +
                                   "SELECT distinct ?property (str(?value) AS ?Value)\n" +
                                   "WHERE { my:"+unless[c].trim()+" ?property ?value.}";
                                    query.b=true;
                                    unless[c]="";
                                    System.out.println("qname: "+qname);
                                    query q=new query();
                                    q.queryName(qname);
                                    q.queryRunner();
                                    System.out.println("yhi tha");
                                    System.out.println("result : "+query.results);
                                    char arr[]=query.results.toCharArray();
                                    char delt[]=new char[25];
                                    int g=0;
                                    
                                    while(arr[g]!='"')
                                        g++;
                                    
                                    g++;
                                    int g1=g;
                                    
                                    while(arr[g]!='"')
                                    {
                                        delt[g-g1]=arr[g++];
                                    }
                                    
                                    String convert=new String(delt);
                                    dbl=Double.parseDouble(convert);
                                    
                                    if(cont>0)
                                    lambda[cont-1]=lambda[cont-1]+dbl;
                            }
                                    query.b=false;
                        }
                        else
                        {
                            double u=min();
                            
                            if(cont>0)
                            ans=u*lambda[cont-1];
                            
                            ans*=100;
                            JOptionPane.showMessageDialog(f,df.format(ans)+"% "+subclassof);
                            query.query1Button.setEnabled(false);
                        }
                    
                        for(int w=1;w<=countingofexception;w++)
                        {
                            System.out.println("unless ko null kr rha "+unless[w]);
                            unless[w]=" ";
                        }
                }
        
        else if(e.getActionCommand().equals("GO.."))
        {
            System.out.println("\nin Go..");
           
            for(int q=0;q<subclasscount;q++)
                System.out.println(subclassname[q]);
            
            System.out.println("\n");
                    error=false;
                    error1=false;
                    
                    for(int cd=0;cd<properties[go].length;cd++)
                    {
                        System.out.println((properties[go][cd]));
                        //checking that every field is filled or not
                        
                        if(tf[myList.indexOf(properties[go][cd])].getText().equals(""))
                        {
                            error1=true;
                            break;
                        }
                        
                        //checking surety of user must be greater than .88
                        double d=Double.parseDouble(tf[myList.indexOf(properties[go][cd])].getText());
                        
                        if(d<0.88)
                        {
                             error=true;break;
                        }
                    }
                    //displaying correct message to user
                    System.out.println(error+" " +error1);
                    
                    if(error)
                    {
                        error=false;
                        JOptionPane.showMessageDialog(f,"cant allow less than 88% ");
                    }
                    
                    else if(error1)
                    {
                         error1=false;
                         JOptionPane.showMessageDialog(f,"enter all fields");
                    }
                    //if ther is no error
                    
                    else
                    { 
                        System.out.println("value of go is :"+go+"properties[go].length"+properties[go].length);
                       
                        for(int b=0;b<properties[go].length;b++)
                            System.out.println(properties[go][b]+" "+values[go][b]);
                        
                        for(int cd=0;cd<properties[go].length;cd++)
                        {
                            double d=Double.parseDouble(tf[myList.indexOf(properties[go][cd])].getText());
                            //taking minimum value from every textField and assign it to min veriable
                            if(min>d)
                            {
                                min=d;
                                mins=min;
                            }
                            tru=true;
                        }
                    }
                    // if tru is true then taking a properties and get values of delta and unless
                if(tru)
                {
                    System.out.println("in tru : ");
                    
                    if(access==1)
                        subclassnames=query.mainclass;
                    
                    qname="PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>\n" +
                    "PREFIX owl: <http://www.w3.org/2002/07/owl#>\n" +
                    "PREFIX xsd: <http://www.w3.org/2001/XMLSchema#>\n" +
                    "PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>\n" +
                     "PREFIX my:<"+prefix.trim()+"#>\n" +
                     "SELECT distinct ?property (str(?value) AS ?Value)\n" +
                     "WHERE { my:"+subclassnames+" ?property ?value.}";
                    
                    query q=new query();
                    q.queryName(qname);
                    query.b=true;
                    q.queryRunner();
                    query.b=false;
                    char arr[]=query.results.toCharArray();
                    int i=0;
                    System.out.println("subclassnames : "+subclassnames+" results \n"+query.results);
                    countingofexception=0;
                    
                    while(i<arr.length-10)
                    {
                       if(arr[i+3]=='u'&&arr[i+4]=='n'&&arr[i+5]=='l'&&arr[i+6]=='e'&&arr[i+7]=='s'&&arr[i+8]=='s'&&arr[i]=='m'&&arr[i+1]=='y')
                       {
                           int j=9;
                           while(arr[i+j]!='"')
                               j++;
                           j++;
                           int c=j;
                           while(arr[j+i]!='"')
                           arrays[0][j-c]=arr[i+j++];
                           String s=new String(arrays[0]);
                           unless[countingofexception++]=s;
                           i=i+j;
                       }
                        if(arr[i]=='d'&&arr[i+1]=='e'&&arr[i+2]=='l'&&arr[i+3]=='t'&&arr[i+4]=='a')
                         {
                             int j=6,c;
                             while(arr[i+j]!='"')
                                 j++;
                            j++;
                            c=j;
                            while(arr[i+j]!='"')
                            {
                                 array[j-c]=arr[i+j];
                                 j++;
                            }
                             i=i+j;
                             if(cont>0)
                                lambda[cont-1]=this.arr[cont-1];
                             String ne=new String(array);
                             System.out.print(Double.parseDouble(ne));
                             double dd=Double.parseDouble(ne);
                             assigns(dd,counters++);
                         }     
                        i++;
                  }
                
                v1=new JButton("CORRECT");
                v2=new JButton("NOT CORRECT");
                
                if(access>=1)
                {
                    f.add(v1);
                    f.add(v2);
                }
                
                v1.setBounds(150,630,80,50);
                v2.setBounds(240,630,100,50);
                v1.addActionListener(this);
                v2.addActionListener(this);
                double u=min();
                
                for(int v=0;v<4;v++)
                    System.out.print(lambda[v]);
                
                if(cont>0)
                    ans=u*lambda[cont-1];
                System.out.println("U : "+u+" cont "+cont);
                ans*=100;
                btn.setEnabled(false);
                
                if(access==1)
                    subclassname[go]=query.mainclass;
                
                System.out.println("printing message in Go...");
                JOptionPane.showMessageDialog(f,df.format(ans)+"% "+subclassname[go]);
                }
            }
        }
    }