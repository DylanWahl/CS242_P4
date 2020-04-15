package markov;

public class InsufficientMarkovChainException extends RuntimeException {

	public InsufficientMarkovChainException(){}
	
	public InsufficientMarkovChainException(String message) {
		System.out.println(message);
	}
}
