package com.x.project.application.layer.chain.manager.exception;

import com.x.project.application.layer.chain.exception.ChainRuntimeException;

/**
 * Chain manager unchecked {@link RuntimeException}.
 * 
 * @author Esteban Cristóbal
 */
public class ChainManagerRuntimeException extends ChainRuntimeException {

    private static final long serialVersionUID = 7345624675173933557L;

    /**
     * Class constructor.
     * 
     * @param message
     *            exception message
     */
    public ChainManagerRuntimeException(String message) {
        super(message);
    }

    /**
     * Class constructor.
     * 
     * @param cause
     *            exception cause
     */
    public ChainManagerRuntimeException(Throwable cause) {
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
    public ChainManagerRuntimeException(String message, Throwable cause) {
        super(message, cause);
    }

}
