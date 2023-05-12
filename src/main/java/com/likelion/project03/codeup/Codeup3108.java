package com.likelion.project03.codeup;

/* 문제 3108
세종이는 주말에 정보 과학실에서 정보 올림피아드 준비를 하려고 한다.
선생님은 정보 과학실 사용 조건으로 정보 올림피아드 참가 학생 명단을 작성하는 프로그램을 작성하라고 하셨다.
짖굳은 선생님은 입력 데이터를 만들 때 일부러 중간에 잘못된 값을 끼워 왕창 끼워 넣었다.
그리고 잘못된 데이터를 제거하는 방법을 설명해 주었다.
다음 조건에 따라 프로그램을 만들고 올바른 명단만 출력해 보자.

첫째 줄에 입력 데이터의 개수 n이 입력된다. (10 <= n <= 100)
둘째 줄부터 n+1번째 줄까지 처리 코드c(문자 1자리), 수험 번호no(1 <= no <= 10,000), 이름(10바이트 이내)이 입력된다.
처리 코드에 따라 입력 데이터를 메모리에 저장하거나 삭제해야 한다. 처리 코드가 'I'이면 데이터를 수험 번호 순서에 맞게 삽입한다.
만약 입력할 때 이미 수험 번호가 입력되어 있다면 아무 작업도 하지 않는다.
처리 코드가 ‘D’이면 메모리의 데이터 중에서 해당 수험 번호를 찾아 삭제한다.
만약 처리 코드가 'D'이고 해당 수험 번호가 존재하지 않으면 아무 작업도 하지 않는다.
마지막으로 n+2번째 줄에 올바른 데이터의 위치를 나타내는 정수 5개가 입력된다.
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student {
    private String code;
    private int testId;
    private String name;

    public Student(String code, int testId, String name) {
        this.code = code;
        this.testId = testId;
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public int getTestId() {
        return testId;
    }

    public String getName() {
        return name;
    }
}

public class Codeup3108 {

    private List<Student> students = new ArrayList<>();

    public Student makeAStudent(String code, int testId, String name){
        return new Student(code, testId, name);
    }

    // shift + 6
    private boolean isExist(Student pStudent) {
        // 중복 여부 check
        for (Student student : students){
            if(pStudent.getTestId() == student.getTestId()){
                return true;
            }
        }
        return false;
    }

    private Student getExistStudent(Student pStudent) {

        return new Student("", 0, "");
    }

    private void deleteStudent(Student pStudent) {
        // pStudent가 students에 몇번째에 있는지 알아야 함
        for (int i = 0; i < students.size(); i++) {
            if(students.get(i).getTestId() == pStudent.getTestId()){
                students.remove(i);
            }
        }
    }

    public void process(String line) {
        String[] splitted = line.split(" ");
        Student student = makeAStudent(splitted[0], Integer.parseInt(splitted[1]), splitted[2]);
        switch (student.getCode()){
            case "I" -> addAStudent(student);
            case "D" -> deleteStudent(student);
        }
    }

    private void addAStudent(Student student){
        if (!isExist(student)){
            students.add(student);
        }
    }

    private void printStudents() {
        for (Student student : students) {
            System.out.printf("%s %s %s\n", student.getCode(), student.getTestId(), student.getName());
        }
    }

    private void printSpecificStudents(int[] arr){
        // 정렬
        Collections.sort(students,new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getTestId() - o2.getTestId();
            }
        });

        // 출력
        for (int i = 0; i < arr.length; i++) {
            Student student = students.get(arr[i] - 1);
            System.out.printf("%s %s %s\n", student.getCode(), student.getTestId(), student.getName());
        }
    }

    public static void main(String[] args) {
        int size = 1;

        Codeup3108 codeup3108 = new Codeup3108();
        codeup3108.process("I 1011 한라산");
        codeup3108.process("I 999 백두산");
        codeup3108.process("I 999 오대산");
        codeup3108.process("D 999 백두산");
        codeup3108.process("I 800 백두산");
        codeup3108.process("D 500 한라산");
        codeup3108.process("I 900 남산");
        codeup3108.process("I 950 금강산");
        codeup3108.process("I 1205 지리산");
        codeup3108.process("I 700 북한산");
        codeup3108.printSpecificStudents(new int[]{1, 2, 4, 5, 6});
    }
}