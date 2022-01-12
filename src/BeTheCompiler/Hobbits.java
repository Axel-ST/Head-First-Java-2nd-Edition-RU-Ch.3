/*
 * Created by Axel_ST on 11.01.2022
 *
 * Head First Java, 2nd Edition (RU) p. 93
 */

package BeTheCompiler;

public class Hobbits {
    String name;
    
    public static void main(String[] args) {
        Hobbits[] h = new Hobbits[3];
        int z = -1;
        
        while (z < 2) {
            z += 1;
            h[z] = new Hobbits();
            h[z].name = "Bilbo";
            
            if (z == 1)
                h[z].name = "Frodo";
            
            if (z == 2)
                h[z].name = "Sam";
            
            System.out.print(h[z].name + " is ");
            System.out.println("a name of a nice hobbit");
        }
    }
}
