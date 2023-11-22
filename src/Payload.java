public class Payload {
    public Payload(PayloadType payloadType, String clientName, String message) {
        this.payloadType = payloadType;
        this.clientName = clientName;
        this.message = message;
    }

    private PayloadType payloadType;

    public PayloadType getPayloadType() {
        return payloadType;
    }

    public void setPayloadType(PayloadType payloadType) {
        this.payloadType = payloadType;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    private String clientName;
    private String message;
}
