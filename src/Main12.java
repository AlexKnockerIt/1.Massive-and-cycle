import java.util.Arrays;

public class Main12 {
    public static void main(String[] args) {
        //Даны 2 массива символов char, array1 и array2. Вывести на экран массив состоящий из символов, которые есть в array1, но нет в array2.
        char[] simArray1 = new char[]{'r','b','c'};         //Объявляем массив типа char содержащий в себе символы r b c
        char[] simArray2 = new char[]{'a','b','d','r'};     //Объявляем массив типа char содержащий в себе символы a b d r
        char[] simArray3 = new char[0];                     //Объявляем массив в который будем выводить символы которые есть в первом массиве,но нет во втором.

        for (int i = 0; i < simArray1.length; i++) {        //Нам нужно вызвать цикл который пройдет по всему первому массиву,в каждой итерации flag будет равен true
            boolean flag = true;

            for (int j = 0; j < simArray2.length; j++) {    //Создаем второй массив внутри первого который сравнит символ с индексом i со всем вторым массивом и в случае совпадения символом,flag принимает false

                if(simArray1[ i ] == simArray2[ j ]){
                    flag = false;
                }
            }
            if(flag){                                                   //За пределом второго цикла,но внутри первого создаем условие которое будет проверять flag является ли он true или false.
                char[] newSimArray = new char[simArray3.length + 1];    //Если flag true то мы создаем новый промежуточный массив который будет равен длине третьего массива увеличенным на 1
                for (int j = 0; j < simArray3.length; j++) {            //Вызываем цикл который перенесет все значения из нового массива в третий массив
                    newSimArray[j] = simArray3[j];
                }
                newSimArray[newSimArray.length - 1] = simArray1[i];     //Когда цикл закончится помещаем в предпоследний элемент массива элемент из вассива simArray1
                simArray3 = newSimArray;                                //Переписать newSimArray на место simArray3 что бы результат созранился за пределами всех циклов и не стерся
            }
        }
        System.out.println(Arrays.toString(simArray3));                 //Вывести третий массив через Arrays.toString
    }
}
