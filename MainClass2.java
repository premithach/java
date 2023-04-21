/* 2. Create three classes Named Student, Teacher, Parents. Student and Teacher class inherits Thread class and Parent class 
implements Runnable interface. These three classes have run methods with statements. The task of the teacher class of the first 
assignment has to be synchronized. Similarly, the other two classes should have run methods with few valid statements under 
synchronized.  */

class Student extends Thread {
    public void run() {
        synchronized (System.out) {
            System.out.println("Student is attending class.");
        }
    }
}

class Teacher extends Thread {
    public void run() {
        synchronized (System.out) {
            System.out.println("Teacher is giving an assignment.");
            
        }
    }
}

class Parent implements Runnable {
    public void run() {
        synchronized (System.out) {
            System.out.println("Parent is attending a parent-teacher conference.");
                  }
    }
}
class MainClass2{
    public static void main(String[] args) {
        Student o1 = new Student();
        Teacher o2 = new Teacher();
        Parent o3 = new Parent();

        o1.start();
        o2.start();
        o3.run();
    }
}

