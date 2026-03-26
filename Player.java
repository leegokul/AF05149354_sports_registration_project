public class Player {
    private int id;
    private String name;
    private String sport;

    public Player() {}

    public Player(int id, String name, String sport) {
        this.id = id;
        this.name = name;
        this.sport = sport;
    }

    // Getters and Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getSport() { return sport; }
    public void setSport(String sport) { this.sport = sport; }
}