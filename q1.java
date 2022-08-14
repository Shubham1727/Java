class GArray<Type> {
    public static <Type> void exchange(Type[] arr, int a, int b) {
        Type temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static <Type> void display(Type[] arr) {
        for (Type obj : arr) {
            System.out.print("\t" + obj);
        }
        System.out.println();
    }
}

public class q1 {
    public static void main(String[] args) {
        Integer intArray[] = { 1, 5, 8, 3, 2, 10 };
        Double doubleArray[] = { 13.65, 85.65, 52.66 };
        String stringArray[] = { "Aryan", "Shubham", "Arun", "Arjun" };
        System.out.println("\n\tIBefore Swapping : ");
        GArray.display(intArray);
        GArray.display(doubleArray);
        GArray.display(stringArray);
        System.out.println("\n\t After Swapping indices '1' and '2': ");
        GArray.exchange(intArray, 1, 2);
        GArray.exchange(doubleArray, 1, 2);
        GArray.exchange(stringArray, 1, 2);
        GArray.display(intArray);
        GArray.display(doubleArray);
        GArray.display(stringArray);
    }
}
