

public class mark {

    static class Student {
        String name, dept;
        int regNo;
        int maths, physics, chemistry;
        Student(String n, int r, String d) {
            name = n;
            regNo = r;
            dept = d;
        }
        int getMaths() {
            return maths;
        }
        int getPhysics() {
            return physics;
        }

        int getChemistry() {
            return chemistry;
        }

        void setMaths(int m) {
            maths = m;
        }

        void setPhysics(int p) {
            physics = p;
        }

        void setChemistry(int c) {
            chemistry = c;
        }
        void updateMarks(int m) {
            maths = m;
        }

        void updateMarks(int m, int p) {
            maths = m;
            physics = p;
        }

        void updateMarks(int m, int p, int c) {
            maths = m;
            physics = p;
            chemistry = c;
        }

        void show() {
            System.out.println(name + " " + regNo + " " + dept);
            System.out.println(maths + " " + physics + " " + chemistry);
            System.out.println("------------");
        }
    }
    public static void main(String[] args) {
        Student s1 = new Student("Arun", 101, "CSE");
        Student s2 = new Student("Bala", 102, "ECE");
        Student s3 = new Student("Charan", 103, "MECH");
        s1.updateMarks(80, 85, 90);
        s2.setMaths(70);
        s2.setPhysics(75);
        s2.setChemistry(65);
        s3.updateMarks(88);
        s1.show();
        s2.show();
        s3.show();
    }
}

