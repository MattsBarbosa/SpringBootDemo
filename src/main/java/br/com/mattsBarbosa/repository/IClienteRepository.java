package br.com.mattsBarbosa.repository;

import br.com.mattsBarbosa.domain.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface IClienteRepository extends CrudRepository<Cliente, Long>  {
}
