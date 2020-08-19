public class BinaryGap {

    public static int solution(int N){
        String binaryRepresentation = Integer.toBinaryString(N);
        int longestBinaryGap = 0;
        int currentBinaryGap = 0;

        for (int i = 0; i < binaryRepresentation.length(); i++) {
            char caracter = binaryRepresentation.charAt(i);

            if(caracter == '0'){
                currentBinaryGap++;
            } else {
                if(currentBinaryGap > longestBinaryGap){
                    longestBinaryGap = currentBinaryGap;
                }
                currentBinaryGap = 0;
            }
        }

        return longestBinaryGap;
    }

    public static void main(String[] args) {
        int binaryGap = solution(32 );

        System.out.println(binaryGap);
    }
}
