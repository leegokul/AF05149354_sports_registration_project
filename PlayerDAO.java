import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class PlayerDAO {

    public void addPlayer(Player player) {
        try {
            Connection con = DBConnection.getConnection();
            String sql = "INSERT INTO players (name, sport) VALUES (?, ?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, player.getName());
            ps.setString(2, player.getSport());
            int rows = ps.executeUpdate();
            System.out.println(rows + " Player Added Successfully!");
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<Player> getAllPlayers() {
        List<Player> players = new ArrayList<>();
        try {
            Connection con = DBConnection.getConnection();
            String sql = "SELECT * FROM players";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Player p = new Player();
                p.setId(rs.getInt("id"));
                p.setName(rs.getString("name"));
                p.setSport(rs.getString("sport"));
                players.add(p);
            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return players;
    }
}