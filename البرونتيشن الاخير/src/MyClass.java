//Mohammed Rashid Balharith / 441107721

//Najran university

//Dr. Ibrahim Al Mirdif

//212CSS-4 Second Semester
public class MyClass {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
Person[] Person = new Person[5];
Person[0]= new Emplyee();


for (int i = 1; i< 5; i++) {
    Person[i]= new Player();
}

for (int i = 0; i< 5; i++) {
    Person[i].SayHello();
    
    
    }

}
}
