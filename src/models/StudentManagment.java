package models;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class StudentManagment implements Managment<Etudiant> {

    public   void displayStudents(List<Etudiant> etudiants,
                                  Consumer<Etudiant> con){
        for (Etudiant etudiant : etudiants) {
            con.accept(etudiant);


    }
    }


    public  void displayStudentsByFilter(List<Etudiant> etudiants, Predicate<Etudiant> pre, Consumer<Etudiant> con){

        for (Etudiant etudiant : etudiants) {
            if (pre.test(etudiant)) {
                con.accept(etudiant);
            }
        }


    }


    public     String returnStudentsNames(List<Etudiant> etudiants, Function<Etudiant, String> fun){

        StringBuilder noms = new StringBuilder();
        for (Etudiant etudiant : etudiants) {
            noms.append(fun.apply(etudiant)).append(", ");
        }
        return noms.toString();



    }

    public  Etudiant createStudent(Supplier<Etudiant> sup){
        return sup.get();

    }


    public     List<Etudiant> sortStudentsById(List<Etudiant> etudiants, Comparator<Etudiant> com){

        List<Etudiant> sortedList = new ArrayList<>(etudiants);
        sortedList.sort(com);
        return sortedList;


    }


    public Stream<Etudiant> convertToStream(List<Etudiant> etudiants){

        return etudiants.stream();

    }


}
