package Line;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class LineTest {

    @Test
    public void calculateDistance() {
        double answer = 5;
        int x1 = 0;
        int x2 = 3;
        int y1 = 0;
        int y2 = 4;

        Line line = new Line(x1, x2, y1, y2);

        double distance = line.calculateDistance();

        assertEquals(answer, distance, 0.0001);
    }
}
