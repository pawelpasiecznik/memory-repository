package example.repository.company;

/**
 * Fabryka sluzaca do tworzenia encji firmy.
 */
public interface CompanyFactory {

	/**
	 * Tworzy osobe
	 * @param name nazwa firmy
	 * @return Utworzona encja
	 */
	Company create(String name);
	
}
