import java.util.Stack;

public class StackSample {
    // Stack = LIFO - Last In First Out
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        // Đẩy dữ liệu vào stack, push(Object) = addElement(Object)
        stack.push("apt_update");
        stack.push("snap_install");
        stack.push("pwd");
        stack.push("sudo");
        System.out.println(stack);

        // pop() = remove last index
        stack.pop();
        stack.pop();
        System.out.println(stack);

        // peek() = get last index
        System.out.println(stack.peek());

        // Search index, return index object
        System.out.println(stack.search("apt_update"));
        System.out.println(stack.search("No_in_Stack"));

        // Ứng dụng:
            // Làm undo for text editor, sửa đổi cuối sẽ được sử dụng đầu
            // Lịch sử brower, lùi hoặc tiến bằng nút quay lại hoặc tiến lên trong brower
            // Tìm kiếm thông tin qua path C:/code/stack/over/flow
            // Log điều khiển chương trình, ví dụ khi ấn mũi tên trong terminal thì lấy câu lệnh gần nhất

    }
}
