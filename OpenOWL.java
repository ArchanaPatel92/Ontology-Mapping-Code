/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author root
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.hp.hpl.jena.ontology.OntModel;
import com.hp.hpl.jena.ontology.OntModelSpec;
import com.hp.hpl.jena.query.QueryExecution;
import com.hp.hpl.jena.query.QueryExecutionFactory;
import com.hp.hpl.jena.query.QueryFactory;
import com.hp.hpl.jena.query.ResultSetFormatter;
import com.hp.hpl.jena.rdf.model.ModelFactory;
import com.hp.hpl.jena.util.FileManager;
import com.hp.hpl.jena.query.Query;
import com.hp.hpl.jena.query.ResultSet;
import java.io.InputStream ;

/*//added for checking
import org.apache.jena.atlas.web.ContentType ;
import org.apache.jena.atlas.web.TypedInputStream ;
import org.apache.jena.riot.RDFLanguages ;
import java.io.IOException ;
import java.util.zip.ZipEntry ;
import java.util.zip.ZipFile ;*/

import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import java.util.logging.Level;
import java.util.logging.Logger;


//Class OpenOWL
class OpenOWL 
{
    static  String  s;    
    
    static  OntModel OpenConnectOWL(String url)
    {
        OntModel mode;
        mode = ModelFactory.createOntologyModel( OntModelSpec.OWL_MEM );
        InputStream in;
        in = FileManager.get().open(url);
        System.out.println("inside in :"+in);
        if (in == null) 
        {
            throw new IllegalArgumentException("File not found ");
        }
        //System.out.println((OntModel) mode.read(in, ""));
        return  (OntModel) mode.read(in, "");                   
    }
    //Connected OWL File Jena and return the ResultSet
    /*static  ResultSet ExecSparQl(String q)
    {
        Query query = QueryFactory.create(q);
        QueryExecution qe = QueryExecutionFactory.create(query, OpenConnectOWL(url));
        ResultSet results = qe.execSelect();
        return results; 
    }*/
     
    // Connected File OWL and return String
    static String GetResultAsString(String q, String url){
        Query query = QueryFactory.create(q); 
        QueryExecution qe = QueryExecutionFactory.create(query, OpenConnectOWL(url));
        ResultSet results = qe.execSelect();
        System.out.println("in open owl : "+results);
        System.out.println(results.hasNext());
        if(true)
        {
            System.out.println("here");
            // The ByteArrayOutputStream class stream creates a buffer in memory and all the data sent to the stream is stored in the buffer.
            ByteArrayOutputStream go = new ByteArrayOutputStream ();
            ResultSetFormatter.out(go, results, query);
            // Return the result of research
            try {
                s = new String(go.toByteArray(), "UTF-8");
                
                
                // Need This for removing URI
                /*
                s = "";
                for(;results.hasNext();)
                {
                
                //QuerySolution row = results.next();
                //String r = row.getResource("subject").getLocalName();
                //s += r + "\n";
                
                }
                */
                
            } catch (UnsupportedEncodingException ex) {
                Logger.getLogger(OpenOWL.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else 
        {
            System.out.println("there");
            // if found nothing = > to the test
            s = "\n nothing found";
        }
        return s;
      }
    
}