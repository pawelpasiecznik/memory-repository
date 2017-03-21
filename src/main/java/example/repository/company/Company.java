package example.repository.company;

import example.repository.base.Entity;

/**
 * Struktura osoby
 */
public interface Company extends Entity<Regon> {

	/**
	 * @return zwraca unikalna nazwe firmy
	 */
	String getName();

}
