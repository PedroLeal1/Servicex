package br.com.pedro.servicex.ordemServico.repositories;

import br.com.pedro.servicex.ordemServico.domain.OrdemServico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrdemServicoRepository extends JpaRepository<OrdemServico,Integer> {
}
