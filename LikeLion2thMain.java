package week3_day2_1005_Collection_List;

import java.util.List;

public class LikeLion2thMain {

    public static void main(String[] args) {

        LikeLion2th likeLion2th = new LikeLion2th();
        List<String> students = likeLion2th.getStudentList();

        for(String student : students) {
            System.out.println(student);
        }
    }
}
