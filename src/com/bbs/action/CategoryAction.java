package com.bbs.action;

import com.bbs.model.Category;
import com.bbs.service.CategoryService;
import com.opensymphony.xwork2.ActionSupport;

import java.util.List;

/**
 * Created by tage on 3/14/16.
 */
public class CategoryAction extends ActionSupport {


    private Category category;

    private int id;


    private List<Category> categories;

    private CategoryService categoryService = new CategoryService();//将来交给Spring 实现单例

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

    public CategoryService getCategoryService() {
        return categoryService;
    }

    public void setCategoryService(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public int getId() {
        return id;
    }



    public void setId(int id) {
        this.id = id;
    }






    public String list() throws Exception{
        categories = categoryService.list();
        return SUCCESS;
    }

    public String add() {
        categoryService.add(category);
        return SUCCESS;
    }

    public String update() {
        categoryService.update(category);
        return SUCCESS;
    }

    public String delete() {
        categoryService.deleteById(id);
        return SUCCESS;
    }

    public String addInput() {



        return INPUT;
    }

    public String updateInput() {
        this.category=this.categoryService.loadById(id);
        return INPUT;
    }
}
