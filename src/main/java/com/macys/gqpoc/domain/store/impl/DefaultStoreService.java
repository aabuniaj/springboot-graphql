package com.macys.gqpoc.domain.store.impl;

import com.macys.gqpoc.domain.store.impl.adapter.StoreAdapter;
import com.macys.gqpoc.domain.store.model.StoreEntity;
import com.macys.gqpoc.domain.store.model.StoreRepository;
import com.macys.gqpoc.domain.store.model.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class DefaultStoreService implements StoreService {

    private final StoreRepository storeRepository;

    @Autowired
    public DefaultStoreService(final StoreRepository storeRepository) {
        this.storeRepository = storeRepository;
    }

    @Transactional
    @Override
    public void createStore(final String type, final String location, final String levels, final String launchDate) {
        final StoreEntity store = new StoreEntity(0, type, location, levels, LocalDate.parse(launchDate));

        this.storeRepository.save(store);
    }

    @Transactional(readOnly = true)
    @Override
    public List<StoreEntity> getAllStores(final int count) {
        return this.storeRepository.findAll().stream().limit(count).collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    @Override
    public Optional<StoreEntity> getStore(final int id) {
        return Optional.of(this.storeRepository.findById(id).get());
    }
}