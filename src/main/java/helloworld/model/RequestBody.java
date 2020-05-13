package helloworld.model;

public class RequestBody {

    private final String name;
    private final String message;

    public RequestBody(String name, String message) {
        this.name = name;
        this.message = message;
    }

    public String getName() {
        return name;
    }

    public String getMessage() {
        return message;
    }

}
