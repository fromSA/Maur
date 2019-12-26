package Objects;

import java.util.Objects;

public class ISBN {

    public ISBN(int EAN, int Group, int Publisher, int Title, int CheckDigit) {
        this.EAN = EAN;
        this.Group = Group;
        this.Publisher = Publisher;
        this.Title = Title;
        this.CheckDigit = CheckDigit;
    }

    //TODO create proper isbn code.
    int EAN;
    int Group;
    int Publisher;
    int Title;
    int CheckDigit;



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ISBN isbn = (ISBN) o;
        return EAN == isbn.EAN &&
                Group == isbn.Group &&
                Publisher == isbn.Publisher &&
                Title == isbn.Title &&
                CheckDigit == isbn.CheckDigit;
    }

    @Override
    public int hashCode() {
        return Objects.hash(EAN, Group, Publisher, Title, CheckDigit);
    }
}
