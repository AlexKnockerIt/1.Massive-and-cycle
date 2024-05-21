import java.util.Arrays;

public class Main5 {
    public static void main(String[] args) {
        //Написать программу, которая отсортирует массив из букв по алфавиту и выведет их на экран в верхнем регистре.
        char[] letterAlphabet = new char[]{'b', 'a', 'd', 'e', 'c', 'f'}; //Объявляем массив типа char который содержит 6 символов.
        for (int i = 0; i < letterAlphabet.length; i++) {                 //Вызываем цикл который будет работать по длинне всего массива.
            for (int j = letterAlphabet.length - 1; j > i; j--) {         //Вызываем второй цилк внутри первого инициализация которого длина массива уменьшенная  на 1,он будет работать пока j больше i.
                if (letterAlphabet[j] < letterAlphabet[j - 1]) {          //Суть второго цикла если мы по условиям заходим ы цикл,тогда начиная с конца массива мы берем два последних значения и сравниваем их
                    int number = letterAlphabet[j];                       //Если значение под индексом j меньше чем j-1 то мы перемещаем j налево,а j-1 направо.
                    letterAlphabet[j] = letterAlphabet[j - 1];            //Если мы не заходим во второй цилк,тогда берем следующие 2 значение и сравниваем их и т.д.
                    letterAlphabet[j - 1] = (char) number;
                }
            }
        }
        for (int i = 0; i < letterAlphabet.length; i++) {      //Вызываем цикл который будет работать по длинне массива,его суть в том что он пройдет по каждому значению и по таблице ascii переведет все символы в верхний регистр
            letterAlphabet[i] -= 32;
        }
        System.out.println(Arrays.toString(letterAlphabet));  //Выводим отсортированный массив через метод Arrays.toString
    }
}
