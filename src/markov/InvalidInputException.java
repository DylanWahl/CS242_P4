package markov;

public class InvalidInputException extends RuntimeException {

	public InvalidInputException(){}
	
	public InvalidInputException(String message) {
		System.out.println(message);
	}
}
