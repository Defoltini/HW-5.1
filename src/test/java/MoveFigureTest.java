import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.sleep;

public class MoveFigureTest {

    @Test
    void MoveFigureOnPage() {
        open("https://github.com/home");
        sleep(5000);
    }
}


