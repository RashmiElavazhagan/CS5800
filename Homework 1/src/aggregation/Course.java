package aggregation;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private String courseName;
    private List<Instructor> instructorList = new ArrayList<>();
    private List<Textbook> textbookList = new ArrayList<>();

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void print() {
        System.out.println("Course name: " + courseName);
        printInstructors();
        printTextbooks();
    }

    private void printInstructors() {
        System.out.println("Instructor: ");
        for (Instructor instructor : instructorList) {
            System.out.println(instructor.getFirstName() + " " + instructor.getLastName());
        }
    }

    private void printTextbooks() {
        System.out.println("Textbook: ");
        for (Textbook textbook : textbookList) {
            System.out.println("Title: " + textbook.getBookTitle());
            System.out.println("Author: " + textbook.getAuthor());
        }
    }

    public void addInstructor(Instructor instructor) {
        instructorList.add(instructor);
    }

    public void addTextbook(Textbook textbook) {
        textbookList.add(textbook);
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }
}
