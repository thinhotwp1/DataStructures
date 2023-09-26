import java.util.Stack;

public class StackSample {
    // Stack = LIFO - Last In First Out
    public static void main(String[] args) {
        Stack<String> stackSample = new Stack<>();

        // Đẩy dữ liệu vào stack
        stackSample.push("apt_update");
        stackSample.push("snap_install");
        stackSample.push("pwd");
        stackSample.push("sudo");
        System.out.println(stackSample);

        // Đẩy dữ liệu ra khỏi stack, đẩy phần từ cuối cùng ra, vào sau ra trước
        stackSample.pop();
        stackSample.pop();
        System.out.println(stackSample);

        // Lấy dữ liệu stack trên cùng hay stack cuối được thêm vào
        System.out.println(stackSample.peek());

        // Search index
        System.out.println(stackSample.search("apt_update"));
        System.out.println(stackSample.search("No_in_Stack"));

        // Ứng dụng:
            // Làm undo for text editor, sửa đổi cuối sẽ được sử dụng đầu
            // Lịch sử brower, lùi hoặc tiến bằng nút quay lại hoặc tiến lên trong brower
            // Tìm kiếm thông tin qua path C:/code/stack/over/flow
            // Log điều khiển chương trình, ví dụ khi ấn mũi tên trong terminal thì lấy câu lệnh gần nhất

    }
}
