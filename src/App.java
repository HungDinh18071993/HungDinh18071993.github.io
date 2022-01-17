import java.io.File;
import java.io.FileOutputStream;
import java.util.Scanner;

class Product {

    String bcode;
    String title;
    Integer quantity;
    double price;

    public Product() {
    }

    // constructor
    public Product(String bcode, String title, Integer quantity, double price) {
        this.bcode = bcode;
        this.title = title;
        this.quantity = quantity;
        this.price = price;
    }

    @Override
    public String toString() {
        String s = this.bcode + " | " + this.title + " | " + this.quantity + " | " + this.price;
        return s;
    }

}

/**
 * Generic version of the Node class.
 *
 * @param <T> the type of the value
 */
class Node<T> {

    /**
     * The info of this node
     */
    T info;

    /**
     * The next node
     */
    Node<T> next;

    /**
     * Default constructor
     */
    public Node() {
    }

    /**
     * Constructor with info and next node
     *
     * @param info The info of this node
     * @param next The next Node of this node
     */
    public Node(T info, Node<T> next) {
        this.info = info;
        this.next = next;
    }

    /**
     * Overriding to convert this node to String
     */
    @Override
    public String toString() {
        String s = "";
        return s;
    }

}

/**
 * Generic version of the LinkedList class.
 *
 * @param <T> the type of the value
 */
class MyList<T> {

    /**
     * Head node, default is null
     */
    Node<T> head;

    /**
     * Tail node, default is null
     */
    Node<T> tail;
    int length = 0; // biến lưu chiêu dài list

    /**
     * Default constructor
     */
    public MyList() {
        head = tail = null;
    }

    /**
     * Constructor with head and tail
     *
     * @param head Head node of this list
     * @param tail Tail node of this list
     */
    public MyList(Node<T> head, Node<T> tail) {

    }

    /**
     * Checking if this list is empty
     *
     * @return true if list is empty
     */
    public boolean isEmpty() {
        return (head == null);
    }

    /**
     * Returning the length of this list
     *
     * @return The length of this list
     */
    public int length() {
        return length;
    }

    /**
     * Insert an item to the head of this list
     *
     * @param item The item to be inserted
     */
    public void insertToHead(T item) {
        Node<T> p = new Node<T>();
        p.info = item;
        p.next = head;
        head = p;
    }

    /**
     * Insert an item at position to this list
     *
     * @param position The position of new item
     * @param item     The item to be inserted
     */
    public void insertAfterPosition(int position, T item, int length) {
        Node<T> p = head;
        for (int i = 0; i < position - 1; i++) {
            p = p.next;
        }

        Node<T> q = new Node<T>();
        q.info = item;
        if (position < length - 1) {
            q.next = p.next.next;
        }
        p.next = q;

    }

    /**
     * Deleting the tail of this list
     */
    public void deleteTail() {
        tail = null;
    }

    /**
     * Searching and deleting an item from this list by comparing the ID of items
     *
     * @param item The item to be deleted
     */
    public void deleteElement(T item) {
        // Store head node
        Node<T> temp = head, prev = null;

        // If head node itself holds the key to be deleted
        if (temp != null && temp.info == item) {
            head = temp.next; // Changed head
            return;
        }

        // Search for the key to be deleted, keep track of
        // the previous node as we need to change temp.next
        while (temp != null && temp.info != item) {
            prev = temp;
            temp = temp.next;
        }

        // If key was not present in linked list
        if (temp == null)
            return;

        // Unlink the node from linked list
        prev.next = temp.next;
    }

    /**
     * Swaping two nodes [firstNode] and [secondNode]
     *
     * @param firstNode
     * @param secondNode
     */
    public void swap(Node<T> firstNode, Node<T> secondNode) {
        T tam = firstNode.info;
        firstNode.info = secondNode.info;
        secondNode.info = tam;
    }

