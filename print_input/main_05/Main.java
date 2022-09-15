package print_input.main_05;

public class Main {
    public static void main(String[] args) {
        try {

        } catch(MyException e) {
            e.printStackTrace();
        }
    }
}

class MyException extends RuntimeException {
    MyException() {super();}

    MyException(String message) {super(message);}
}