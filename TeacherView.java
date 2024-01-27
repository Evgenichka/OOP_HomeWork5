package OOP_Home_work5.idea;

import java.util.List;
import java.util.Scanner;

public class TeacherView {
    Scanner scanner;

    public TeacherView() {
        scanner = new Scanner(System.in);
    }

    public void displayDate(List<Teacher> data) {
        System.out.println("Список преподавателей:");
        for (int i = 0; i < data.size(); i++) {
            Teacher teacher = data.get(i);
            System.out.println((i + 1) + ". " + teacher.getId() +". " + teacher.getFirstName() + ". " + teacher.getLastName()
                    + " (" + teacher.getEmail() + ")");
        }
    }

    public int getUserChoice() {
        System.out.print("Введите запрос ( имя): ");
        return scanner.nextInt();
    }

    public void showMenu() {
        System.out.println("Помощь:");
        System.out.println("1. Создать новую запись");
        System.out.println("2. Отредактировать запись");
        System.out.println("3. Вывести список учителей");
        System.out.println("4. удалить запись");

    }


}
