package introductionJava.lessons.lesson11;

public class Lesson10_1_Person {

    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    /**
     * Somethomg
     * @param age
     */
    public void setAge(int age) {
        boolean isCorrect = age > 0 && age < 100;
        this.age = isCorrect ? age : 0;
    }

    public boolean isTeen() {
        return age > 12 && age < 20; // а если 10 годитов - он не подросток.. ну да в принципе
    }

    public String getFullName() {
        if (firstName == null && lastName == null) {
            return "";
        }
        if (firstName == null || firstName.isEmpty()) {
            return lastName;
        } else if (lastName == null) {
            return firstName;
        } else {
            return firstName + " " + lastName;
        }
    }

    public static void main(String[] args) {
        Lesson10_1_Person per = new Lesson10_1_Person();
        per.setAge(10);
    }
}
