package Chernovik;

public class MyArraySizeException extends RuntimeException {
    MyArraySizeException(String msg) {
        super("Ошибка размерности" + " " + msg);
    }
}
