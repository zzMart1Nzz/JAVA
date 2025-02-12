package kudeaketak;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import erronka2.DBKonexioa;
import erronka2.Eskaera;

public class kudeaketaEskaerak {

    public List<Eskaera> lortuEskaerak() {
        List<Eskaera> lista = new ArrayList<>();
        String sql = "SELECT idEskaera, fraZkia, Bezeroa_idBezeroa, totala, egoera, data, faktura " +
                     "FROM eskaera ORDER BY idEskaera ASC";

        try (Connection conn = DBKonexioa.konexioaEgin();
             PreparedStatement pst = conn.prepareStatement(sql);
             ResultSet rs = pst.executeQuery()) {

            while (rs.next()) {
                Eskaera es = mapResultSetToEskaera(rs);
                lista.add(es);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }

    private Eskaera mapResultSetToEskaera(ResultSet rs) throws SQLException {
        return new Eskaera(
            rs.getInt("idEskaera"),
            rs.getString("fraZkia"),
            rs.getInt("Bezeroa_idBezeroa"),
            rs.getDouble("totala"),
            rs.getString("egoera"),
            rs.getTimestamp("data"),
            rs.getString("faktura")
        );
    }

    public void sortuEskaera(Eskaera eskaera) {
        String sql = "INSERT INTO eskaera (fraZkia, Bezeroa_idBezeroa, totala, egoera, data, faktura) VALUES (?, ?, ?, ?, ?, ?)";

        try (Connection conn = DBKonexioa.konexioaEgin();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            mapEskaeraToPreparedStatement(eskaera, ps);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void entregatuEskaera(int eskaera) {
        String sql = "UPDATE eskaera SET egoera = 'entregatuta' WHERE idEskaera = ?";

        try (Connection conn = DBKonexioa.konexioaEgin();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            //mapEskaeraToPreparedStatement(eskaera, ps);
            ps.setInt(1, eskaera);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void bidaliEskaera(int eskaera) {
        String sql = "UPDATE eskaera SET egoera = 'bidalita' WHERE idEskaera = ?";

        try (Connection conn = DBKonexioa.konexioaEgin();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            //mapEskaeraToPreparedStatement(eskaera, ps);
            ps.setInt(1, eskaera);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void ezabatuEskaera(int eskaera) {
        String sql = "DELETE FROM eskaera WHERE idEskaera = ?";

        try (Connection conn = DBKonexioa.konexioaEgin();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, eskaera);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void mapEskaeraToPreparedStatement(Eskaera eskaera, PreparedStatement ps) throws SQLException {
        ps.setString(1, eskaera.getEgoera());



    }

}
