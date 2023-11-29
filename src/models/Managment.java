package models;

import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;


public interface Managment<Student> {


    public   void displayStudents(List<Student> students,
                         Consumer<Student> con);
    public  void displayStudentsByFilter(List<Student> students, Predicate<Student> pre, Consumer<Student> con);
    public     String returnStudentsNames(List<Student> students, Function<Student, String> fun);
    public  Student createStudent(Supplier<Student> sup);
    public     List<Student> sortStudentsById(List<Student> students, Comparator<Student> com);
    public Stream<Student> convertToStream(List<Student> students);


}
