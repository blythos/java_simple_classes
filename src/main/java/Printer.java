public class Printer {


    private int sheets;
    private int toner;

    public Printer(int sheets, int toner){
        this.sheets = sheets;
        this.toner = toner;
    }

    public int getSheets() {
        return sheets;
    }

    public void printCopies(int pages, int copies) {
        int total = pages * copies;
        if (total <= this.sheets && total <= this.toner){
            this.sheets -= total;
            this.toner -= total;
        }
    }
}
