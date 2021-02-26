import java.util.Arrays;

/*
In academia, the h-index is a metric used to calculate the impact of a researcher's papers. It is calculated as follows:

A researcher has index h if at least h of her N papers have h citations each. If there are multiple h satisfying this formula, the maximum is chosen.

For example, suppose N = 5, and the respective citations of each paper are [4, 3, 0, 1, 5]. Then the h-index would be 3, since the researcher has 3 papers with at least 3 citations.

Given a list of paper citations of a researcher, calculate their h-index.
 */
public class DCP605 {

    public static void main(String[] args) {

        int[] arr = {4, 3, 0, 1, 5};

        DCP605 dcp605 = new DCP605();
        dcp605.hIndex(arr);

    }

    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int len = citations.length;
        for(int i = 0; i < len; i++){
            if(citations[i] >= len - i)
                return len - i;

        }
        return 0;
    }



}
