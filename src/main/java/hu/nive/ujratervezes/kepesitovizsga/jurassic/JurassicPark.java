package hu.nive.ujratervezes.kepesitovizsga.jurassic;

import org.mariadb.jdbc.MariaDbDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class JurassicPark {
    private DataSource dataSource;

    public JurassicPark(MariaDbDataSource dataSource) {
        this.dataSource = dataSource;
    }

    public List<String> checkOverpopulation() {
        try (
                Connection conn = dataSource.getConnection();
                PreparedStatement stmt =
                        conn.prepareStatement("select breed from dinosaur where actual > expected order by breed")
        ) {
//            stmt.setString(1);

            return getDinosNames(stmt);
        } catch (SQLException sqle) {
            throw new IllegalArgumentException("Error by insert", sqle);
        }
//        return null;
    }

    private List<String> getDinosNames(PreparedStatement stmt) {
        List<String> dinoNames = new ArrayList<>();
        try (
                ResultSet rs = stmt.executeQuery()
        ) {
            while (rs.next()) {
                String name = rs.getString("breed");
                dinoNames.add(name);
            }
        } catch (SQLException sqle) {
            throw new IllegalArgumentException("Error by insert", sqle);
        }
        return dinoNames;
    }
}
