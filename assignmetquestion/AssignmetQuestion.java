
package assignmetquestion;

import interfaceprintable.Printable;
import java.util.ArrayList;
import tut.ac.za.document.Document;
import tut.ac.za.photo.Photo;

/**
 *
 * Create an interface Printable with a method print. 
 * Create classes Document and Photo that implement this interface.
 * Use the interface to call the print method on an array of Printable objects.
 */
public class AssignmetQuestion {

 
    public static void main(String[] args) {
     
 
       ArrayList<Printable> printable=new ArrayList();
       
       printable.add(new Photo());
       printable.add(new Document());
       
       
       for(Printable thePrintable:printable){
           
           if(thePrintable instanceof Photo){
               ((Photo)thePrintable).print();
             }
           
           else if(thePrintable instanceof Document){
               ((Document)thePrintable).print();
           }
           
       }
    }
    
}
