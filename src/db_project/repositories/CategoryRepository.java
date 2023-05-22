package db_project.repositories;

import db_project.helpers.DbHelper;
import db_project.infrastructure.CrudRepository;
import db_project.infrastructure.ToObjectAble;
import db_project.models.Category;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class CategoryRepository implements CrudRepository<Category, Integer>, ToObjectAble<Category> {
    @Override
    public Category findById(Integer id) {
        String query = "SELECT * FROM dbo.Categories WHERE CategoryID = ?";
        try (Connection connection = DbHelper.getConnection(); PreparedStatement statement = connection.prepareStatement(query)) {

            Category category = null;
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) category = toObject(resultSet);

            return category;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Category> findAll() {
        return null;
    }

    @Override
    public void add(Category model) {

    }

    @Override
    public void modify(Integer id, Category model) {

    }

    @Override
    public void remove(Integer id) {

    }

    @Override
    public Category toObject(ResultSet resultSet) throws SQLException {
        int categoryId = resultSet.getInt("CategoryId");
        String categoryName = resultSet.getString("CategoryName");
        String description = null;
        if (resultSet.getObject("Description") != null)
            description = resultSet.getString("Description");
        byte[] picture = null;
        if (resultSet.getObject("Picture") != null)
            picture = (byte[]) resultSet.getObject("Picture");
        return new Category(categoryId, categoryName, description, picture);
    }
}
