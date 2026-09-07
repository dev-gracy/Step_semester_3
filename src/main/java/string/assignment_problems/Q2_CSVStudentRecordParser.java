package string.assignment_problems;

public class Q2_CSVStudentRecordParser {

    public static void parseStudentRecord(String csvLine) {
        String[] fields = csvLine.split(",");

        if (fields.length != 3) {
            System.out.println("Invalid Record");
            return;
        }

        System.out.println(
            "Name: " + fields[0]
            + " | Roll No: " + fields[1]
            + " | Dept: " + fields[2]
        );
    }

    public static void main(String[] args) {
        String csvLine = "Gracy Gupta,RA2511026011554,CSE";

        parseStudentRecord(csvLine);
    }
}