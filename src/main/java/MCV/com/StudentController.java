package MCV.com;

public class StudentController {

    private StudentModel model;
    private StudentView view;

    public StudentController(StudentModel model, StudentView view){
        this.model = model;
        this.view = view;
    }

    public void setStudentName(String name){
        model.setName(name);
    }

    public String getStudentName(){
        return model.getName();
    }

    public void setLesson(String lesson){
        model.setLesson(lesson);
    }

    public String getLesson(){
        return model.getLesson();
    }

    public void updateView(){
        view.printStudentInfo(model.getName(), model.getLesson());
    }
}
