public class Course {
    Teacher teacher;
    String name;
    short code;
    String prefix;
    int note ;
    int quiznote;


    Course(String name,short code ,String prefix){
        this.name=name;
        this.code=code;
        this.prefix=prefix;
        this.teacher=teacher;
        this.note=0;
        this.quiznote=0;

    }
    public void  addTeacher(Teacher t){

        if (this.prefix.equals(t.branch)){
            this.teacher=t;

        }else{
            System.out.println(t.name+" "+"Akademisyeni bu ders branşına uygun değil...");
        }
    }

    public void  printTeacher(Teacher teacher){
        System.out.println("Akademisyen Adı :"+ teacher.name);
        System.out.println("Akademisyen Branşı :"+ teacher.branch);
        System.out.println("Akademisyen İletişim Numarası :"+teacher.mpno );

    }

}
