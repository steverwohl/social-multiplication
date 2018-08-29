package microservices.book.multiplication.service;

import microservices.book.multiplication.domain.Multiplication;
import microservices.book.multiplication.domain.MultiplicationResultAttempt;

public interface MultiplicationService {

    /**
     * Generates a random {@link Multiplication} object.
     */
    Multiplication createRandomMultiplication();
    /**
     * @return true if the attempt matches the result of the multiplication
     * false if it does not
     */
    boolean checkAttempt(final MultiplicationResultAttempt resultAttempt);

}