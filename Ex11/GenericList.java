import java.util.*;

class ListADT<T> {
    int index;
    int size;
    Object arr[];

    ListADT(int size) {
        index = 0;
        this.size = size;
        arr = new Object[size];
    }

    void insert(T ele) {
        if (index == size) {
            System.out.println("List is full!");
            return;
        }
        arr[index] = ele;
        index++;
    }

    void sort(Comparator<T> comp) {
        for (int i = 0; i < index; i++) {
            for (int j = 0; j < index - i - 1; j++) {
                if (comp.compare((T) arr[j], (T) arr[j + 1]) > 0) {
                    T temp = (T) arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    void delete(T ele) {
        for (int i = 0; i < index; i++) {
            if (arr[i].equals(ele)) {
                System.out.println("Deleted " + arr[i]);
                for (int j = i + 1; j < index; j++) {
                    arr[j - 1] = arr[j];
                }
                index--;
                return;
            }
        }
        System.out.println("No such element!");
    }

    void display() {
        System.out.println("Current list:");
        for (int i = 0; i < index; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

public class GenericList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1) Integer 2) String 3) Float");
        int dch = sc.nextInt();

        ListADT<Integer> intList = null;
        ListADT<String> strList = null;
        ListADT<Float> floatList = null;
        switch (dch) {
            case 1:
                intList = new ListADT<>(10);
                break;
            case 2:
                strList = new ListADT<>(10);
                break;
            case 3:
                floatList = new ListADT<>(10);
                break;
            default:
                System.out.println("Invalid choice!");
                System.exit(0);
        }
        System.out.println("1) Insert 2) Delete 3) Sort 4) Display");
        while (true) {
            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("Enter value to insert:");
                    if (intList != null) {
                        intList.insert(sc.nextInt());
                    } else if (strList != null) {
                        strList.insert(sc.next());
                    } else if (floatList != null) {
                        floatList.insert(sc.nextFloat());
                    }
                    break;
                case 2:
                    System.out.println("Enter value to delete:");
                    if (intList != null) {
                        intList.delete(sc.nextInt());
                    } else if (strList != null) {
                        strList.delete(sc.next());
                    } else if (floatList != null) {
                        floatList.delete(sc.nextFloat());
                    }
                    break;
                case 3:
                    System.out.println("Sorting the list");
                    if (intList != null) {
                        intList.sort(Comparator.naturalOrder());
                    } else if (strList != null) {
                        strList.sort(Comparator.naturalOrder());
                    } else if (floatList != null) {
                        floatList.sort(Comparator.naturalOrder());
                    }
                    break;
                case 4:
                    if (intList != null) {
                        intList.display();
                    } else if (strList != null) {
                        strList.display();
                    } else if (floatList != null) {
                        floatList.display();
                    }
                    break;
                case 5:
                    System.out.println("Exiting.");
                    System.exit(0);
                default:
                    System.out.println("Invalid option!");
                    break;
            }
        }
    }
}
