public class Controller {
    private Student[]allStudents;
    private int numOfStudent;

    public Controller() {
        allStudents=new Student[10];
        numOfStudent=0;
    }
    public boolean addNewStudent(int id, String fName, String lName, int registrationYear)
    {
        if (numOfStudent<allStudents.length)
        {
        Student s= new Student(id,fName,lName,registrationYear);
        allStudents[numOfStudent]=s;
        numOfStudent++;
        return true;}
        else return false;
    }
    public Student[] viewAllStudent()
    {
        return allStudents;
    }
    public Student searchForStudent(int id )
    {
        int i=0;
        boolean found=false;
        while (!found&&i<allStudents.length)
        {
            if (allStudents[i]!=null)
            {
                if (allStudents[i].getId()==id)
                    found=true;
                else i++;
            }
            else
                i++;
        }
        if (i<allStudents.length)
            return allStudents[i];
        else
            return null;
    }
}
