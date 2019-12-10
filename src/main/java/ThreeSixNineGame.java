public class ThreeSixNineGame {
    public String claps(int i) {
        String result = "";
        int remainder = (i > 10)? i % 10: i;
        if (remainder > 0 && remainder % 3 == 0) {
            result = "O";
        } else {
            result = "X" ;
        }

        if (i/10 > 0) {
            remainder = i/10;
            if (remainder > 0 && remainder % 3 == 0)
                result = "O" + result ;
            else
                result = "X" + result;
        }

        return result;
    }
}
