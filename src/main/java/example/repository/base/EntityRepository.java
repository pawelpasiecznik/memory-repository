package example.repository.base;

import java.util.Collection;

import example.repository.base.events.EntityEvent;
import example.repository.base.events.PostDeleteEvent;
import example.repository.base.events.PostModifiedEvent;
import example.repository.base.events.PostPersistEvent;

/**
 * Bazowe repozytorium encji
 *
 * @param <I> typ id
 * @param <E> typ encji
 */
public interface EntityRepository <I, E extends Entity<I>> {

	/**
	 * Dodaje lub modyfikuje encje.
	 * Po dodaniu generuje zdarzenie {@link PostPersistEvent}  do zarejestrowanych sluchaczy {@link EntityRepository#register(EntityEventListener...)}
	 * Po modyfikacji generuje zdarzenie {@link PostModifiedEvent} do zarejestrowanych sluchaczy {@link EntityRepository#register(EntityEventListener...)}
	 * @param entity encja do zapisania. W przypadku kiedy id bedzie null-em encja zostanie dodana, w przeciwnym przypadku nastapi aktualizacja encji
	 * @return Zmodyfikowana encja
	 */
	E save(E entity);

	/**
	 * Usuwa encje z kolekcji.
	 * Po usunieciu encji generuje zdarzenie {@link PostDeleteEvent} do zarejestrowanych sluchaczy {@link EntityRepository#register(EntityEventListener...)}
	 * @param id
	 */
	void delete(I id);
	
	/**
	 * Pobiera encje na podstawie id
	 * @param id
	 * @return
	 * @throws EntityNotFoundException w przypadku kiedy encja o podanym id nie istnieje
	 */
	E findOne(I id) throws EntityNotFoundException;
	
	/**
	 * Zwraca wszystkie elementy kolekcji
	 * @return
	 */
	Collection<E> findAll();

	/**
	 * Rejestruje sluchacza, ktory nasluchuje na dane zdarzenia
	 * @param listener
	 */
	void register(EntityEventListener<I, EntityEvent<I>> listener);
	
	/**
	 * Nie znaleziono szukanej osoby
	 */
	class EntityNotFoundException extends RuntimeException {
		
		private static final long serialVersionUID = 1L;
	
	}
	
}
