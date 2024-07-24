
package tut.ac.za.photo;

import interfaceprintable.Printable;

/**
 *
 * Create an interface Printable with a method print. 
 * Create classes Document and Photo that implement this interface.
 * Use the interface to call the print method on an array of Printable objects.
 */
public class Photo implements Printable{

    public Photo() {
        
    }
    
     @Override
    public void print() {
       System.out.println("Photo printing ");
    }

}
