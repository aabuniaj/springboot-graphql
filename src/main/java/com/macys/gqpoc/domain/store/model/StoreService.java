package com.macys.gqpoc.domain.store.model;

import java.util.List;
import java.util.Optional;

public interface StoreService {
    void createStore(final String type, final String modelCode, final String brandName, final String launchDate);
    List<StoreEntity> getAllStores(final int count);
    Optional<StoreEntity> getStore(final int id);
}
