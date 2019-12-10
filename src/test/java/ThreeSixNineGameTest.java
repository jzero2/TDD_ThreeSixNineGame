import org.junit.jupiter.api.BeforeEach;
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
        assertThat(game.claps(1), is("X"));
    }

}