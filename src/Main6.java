public class Main6 {
    public static void main(String[] args) {
        //Даны 2 массива целых чисел: array1 и array2. Необходимо проверить равны ли они друг другу и вывести «Да» если равны и «Нет» если не равны.
        int[] firstMassive = {1, 2, 3, 4, 5, 6};             //Объявляем два массива типа int содержащивае в себе значения от 1 до 6
        int[] secondMassive = {1, 2, 3, 4, 5, 5};            //Создаем переменную типа boolean со значением false
        boolean result = false;                              //Для начала сравниваем длину массива и если длина разная,то просто выводим что утверждение то что массивы равны афдык
        if(firstMassive.length == secondMassive.length) {    //Если длина одинаковая то начинаем проверять значения
            for (int i = 0; i < firstMassive.length; i++) {  //Вызываем цикл который пройдет по каждому значению в массиве и сравниваем значения с одинаковым индексом
                if (firstMassive[i] == secondMassive[i]){    //Если значения с одинаковыи индексом равны,переменная boolean берет значение true
                    result = true;                           //Если хотя бы одни значения с одинаковым индексом не будут равны,boolean берет значение false,цикл заканчивается и выводим что утверждение то что массивы равны false
                }
                else {
                    result = false;
                    break;
                }
            }
            System.out.println("Равны ли массивы? " + result);
        }else System.out.println("Равны ли массивы? " + result);
    }
}