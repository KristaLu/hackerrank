package datastructures;

import java.util.*;

public class JavaPriorityQueue {
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();

    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());
        List<String> events = new ArrayList<>();

        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }

        List<Student> students = priorities.getStudents(events);

        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st: students) {
                System.out.println(st.getName());
            }
        }
    }
}


class Priorities {
    public List<Student> getStudents(List<String> events) {
        PriorityQueue<Student> queue = new PriorityQueue<>();
        List<Student> students = new ArrayList<Student>();

        for (String e : events) {
            Scanner in = new Scanner(e);
            String event = in.next();
            if (event.equals("ENTER")) {
                String name = in.next();
                double cgpa = in.nextDouble();
                int id = in.nextInt();

                Student student = new Student(id, name, cgpa);
                queue.add(student);
            } else if (event.equals("SERVED")) {
                Student first = queue.poll();
            }
            in.close();
        }
        Student first = queue.poll();
        if (first == null) {
            return students;
        } else {
            while (first != null) {
                students.add(first);
                first = queue.poll();
            }
            return students;
        }
    }
}