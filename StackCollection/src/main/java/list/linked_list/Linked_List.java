package list.linked_list;

import java.util.Iterator;
import java.util.LinkedList;

public class Linked_List {
    /**
     - List sắp xếp dựa theo index, khi thêm một object vào vị trí n thì mỗi phần từ từ n đến cuối danh sách
     đều phải dịch chuyển sang một ô nhớ, điều này với mảng có một triệu object sẽ mất nhiều thời gian

     - LinkedList lưu object theo dạng lưu giá trị và thêm địa chỉ của index tiếp theo, nếu thêm một object
     vào vị trí n thì chỉ cần sửa ô nhớ của 2 ô thứ n-1 và thứ n+1, rất nhanh nếu phải thêm nhiều vào index cụ thể
     (Nhưng sẽ tốn bộ nhớ hơn vì phải lưu thêm địa chỉ ô nhớ của ô tiếp theo và có thể cả ô nhớ trước đó - Doubly Linked List)

     - So sánh tốc độ thêm object giữa list và linkedList ở file List_Vs_LinkedList.java
     */
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();

        // 1. push(Object) = addFirst(Object)
        linkedList.push("2");
        linkedList.push("0");
        System.out.println(linkedList);

        // 2. add(Object) = addLast(Object) or add with index
        linkedList.add("1");
        linkedList.add(0,"0");
        System.out.println(linkedList);

        // 3. indexOf() = search first index, lastIndexOf() = search last index
        System.out.println("first index: "+ linkedList.indexOf("0"));
        System.out.println("last index: "+ linkedList.lastIndexOf("0"));

        // 4. peekFirst = get first index, peekLast = get last index,
        System.out.println(linkedList.peekFirst());
        System.out.println(linkedList.peekLast());

        // 4. linkedList to iterator
        Iterator<String> iterator = linkedList.iterator();

        // 5. descendingIterator() =  iterator sắp xếp ngược
        Iterator<String> iteratorDescending = linkedList.descendingIterator();

        // 6. Clone linkedList
        Object clone = linkedList.clone();
        System.out.println("Clone linkedList: " + clone);

    }
}
