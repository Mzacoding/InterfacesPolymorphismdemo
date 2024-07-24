
package tut.ac.za.document;

import interfaceprintable.Printable;

/**
 *
 * Create an interface Printable with a method print. 
 * Create classes Document and Photo that implement this interface.
 * Use the interface to call the print method on an array of Printable objects.
 */
public class Document implements Printable{

    public Document() {
    }

    
    @Override
    public void print() {
         System.out.println("Document printing ");
    }
    
}
