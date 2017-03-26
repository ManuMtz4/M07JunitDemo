package m07junitdemo1;

/**
 * @author manuel y angel
 */
public class JunitDemo1 {

    private char[] badChart;

    public JunitDemo1() {
        this.badChart = new char[]{'b', 'a', 'd', 'c'};
    }

    public char[] getBadChart() {
        return badChart;
    }

    public void bubbleSort() {
        for (int i = 0; i < badChart.length; i++) {
            for (int j = i; j < badChart.length; j++) {
                if (badChart[j] < badChart[i]) {
                    char tmpChar = badChart[j];
                    badChart[j] = badChart[i];
                    badChart[i] = tmpChar;
                }
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
}
