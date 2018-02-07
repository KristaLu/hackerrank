package datastructures;

import java.util.*;

public class JavaSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        List<Student> studentList = new ArrayList<Student>();
        while(testCases>0){
            int id = in.nextInt();
            String fname = in.next();
            double cgpa = in.nextDouble();

            Student st = new Student(id, fname, cgpa);
            studentList.add(st);

            testCases--;
        }

        Collections.sort(studentList,new Checker());
        for(Student st: studentList){
            System.out.println(st.getName());
        }
    }
}

class Student implements Comparable<Student>{
    private int id;
    private String name;
    private double cgpa;

    public Student(int id, String name, double cgpa) {
        super();
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public double getCgpa() {
        return cgpa;
    }

    @Override
    public int compareTo(Student o) {
        if (getCgpa()>o.getCgpa()) return -1;
        if (getCgpa()<o.getCgpa()) return 1;

        int n = getName().compareTo(o.getName());
        if (n!=0) return n;

        if (getId()<o.getId()) return -1;
        if (getId()>o.getId()) return 1;

        return 0;
    }
}

class Checker implements Comparator<Student> {
    public int compare(Student a, Student b){
        if (a.getCgpa()>b.getCgpa())
            return -1;
        else if (a.getCgpa()<b.getCgpa())
            return 1;
        else{
            if (a.getName().equals(b.getName())){
                if (a.getId()>b.getId())
                    return -1;
                else
                    return 1;
            }
            else
                return a.getName().compareTo(b.getName());

        }
    }
}