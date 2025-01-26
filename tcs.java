import java.util.*;

class Main {
    private int courseId;
    private String courseName;
    private String courseAdmin;
    private int quiz;
    private int handson;

    public void setcourseId(int courseId) {
        this.courseId = courseId;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setcourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setcourseAdmin(String courseAdmin) {
        this.courseAdmin = courseAdmin;
    }

    public String getCourseAdmin() {
        return courseAdmin;
    }

    public void setquiz(int quiz) {
        this.quiz = quiz;
    }

    public int getquiz() {
        return quiz;
    }

    public void sethandson(int handson) {
        this.handson = handson;
    }

    public int gethandson() {
        return handson;
    }

    public Main(int courseId, String courseName, String courseAdmin, int quiz, int handson) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.courseAdmin = courseAdmin;
        this.quiz = quiz;
        this.handson = handson;
    }
}

class courseProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Main a[] = new Main[4];

        // Input course details
        for (int i = 0; i < 4; i++) {
            int courseId = sc.nextInt();
            sc.nextLine();
            String courseName = sc.nextLine();
            String courseAdmin = sc.nextLine();
            int quiz = sc.nextInt();
            int handson = sc.nextInt();
            sc.nextLine();
            Main obj = new Main(courseId, courseName, courseAdmin, quiz, handson);
            a[i] = obj;
        }

        // Input filters
        String value = sc.nextLine();
        int value1 = sc.nextInt();

        // Find average quiz score by admin
        int res = findAvgOfQuizByAdmin(a, value);
        if (res > 0) {
            System.out.println(res);
        } 
        else {
            System.out.println("No course found");
            Main a1[] = sortCourseByHandson(a);

            // Check for courses with handson < value1
            int count = 0;
            for (int i = 0; i < a1.length; i++) {
                if (a1[i].gethandson() < value1) {
                    count++;
                }
            }

            if (count > 0) {
                for (int i = 0; i < a1.length; i++) {
                    if (a1[i].gethandson() < value1) {
                        System.out.println(a1[i].getCourseName());
                    }
                }
            } else {
                System.out.println("No course found with mentioned attributes");
            }
        }
       
    }

    public static int findAvgOfQuizByAdmin(Main a[], String value) {
        int sum = 0, count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i].getCourseAdmin().equalsIgnoreCase(value)) {
                sum += a[i].getquiz();
                count++;
            }
        }

        if (count > 0) {
            return sum / count;
        } else {
            return 0;
        }
    }

    public static Main[] sortCourseByHandson(Main a1[]) {
        for (int i = 0; i < a1.length; i++) {
            for (int j = 0; j < a1.length - i - 1; j++) {
                if (a1[j].gethandson() > a1[j + 1].gethandson()) {
                    Main temp = a1[j];
                    a1[j] = a1[j + 1];
                    a1[j + 1] = temp;
                }
            }
        }
        return a1;
    }
}
