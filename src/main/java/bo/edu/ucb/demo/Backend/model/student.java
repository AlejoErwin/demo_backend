package bo.edu.ucb.demo.Backend.model;
import javax.persistence.*;
@Entity
public class student {
    //public Integer studentId;
    //public String fullName;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Autoincrement
    @Column(name = "student_id")
    @Basic(optional = false)
    private Integer studentId;
    @Column(name = "full_name")
    @Basic(optional = false)
    private String fullName;
    @Column(name = "age")
    private Integer age;
    public student() {

    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }


    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }


    @Override
        public String toString() {
            return "Student{" +
                    "studentId=" + studentId +
                    ", fullName='" + fullName + '\'' + 
                    ", age='" + age + '\'' +
                    

                    '}';
    }
}
