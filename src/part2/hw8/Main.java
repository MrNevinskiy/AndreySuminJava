package part2.hw8;

public class Main {
    public static void main(String[] args) {
        MyArrayList arrayList = new MyArrayList();
        arrayList.add("Вася");
        arrayList.add("Илья");
        arrayList.add("Никита");
        arrayList.add("Жора");
        arrayList.add("Петя");
        arrayList.add("Сережа");
        arrayList.add("Коля");

        for (int i = 0; i < 100; i++) {
            arrayList.add("Сотрудник " + i);
        }

        for (int i = 0; i < arrayList.getSize(); i++) {
            System.out.println(arrayList.get(i));
        }
    }
}
