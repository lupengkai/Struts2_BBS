package com.bbs.action;

import com.bbs.model.Category;
import com.opensymphony.xwork2.ActionSupport;

import java.util.List;

/**
 * Created by tage on 3/14/16.
 */
public class CategoryAction extends ActionSupport {
    private List<Category> categories;

    public String list() {
        return SUCCESS;
    }

    public String add() {
        return SUCCESS;
    }

    public String update() {
        return SUCCESS;
    }

    public String delete() {
        return SUCCESS;
    }

    public String addInput() {
        return INPUT;
    }

    public String updateInput() {
        return INPUT;
    }
}
