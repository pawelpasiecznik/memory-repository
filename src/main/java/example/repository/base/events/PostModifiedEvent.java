package example.repository.base.events;

import example.repository.base.Entity;

/**
 * Zdarzenie modyfikacji encji
 *
 * @param <I>
 * @param <E>
 */
public interface PostModifiedEvent<I, E extends Entity<I>> extends EntityEvent<I> {

	/**
	 * @return wartosc przed zmiana. W przypadku dodawanie encji wartosc przyjmuje {@code null}
	 */
	E getOldValue();
	
	/**
	 * @return aktualna wartosc
	 */
	E getNewValue();
	
}
