import java.util.*;
class Car{
    String model;
    int price;
    Car(String model,int price){
        this.model = model;
        this.price = price;
    };
};
class AscendingPooki implements Comparator<Car>{
    @Override // optional
    public int compare(Car a,Car b){ // use public
        return a.price-b.price;
    }
};
class DescendingPooki implements Comparator<Car>{
    public int compare(Car a, Car b){
        return b.price-a.price;
    }
}
class Main{
    public static void main(String[] args) {
        ArrayList<Car> list = new ArrayList<>();
        list.add(new Car("tata", 6300));
        list.add(new Car("mercedes",1200));
        list.add(new Car("nano",63000));

        System.out.println("Normal : ");

       for(Car l1 : list){
        System.out.println(l1.model + " : " + l1.price);
       }

       System.out.println("Ascending : ");

       Collections.sort(list,new AscendingPooki()); // ascending 

       for(Car l1 : list){
        System.out.println(l1.model + " : " + l1.price);
       }

       System.out.println("Descending : ");


       Collections.sort(list,new DescendingPooki());

       for(Car l1 : list){
        System.out.println(l1.model + " : " + l1.price);
       }

}
}