package list.linked_list;

import java.util.LinkedList;

public class Doubly_LinkedList {
    public static void main(String[] args) {
        /**
         * LinkedList của java là một Doubly Linked List, khi nó lưu cả địa chỉ ô nhớ của ô trước, ví dụ ở dưới
         * đây lấy ra giá trị của trước ô nhớ 1, vì ô nhớ có lưu address của ô nhớ trước nên có thể truy cập
         */
        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("1");
        linkedList.add("2");
        System.out.println(linkedList.listIterator(1).previous());
    }
}
