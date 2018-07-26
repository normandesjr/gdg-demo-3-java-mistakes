package com.hibicode.crud;

import java.util.Optional;

public interface GoodClientes {

    Optional<Cliente> buscarPorCodigo(Long codigo);
}
