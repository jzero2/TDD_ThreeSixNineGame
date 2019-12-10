import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class ThreeSixNineGameTest {
    ThreeSixNineGame game;

    @BeforeEach
    public void setUp() {
        game = new ThreeSixNineGame();
    }

    @Test
    @DisplayName("한 자리 test")
    public void claps_one_digits() {
        assertClaps(1, "X");
        assertClaps(3, "O");
        assertClaps(6, "O");
        assertClaps(8, "X");
        assertClaps(9, "O");
    }

    @Test
    @DisplayName("두 자리 test")
    public void claps_two_digits() {
        assertClaps(10, "XX");
        assertClaps(13, "XO");
    }

    @Test
    @DisplayName("세 자리 test")
    void claps_three_digits() throws Exception {
        assertClaps(133, "XOO");
        assertClaps(100, "XXX");
        assertClaps(369, "OOO");
    }

    private void assertClaps(int i, String x) {
        assertThat(game.claps(i), is(x));
    }

}
