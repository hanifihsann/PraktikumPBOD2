package jdbc.Service;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import jdbc.Model.Mahasiswa;
import jdbc.Utilities.MysqlUtility;

public class MysqlMahasiswaService {

    Connection koneksi = null;

    public MysqlMahasiswaService() {
        koneksi = MysqlUtility.getConnection();
    }

    public Mahasiswa makeMhsObject() {
        return new Mahasiswa();
    }

    public void add(Mahasiswa mhs) {
        String query = "INSERT INTO mahasiswa(id, nama) VALUES (?, ?)";

        try {
            PreparedStatement ps = koneksi.prepareStatement(query);
            ps.setInt(1, mhs.getId());
            ps.setString(2, mhs.getNama());
            ps.executeUpdate();

            System.out.println("Berhasil insert");
        } catch (SQLException e) {
            System.out.println("Gagal insert : " + e.getMessage());
        }
    }

    public void update(Mahasiswa mhs) {
        String query = "UPDATE mahasiswa SET nama=? WHERE id=?";

        try {
            PreparedStatement ps = koneksi.prepareStatement(query);
            ps.setString(1, mhs.getNama());
            ps.setInt(2, mhs.getId());
            ps.executeUpdate();

            System.out.println("Berhasil update");
        } catch (SQLException e) {
            System.out.println("Gagal update : " + e.getMessage());
        }
    }

    public void delete(int id) {
        String query = "DELETE FROM mahasiswa WHERE id=?";

        try {
            PreparedStatement ps = koneksi.prepareStatement(query);
            ps.setInt(1, id);
            ps.executeUpdate();

            System.out.println("Berhasil delete");
        } catch (SQLException e) {
            System.out.println("Gagal delete : " + e.getMessage());
        }
    }

    public Mahasiswa getById(int id) {
        Mahasiswa mhs = null;
        String query = "SELECT * FROM mahasiswa WHERE id=?";

        try {
            PreparedStatement ps = koneksi.prepareStatement(query);
            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                mhs = new Mahasiswa(
                        rs.getInt("id"),
                        rs.getString("nama")
                );
            }

        } catch (SQLException e) {
            System.out.println("Gagal getById : " + e.getMessage());
        }

        return mhs;
    }

    public List<Mahasiswa> getAll() {
        List<Mahasiswa> listmhs = new ArrayList<>();
        String query = "SELECT * FROM mahasiswa";

        try {
            Statement st = koneksi.createStatement();
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {
                Mahasiswa mhs = new Mahasiswa(
                        rs.getInt("id"),
                        rs.getString("nama")
                );

                listmhs.add(mhs);
            }

        } catch (SQLException e) {
            System.out.println("Gagal getAll : " + e.getMessage());
        }

        return listmhs;
    }
}