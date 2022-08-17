package javapriorityqueue;
// In computer science, a priority queue is an abstract data type
// which is like a regular queue,
// but where additionally each element has a "priority" associated with it.
// In a priority queue, an element with high priority is served
// before an element with low priority.
import java.util.*;

class Student implements Comparable<Student> {
    String name = new String();
    double cgpa;
    int id;
    public Student(String name, double cgpa, int id) {
        this.name = name;
        this.cgpa = cgpa;
        this.id = id;
    }
    public String getName() {
        return this.name;
    }
    public int compareTo(Student s) {
        if (cgpa == s.cgpa) {
            if (name.compareTo(s.name) == 0) {
                if (id == s.id) {
                    return 0;
                }
                else if (id > s.id) {
                    return 1;
                }
                else {
                    return -1;
                }
            }
            else {
                return name.compareTo(s.name);
            }
        }
        else if (cgpa > s.cgpa) {
            return -1;
        }
        else {
            return 1;
        }
    }
}

class Priorities {
    public ArrayList<Student> getStudents(List<String> events) {
        int n = events.size();
        PriorityQueue<Student> pq = new PriorityQueue<Student>();
        for (String i : events) {
            String[] s = new String[4];
            s = i.split("\\s");
            if (s.length > 1) {
                pq.add(new Student(s[1], Double.valueOf(s[2]), Integer.valueOf(s[3])));
            }
            else {
                pq.poll();
            }
        }
        while (pq.size() > 1) {
            System.out.println(pq.poll().name);
        }
        return new ArrayList<Student>(pq);
    }
}

public class Main {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        Priorities priorities = new Priorities();
        int totalEvents = Integer.parseInt(in.nextLine());
        List<String> events = new ArrayList<>();

        while (totalEvents-- != 0) {
            String event = in.nextLine();
            events.add(event);
        }
        List<Student> students = priorities.getStudents(events);
        if (students.isEmpty()) {
            System.out.println("EMPTY");
        }
        else {
            for (Student st : students) {
                System.out.println(st.getName());
            }
        }
    }
}