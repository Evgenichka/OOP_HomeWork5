package OOP_Home_work5.idea;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class TeacherController<string> {
    private static TeacherService model;
    private static TeacherView view;

    public TeacherController(TeacherService model, TeacherView view) {
        //noinspection AccessStaticViaInstance
        this.model = model;
        //noinspection AccessStaticViaInstance
        this.view = view;
    }

    public void run() {
        int choice;

        do {
            view.displayDate(model.getData());
            view.showMenu();
            choice = view.getUserChoice();

            switch (choice) {
                case 1:
                    model.addTeacher();
                    break;
                case 2:
                    updateTeacher();
                case 3:
                    displayAllTeacher();
                case 4:
                    model.removeTeacher();
                    break;
                case 5:
                    return;
                default:
                    System.out.print("Некорректный номер функции!");
                    break;
            }
        } while (choice != 4);
    }

    private void addTeacher() {
        System.out.print("Введите id преподавателя: ");
        String id = view.scanner.nextLine();
        System.out.print("Введите имя преподавателя: ");
        String Firstname = view.scanner.nextLine();
        System.out.print("Введите фамилию преподавателя: ");
        String LastName = view.scanner.nextLine();
        System.out.print("Введите адрес электронной почты контакта: ");
        String email = view.scanner.nextLine();
        Teacher date = new Teacher(id, Firstname, LastName, email);
        model.addTeacher();
        System.out.println("[Успешно] Информация об учителе успешно добавлена!");
    }


    private void displayAllTeacher(List<Teacher> data) {
        System.out.println("Список преподавателей:");
        for (int i = 0; i < data.size(); i++) {
            Teacher teacher = data.get(i);
            System.out.println((i + 1) + ". " + teacher.getId() + ". " + teacher.getFirstName() + ". " + teacher.getLastName()
                    + " (" + teacher.getEmail() + ")");
        }
    }


    private void updateTeacher(ArrayList<Teacher> teaList, Scanner sc) {
        System.out.println("Введите идентификатор учителя, который нужно изменить:");

        int teaId = 0;
        for (Teacher teacher : teaList) {
            Scanner scanner = new Scanner();
            teaId = scanner.nextInt();

            // Запрос

            System.out.println("[Результат запроса] Информация об учителе будет изменена:");

            System.out.println("Введите новое имя учителя (сохраните исходное значение и введите 0):");
            String newFirstName = scanner.next();
            System.out.println("Введите новую фамилию учителя (сохраните исходное значение и введите 0):");
            String newLastName = scanner.next();
            System.out.println("Введите новый email учителя (сохраните исходное значение и введите 0):");
            String newEmail = scanner.next();
            System.out.println("Введите новый id учителя (сохраните исходное значение и введите 0):");
            String newId = scanner.next();
            if (!"0".equals(newFirstName)) {
                teacher.setFirstName(newFirstName);
            }
            if (!"0".equals(newLastName)) {
                teacher.setLastName(newLastName);
            }
            if (!"0".equals(newEmail)) {
                teacher.setEmail(newEmail);
            }
            if (!"0".equals(newId)) {
                teacher.setId(newId);
            }

            System.out.println("[Успешно] Информация об учителе была успешно изменена!");
            return;

        System.out.println("[Ошибка] ID учителя:" + teaId + " не нашли!");



        private void removeTeacher() {
            int contactNumber = view.getUserChoice() - 1;
            if (contactNumber >= 0 && contactNumber < model.getData().size()) {
                Teacher dateToRemove = model.getData().get(contactNumber);
                model.removeTeacher(dateToRemove);
            }
        }
