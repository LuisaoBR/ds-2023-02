package com.lanchonete.projeto;

import com.lanchonete.projeto.repositories.VendaRepository;
import org.springframework.stereotype.Component;

@Component
public class RegistroVendas  {
    private final VendaRepository vendaRepository;

    public RegistroVendas(VendaRepository vendaRepository) {
        this.vendaRepository = vendaRepository;
    }


    }

