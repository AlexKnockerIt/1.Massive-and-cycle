import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //Цикл со счетчиком
        for (int i = 0;i < 10;i++) {               //Вызываем цикл в которой объявляем переменную i,итерации будут выполняться пока i меньше 10,шаг итерации +1
            int result = i*i;                      //Объявляем переменную result которое равняется нынешней переменной возведенной в квадрат
            System.out.println(result);            //Выводим result
        }
    }
}


