package lesson2package;

import lesson2package.checkingclasses.CheckTwoLevelArrayClass;
import lesson2package.exceptions.MyArrayDataException;
import lesson2package.exceptions.MyArraySizeException;
import lesson2package.repositories.StringRepository;

public class Program {
    public static void main(String[] args) {
//        1. Напишите метод, на вход которого подаётся двумерный
//        строковый массив размером 4х4, при подаче массива другого
//        размера необходимо бросить исключение MyArraySizeException.
//        2. Далее метод должен пройтись по всем элементам массива,
//        преобразовать в int, и просуммировать. Если в каком-то элементе
//        массива преобразование не удалось (например, в ячейке лежит
//        символ или текст вместо числа), должно быть брошено исключение
//        MyArrayDataException, с детализацией в какой именно ячейке лежат неверные данные.
//        3. В методе main() вызвать полученный метод, обработать возможные
//        исключения MySizeArrayException и MyArrayDataException, и вывести
//        результат расчета.

        try {
            StringRepository stringRepository = new StringRepository();
            CheckTwoLevelArrayClass.CheckTwoLevelArrayMethod(stringRepository.getArray());
        }
        catch (MyArraySizeException e){
            System.out.println(e.getMessage());
        }
        catch (MyArrayDataException e){
            System.out.println(e.getMessage());
        }

        finally {
            if(CheckTwoLevelArrayClass.getEndOfArray()){
                System.out.println("Прогмма успешно отработала. Сумма всех занчений = "
                        + CheckTwoLevelArrayClass.getValueCounter());
                System.exit(0);
            }
            else{
                System.out.println("Программа завершена некорректно");
                System.exit(1);
            }
        }


    }
}
