
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StaffDAO {
    private Connection connection;

    public StaffDAO(Connection connection) {
        this.connection = connection;
    }

    // CREATE
    public void insertStaff(Staff staff) {
        String sql = "INSERT INTO Staff (staffId, firstName, lastName, addressId, number, password) VALUES (?, ?, ?, ?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, staff.getStaffId());
            stmt.setString(2, staff.getFirstName());
            stmt.setString(3, staff.getLastName());
            stmt.setInt(4, staff.getAddressId());
            stmt.setString(5, staff.getNumber());
            stmt.setString(6, staff.getPassword());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // READ ALL
    public List<Staff> getAllStaff() {
        List<Staff> staffList = new ArrayList<>();
        String sql = "SELECT * FROM Staff";
        try (Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Staff staff = new Staff(
                        rs.getInt("staffId"),
                        rs.getString("firstName"),
                        rs.getString("lastName"),
                        rs.getInt("addressId"),
                        rs.getString("number"),
                        rs.getString("password")
                );
                staffList.add(staff);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return staffList;
    }

    // READ BY ID
    public Staff getStaffById(int id) {
        String sql = "SELECT * FROM Staff WHERE staffId = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return new Staff(
                        rs.getInt("staffId"),
                        rs.getString("firstName"),
                        rs.getString("lastName"),
                        rs.getInt("addressId"),
                        rs.getString("number"),
                        rs.getString("password")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    // UPDATE
    public void updateStaff(Staff staff) {
        String sql = "UPDATE Staff SET firstName = ?, lastName = ?, addressId = ?, number = ?, password = ? WHERE staffId = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, staff.getFirstName());
            stmt.setString(2, staff.getLastName());
            stmt.setInt(3, staff.getAddressId());
            stmt.setString(4, staff.getNumber());
            stmt.setString(5, staff.getPassword());
            stmt.setInt(6, staff.getStaffId());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // DELETE
    public void deleteStaff(int id) {
        String sql = "DELETE FROM Staff WHERE staffId = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
