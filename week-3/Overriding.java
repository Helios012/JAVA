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
        bike obj=new bike();
        obj.run();
    }
}
//javac Overriding.java
//java bike