    /**
     * Deleting all items in the list
     */
    public void clear() {

        for (int i = 0; i < length(); i++) {
            if (head != null) {
                head = null;
            }
        }
    }
}

/**
 * Generic version of the Queue class.
 *
 * @param <T> the type of the value
 */
class MyQueue<T> {

    /**
     * Head node contains front node in the queue
     */
    Node<T> head;

    /**
     * Tail node contains last node in the queue
     */
    Node<T> tail;

    int length = 0; // biến lưu chiêu dài queue

    /**
     * Default constructor
     */
    public MyQueue() {
        head = tail = null;
    }

    public int length() {
        return length;
    }

    /**
     * Deleting all items in the queue
     */
    public void clear() {

        for (int i = 0; i < length(); i++) {
            if (head != null) {
                head = null;
            }
        }
    }

    /**
     * Insert an item to the head of this queue
     *
     * @param item The item to be inserted
     */
    public void insertToHead(T item) {
        Node<T> p = new Node<T>();
        p.info = item;
        p.next = head;
        head = p;
    }
}

/**
 * Generic version of the Stack class.
 *
 * @param <T> the type of the value
 */
class MyStack<T> {

    /**
     * Head node contains front node in the stack
     */
    Node<T> head;

    int length = 0; // biến lưu chiêu dài stack

    /**
     * Default constructor
     */
    public MyStack() {
        head = null;
    }

    public int length() {
        return length;
    }

    /**
     * Deleting all items in the stack
     */
    public void clear() {

        for (int i = 0; i < length(); i++) {
            if (head != null) {
                head = null;
            }
        }
    }

    /**
     * Insert an item to the head of this stack
     *
     * @param item The item to be inserted
     */
    public void insertToHead(T item) {
        Node<T> p = new Node<T>();
        p.info = item;
        p.next = head;
        head = p;
    }
}

/**
 * This class manages all functions relate to the product
 */
class OperationToProduct {

    /**
     * Searching and returning the index of product p in the list. If not found
     * return -1.
     *
     * @param p    Product for searching
     * @param list The Linked List
     * @return The index of product p in the list
     */
    public int index(Product p, MyList<Product> list) {
        return 0;
    }

    /**
     * Creating and returning a product with info input from keyboard.
     *
     * @return The product
     */
    public Product createProduct() {
        return null;
    }

