package example.repository.base;

import java.util.Date;

/**
 * Bazowa encja
 *
 * @param <I> typ id
 */
public interface Entity<I> extends Cloneable {

	/**
	 * @return id encji
	 */
	I getId();
	
	/**
	 * @return data utworzenia encji
	 */
	Date getCreationDate();
	
	/**
	 * @return data ostatniej modyfikacji encji
	 */
	Date getLastModifiedDate();
	
}
