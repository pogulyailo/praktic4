public class task4_1 {
    public static void main(String[] args) {
        int[] a = {7, 60, 11, -25};


        System.out.println(maxIndex(a));
        System.out.println(maxValue(a));
        // -1 -2 -5 -100 -20
    }


    static int maxValue (int[] a){
        return a[maxIndex(a)];
    }
    static int maxIndex( int[] a){
            int max = a[0];
            int maxIn = 0;

            for (int i = 0; i < a.length; i++) {
                if (a[i] > max) {
                    max = a[i];
                    maxIn = i;
                }
            }

            return maxIn;
        }
    }