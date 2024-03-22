package br.com.pedro.servicex.categoria.repositories;

import br.com.pedro.servicex.categoria.domain.Servico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServicoRepository  extends JpaRepository<Servico, Integer> {
}