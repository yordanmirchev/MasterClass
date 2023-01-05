package oop1;

public class Student {

    private String id;
    private String name;
    private String dateOfBirth;
    private String classList;

    public Student(String id, String name, String dateOfBirth, String classList) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.classList = classList;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getClassList() {
        return classList;
    }

    public void setClassList(String classList) {
        this.classList = classList;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", classList='" + classList + '\'' +
                '}';
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            Student s = new Student("Sid_" + i,
                    switch (i) {
                        case 1 -> "Amy";
                        case 2 -> "Bobi";
                        case 3 -> "Carol";
                        case 4 -> "David";
                        case 5 -> "Emily";
                        default -> "Anonymous";
                    },
                    "01." + "O" + i + ".1985",
                    "JavaMasterClass");

            System.out.println(s);
        }

    }

}