    /**
     * Reading all products from the file and insert them to the list at tail.
     *
     * @param fileName The file name of the file
     * @param list     The Linked List contains all products that read from file
     */
    public void getAllItemsFromFile(String fileName, MyList<Product> list) {
        try {
            list.clear(); // xoa list đọc lại
            list.length = 0;
            boolean check = true; // biến kiểm tra kết thúc
            Scanner sc = new Scanner(new File(fileName));
            String[] arrString = sc.nextLine().split("\\s"); // phân dữ liệu
            while (check == true) {
                list.length++; // tăng chiều dài list
                list.insertToHead(new Product(arrString[0], arrString[1], Integer.parseInt(arrString[2]),
                        Double.parseDouble(arrString[3])));
                arrString = sc.nextLine().split("\\s");
                if (arrString[0].compareTo("//") == 0)
                    check = false;
            }
            sc.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Reading all products from the file and insert them to the stack.
     *
     * @param fileName The file name of the file
     * @param list     The Stack contains all products that read from file
     */
    public void getAllItemsFromFile(String fileName, MyStack<Product> stack) {
        try {
            stack.clear();
            stack.length = 0;
            boolean check = true;
            Scanner sc = new Scanner(new File(fileName));
            String[] arrString = sc.nextLine().split("\\s");
            while (check == true) {
                stack.length++;
                stack.insertToHead(new Product(arrString[0], arrString[1], Integer.parseInt(arrString[2]),
                        Double.parseDouble(arrString[3])));
                arrString = sc.nextLine().split("\\s");
                if (arrString[0].compareTo("//") == 0)
                    check = false;
            }
            sc.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Reading all products from the file and insert them to the queue.
     *
     * @param fileName The file name of the file
     * @param list     The Queue contains all products that read from file
     */
    public void getAllItemsFromFile(String fileName, MyQueue<Product> queue) {
        try {
            queue.clear();
            queue.length = 0;
            boolean check = true;
            Scanner sc = new Scanner(new File(fileName));
            String[] arrString = sc.nextLine().split("\\s");
            while (check == true) {
                queue.length++;
                queue.insertToHead(new Product(arrString[0], arrString[1], Integer.parseInt(arrString[2]),
                        Double.parseDouble(arrString[3])));
                arrString = sc.nextLine().split("\\s");
                if (arrString[0].compareTo("//") == 0)
                    check = false;
            }
            sc.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Adding a product to the list, info of the product input from keyboard.
     *
     * @param list The Linked list
     */
    public void addLast(MyList<Product> list, Product item) {
        list.insertAfterPosition(list.length(), item, list.length());
        list.length++;
    }

    /**
     * Printing all prodcuts of the list to console screen
     *
     * @param list
     */
    public void displayAll(MyList<Product> list) {
        System.out.println("ID | Title | Quantity | price");
        System.out.println("--------------------------------");
        Node<Product> p = list.head;
        System.out.println("list.length : " + list.length());
        for (int i = 0; i < list.length(); i++) { // duyệt qua list
            if (p != null) {
                System.out.println(p.info.toString());
                p = p.next;
            }
        }
    }

    /**
     * Printing all prodcuts of the queue to console screen
     *
     * @param list
     */
    public void displayAll(MyQueue<Product> list) {
        System.out.println("ID | Title | Quantity | price");
        System.out.println("--------------------------------");
        Node<Product> p = list.head;
        System.out.println("queue.length : " + list.length());
        for (int i = 0; i < list.length(); i++) {
            if (p != null) {
                System.out.println(p.info.toString());
                p = p.next;
            }
        }
    }

    /**
     * Printing all prodcuts of the stack to console screen
     *
     * @param list
     */
    public void displayAll(MyStack<Product> list) {

        Node<Product> q = new Node<Product>();
        MyStack<Product> list2 = new MyStack<Product>();
        q = list.head;
        for (int i = 0; i < list.length(); i++) {
            list2.insertToHead(q.info);
            list2.length++;
            q = q.next;
        }
        System.out.println("ID | Title | Quantity | price");
        System.out.println("--------------------------------");
        Node<Product> p = list2.head;
        System.out.println("stack.length : " + list2.length());
        for (int i = 0; i < list2.length(); i++) {
            if (p != null) {
                System.out.println(p.info.toString());
                p = p.next;
            }
        }
    }

    /**
     * Writing all products from the list to the file
     *
     * @param fileName Input file name
     * @param list     Input Linked list
     */
    public void writeAllItemsToFile(String fileName, MyList<Product> list, boolean check) {
        try {
            String phanCach = " ";
            String ket_thuc = "//";
            FileOutputStream output = new FileOutputStream(fileName, check);

            // ghi file vào list theo thứ tự đuôi lên
            Node<Product> p = new Node<Product>();
            Node<Product> q = new Node<Product>();
            p = list.head;

            MyList<Product> list2 = new MyList<Product>();
            for (int i = 0; i < list.length(); i++) {
                list2.insertToHead(p.info);
                p = p.next;
            }

            q = list2.head;

            for (int i = 0; i < list.length(); i++) {

                byte buff2[] = String.valueOf(q.info.bcode).getBytes();
                output.write(buff2, 0, buff2.length);
                output.write(phanCach.getBytes(), 0, phanCach.getBytes().length);

                buff2 = String.valueOf(q.info.title).getBytes();
                output.write(buff2, 0, buff2.length);
                output.write(phanCach.getBytes(), 0, phanCach.getBytes().length);

                buff2 = String.valueOf(q.info.quantity).getBytes();
                output.write(buff2, 0, buff2.length);
                output.write(phanCach.getBytes(), 0, phanCach.getBytes().length);

                buff2 = String.valueOf(q.info.price).getBytes();
                output.write(buff2, 0, buff2.length);
                output.write(phanCach.getBytes(), 0, phanCach.getBytes().length);

                // xuống dòng
                output.write(System.getProperty("line.separator").getBytes());
                q = q.next;

            }
            if (check == false) {
                output.write(ket_thuc.getBytes(), 0, ket_thuc.getBytes().length);
                output.write(System.getProperty("line.separator").getBytes());
            }
            output.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Writing all products from the Queue to the file
     *
     * @param fileName Input file name
     * @param list     Input Linked list
     */
    public void writeAllItemsToFile(String fileName, MyQueue<Product> list, boolean check) {
        try {
            String phanCach = " ";
            String ket_thuc = "//";
            FileOutputStream output = new FileOutputStream(fileName, check);
            Node<Product> p = new Node<Product>();
            Node<Product> q = new Node<Product>();
            p = list.head;

            MyList<Product> list2 = new MyList<Product>();
            for (int i = 0; i < list.length(); i++) {
                list2.insertToHead(p.info);
                p = p.next;
            }

            q = list2.head;

            for (int i = 0; i < list.length(); i++) {

                byte buff2[] = String.valueOf(q.info.bcode).getBytes();
                output.write(buff2, 0, buff2.length);
                output.write(phanCach.getBytes(), 0, phanCach.getBytes().length);

                buff2 = String.valueOf(q.info.title).getBytes();
                output.write(buff2, 0, buff2.length);
                output.write(phanCach.getBytes(), 0, phanCach.getBytes().length);

                buff2 = String.valueOf(q.info.quantity).getBytes();
                output.write(buff2, 0, buff2.length);
                output.write(phanCach.getBytes(), 0, phanCach.getBytes().length);

                buff2 = String.valueOf(q.info.price).getBytes();
                output.write(buff2, 0, buff2.length);
                output.write(phanCach.getBytes(), 0, phanCach.getBytes().length);

                output.write(System.getProperty("line.separator").getBytes());
                q = q.next;

            }
            if (check == false) {
                output.write(ket_thuc.getBytes(), 0, ket_thuc.getBytes().length);
                output.write(System.getProperty("line.separator").getBytes());
            }
            output.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Writing all products from the Stack to the file
     *
     * @param fileName Input file name
     * @param list     Input Linked list
     */
    public void writeAllItemsToFile(String fileName, MyStack<Product> list, boolean check) {
        try {
            String phanCach = " ";
            String ket_thuc = "//";
            FileOutputStream output = new FileOutputStream(fileName, check);
            Node<Product> q = new Node<Product>();
            q = list.head;

            for (int i = 0; i < list.length(); i++) {

                byte buff2[] = String.valueOf(q.info.bcode).getBytes();
                output.write(buff2, 0, buff2.length);
                output.write(phanCach.getBytes(), 0, phanCach.getBytes().length);

                buff2 = String.valueOf(q.info.title).getBytes();
                output.write(buff2, 0, buff2.length);
                output.write(phanCach.getBytes(), 0, phanCach.getBytes().length);

                buff2 = String.valueOf(q.info.quantity).getBytes();
                output.write(buff2, 0, buff2.length);
                output.write(phanCach.getBytes(), 0, phanCach.getBytes().length);

                buff2 = String.valueOf(q.info.price).getBytes();
                output.write(buff2, 0, buff2.length);
                output.write(phanCach.getBytes(), 0, phanCach.getBytes().length);

                output.write(System.getProperty("line.separator").getBytes());
                q = q.next;

            }
            if (check == false) {
                output.write(ket_thuc.getBytes(), 0, ket_thuc.getBytes().length);
                output.write(System.getProperty("line.separator").getBytes());
            }
            output.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /// hàm ghi output ra file console_output
    // hàm ghi String ( chức năng 5 & 8)
    public void writeFile(String fileName, String s) {
        try {
            FileOutputStream output = new FileOutputStream(fileName, true);

            byte buff2[] = s.getBytes();
            output.write(buff2, 0, buff2.length);
            output.write(System.getProperty("line.separator").getBytes());

            output.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Searching product by ID input from keyboard.
     *
     * @param list
     */
    public void searchByCode(MyList<Product> list, Scanner scan) {
        System.out.print("Input the IDto search = ");
        String findID = scan.next();
        Node<Product> p = list.head;
        boolean check = false;
        for (int i = 0; i < list.length(); i++) {
            if (p.info.bcode.compareTo(findID) == 0) {
                System.out.println("result = " + p.info.toString());
                check = true;
                writeFile("Project2/src/console_output.txt", "result = " + p.info.toString());
            }
            p = p.next;
        }
        if (check == false) {
            System.out.print("result =  -1 !!!");
        }
    }

    /**
     * Deleting first product that has the ID input from keyboard from the list.
     *
     * @param list
     */
    public void deleteByCode(MyList<Product> list, Scanner scan) {
        System.out.print("Input the bcode to delete = ");
        String findID = scan.next();
        Node<Product> p = list.head;
        boolean check = false;
        int len = list.length();
        for (int i = 0; i < len; i++) {
            if (p.info.bcode.compareTo(findID) == 0) {
                list.deleteElement(p.info);
                check = true;
                list.length--; // giảm chiều dài
            }
            p = p.next;

        }
        if (check == false) {
            System.out.print("Input the bcode to delete = NotFound");
        } else {
            System.out.print("Deleted !!!");
        }
    }

    /**
     * Sorting products in linked list by ID
     *
     * @param list The Linked list
     */

    // hàm đệ quy selection sort
    void selectSort(int index, int length, Node<Product> p, MyList<Product> list) {
        Node<Product> min = p;
        Node<Product> q = p.next;
        for (int j = index + 1; j < list.length; j++) {
            if (q.info.bcode.compareTo(min.info.bcode) < 0) { // so sánh chuỗi
                min = q;
            }
            if (j < list.length - 1) {
                q = q.next;
            }

        }
        list.swap(min, p); // đảo chỗ
        if (index < length - 1) {
            p = p.next;
            selectSort(index + 1, length, p, list); // đệ quy vào lặp tiếp theo cho đến cuối list
        }
    }

    // hàm sortbycode
    public void sortByCode(MyList<Product> list) {
        Node<Product> p = list.head;
        int index = 0;
        selectSort(index, list.length, p, list); // hàm đệ quy
        System.out.println("Successfully!");
    }

    /**
     * Adding new product to head of Linked List. The info input from keyboard.
     *
     * @param list The linked list
     */
    public void addFirst(MyList<Product> list) {

    }

    /**
     * Convert a decimal to an array of binary. Example: input i = 18 -> Output =
     * {0, 1, 0, 0, 0, 1}
     *
     * @param i Input decimal number
     * @return Array of binary numbers
     */
    // hàm đệ quy tìm nhị phân
    String s = "";

    void binary(int thuong, int du) {
        s += du + "";
        if (thuong != 0) {
            binary(thuong / 2, thuong % 2);
        }
    }

    public int[] convertToBinary(MyList<Product> list) {
        Node<Product> p = list.head;
        int soLuong = p.info.quantity;
        s = "";
        binary(soLuong / 2, soLuong % 2); // hàm đệ quy cho tới khi thuong = 0
        int a[] = new int[s.length()];
        for (int i = s.length() - 1; i >= 0; i--) {
            a[i] = Integer.parseInt(String.valueOf(s.charAt(i)));
        }
        return a;
    }

    /**
     * Deleting the product at position
     *
     * @param list The Linked List
     * @param pos  The position of product to be deleted
     */
    public void deleteAtPosition(MyList<Product> list, int pos) {

    }
}

public class App {
    public static void showMenu() {
        System.out.println("Choose one of this options:");
        System.out.println("Product list:");
        System.out.println("1. Load data from file and display");
        System.out.println("2. Input & add to the end.");
        System.out.println("3. Display data");
        System.out.println("4. Save product list to file.");
        System.out.println("5. Search by ID");
        System.out.println("6. Delete by ID");
        System.out.println("7. Sort by ID.");
        System.out.println("8. Convert to Binary");
        System.out.println("9. Load to stack and display");
        System.out.println("10. Load to queue and display.");
        System.out.println("0. Exit");
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int choice;
        OperationToProduct operateProduct = new OperationToProduct();
        MyList<Product> listProduct = new MyList<Product>();

        while (true) {
            System.out.println();
            System.out.print("choice: ");
            choice = scan.nextInt();

            // kết thúc chương trình
            if (choice == 0) {
                System.out.println(" Thanks!!!");
                scan.close();
                break;
            }

            switch (choice) {
            case 1: // Load data from file and display
                operateProduct.getAllItemsFromFile("Project2/src/data.txt", listProduct);
                operateProduct.displayAll(listProduct);
                operateProduct.writeAllItemsToFile("Project2/src/console_output.txt", listProduct, true);
                System.out.println();
                break;

            case 2: // Input & add to the end.
                System.out.print("Input new ID: ");
                String newId = scan.next();
                System.out.print("Input Product's Name: ");
                String newName = scan.next();
                System.out.print("Input Product's quantity: ");
                int newQuatity = scan.nextInt();
                System.out.print("Input Product's price: ");
                Double newPrice = scan.nextDouble();
                operateProduct.addLast(listProduct, new Product(newId, newName, newQuatity, newPrice));
                System.out.println();
                break;

            case 3: // Display data
                operateProduct.displayAll(listProduct);
                operateProduct.writeAllItemsToFile("Project2/src/console_output.txt", listProduct, true);
                System.out.println();
                break;

            case 4: // Save product list to file
                operateProduct.writeAllItemsToFile("Project2/src/data.txt", listProduct, false);
                System.out.print("Successfully! !!!");
                System.out.println();
                break;

            case 5: // Search by ID
                operateProduct.searchByCode(listProduct, scan);
                System.out.println();
                break;

            case 6: // Delete by ID
                operateProduct.deleteByCode(listProduct, scan);
                System.out.println();
                break;

            case 7: // Sort by ID
                operateProduct.sortByCode(listProduct);
                System.out.println();
                break;

            case 8: // Convert to Binary
                int a[] = operateProduct.convertToBinary(listProduct);
                String s = "";
                for (int i = a.length - 1; i >= 0; i--) {
                    s += a[i] + "";
                }
                System.out.println("Quantity = " + listProduct.head.info.quantity + " => " + s);
                System.out.println();
                operateProduct.writeFile("Project2/src/console_output.txt",
                        "Quantity = " + listProduct.head.info.quantity + " => " + s);
                break;

            case 9: // Load to stack and display
                MyStack<Product> listStack = new MyStack<Product>();
                operateProduct.getAllItemsFromFile("Project2/src/data.txt", listStack);
                operateProduct.displayAll(listStack);
                operateProduct.writeAllItemsToFile("Project2/src/console_output.txt", listStack, true);
                System.out.println();
                break;

            case 10: // Load to queue and display
                MyQueue<Product> listQueue = new MyQueue<Product>();
                operateProduct.getAllItemsFromFile("Project2/src/data.txt", listQueue);
                operateProduct.displayAll(listQueue);
                operateProduct.writeAllItemsToFile("Project2/src/console_output.txt", listQueue, true);
                System.out.println();
                break;
            default:
                System.out.println("**Invalid choice. Try again.**");
                break;
            }

        }
    }

}