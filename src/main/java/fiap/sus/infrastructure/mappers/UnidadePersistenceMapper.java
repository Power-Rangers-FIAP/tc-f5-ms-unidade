package fiap.sus.infrastructure.mappers;

import fiap.sus.domain.model.UnidadeDomain;
import fiap.sus.infrastructure.persistence.UnidadePersistence;


public class UnidadePersistenceMapper {

    private UnidadePersistenceMapper() {
        throw new IllegalStateException("Classe Utilitaria, não deve ser instanciada");
    }

    public static UnidadePersistence toPersistence(fiap.sus.domain.model.UnidadeDomain unidadeDomain) {
        return new fiap.sus.infrastructure.persistence.UnidadePersistence(
                unidadeDomain.getId(),
                unidadeDomain.getNome(),
                unidadeDomain.getEndereco()
        );
    }

    public static UnidadeDomain toDomain(fiap.sus.infrastructure.persistence.UnidadePersistence unidadePersistence) {
        return new fiap.sus.domain.model.UnidadeDomain(
                unidadePersistence.getId(),
                unidadePersistence.getNome(),
                unidadePersistence.getEndereco()
        );
    }

}
