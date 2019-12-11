public class ThreeSixNineGame {
    public String claps(int i) {
        int remainder = i % 10;
        String result = (remainder > 0 && remainder % 3 == 0)? "O" : "X";
        if (i/10 > 0) {
            result = claps(i/10) + result;
        }
        return result;
    }
}
