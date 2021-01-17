package lesson2package.exceptions;

public class MyArraySizeException extends ArrayIndexOutOfBoundsException {

    private String mes;

    public MyArraySizeException(String s, int i){
        mes = s + i;
    }

    public String getMessage(){
        return mes;
    }
}
