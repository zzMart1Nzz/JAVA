package kudeaketak;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import erronka2.DBKonexioa;
import erronka2.EskaerenXehetasunak;

public class kudeaketaEskaerenXehetasunak {

    public List<EskaerenXehetasunak> lortuEskaerenXehetasunak() {
        List<EskaerenXehetasunak> lista = new ArrayList<>();
        String sql = "SELECT idEskaeraproduktua, fraZkia, idProduktua, kopurua, prezioa, data, idBezeroa " +
                     "FROM eskaeraproduktua ORDER BY idEskaeraproduktua ASC";

        try (Connection conn = DBKonexioa.konexioaEgin();
             PreparedStatement pst = conn.prepareStatement(sql);
             ResultSet rs = pst.executeQuery()) {

            while (rs.next()) {
                EskaerenXehetasunak es = mapResultSetToEskaerenXehetasunak(rs);
                lista.add(es);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }

    private EskaerenXehetasunak mapResultSetToEskaerenXehetasunak(ResultSet rs) throws SQLException {
        return new EskaerenXehetasunak(
            rs.getInt("idEskaeraproduktua"),
            rs.getString("fraZkia"),
            rs.getInt("idProduktua"),
            rs.getInt("kopurua"),
            rs.getDouble("prezioa"),
            rs.getTimestamp("data"),
            rs.getInt("idBezeroa")
        );
    }

    public void sortuEskaerenXehetasunak(EskaerenXehetasunak eskaerenXehetasunak) {
        String sql = "INSERT INTO eskaeraproduktua (fraZkia, idProduktua, kopurua, prezioa, data, idBezeroa) VALUES (?, ?, ?, ?, ?, ?)";

        try (Connection conn = DBKonexioa.konexioaEgin();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            //mapEskaerenXehetasunakToPreparedStatement(eskaerenXehetasunak, ps);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void entregatuEskaerenXehetasunak(int eskaera) {
        String sql = "UPDATE eskaeraproduktua SET fraZkia = ?, idProduktua = ?, kopurua = ?, prezioa = ?, data = ?, idBezeroa = ? WHERE idEskaeraproduktua = ?";

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
        String sql = "DELETE FROM eskaeraproduktua WHERE idEskaera = ?";

        try (Connection conn = DBKonexioa.konexioaEgin();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, eskaera);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //private void mapEskaerenXehetasunakToPreparedStatement(EskaerenXehetasunak eskaerenXehetasunak, PreparedStatement ps) throws SQLException {
      //  ps.setString(1, eskaera.getEgoera());





}

