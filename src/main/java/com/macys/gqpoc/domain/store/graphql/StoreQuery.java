package com.macys.gqpoc.domain.store.graphql;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.macys.gqpoc.domain.store.model.Store;
import com.macys.gqpoc.domain.store.model.StoreEntity;
import com.macys.gqpoc.domain.store.model.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class StoreQuery implements GraphQLQueryResolver {

    private final StoreService storeService;

    @Autowired
    public StoreQuery(StoreService storeService) {
        this.storeService = storeService;
    }

    public List<StoreEntity> getStores(final int count) {
        return this.storeService.getAllStores(count);
    }

    public Optional<StoreEntity> getStore(final int id) {
        return this.storeService.getStore(id);
    }
}
