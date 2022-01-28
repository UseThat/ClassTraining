public class Company {
    public static void main(String[] args) {
        Employee[] empl = new Employee[3];

        empl[0] = new Employee("Mateusz", "Wygoda", 1990, 4);
        empl[1] = new Employee("Marek", "Wygoda", 1994, 2);
        empl[2] = new Employee("Wiesiek", "Wygoda", 1996, 6);

        for (Employee obj :
                empl) {
            obj.printInformation();
        }

    }
}
