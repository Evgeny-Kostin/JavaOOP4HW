/*
Создайте еще один обобщенный класс Pair, который будет представлять собой пару объектов. Этот класс должен иметь 
два поля для хранения объектов и соответствующие геттеры и сеттеры.
Создайте метод swapPairs, который принимает массив объектов типа Pair и меняет местами элементы в каждой паре. 
Например, если у вас есть пара (A, B), после вызова swapPairs она должна стать парой (B, A). 
Используйте обобщенные методы для реализации этой операции.
 */

public class Pair<T, V> {
    private T ob1;
    private V ob2;

    public Pair(T o1, V o2) {
        T ob1=o1;
        V ob2=o2;
    }
    public T getOb1(){
        return ob1;
    }
    public void setOb1 (T ob1){
        this.ob1 = ob1;
    }
    public V getOb2() {
        return ob2;
    }
    public void setOb2 (V ob2){
        this.ob2 = ob2;
    }
    public String toString() {
        return "(" + ob1 + ", " + ob2 + ")";
    }
    

    public static <T> void swapPairs(Pair<T,T>[] pairs){
        for (Pair<T, T> pair : pairs) {
            T tmp = pair.getOb1();
            pair.setOb1(pair.getOb2());
            pair.setOb2(tmp);
        }
    }
}