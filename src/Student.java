public class Student {

  // POJO class
  private String studentID;
  private String name;
  private double cgpa;

  public Student() {}

  public Student(String studentID, String name, double cgpa) {
    this.studentID = studentID;
    this.name = name;
    this.cgpa = cgpa;
  }

  public String getStudentID() {
    return studentID;
  }

  public String getName() {
    return name;
  }

  public double getCgpa() {
    return cgpa;
  }

  public void setStudentID(String studentID) {
    this.studentID = studentID;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setCgpa(double cgpa) {
    this.cgpa = cgpa;
  }

  public String toString() {
    return "ID: " + studentID + " | Name: " + name + " | cgpa: " + cgpa;
  }
}
