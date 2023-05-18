package generics.db;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CategoryRepository implements CrudRepository<Category, Integer>{
    private static final String connectionString =
            "jdbc:sqlserver://127.0.0.1:1433;encrypt=false;databaseName=Northwind;username=sa;password=yourStrong(!)Password;";

    @Override
    public void add(Category item) {
        String query = "INSERT INTO dbo.Categories(CategoryName, Description) VALUES (?, ?)";
        try (
                Connection connection = DriverManager.getConnection(connectionString);
                PreparedStatement statement = connection.prepareStatement(query);
        ) {
            statement.setString(1, item.getCategoryName());
            statement.setString(2, item.getDescription());

            int rowAffected = statement.executeUpdate();
            System.out.println(rowAffected + " rows affected!");

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void modify(Integer id, Category item) {

    }

    @Override
    public void remove(Integer id) {

    }

    @Override
    public List<Category> findAll() {
        try {
            Connection connection = DriverManager.getConnection(connectionString);
            String query = "SELECT * FROM dbo.Categories";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            List<Category> categories = new ArrayList<>();
            while (resultSet.next()) {
                int categoryId = resultSet.getInt(1);
                String categoryName = resultSet.getString("CategoryName");
                String description = resultSet.getObject("Description", String.class);
                String picture = resultSet.getObject(4) != null
                        ? resultSet.getObject(4).toString() : "NULL";
                Category category = new Category(categoryId, categoryName, description, picture);
                categories.add(category);
            }
            connection.close();
            return categories;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Category findById(Integer id) {
        String query = "SELECT * FROM dbo.Categories WHERE CategoryId = ?";
        try (Connection connection = DriverManager.getConnection(connectionString);
             PreparedStatement stmt = connection.prepareStatement(query);
        ) {
            stmt.setInt(1, id);
            ResultSet resultSet = stmt.executeQuery();
            Category category = null;
            if (resultSet.next()) {
                id = resultSet.getInt(1);
                String categoryName = resultSet.getString("CategoryName");
                String description = resultSet.getObject("Description", String.class);
                String picture = resultSet.getObject(4) != null
                        ? resultSet.getObject(4).toString() : "NULL";
                category = new Category(id, categoryName, description, picture);
            }
            return category;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            throw new RuntimeException(ex);
        }
    }
}
