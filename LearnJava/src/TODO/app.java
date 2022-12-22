package TODO;
import java.util.*;
/**
 * 1 [ ] Di cho
 * 2 [x] Tap the duc
 * 3 [x] Rua chen
 */
/**
 * 1. show todo list
 * 2. check/uncheck todo
 * 3. add new todo
 * 4. delete a todo
 */
import java.util.random.*;
import java.util.ArrayList;

/**
 * TodoList {
 *     TodoItem[] todoItems = []
 *     void showList()
 *     void toggle(int Index)
 *     void addItem(String content)
 *     void deleteItem(int Index)
 * }
 *
 * TodoItem {
 *     Boolean isChecked =  false;
 *     String content = '';
 *
 *     get/set => isCheck
 *     get/set content
 * }
 */
class TodoItems{
    private String content;
    private boolean ischeck;
    public TodoItems(){
        content = "";
        ischeck = false;
    }
    public TodoItems(String content, boolean ischeck) {
        this.content = content;
        this.ischeck = ischeck;
    }
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public boolean isIscheck() {
        return ischeck;
    }

    public void setIscheck(boolean ischeck) {
        this.ischeck = ischeck;
    }
    @Override
    public String toString(){
        return String.format(" "+content);
    }
}
class TodoList{
    private ArrayList<TodoItems> list;
    public TodoList(){
        this.list = new ArrayList<>();
    }
    public TodoList(ArrayList<TodoItems> list) {
        this.list = list;
    }
    public void addList(TodoItems td){
        this.list.add(td);
    }
    public void showList(){
        System.out.println();
        System.out.println("----- List -----");
        for (TodoItems todo:list) {
            if (todo.isIscheck() == false){
                System.out.println("[] "+todo);
            }
            else {
                System.out.println("[x] "+todo);
            }
        }
        System.out.println();
    }
    public void removeLlist(int i){
        for (int j = 0; j < list.size(); j++) {
            if (j == i){
                list.remove(j);
                break;
            }
        }
    }
    public void toggle(int i){
        boolean check = true;
        for (int j = 0; j < list.size(); j++) {
            if (j == i){
                list.get(j).setIscheck(check);
                break;
            }
        }
    }
    public void unToggle(int i){
        TodoItems t;
        boolean check = false;
        for (int j = 0; j < list.size(); j++) {
            if (j == i){
                list.get(j).setIscheck(check);
                break;
            }
        }
    }
}
//
public class app {
    public static void main(String[] args) {
        TodoList todoList = new TodoList();
        boolean check = false;
        int state;
        int index = 0;
        Scanner scanner = new Scanner(System.in);
        int chon = 0;
        do {
            System.out.println("1. Add");
            System.out.println("2. ShowList");
            System.out.println("3. Check");
            System.out.println("4. Uncheck");
            System.out.println("5. Remove  ");
            System.out.println("0. exits");
            System.out.print("choice function : ");
            chon = scanner.nextInt();
            switch (chon){
                case 1:
                    scanner.nextLine();
                    System.out.print("Input job : ");
                    String job = scanner.nextLine();
                    TodoItems t = new TodoItems(job,check);
                    todoList.addList(t);
                    break;
                case 2:
                    todoList.showList();
                    break;
                case 3:
                    System.out.print("Input check position : ");
                    index = scanner.nextInt();
                    todoList.toggle(index);
                    break;
                case 4:
                    System.out.print("Include uncheck position : ");
                    index = scanner.nextInt();
                    todoList.unToggle(index);
                    break;
                case 5:
                    System.out.print("Input remove position : ");
                    index = scanner.nextInt();
                    todoList.removeLlist(index);
                    break;
                default:
                    if (chon == 0){
                        System.out.println();
                        System.out.println("Thanks !!!!!!!");
                    }
            }
        }while (chon != 0);
    }
}
