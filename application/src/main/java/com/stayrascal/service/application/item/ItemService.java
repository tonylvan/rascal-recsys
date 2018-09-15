package com.stayrascal.service.application.item;

import com.stayrascal.service.application.common.FileImporter;
import com.stayrascal.service.application.domain.Item;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public interface ItemService extends FileImporter {
    Optional<Item> searchItems(String name);

    List<Item> searchItemLike(String titleLike);

    Optional<Item> searchItem(int id);

    List<Item> searchItemsByDesc(String desc, int rows);

    List<Item> searchItemsByTitle(String title, int rows);

    List<Item> searchItemsByContent(String content, int rows);

    List<Item> searchItemsByTag(String tag, int rows);

    Item updateItem(Item item);

    void deleteItem(String id);

    Item addItem(Item component);

    CompletableFuture<Void> rebuild();
}