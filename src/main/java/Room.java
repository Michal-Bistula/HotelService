public class Room {

    private int number;
    private int size;
    private boolean bathroom;
    private boolean book;

    public Room(int number, int size, boolean bathroom, boolean book) {
        this.number = number;
        this.size = size;
        this.bathroom = bathroom;
        this.book = book;
    }

    public boolean isBook() {
        return book;
    }

    public void setBook(boolean book) {
        this.book = book;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "\nPokój " +
                "nr " + number +
                ", rozmiar: " + size +
                ", łazienka: " + bathroom +
                ", zarezerwowany: " + book;
    }

}
