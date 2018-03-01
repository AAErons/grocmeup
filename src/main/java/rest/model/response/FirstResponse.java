package rest.model.response;

public class FirstResponse {
    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "FirstResponse{" +
                "value='" + value + '\'' +
                '}';
    }
}
