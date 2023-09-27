package list.linked_list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class List_Vs_LinkedList {
    public static void main(String[] args) {
        /**
         * Đối với danh sách nhỏ và thêm vào list ở cuối danh sách thì List nhanh hơn,
         * nếu cần thêm vào index cụ thể thì LinkedList giảm nhiều thời gian,
         * ví dụ dưới với arrayList mất 1p để thực hiện còn với linkedList thì chỉ
         * mất 0.1s với mảng 1 triệu phần từ
         */

        List<String> arrayList = new ArrayList<>();
        // Chèn 1 triệu phần tử vào giữa danh sách
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            arrayList.add(0, "Inserted 0");
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Duration with ArrayList insertion: " + (endTime - startTime));


        List<String> linkedList = new LinkedList<>();
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            linkedList.add(0, "Inserted 0");
        }
        endTime = System.currentTimeMillis();
        System.out.println("Duration with LinkedList insertion: " + (endTime - startTime));
    }

}
