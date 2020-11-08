package net.jaya.shoppingbackend.dao;

import java.util.List;

import net.jaya.shoppingbackend.dto.Category;

public interface CategoryDAO 
{
    List<Category> list();
    Category get(int id);
}
