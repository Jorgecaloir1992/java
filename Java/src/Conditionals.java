public class Conditionals {
 public static void main(String[] args) {
    int math = 6;
    int biology = 5;
    int history = 2;
    int chemistry = 4;
    int average = 0;
    average = (math + biology + history + chemistry) / 4;

    if (average >= 6){
        System.out.println("The student passed with: " + average);
    } else {
        System.out.println("The student not passed and you calification is: " + average);
    }
 }   
}
