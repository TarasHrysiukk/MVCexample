package MCV.com;

public class MCVMain {
    public static  void main (String[] args){
          StudentModel model = retrieveStudentFromDB();

          StudentView view = new StudentView();

          StudentController controller = new StudentController(model, view);
          controller.updateView();

/*Добвлення нового юзера */
        controller.setStudentName("Hrysiuk");
        controller.setLesson("Lab5Yit");
        controller.updateView();

    }

/*Дефолтний юзер*/
    private static StudentModel retrieveStudentFromDB(){
        StudentModel student = new StudentModel();
        student.setName("Taras");
        student.setLesson("YIT");

        return student;
    }
}
