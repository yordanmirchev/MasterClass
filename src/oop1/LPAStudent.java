package oop1;

public record LPAStudent(String id, String name, String dateOfBirth, String classList) {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            LPAStudent s = new LPAStudent("Sid_" + i,
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

        Student pojoStudent = new Student("12345", "Alice", "01.01.2000", "JavaMasterClass");
        LPAStudent lpaStudent = new LPAStudent("56789", "Bob", "01.02.2023", "JavaMasterCLAss");

        System.out.println("\n");
        System.out.println(pojoStudent);
        System.out.println(lpaStudent);
        System.out.println("\n");

        pojoStudent.setClassList(pojoStudent.getClassList() + " [UPDATED]");
        // lpaStudent.setClassList(lpaStudent.getClassList() + "[UPDATED]"); --> no setters in Record, only can be changed in constructor or in the list

        System.out.println("Pojo name is takking " + pojoStudent.getClassList());
        System.out.println("Lpa name is takking  " + lpaStudent.classList());

    }
}
