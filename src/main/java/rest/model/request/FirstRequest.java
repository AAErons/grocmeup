package rest.model.request;

public class FirstRequest {
    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "FirstRequest{" +
                "value='" + value + '\'' +
                '}';
    }
}
