/*

```Цель: Практика создания обобщенных классов и методов для обработки различных типов данных.

Инструкции:

Создайте обобщенный класс Box, который будет представлять собой коробку, способную хранить объекты разных типов. 
Класс Box должен иметь поле для хранения объекта и соответствующие геттеры и сеттеры.

Создайте метод printBoxContents, который принимает объект класса Box и выводит на экран содержимое этой коробки. 
Обратите внимание, что этот метод должен работать с любым типом объекта, хранящегося в Box. Используйте обобщенные методы 
для достижения этой цели.

Создайте еще один обобщенный класс Pair, который будет представлять собой пару объектов. Этот класс должен иметь 
два поля для хранения объектов и соответствующие геттеры и сеттеры.

Создайте метод swapPairs, который принимает массив объектов типа Pair и меняет местами элементы в каждой паре. 
Например, если у вас есть пара (A, B), после вызова swapPairs она должна стать парой (B, A). 
Используйте обобщенные методы для реализации этой операции.

Напишите программу, которая демонстрирует использование вашего обобщенного класса Box и методов printBoxContents 
и swapPairs для разных типов данных (например, целых чисел, строк, объектов пользовательских классов и т. д.).

Выведите результаты выполнения программы на экран, чтобы показать, что методы работают с разными типами данных.

Примечания:

Обязательно добавьте комментарии к вашему коду, чтобы объяснить, какие части кода выполняют какие задачи 
и как обобщенные типы используются в вашей программе.

При реализации метода swapPairs, учтите, что он должен работать с любыми типами объектов внутри пары.

Экспериментируйте с разными типами данных, чтобы продемонстрировать универсальность вашего кода.

 */

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        // Создание объекта типа Box<String>
        Box<String> b = new Box<>("1a", 10);
        // Создание объекта типа Box<Integer>
        Box<Integer> b2 = new Box<Integer>(1, 3);
        b.printBoxContents();
        b2.printBoxContents();
        System.out.println();

        Pair<Integer, Integer> pair1 = new Pair<>(547, 745);
        Pair<Integer, Integer> pair3 = new Pair<Integer, Integer>(12, 6);
        // Pair<String, Double> pair2 = new Pair<String, Double>("Половина", 0.5);
        // Pair<Integer, String> pair4 = new Pair<Integer, String>(12, "Двенадцать");

        Pair<Integer,Integer> [] pairs = new Pair[2];
        pairs[0]= new Pair<>(pair1.getOb1(),pair1.getOb2());
        pairs[1]= new Pair<>(pair3.getOb1(),pair3.getOb2());
        // pairs[2] = new Pair<>(pair3.getOb1(),pair1.getOb2());
        // pairs[3] = new Pair<>(pair4.getOb1(),pair4.getOb2());

        System.out.println("Масив: ");

    //     for (Pair<Integer, Integer> item : pairs) {
    //         System.out.println("(" + item.getOb1() + " " + item.getOb2() + ")");
    //     }
    //     System.out.println();

    //     swapPairs(pairs);

    //     System.out.println("Перевернутый массив: ");

    //     for (Pair<Integer, Integer> item : pairs) {
    //         System.out.println("(" + item.getOb1() + " " + item.getOb2() + ")");
    //     }
    //     System.out.println();

    //     List<Pair<Integer, Integer>> pairs1 = new ArrayList<>();
    //     List<Pair<Integer, String>> pairs2 = new ArrayList<>();
    //     List<Pair<Integer, Double>> pairs3 = new ArrayList<>();

    //     pairs1.add(pair1);
    //     pairs1.add(pair3);
    //     pairs3.addAll((Collection<? extends Pair<Integer, Double>>) pair2);

    //     System.out.println("Massiv");
    //     System.out.println(pair1);
    //     System.out.println(pair4);
    //     System.out.println(pair4);
    //     System.out.println();

    //     for (Pair<Integer, Integer> item : pairs1) {
    //         swapPairs(new Pair[] { item });
    //     }
    //     for (Pair<Integer, Double> item : pairs3) {
    //         swapPairs(new Pair[] { item });
    //     }
    //     // for (Pair<Integer, Double> item : pairs2) {
    //     //     swapPairs(new Pair[] { item });
    //     // }
    //     System.out.println(pairs1);
    //     System.out.println(pair3);
    //     System.out.println();


    // }

    // private static void swapPairs(Pair<Integer, Integer>[] pairs) {
    // }

   

}
}