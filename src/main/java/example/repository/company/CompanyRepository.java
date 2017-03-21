package example.repository.company;

import example.repository.base.EntityRepository;

/**
 * Repozytorium zarzadzajace encjami firmy
 */
public interface CompanyRepository extends EntityRepository<Regon, Company> {
	
	/**
	 * Zwraca nazwe firmy po nazwie
	 * @param name nazwa firmy
	 * @return nazwa firmy lub null w przypadku kiedy firma o podanej nazwie nie istnieje
	 */
	Company findByName(String name);
	
}
