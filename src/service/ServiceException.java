package service;

/**
 * Created by choiz on 2017-02-28.
 */
public class ServiceException extends Exception {
    public ServiceException(String message, Exception cause) {
        super(message, cause);
    }

    public ServiceException(String message) {
        super(message);
    }
}
