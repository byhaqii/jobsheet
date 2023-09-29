import java.util.Scanner;

public class Selection219 {
    public static void main(String[] args) {
        Scanner input19 = new Scanner(System.in);
        System.out.print("Nilai uas         : ");
        float finalExam = input19.nextFloat();
        System.out.print("Nilai uts         : ");
        float midExam = input19.nextFloat();
        System.out.print("Nilai kuis        : ");
        float quiz = input19.nextFloat();
        System.out.print("Nilai tugas       : ");
        float assignment = input19.nextFloat();
        float total = (finalExam * 0.4F) + (midExam * 0.3F) + (quiz * 0.1F) + (assignment * 0.2F);

        if (total > 80 && total <= 100)
            System.out.print("Predikat A Sangat Baik");
        else if (total > 73 && total <= 80)
            System.out.print("Predikat B+ Lebih dari Baik");
        else if (total > 65 && total <= 73)
            System.out.println("Predikat B Baik");
        else if (total > 60 && total <= 65)
            System.out.print("Predikat C+ Lebih dariCukup");
        else if (total > 50 && total <= 60)
            System.out.print("Predikat C Cukup");
        else if (total > 39 && total <= 50)
            System.out.print("Predikat D Kurang");
        else
            System.out.println("Predikat E GAGAL");
    }
}