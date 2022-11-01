public class Human {
    void print(){
        System.out.println("Kamal can Java");
    }
}
class Human1 extends Human{
    @Override
    void print() {
        System.out.println("Amal can not Java");
    }
}
class Human2 extends Human1{
    @Override
    void print() {
        System.out.println("Samal can Java & Python");
    }
}
class TestProgram{
    public static void main(String[] args) {
        Human h1,h2,h3;
        h1 = new Human();
        h2 = new Human1();
        h3 = new Human2();
        h1.print();
        h2.print();
        h3.print();
    }
}
