
import java.awt.*;
import javax.swing.*;
import javax.swing.text.*;

public class query extends javax.swing.JPanel {
    
    static String url,prefixs,mainclass,URL,results,queryString;
    static boolean b=false,Thing,onto,flgs;
    static JButton query1Button,Button;
    static int my,my1,no,counters=0,X;
    static char prefixss[]=new char[70];
    char array[]=new char[25];
    char unless[]=new char[50];
    JOptionPane j=new JOptionPane();
    JTextArea jTextArea1,jTextPane1;
    JButton query3Button ;
    int f=0,loop,flag=0;
    JPanel internal_stretegic,internal_tactical,internal_operational,earthquake_sample;
    JScrollPane ta,qry,result;
    String qname;
    
    
    public void call()
    {
        design();
    }
    
    
    public query() {
        initComponents();
    }
    
    
    static void xyz()
    {
        if(ontology.flags==0)
            onto=false;
        else
            onto=true;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        panel = new javax.swing.JPanel();

        setMinimumSize(new java.awt.Dimension(0, 0));
        setPreferredSize(new java.awt.Dimension(0, 0));
        java.awt.GridBagLayout layout = new java.awt.GridBagLayout();
        layout.columnWidths = new int[] {0};
        layout.rowHeights = new int[] {0};
        setLayout(layout);

        panel.setLayout(new java.awt.GridBagLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipady = 269;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 1214);
        add(panel, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void design()
    {
        GridBagConstraints c = new GridBagConstraints();
        c.anchor = java.awt.GridBagConstraints.NORTHWEST;
        c.insets = new Insets(10,10,10,10);
        c.ipadx = 0;
        c.ipady = 0;
        c.weightx = 0;
        c.gridx = 0;
        c.gridy = 0;
        jTextPane1 = new JTextArea();
        panel.setSize(700, 700);
        add(panel, c);
       
                url = "F:\\"+URL+".owl";
               
        //Internal Panel for Strategic
        internal_stretegic = new JPanel(new GridBagLayout());
       try
       {
            internal_stretegic.setVisible(true);
           internal_stretegic.setBounds(80,120,100,100);
           qry = new JScrollPane(internal_stretegic);
           qry.setPreferredSize(new Dimension(500, 550));

           qry.setVisible(false);
           panel.add(internal_stretegic, c);


           GridLayout secondLayout = new GridLayout(0,2);

           secondLayout = new GridLayout(0,2);
           internal_stretegic.setLayout(secondLayout);
           JLabel internal_stretegic_query1 = new JLabel();
           internal_stretegic_query1.setHorizontalAlignment(SwingConstants.LEFT);
           internal_stretegic_query1.setText(String.format("<html><div WIDTH=%d>%s</div><html>", 400, "1. Event Identification"));

           internal_stretegic.add(internal_stretegic_query1);
       }
       catch(Exception E)
       {
            JOptionPane.showMessageDialog(this.j,"some error has occured");
       }
        
        query1Button = new JButton("EXECUTE");
        
        
        internal_stretegic.add(query1Button);
        //qry.add(query1Button);
    }
    

    private void appendVersPane( String msg, Color c)
    {
        try
        {
            StyleContext sc = StyleContext.getDefaultStyleContext();
            AttributeSet aset = sc.addAttribute(SimpleAttributeSet.EMPTY, StyleConstants.Foreground, c);

            aset = sc.addAttribute(aset, StyleConstants.FontFamily, "Lucida Console");
            aset = sc.addAttribute(aset, StyleConstants.Alignment, StyleConstants.ALIGN_JUSTIFIED);
        }
        catch(Exception E)
        {
            JOptionPane.showMessageDialog(this.j,"some error has occured");
        }
    }
    
    
    public void queryName(String name)
    {
        this.queryString=name;
    }
    
    
    void queryRunner()
    {
                
                ontology o=new ontology();
                String s = new String();
               
               try
               {
                    s = OpenOWL.GetResultAsString(queryString, url);//call method GetResultAsString from OpenOWL class
                   //System.out.println(s);
                    if(ontology.access!=1)
                       ontology.subclassnames=mainclass;
                    results = s.substring(s.indexOf("-"));
                    appendVersPane(results, Color.DARK_GRAY);
                    System.out.println("access : "+ontology.access+" accesses"+ontology.accesses);
                    System.out.println("subclassnames :"+ontology.subclassnames+" "+mainclass+"\n"+queryString);
               }
               catch(Exception E)
               {
                   JOptionPane.showMessageDialog(this.j,E);
               }
               
                System.out.println(results);
                if(!Thing)
                {
                    System.out.println("\n"+results+"\n");
                    char arr[]=results.toCharArray();
                    System.out.println("yha hu meeeeeeeeee"+arr);
                    int i=0,g=0;
                    boolean flag=false;
                    char rootclass[][]=new char[30][20];
                    while(i<arr.length-5)
                    {
                        
                        if((arr[i]=='m')&&(arr[i+1]=='y')&&(arr[i+2]==':'))
                        {
                            int j=0;
                            while(arr[i+3+j]!=' '){
                            rootclass[g][j]=arr[i+3+j];
                            j++;}
                            i=i+3+j;
                            g++;
                        }
                        else
                        {
                            if(arr[i]=='h'&&arr[i+1]=='t'&&arr[i+2]=='t'&&arr[i+3]=='p')
                            {
                                int k=0;
                                while(arr[i+k]!='#')
                                {
                                    prefixss[k]=arr[i+k];
                                    k++;
                                }
                                String strng=new String(prefixss);
                                prefixs=strng;
                                ontology.prefix=strng;
                                return;
                            }
                        }
                        i++;
                    }
                    for(int v=1;v<g;v+=2)
                    {
                        String w=new String(rootclass[v]);
                        System.out.println("V : "+w);
                        int u;
                        for(u=0;u<g;u+=2)
                        {
                            String ww=new String(rootclass[u]);
                            System.out.println(ww);
                            if(w.trim().equals(ww.trim()))
                            {
                                break;
                            }
                        }
                        if(u==g)
                        {
                            mainclass=w.trim();
                            break;
                        }
                    }
                    return;
                }
                if(queryString.equals("PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>\n" +
                    "PREFIX owl: <http://www.w3.org/2002/07/owl#>\n" +
                    "PREFIX xsd: <http://www.w3.org/2001/XMLSchema#>\n" +
                    "PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>\n" +
                    "PREFIX my:<"+prefixs.trim()+"#>\n" +
                    "SELECT distinct ?property (str(?value) AS ?Value)\n" +
                    "WHERE { my:"+mainclass+" ?property ?value.}"))
                    
                    onto=false;
                    flag=1;
//---------------to extract properties from resultant string-------------------//

        int i=0,j=0,x=0,y=0,x1=0;
        char arr[]=results.toCharArray();
        char property[][]=new char[20][20];
        char value[][]=new char[20][100];
        char subclass[][]=new char[20][100];
        System.out.println("ha bol to rha: "+results);
        if(b)
            return;
        if(!onto)
        {
            f=0;
        while(i<results.length()-10)
        {
            if(arr[i]=='r'&&arr[i+1]=='d'&&arr[i+2]=='f'&&arr[i+3]=='s'&&arr[i+5]=='s'&&arr[i+6]=='u'&&arr[i+7]=='b'&&arr[i+8]=='C'&&arr[i+9]=='l')
            {
                while(arr[i]!='#')
                i++;
                int c=0;
                char arra[]=new char[30];
                while(arr[i+1]!='"'){
                    arra[c++]=arr[i+1];
                i++;}
                String sbclass=new String(arra);
                ontology.subclassof=sbclass;
            }
            if(arr[i]=='d'&&arr[i+1]=='e'&&arr[i+2]=='l'&&arr[i+3]=='t'&&arr[i+4]=='a')
            {
                j=6;
                while(arr[i+j]!='"')
                    j++;
                j++;
                int c=j;
                while(arr[i+j]!='"')
                {
                    array[j-c]=arr[i+j];
                    j++;
                }
                String ne=new String(array);
                System.out.print(Double.parseDouble(ne));
                double dd=Double.parseDouble(ne);
                ontology.assigns(dd,counters++);
            }
           if(arr[i]=='u'&&arr[i+1]=='n'&&arr[i+2]=='l'&&arr[i+3]=='e'&&arr[i+4]=='s'&&arr[i+5]=='s')
            {
                flgs=true;
                j=6;
                while(arr[i+j]!='\"')
                    j++;
                j++;
                int c=j;
                for(int d=0;d<unless.length;d++){unless[d]='\0';}
                while(arr[i+j]!='\"')
                {
                    unless[j-c]=arr[i+j];
                    j++;
                }
                String sh=new String(unless);
                no++;
                ontology.assign(sh,no);
            }
            if(arr[i]=='m'&&arr[i+1]=='y'&&arr[i+2]==':'&&(arr[i+3]!='d'||arr[i+4]!='e'||arr[i+5]!='l'||arr[i+6]!='t'||arr[i+7]!='a')&&(arr[i+3]!='u'||arr[i+4]!='n'||arr[i+5]!='l'||arr[i+6]!='e'||arr[i+7]!='s'||arr[i+8]!='s'))
            {
                j=3;
                while(arr[i+j]!=' ')
                {
                    property[x][j-3]=arr[i+j];
	            j++;
                }
                x++;
            }
            else if(arr[i]=='r'&&arr[i+1]=='d'&&arr[i+2]=='f'&&arr[i+3]=='s'&&arr[i+4]==':'&&((arr[i+5]!='c'&&arr[i+6]!='o')&&(arr[i+5]!='s'&&arr[i+6]!='u')))
            {
                j=5;
                while(arr[i+j]!=' ')
                {
                    property[x][j-5]=arr[i+j];
         		j++;
					
                }
                x++;
            }      
            else if(arr[i]=='r'&&arr[i+1]=='d'&&arr[i+2]=='f'&&arr[i+3]==':'&&arr[i+4]!='t'&&arr[i+5]!='y'&&arr[i+6]!='p')
            {
                j=4;
                while(arr[i+j]!=' ')
                {
                    property[x][j-4]=arr[i+j];
                    j++;
                }
                x++;
            }  
            else if(arr[i]=='x'&&arr[i+1]=='s'&&arr[i+2]=='d'&&arr[i+3]==':')
            {
                j=4;
                while(arr[i+j]!=' ')
                {
                    property[x][j-4]=arr[i+j];
                    j++;
                }
                
                x++;
            }  
            else if(arr[i]=='o'&&arr[i+1]=='w'&&arr[i+2]=='l'&&arr[i+3]==':')
            {
                j=4;
                while(arr[i+j]!=' ')
                {
                    property[x][j-4]=arr[i+j];
                    j++;
                }
                x++;		
            }
            i++;
        }
        
        if(!flgs)
            ontology.countingofexception=0;
        flgs=false;
        no=0;
        i=0;
        
        //-------------------to extract values from a string----------------------------
        while(i<results.length()-15&&x1<x)
        {    
                        if((arr[i]=='u'&&arr[i+1]=='n'&&arr[i+2]=='l'&&arr[i+3]=='e'&&arr[i+4]=='s'&&arr[i+5]=='s')||(arr[i]=='d'&&arr[i+1]=='e'&&arr[i+2]=='l'&&arr[i+3]=='t'&&arr[i+4]=='a'))
                            {
                                while(arr[i]!='\"')
                                i++;
                                    i++;
                                while(arr[i]!='\"')
                                i++;
                                i++;
                            }
                        if((arr[i]=='r'&&arr[i+1]=='d'&&arr[i+2]=='f'&&arr[i+4]=='t'&&arr[i+5]=='y'&&arr[i+6]=='p'&&arr[i+7]=='e')||(arr[i]=='r'&&arr[i+1]=='d'&&arr[i+2]=='f'&&arr[i+3]=='s'&&(arr[i+5]=='s'&&arr[i+6]=='u'&&arr[i+7]=='b'&&arr[i+8]=='C'&&arr[i+9]=='l'))){
                            j=1;
                            while(arr[i+j]!='"')
                                j++;
                            j++;
                            while(arr[i+j]!='"')
                                j++;
                            i=i+(++j);
                        }
                          
                        if(arr[i]=='\"')
			{
                            	j=1;
                                if(arr[i+1]=='"')
                                {
                                    value[x1][0]='y';
                                    value[x1][1]='e';
                                    value[x1][2]='s';
                                    i=i+2;
                                    x1++;
                                    continue;
                                }
				while(arr[i+j]!='\"'){
                                    if(arr[i+j]=='\\'&&arr[i+j+1]=='n'){
                                        j+=2;
                                        continue;}
				value[x1][j-1]=arr[i+j];
				j++;}
				i=i+j;
                                x1++;
			}
			i++;
		}// x is a count of no. of properties and their values
        
        
        String str1[]=new String[x];//array of properties of any node
        String str[]=new String[x];//array of values of any node
        for(y=0;y<x;y++){
        str[y]=new String(value[y]);
        str[y]=str[y].replaceAll("\n","");
        str[y]=str[y].trim();
        str1[y]=new String(property[y]);
        str1[y]=str1[y].trim();
        System.out.println("in calling of function : "+str[y]+" "+str1[y]);}
        
        if(flag==1)
            onto=true;
        System.out.println("passing values in function" +str1+" "+str+" "+x+" "+loop);
        o.function(str1,str,x,loop);//for properties and their respective values in a frame on ontology

}
else
{
    System.out.println(results);
        query.onto=false;
        x=0;
        i=0;
        while(i<results.length()-10)
        {
            //USED TO FIND SUBCLASSES NAMES OF ANY CLASS
            if(arr[i]=='m'&&arr[i+1]=='y'&&arr[i+2]==':')
            {
                j=3;
                while(arr[i+j]!=' ')
                {
                    subclass[x][j-3]=arr[i+j];
                    j++;
                }
                x++;
                i=i+j-1;
            }
            i++;
        }
        if(x==0)
        {
            X=1;
            JOptionPane.showMessageDialog(this.j,"cant go more specific in "+ontology.subclassnames);
            return;
        }
        String s1[]=new String[x];
        System.out.println("in query : ");
        for(int z=0;z<x;z++)
        {
            System.out.println(subclass[z]);
            s1[z]=new String(subclass[z]);
            s1[z]=s1[z].trim();
            System.out.println(s1[z]);
        }
        o.fun1(s1,x);
}
}
    private javax.swing.JPanel panel;
}
