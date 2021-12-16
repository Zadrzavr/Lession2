package Chernovik;

public class MyArrayDataException extends RuntimeException {
    MyArrayDataException(String msg) {
        super("Ошибка преоброзования" + " " + msg);
    }
}
