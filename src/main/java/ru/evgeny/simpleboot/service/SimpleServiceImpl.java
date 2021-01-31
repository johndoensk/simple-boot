package ru.evgeny.simpleboot.service;

import org.springframework.stereotype.Service;
import ru.evgeny.simpleboot.config.NameProvider;

@Service
public class SimpleServiceImpl implements SimpleService {

    private final NameProvider nameProvider;

    public SimpleServiceImpl(NameProvider nameProvider) {
        this.nameProvider = nameProvider;
    }

    @Override
    public String getName() {
        return nameProvider.getName();
    }
}
