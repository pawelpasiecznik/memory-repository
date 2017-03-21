package example.repository.base.events;

import example.repository.base.Entity;

/**
 * Zdarzenie usuniecia encji
 *
 * @param <I> typ id
 * @param <E> typ encji
 */
public interface PostDeleteEvent<I, E extends Entity<I>> extends EntityEvent<I> {
	
}
