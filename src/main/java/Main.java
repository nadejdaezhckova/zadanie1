public class Main {
    public static void main(String[] arg) {
        Student a = new Student("Иван", "Ежков", "ТМС122", 5);
        Aspirant b = new Aspirant("Ксения", "Цветкова", "АДТ221", 4, "Дружба");
        Student c = new Aspirant("Владислав", "Зайцев", "ПСО321", 3.5, "Жвачка");
        Student[] students = { a, b, c };
        for (Student s : students)
            System.out.println(s.getScholarship());
    }
}
