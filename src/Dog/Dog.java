/*
 * Created by Axel_ST on 10.01.2022
 *
 * Head First Java, 2nd Edition (RU) p. 91
 */

package Dog;

class Dog {
    String name;
    
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.bark();
        dog1.name = "Bart";
        
        Dog[] myDogs = new Dog[3];
        
        myDogs[0] = new Dog();
        myDogs[1] = new Dog();
        myDogs[2] = dog1;
        
        myDogs[0].name = "Fred";
        myDogs[1].name = "Marge";
        
        System.out.print("Last dog's name is ");
        System.out.println(myDogs[2].name);
        
        int x = 0;
        
        while (x < myDogs.length) {
            myDogs[x].bark();
            x += 1;
        }
    }
    
    public void bark() {
        System.out.println(name + " says Raff!");
    }
    
    public void eat() {
    }
    
    public void chaseCat() {
    }
}
