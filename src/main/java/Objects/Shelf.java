package Objects;

import java.util.UUID;

public class Shelf {
    private UUID id;
    private final int nrOfBoxes;
    private Box[] boxes;

    public Shelf(int nrOfBoxes) {
        this.nrOfBoxes = nrOfBoxes;
        boxes = new Box[nrOfBoxes];
        for (int i = 0; i < nrOfBoxes; i++) {
            boxes[i] = new Box();
        }
    }
}
