public class DCP2 {

    public int[] getProductArr(int[] arr) {
        int[] productArr = new int[arr.length];
        int num = 1;

        for (int i=0; i<arr.length; i++) {
            productArr[i] = num;
            num *= arr[i];
        }

        num = 1;

        for (int i=arr.length-1; i>=0; i--) {
            productArr[i] *= num;
            num *= arr[i];
        }

        return productArr;
    }
}
