package dao;

import entity.Category;

import java.util.List;

public interface ICategory {

    public int add(Category category);

    public void delete(int id);

    public Category get(int id);

    public int update(Category category);

    public List<Category> lisst();

    public int count();


}
