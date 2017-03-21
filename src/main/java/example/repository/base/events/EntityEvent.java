package example.repository.base.events;

/**
 * Zdarzenie zwiazane ze zmiana stanu encji w repozytorium
 *
 * @param <I> typ identyfikatora encji
 */
public interface EntityEvent<I> {

	/**
	 * @return zwraca id encji zdarzenia
	 */
	I getId();
	
}
