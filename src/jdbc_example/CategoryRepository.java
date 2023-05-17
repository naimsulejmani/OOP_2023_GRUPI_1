package jdbc_example;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CategoryRepository {
    private static final String connectionString =
            "jdbc:sqlserver://127.0.0.1:1433;encrypt=false;databaseName=Northwind;username=sa;password=yourStrong(!)Password;";

    public static void main(String[] args) {
      //  addCategory(new Category(9, "Profesor", "Profesor", null));

        List<Category> categories = getAllCategories();

        for (Category category : categories) {
            System.out.println(category);
        }
    }

    public static void addCategory(Category category) {
        String query = "INSERT INTO dbo.Categories(CategoryName, Description) VALUES (?, ?)";
        try (
                Connection connection = DriverManager.getConnection(connectionString);
                PreparedStatement statement = connection.prepareStatement(query);
        ) {
            statement.setString(1, category.getCategoryName());
            statement.setString(2, category.getDescription());

            int rowAffected = statement.executeUpdate();
            System.out.println(rowAffected + " rows affected!");

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static List<Category> getAllCategories() {

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
}











