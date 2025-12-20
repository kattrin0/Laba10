public class Main {
    public static void main(String[] args) {
        University university = new University();
        university.setName("Воронежский Государственный Университет");
        university.setNumderOfEmployees(600);

        Faculty faculty = new Faculty();
        faculty.setName("Факультет Компьютерных наук");

        Dean dean = new Dean();
        dean.setName("Маша Иванова");
        dean.setEmail("masha.ivanova@edu.vsu.ru");
        dean.setSocialSecurityNumber("123-45-6789");

        Institute institute = new Institute();
        institute.setName("Кафедра Программной Инженерии");
        institute.setAddress("г. Москва, Ленинский проспект, д. 1");

        ResearchAssociate ResearchAssociate = new ResearchAssociate();
        ResearchAssociate.setName("Бенедикт Камбербэтч");
        ResearchAssociate.setEmail("benedict.camberbatch@edu.vsu.ru");
        ResearchAssociate.setSocialSecurityNumber("987-65-4321");
        ResearchAssociate.setResearchArea("Искусственный интеллект");

        Course course = new Course();
        course.setId("CS101");
        course.setName("Введение в программирование");
        course.setWeeklyDuration(4);

        Lecturer lecturer = new Lecturer();
        lecturer.setName("Бенедикт Камбербэтч");
        lecturer.setEmail("benedict.camberbatch@edu.vsu.ru");
        lecturer.setSocialSecurityNumber("987-65-4321");
        lecturer.setResearchArea("Искусственный интеллект");

        Project project = new Project();
        project.setName("Разработка системы управления студентами");
        project.setStartDate(java.time.LocalDate.of(2025, 1, 15));
        project.setEndDate(java.time.LocalDate.of(2025, 6, 30));


        Participation participation = new Participation();
        participation.setHours(20);

        System.out.println("Университет: " + university.getName());
        System.out.println("Число сотрудников: " + university.getNumderOfEmployees());
        System.out.println("Факультет: " + faculty.getName());
        System.out.println("Декан: " + dean.getName());
        System.out.println("Кафедра: " + institute.getName());
        System.out.println("Научный сотрудник: " + ResearchAssociate.getName());
        System.out.println("Курс: " + course.getName());
        System.out.println("Преподаватель: " + lecturer.getName());
        System.out.println("Проект: " + project.getName());
        System.out.println("Участие: " + participation.getHours() + " часов.");
    }
}