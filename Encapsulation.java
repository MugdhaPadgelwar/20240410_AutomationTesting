package aspire;

public class Encapsulation {

	public static void main(String[] args) {
		// Creating an object of the Student class
        Student student = new Student("John", 20, "Computer Science");

        // Accessing private attributes using getter methods
        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
        System.out.println("Department: " + student.getDepartment());

        // Modifying private attributes using setter methods
        student.setName("Alice");
        student.setAge(22);
        student.setDepartment("Electrical Engineering");

        // Displaying student information using displayInfo method
        student.displayInfo();
		
	}
	 // Student class
    static class Student {
        // Private attributes (data)
        private String name;
        private int age;
        private String department;

        // Constructor
        public Student(String name, int age, String department) {
            this.name = name;
            this.age = age;
            this.department = department;
        }

        // Getter methods to access private attributes
        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public String getDepartment() {
            return department;
        }

        // Setter methods to modify private attributes
        public void setName(String name) {
            this.name = name;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public void setDepartment(String department) {
            this.department = department;
        }

        // Method to display student information
        public void displayInfo() {
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Department: " + department);
        }
    }

}
