package com.x.project.application.layer.chain.manager.exception;

import com.x.project.application.layer.chain.exception.ChainException;

/**
 * Chain manager checked {@link Exception}.
 * 
 * @author Esteban Cristóbal
 */
public class ChainManagerException extends ChainException {

    private static final long serialVersionUID = 3858478949165839459L;

    /**
     * Class constructor.
     * 
     * @param message
     *            exception message
     */
    public ChainManagerException(String message) {
        super(message);
    }

    /**
     * Class constructor.
     * 
     * @param cause
     *            exception cause
     */
    public ChainManagerException(Throwable cause) {
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
    public ChainManagerException(String message, Throwable cause) {
        super(message, cause);
    }

}
