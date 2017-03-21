package example.repository.person;

import java.util.Date;

import example.repository.base.Entity;

/**
 * Struktura osoby
 */
public interface Person extends Entity<Long> {

	String getName();

	String getSurname();

	Date getBirthDate();
	
}
