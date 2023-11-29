/*
Создайте обобщенный класс Box, который будет представлять собой коробку, способную хранить объекты разных типов. 
Класс Box должен иметь поле для хранения объекта и соответствующие геттеры и сеттеры.
 */

public class Box<T> {
    private T id;
    private int sum;

    Box(T id, int sum) {
        this.id = id;
        this.sum = sum;
    }

    public T getId() {
        return id;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }
    /**
     * Вывод объектов на печать, используя созданный в обобщенном классе Box метод printBoxContents
     */
    public void printBoxContents(){
        System.out.println("Номер ячейки: " +getId() + "\nКол-во предметов: " +getSum());
    }
}
