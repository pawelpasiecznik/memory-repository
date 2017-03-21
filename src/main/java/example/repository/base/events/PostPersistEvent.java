package example.repository.base.events;

import example.repository.base.Entity;

/**
 * Zdarzenie dodania encji
 *
 * @param <I>
 * @param <E>
 */
public interface PostPersistEvent<I, E extends Entity<I>> extends EntityEvent<I> {
	
	/**
	 * @return aktualna wartosc
	 */
	E getNewValue();
	
}
