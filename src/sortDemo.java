public class sortDemo {
    //  此文件为排序算法文件
    public static void main(String[] args) {
        bubbleSort();

    }
    public static void bubbleSort(){
        // 此算法为冒泡排序算法
        int[] arrs = {2,5,2,2,9,6};
        for (int i=1;i< arrs.length;i++){
            for (int j=1;j<=arrs.length-i;j++){
                if (arrs[j-1]>arrs[j]){
                    int temp = arrs[j-1];
                    arrs[j-1] = arrs[j];
                    arrs[j] = temp;

                }
            }
        }
        for (int i:arrs){
            System.out.println(i);
        }
    }
}
