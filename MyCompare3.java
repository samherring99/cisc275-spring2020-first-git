import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;



public class MyCompare3 {
	
	public static void main(String[] args) {
		
		List<Dog> dogs = new ArrayList<Dog>();
		dogs.add(new Dog("Fido", 4));
		dogs.add(new Dog("Fido", 3));
		dogs.add(new Dog("Alfie", 4));

		System.out.println(dogs);
		Collections.sort(dogs, new Comparator<Animal>() {
			@Override
			public int compare(Animal a, Animal b){
			    return a.getLegs() - b.getLegs();
			}
		});
		System.out.println(dogs);
	}
    
}

class Animal {
    String name;
    int legs;
    
    Animal() {
        this.name = "Sam";
        this.legs = 2;
    }
    
    Animal(String n, int l) {
        this.name = n;
        this.legs = l;
    }
    
    int getLegs() {
        return this.legs;
    }
    
}

class Dog extends Animal {
    Dog(String n, int l) {
        this.name = n;
        this.legs = l;
    }
}


