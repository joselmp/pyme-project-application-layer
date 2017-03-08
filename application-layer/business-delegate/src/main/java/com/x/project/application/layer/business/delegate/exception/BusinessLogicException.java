package com.x.project.application.layer.business.delegate.exception;

/**
 * Business logic checked {@link Exception}.
 * 
 * @author Esteban Cristóbal
 */
public class BusinessLogicException extends Exception {

    private static final long serialVersionUID = 4584674296571297000L;

    /**
     * Class constructor.
     * 
     * @param message
     *            exception message
     */
    public BusinessLogicException(String message) {
        super(message);
    }

    /**
     * Class constructor.
     * 
     * @param cause
     *            exception cause
     */
    public BusinessLogicException(Throwable cause) {
        super(cause);
    }

    /**
     * Class constructor.
     * 
     * @param message
     *            exception message
     * @param cause
     *            exception cause
     */
    public BusinessLogicException(String message, Throwable cause) {
        super(message, cause);
    }

}