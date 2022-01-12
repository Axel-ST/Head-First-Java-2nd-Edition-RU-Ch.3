/*
 * Created by Axel_ST on 11.01.2022
 *
 * Head First Java, 2nd Edition (RU) p. 93
 */

package BeTheCompiler;

public class BookTest {
    public static void main(String[] args) {
        Books[] myBooks = new Books[3];
        
        int x = 0;
        
        myBooks[0] = new Books();
        myBooks[1] = new Books();
        myBooks[2] = new Books();
        
        myBooks[0].title = "Fruits of Java";
        myBooks[1].title = "Java Gatsby";
        myBooks[2].title = "Java recipe book";
        
        myBooks[0].author = "Bob";
        myBooks[1].author = "Sue";
        myBooks[2].author = "Jan";
        
        while (x < 3) {
            System.out.print(myBooks[x].title);
            System.out.print(", author ");
            System.out.println(myBooks[x].author);
            x += 1;
        }
    }
}
