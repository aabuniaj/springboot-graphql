package com.macys.gqpoc.domain.store.impl.adapter;

import com.macys.gqpoc.domain.store.model.Store;
import com.macys.gqpoc.domain.store.model.StoreEntity;

import java.util.List;
import java.util.stream.Collectors;

public class StoreAdapter {
    public Store from(StoreEntity storeEntity) {
        if (storeEntity == null) {
            return null;
        }
        return new Store(storeEntity.getId(), storeEntity.getType(),
                storeEntity.getLocation(), storeEntity.getLevels(),
                storeEntity.getLaunchDate());
    }

    public List<Store> fromList(List<StoreEntity> storeEntities) {
        return storeEntities.stream().map(this::from).collect(Collectors.toList());
    }
}