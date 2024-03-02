package Directions;

class InvalidValueException extends RuntimeException {
    public InvalidValueException(String message) {
        super(message);
    }
}

class EmptyStringException extends RuntimeException {
    public EmptyStringException(String message) {
        super(message);
    }
}

class ArrayCountElementException extends RuntimeException {
    public ArrayCountElementException(String message) {
        super(message);
    }
}