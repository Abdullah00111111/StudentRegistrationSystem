import java.util.Scanner;

public class View {
    Controller c;
    Scanner in;

    public View() {
        c=new Controller();
        in= new Scanner(System.in);
    }
    public void start()
    {
        System.out.println("____________________________________________");
        System.out.println("    Student Registration System");
        System.out.println("____________________________________________");
        while (true)
        {
            System.out.println("1: Add New Student \t\t2:View All Students\n" +
                    "3:Search For Student\t\t0:Exit");
            int choice=in.nextInt();
            switch (choice)
            {
                case 1:add(); break;
                case 2:view();break;
                case 3:find();break;
                case 0:System.exit(0);
            }
        }

    }
    public void add()
    {
        System.out.println("ID First Name Last Name Registration Year");
        int i=in.nextInt();
        String f=in.next();
        String l=in.next();
        int y=in.nextInt();
        boolean added=c.addNewStudent(i,f,l,y);
        if (added)
            System.out.println("added successfully");
        else System.out.println("too much students");


    }
    public void view()
    {
      Student[]all=  c.viewAllStudent();
        System.out.println("ID First Name Last Name Registration Year");
        for (int i = 0; i <all.length ; i++) {
            if (all[i]!=null)
            System.out.println(all[i].getId()+"\t"+all[i].getfName()+"\t"
            +all[i].getlName()+"\t"+all[i].getRegistrationYear());

        }

    }
    public void find()
    {
        System.out.println("input Student ID");
        int id=in.nextInt();
      Student s=  c.searchForStudent(id);
      if (s!=null)
      {        System.out.println("ID First Name Last Name Registration Year");
          System.out.println(s.getId()+"\t"+s.getfName()+"\t"
                  +s.getlName()+"\t"+s.getRegistrationYear());


      }
      else System.out.println("no student with this ID");
    }
}
