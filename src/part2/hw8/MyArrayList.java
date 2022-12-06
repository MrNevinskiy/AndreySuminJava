package part2.hw8;

public class MyArrayList {
    private String[] array = new String[10];
    private int size = 0;


    public void add(String word) {
        array[size] = word;
        size++;
        if (size == array.length){
            String[] newArray = new String[array.length * 2];
            for (int i = 0; i < size; i++){
                newArray[i] = array[i];
            }
            array = newArray;
        }
    }

    public void remove(int index) {
        if (index >= 0 && index <= size) {
            for (int i = index; i < size - 1; i++) {
                array[i] = array[i + 1];
            }
            size--;
        }
    }

    public void remove(String word) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (array[i].equals(word)){
                index = i;

            }
        }
        remove(index);
    }

    public String get(int index) {
        if (index >= 0 && index <= size) {
            return array[index];
        }else {
         return "Данного индекса нет";
        }
    }

    public int getSize() {
        return size;
    }
}
