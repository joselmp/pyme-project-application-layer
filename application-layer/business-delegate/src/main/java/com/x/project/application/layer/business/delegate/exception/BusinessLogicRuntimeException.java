package com.x.project.application.layer.business.delegate.exception;

/**
 * Business logic unchecked {@link RuntimeException}.
 * 
 * @author Esteban Cristóbal
 */
public class BusinessLogicRuntimeException extends RuntimeException {

    private static final long serialVersionUID = -3961607320663524113L;

    /**
     * Class constructor.
     * 
     * @param message
     *            exception message
     */
    public BusinessLogicRuntimeException(String message) {
        super(message);
    }

    /**
     * Class constructor.
     * 
     * @param cause
     *            exception cause
     */
    public BusinessLogicRuntimeException(Throwable cause) {
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
    public BusinessLogicRuntimeException(String message, Throwable cause) {
        super(message, cause);
    }

}