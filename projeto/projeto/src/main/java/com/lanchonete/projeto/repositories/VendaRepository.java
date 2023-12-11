package com.lanchonete.projeto.repositories;

import com.lanchonete.projeto.models.Venda;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

@Component
public class VendaRepository {

    @Cacheable("books")
    Venda getById(int id, int total) {
            return new Venda(id, total);
    }
}
