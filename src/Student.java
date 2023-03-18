public class Student {
    String name;
    String stuNo;

    String classes ;
    Course fizik;
    Course matematik ;
    Course biyoloji ;

    double generalAvarage ;
    boolean isPass;


    Student(String name,String stuNo,String classes,Course c1 ,Course c2 ,Course c3){
        this.name=name;
        this.stuNo=stuNo;
        this.classes=classes;
        this.fizik=c1;
        this.matematik=c2;
        this.biyoloji=c3;
        calcAvarage();
        this.isPass=false;

    }
    public void addBulkExamNote(int c1Note,int c1QuizNote , int c2Note,int c2QuizNote,int c3Note,int c3QuizNote){
        if (c1Note>=0 && c1Note<=100 || c1QuizNote>=0 && c1QuizNote<=100 ){
            this.fizik.note=c1Note;
            this.fizik.quiznote=c1QuizNote;
        }
        if (c2Note>=0 && c2Note<=100|| c2QuizNote>=0 && c2QuizNote<=100){
            this.matematik.note=c2Note;
            this.matematik.quiznote=c2QuizNote;

        }if (c3Note>=0 && c3Note<=100 || c3QuizNote>=0 && c3QuizNote<=100){
            this.biyoloji.note=c3Note;
            this.biyoloji.quiznote=c3QuizNote;

        }




    }
    public  void calcAvarage(){
       this.generalAvarage=(((fizik.note*0.8)+(fizik.quiznote*0.2)+(matematik.note*0.8)+(matematik.quiznote*0.2)+(biyoloji.note*0.8)+(biyoloji.quiznote*0.2))/3);
    }

    public void isPass() {
        if (fizik.note == 0 || fizik.quiznote == 0 || matematik.note == 0.0 || matematik.quiznote == 0.0||biyoloji.note == 0.0 ||biyoloji.quiznote == 0.0 ){
            System.out.println("Sisteme henüz not girilmemiştir.");
        }else{
            this.isPass=isCheckPass();
            printNote();
            System.out.println("Ortalamanız : "+ " " + this.generalAvarage);
        }if (this.isPass){
            System.out.println("TEBRİKLER BU YILI BAŞARIYLA TAMAMLADINIZ!");
        }else{
            System.out.println("Ortalamanız geçer notun altında.Sınıfta kaldınız...");
        }
    }

    public boolean isCheckPass(){
        calcAvarage();
        return this.generalAvarage>55.0;
    }


    public void printNote(){
        System.out.println("====================================");
        System.out.println("Öğrenci Adı Soyadı :"+ this.name);
        System.out.println("Fizik Sınav Notu: "+this.fizik.note+" " +"\n"+"Fizik Quiz Notu : "+this.fizik.quiznote);
        System.out.println("Matematik Sınav Notu: "+this.biyoloji.note+" " +"\n"+"Matematik Quiz Notu : "+this.matematik.quiznote);
        System.out.println("Biyoloji Sınav Notu: "+this.biyoloji.note+" " +"\n"+"Biyoloji Quiz Notu : "+this.biyoloji.quiznote);
    }
}

