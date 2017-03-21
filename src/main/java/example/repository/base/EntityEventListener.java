package example.repository.base;

import example.repository.base.events.EntityEvent;

/**
 * Nasluchiwacz zdarzen pochodzacych z repozytorium encji
 *
 * @param <I> typ id
 * @param <E> typ encji
 */
public interface EntityEventListener<I, E extends EntityEvent<I>> {

	/**
	 * @return zwraca klase zdarzenia sluchacza
	 */
	Class<E> getEventClass();
	
	/**
	 * Metoda wywolywana po publikcji zdarzenia
	 * @param event
	 */
	void onEvent(E event);
	
}
