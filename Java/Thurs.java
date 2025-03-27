 class Animal{
    public void eat(){
        System.out.println("Animal is eating");
    }
}
class Dog extends Animal{
    public void bark(){
        System.out.println("Dog is barking");
    }
}
 class Thurs {
    
    public static void main(String[] args){
      Dog d1 = new Dog();
       d1.eat();
       d1.bark();
    }
}
