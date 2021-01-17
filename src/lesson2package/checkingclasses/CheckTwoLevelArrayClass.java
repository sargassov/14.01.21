package lesson2package.checkingclasses;

import lesson2package.exceptions.MyArrayDataException;
import lesson2package.exceptions.MyArraySizeException;

public class CheckTwoLevelArrayClass {

    private static int valueCounter = 0;
    private static boolean endOfArray = false;
    private static int LENGTH = 4;

    public static void CheckTwoLevelArrayMethod(String[][] array) throws MyArraySizeException, MyArrayDataException {

        if(array.length != LENGTH) throw new MyArraySizeException("Подан строковый массив неустановленного образца: ", LENGTH);

        for (int x = 0; x < LENGTH; x++) {
            if(array[x].length != LENGTH) throw new MyArraySizeException("Подан строковый массив неустановленного образца: ", LENGTH);
            for (int y = 0; y < LENGTH; y++) {
                try{
                    valueCounter += Integer.parseInt(array[x][y]);
                }
                catch (NumberFormatException nfEx){
                    throw new MyArrayDataException(x, y);
                }
            }
        }
        endOfArray = true;
    }

    public static boolean getEndOfArray(){
        return endOfArray;
    }

    public static int getValueCounter(){
        return valueCounter;
    }
}
