package lesson2package.exceptions;

public class MyArrayDataException extends IllegalArgumentException {

    private String mes;
    private int heigth;
    private int width;

    public MyArrayDataException(int x, int y){
        heigth = x;
        width = y;
        mes = "Значение элемента массива [" + heigth + "][" + width + "] не является числом.";
    }

    public String getMessage(){
        return mes;
    }

}
