package _168_excelSheetColumnTitle;

// https://leetcode.com/problems/excel-sheet-column-title/

public class ExcelSheetColumnTitle {
    public String convertToTitle(int columnNumber) {
        // in Excel sheet we have 26 different characters
        // which is in turn the base
        StringBuilder sb = new StringBuilder();
        int n = columnNumber;
        while (n > 0) {
            n--;
            sb.insert(0, (char) ('A' + n % 26));
            n /= 26;
        }
        return sb.toString();
    }
}
