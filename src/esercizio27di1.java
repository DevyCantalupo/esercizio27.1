import java.util.ArrayList;
import java.util.List;

class esercizio27di1 {
    public static void main(String[] args) {
        List<Student> listStudent = new ArrayList<>();
        System.out.println("la lista vacia: " + listStudent);


        Student st1 = new Student("Franco", 27);
        Student st2 = new Student("Carolina", 17);
        Student st3 = new Student("Magdelys", 26);
        Student st4 = new Student("Liz", 24);

        listStudent.add(st1);
        listStudent.add(st2);
        listStudent.add(st3);
        listStudent.add(st4);
        System.out.println("la lista ordenada: " + listStudent);

    }
}