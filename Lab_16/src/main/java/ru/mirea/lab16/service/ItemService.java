package ru.mirea.lab16.service;

import ru.mirea.lab16.model.Item;

import java.util.List;

public interface ItemService {
    void create(Item item);
    List<Item> readAll();
    Item read(int id);
    boolean update(Item item, int id);
    boolean delete(int id);
}
