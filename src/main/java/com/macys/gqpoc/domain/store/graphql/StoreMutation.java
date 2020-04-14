package com.macys.gqpoc.domain.store.graphql;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.macys.gqpoc.domain.store.model.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StoreMutation implements GraphQLMutationResolver {

    private StoreService storeService;

    @Autowired
    public StoreMutation(StoreService storeService) {
        this.storeService = storeService;
    }

    public boolean createStore(final String type, final String location, final String levels, final String launchDate) {
        storeService.createStore(type, location, levels, launchDate);
        return true;
    }
}
