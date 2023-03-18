public class Teacher {
    String name;
    String branch;
    String mpno;

    Teacher(String name,String branch,String mpno){
        this.name= name;
        this.branch=branch;
        this.mpno=mpno;
    }
    public void printTeacherInfo(){
        System.out.println("Akademisyen Adı : "+ " "+ this.name);
        System.out.println("Akademisyen Branşı : "+ " "+ this.branch);
        System.out.println("Akademisyen İletişim Numarası : "+ " "+ this.mpno );
    }
}
