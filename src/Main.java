public class Main {
    public static void main(String[] args) {
        Teacher t =new Teacher("Mesut Mesut","FZK","1111");
        Teacher t1 = new Teacher("Ahmet Mehmet","MAT","2222");
        Teacher t2 = new Teacher("Halil İbrahim ","BIO","3333");

        Course fizik = new Course("Fizik", (short) 101,"FZK");
        Course matematik = new Course("Matematik",(short) 102,"MAT");
        Course biyoloji = new Course("Biyoloji",(short) 103,"BIO");


        fizik.addTeacher(t);
        matematik.addTeacher(t1);
        biyoloji.addTeacher(t2);

        Student s1= new Student("Şakir Aslan ","123","4",fizik,matematik,biyoloji);

        s1.addBulkExamNote(100,70,60,80,90,100);
        s1.isPass();
        Student s2 = new Student("Cabbar Halledecek","456","3",fizik,matematik,biyoloji);

        s2.addBulkExamNote(85,75,89,78,95,100);
        s2.isPass();
        Student s3 = new Student("Burak Cengo","789","2",fizik,matematik,biyoloji);

        s3.addBulkExamNote(68,80,79,89,75,100);
        s3.isPass();



    }


}