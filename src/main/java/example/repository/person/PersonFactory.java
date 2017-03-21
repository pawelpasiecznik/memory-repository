package example.repository.person;

import java.util.Date;

/**
 * Fabryka sluzaca do tworzenia encji osoby.
 */
public interface PersonFactory {

	/**
	 * Tworzy osobe
	 * @param name imie
	 * @param surname nazwisko
	 * @param birthDate data urodzenia
	 * @return Utworzona osoba
	 */
	Person create(String name, String surname, Date birthDate);
	
}
