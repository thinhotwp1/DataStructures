package list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayList_Vs_LinkedList {
    public static void main(String[] args) {
        /**
         * - Ví dụ 1: Với ArrayList mất khoảng 60000ms để thực hiện việc thêm ở đầu danh sách còn với LinkedList thì chỉ
         * mất 100ms với mảng 1 triệu phần tử.
         * - Ví dụ 2: Với ArrayList mất khoảng 10ms để thực hiện việc thêm ở cuối danh sách còn với LinkedList thì
         * mất 100ms với mảng 1 triệu phần tử
         * - Ví dụ 3: Với ArrayList mất khoảng 1500ms để thực hiện việc thêm 1000 phần tử ở giữa danh sách còn với LinkedList thì
         * mất 1500ms với mảng 1 triệu phần tử.
         * ==> Thao tác phần tử đầu và giữa mảng thì LinkedList, giữa tới cuối thì ArrayList 
         *
         * <-------------------------------------------WHY?------------------------------------------------>
         * - Nếu danh sách cần thêm xóa một phần tử ở đầu tới giữa thì việc sử dụng LinkedList sẽ nhanh hơn
         * do sử dụng địa chỉ ô nhớ của ô trước và ô sau để thêm hoặc xóa một ô bên cạnh, còn ArrayList khi thêm
         * một phần tử mới sẽ phải di dời các phần tử đằng sau sang 1 index.
         *
         * - Nếu danh sách cần thêm xóa phần tử ở giữa tới cuối danh sách thì việc sử dụng ArrayList sẽ nhanh hơn
         * do ArrayList sử dụng index để lưu ô dữ liệu, nhanh hơn so với duyệt từng ô một tới cuối như linkedList,
         * vì linkedList lưu theo địa chỉ ô tiếp theo nên phải duyệt lần lượt từng ô tới cuối danh sách.
         * <----------------------------------------------------------------------------------------------->
         */

        ArrayList<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();
        long startTime;
        long endTime;

        /**-------------------------------------------------------------------------------------------------**/
        System.out.println("Ví dụ 1: Thêm 1 triệu phần tử ở đầu danh sách.");

        // Chèn 1 triệu phần tử vào ArrayList ở đầu danh sách
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++)   arrayList.add(0, "Inserted 0");
        endTime = System.currentTimeMillis();
        System.out.println("Thời gian ArrayList: " + (endTime - startTime) + "ms");

        // Chèn 1 triệu phần tử vào LinkedList ở đầu danh sách
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++)   linkedList.add(0, "Inserted 0");
        endTime = System.currentTimeMillis();
        System.out.println("Thời gian LinkedList: " + (endTime - startTime) + "ms");

        System.out.println("--------------------------------------------------------------------------------");
        // clear data
        arrayList.clear();
        linkedList.clear();

        System.out.println("Ví dụ 2: Thêm 1 triệu phần tử ở cuối danh sách.");

        // Chèn 1 triệu phần tử vào ArrayList ở cuối danh sách
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++)   arrayList.add("Inserted 1000000");
        endTime = System.currentTimeMillis();
        System.out.println("Thời gian ArrayList: " + (endTime - startTime) + "ms");

        // Chèn 1 triệu phần tử vào LinkedList ở cuối danh sách
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++)   linkedList.add("Inserted 1000000");
        endTime = System.currentTimeMillis();
        System.out.println("Thời gian LinkedList: " + (endTime - startTime) + "ms");

        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("Ví dụ 3: Thêm 1000 phần tử ở giữa danh sách.");

        // Chèn phần tử vào ArrayList ở giữa danh sách
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++)  linkedList.add(500000,"Inserted 500000");

        endTime = System.currentTimeMillis();
        System.out.println("Thời gian ArrayList: " + (endTime - startTime) + "ms");

        // Chèn phần tử vào LinkedList ở giữa danh sách
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++)  linkedList.add(500000,"Inserted 500000");

        endTime = System.currentTimeMillis();
        System.out.println("Thời gian LinkedList: " + (endTime - startTime) + "ms");

    }

}
