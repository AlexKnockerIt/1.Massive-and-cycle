public class Main1 {
    public static void main1(String[] args) {

        //Цикл с постусловием
        int i = 0;                                           //Объявляем переменную i со значением 0
        do {                                                 //Вызываем цикл do while
            System.out.println("Сейчас i равно " + (char)i); //Выводим в консоль текущее значение i по таблице ascii
            i++;                                             //добавляем инкремент i++(шаг цикла)
        }while (i < 100);                                    //проверяем условие и если оно true повторяем цикл
    }
}
