import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;



public class StudentImplUsingHashSet {
    public static void main(String[] args) {
        StudentImplUsingHashSet studentImplUsingHashSet = new StudentImplUsingHashSet();
        Set<Student> students = studentImplUsingHashSet.createSet();
        studentImplUsingHashSet.display(students);
        boolean result = studentImplUsingHashSet.removeByRollNo(students,99);
        if(result){
            System.out.println("Student Deleted");
        }else {
            System.out.println("Student not Found");
        }
        studentImplUsingHashSet.display(students);
    }
    public Set<Student> createSet(){
        Set<Student> students = new HashSet<>();
        students.add(new Student("Rishabh",30,100));
        students.add(new Student("Rohit",52,80));
        students.add(new Student("suresh",42,53));
        return  students;
    }
    public  void display(Set<Student> students){
        Iterator <Student> iterator = students.iterator();
        while(iterator.hasNext()){
            System.out.println("iterator.next() = " + iterator.next());

        }
    }

    public boolean removeByRollNo(Set<Student> students,int rollNo){
        boolean respond = false;
        Iterator<Student> iterator = students.iterator();
        while ((iterator.hasNext())){
            if(iterator.next().getRollNo() == rollNo){
                iterator.remove();
                respond = true;
                break;
            }
        }

        return respond;

    }

}
