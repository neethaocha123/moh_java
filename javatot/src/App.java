//main() berada satu class khusus yg akan guna class2 lain
public class App {
    //entry point method
    public static void main(String[] args){
        Car ferrari = new Car();
        ferrari.numOfDoors = 2;
        ferrari.color = "red";//mesti double "" xboleh ''
        ferrari.print();
        ferrari.startEngine();
        Car porsche = new Car();
    }
}
