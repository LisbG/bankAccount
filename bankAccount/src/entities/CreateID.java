package entities;

import java.util.UUID;

public class CreateID {

	public static String newId() {
		return UUID.randomUUID().toString().substring(0, 4);
	}
}
