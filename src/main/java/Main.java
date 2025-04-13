import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Створюємо масив випадкових чисел
        Integer[] array = new Integer[]{5, 4, 10, 2, 1, 8, -5, 0};

        // Створюємо об'єкт для сортування
        BasicAlgSort<Integer> sorter = new BasicAlgSort<>(array);

        // Друкуємо початковий масив
        System.out.println("Початковий масив: " + Arrays.toString(array));

        // Сортуємо за зростанням
        sorter.bubbleSortAsc();
        System.out.println("Після bubbleSortAsc: " + Arrays.toString(sorter.getArray()));

        // Створюємо новий об'єкт для сортування
        sorter = new BasicAlgSort<>(array);

        // Сортуємо за спаданням
        sorter.bubbleSortDesc();
        System.out.println("Після bubbleSortDesc: " + Arrays.toString(sorter.getArray()));

        // Створюємо новий об'єкт для сортування
        sorter = new BasicAlgSort<>(array);

        // Тестуємо SelectionSort за зростанням
        sorter.selectionSortAsc();
        System.out.println("Після selectionSortAsc: " + Arrays.toString(sorter.getArray()));

        // Створюємо новий об'єкт для сортування
        sorter = new BasicAlgSort<>(array);

        // Тестуємо SelectionSort за спаданням
        sorter.selectionSortDesc();
        System.out.println("Після selectionSortDesc: " + Arrays.toString(sorter.getArray()));

        // Створюємо новий об'єкт для сортування
        sorter = new BasicAlgSort<>(array);

        // Тестуємо InsertionSort з лінійним пошуком за зростанням
        sorter.insertionSortWithLinearSearchAsc();
        System.out.println("Після insertionSortWithLinearSearchAsc: " + Arrays.toString(sorter.getArray()));

        // Створюємо новий об'єкт для сортування
        sorter = new BasicAlgSort<>(array);

        // Тестуємо InsertionSort з бінарним пошуком за зростанням
        sorter.insertionSortWithBinarySearchAsc();
        System.out.println("Після insertionSortWithBinarySearchAsc: " + Arrays.toString(sorter.getArray()));

        // Створюємо новий об'єкт для сортування
        sorter = new BasicAlgSort<>(array);

        // Тестуємо InsertionSort з лінійним пошуком за спаданням
        sorter.insertionSortWithLinearSearchDesc();
        System.out.println("Після insertionSortWithLinearSearchDesc: " + Arrays.toString(sorter.getArray()));

        // Створюємо новий об'єкт для сортування
        sorter = new BasicAlgSort<>(array);

        // Тестуємо InsertionSort з бінарним пошуком за спаданням
        sorter.insertionSortWithBinarySearchDesc();
        System.out.println("Після insertionSortWithBinarySearchDesc: " + Arrays.toString(sorter.getArray()));
    }
}
