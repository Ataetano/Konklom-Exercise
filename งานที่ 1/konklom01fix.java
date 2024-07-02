public class test11 {
    public static void main(String[] args) {
//        // ข้อที่ 1
//        String rows = "";
//        int inputNumber = 5;
//        for (int i = 0; i < inputNumber; i++){
//            rows += "*";
//            System.out.println(rows);
//        }
        // ข้อที่ 2
//        int inputNumber = 5;
//        int spaceLimiter = inputNumber - 1;
//        for (int i = 0; i < inputNumber; i++){
//            String rows = "";
//            for (int j = 0; j < spaceLimiter; j++){
//                rows += " ";
//            }
//            for (int k = 0; k < inputNumber - spaceLimiter; k++) {
//                rows += "*";
//            }
//            System.out.println(rows);
//            spaceLimiter -= 1;
//        }
        // ข้อที่ 3
        int inputNumber = 5;
        int spaceLimiter = inputNumber - 1;
        int leftStarLimiter = inputNumber - 1;
        for (int i = 0; i < 2*inputNumber - 1; i++){
            String rows = "";
            if (i < inputNumber) {
                for (int j = 0; j < spaceLimiter; j++) {
                    rows += " ";
                }
                for (int k = 0; k < inputNumber - spaceLimiter; k++) {
                    rows += "*";
                }
                if (i > 0) {
                    for (int l = 0; l < inputNumber - leftStarLimiter; l++) {
                        rows += "*";
                    }
                    leftStarLimiter -= 1;
                }
                System.out.println(rows);
                spaceLimiter -= 1;
            }
            else {
                if (i == inputNumber){
                    spaceLimiter += 1;
                    leftStarLimiter += 1;
                }
                spaceLimiter += 1;
                for (int j = 0; j < spaceLimiter; j++) {
                    rows += " ";
                }
                for (int k = 0; k < inputNumber - spaceLimiter; k++) {
                    rows += "*";
                }
                if (i > 0) {
                    leftStarLimiter += 1;
                    for (int l = 0; l < inputNumber - leftStarLimiter; l++) {
                        rows += "*";
                    }
                }
                System.out.println(rows);
            }
        }
        // ข้อที่ 4
//        int inputNumber = 5;
//        int spaceLimiter = inputNumber - 1;
//        int leftStarLimiter = inputNumber - 1;
//        for (int i = 0; i < inputNumber; i++){
//            int startNumber = 1;
//            String rows = "";
//            for (int j = 0; j < spaceLimiter; j++){
//                rows += " ";
//            }
//            for (int k = 0; k < inputNumber - spaceLimiter; k++) {
//                rows += startNumber;
//                if (k < inputNumber - spaceLimiter - 1)
//                    startNumber += 1;
//            }
//            if (i > 0) {
//                for (int l = 0; l < inputNumber - leftStarLimiter; l++){
//                    startNumber -= 1;
//                    rows += startNumber;
//                }
//                leftStarLimiter -= 1;
//            }
//            System.out.println(rows);
//            spaceLimiter -= 1;
//        }
    }
}
