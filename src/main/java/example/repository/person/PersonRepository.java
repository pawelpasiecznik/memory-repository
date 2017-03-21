package example.repository.person;

import java.util.Collection;

import example.repository.base.EntityRepository;

/**
 * Repozytorium zarzadzajace encjami osoby
 */
public interface PersonRepository extends EntityRepository<Long, Person> {
	
	/**
	 * Wyszukuje osoby spelniajace zadane kryteria
	 * @param name imie, nie moze byc null
	 * @param surname nazwisko, nie moze byc null
	 * @return zbior osob spelniajacych kryteria
	 */
	Collection<Person> findByNameAndSurname(String name, String surname);
	
	/**
	 * Pobiera zbior osob spelniajacych kryteria posortowany wg. nazwiska 
	 * @param fromSurname 	od jakiego naywiska maja byc zwracane dane (wlacznie z podanym). 
	 * 						Dla wartosci null zwracany jest zbior od poczatku
	 * @param endSurname 	do jakiego nazwiska maja byc zwracane dane (wlacznie z podanym).
	 * 						Dla wartosci null zwracany jest zbior do konca kolekcji.
	 * @return zbior osob posortowany po nazwisku
	 */
	Collection<Person> findBySurnameBetweenOrderBySurname(String fromSurname, String endSurname);
	
}
