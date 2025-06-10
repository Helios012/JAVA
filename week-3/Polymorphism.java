class vehicle{
    void run(){
        System.out.println("Vehicle is running");
    }
}
class bike extends vehicle{
    void run(){
        System.out.println("Bike is running");
    }
    public static void main(String[] args) {
        bike obj1=new bike();
        obj1.run();
        vehicle obj2=new vehicle();
        obj2.run();
    }
}
//javac Polymorphism.java
//java bike
