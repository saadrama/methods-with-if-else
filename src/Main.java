public class Main {
    static void checkAge(int Age){
        if (Age<18){
            System.out.println("Access denied - You are too young");
        }else{
            System.out.println("Access granted - You are old enough");
        }
    }
    public static void main(String[] args) {
        checkAge(25);
    }
}