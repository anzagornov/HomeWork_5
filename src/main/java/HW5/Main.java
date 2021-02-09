package HW5;

public class Main {

    public static void main(String[] args) {

        Employee[] persArray = new Employee[5];

        persArray[0] = new Employee("Иван Иванов", "Маркетолог", "ivanov@mail.ru", 89261234567l, 50000, 40);
        persArray[1] = new Employee("Сергей Сергеев", "Разработчик", "sergeev@yandex.ru", 89621234567l, 55000, 25);
        persArray[2] = new Employee("Петр Петров", "Сео-оптимизатор", "petrov@gmail.com", 89991234567l, 45000, 41);
        persArray[3] = new Employee("Семен Семенов", "СММ-специалист", "semenov@mail.ru", 89871234567l, 50000, 26);
        persArray[4] = new Employee("Дмитрий Дмитриев", "Начальник отдела маркетинга", "semenov@mail.ru", 89101234567l, 50000, 50);

        for (int i = 0; i < persArray.length; i++) {
            if (persArray[i].getAge() >= 40) {
                persArray[i].info();
            }
        }
    }
}