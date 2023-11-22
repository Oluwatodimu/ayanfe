public class Main {

    public static void main(String[] args) {

        // read the json file
        // convert the trivia questions json file to a list of trivia questions

        if (args.length > 0) {
            String payloadTypeString = args[0];
            String clientName = args[1];
            String message = args[2];

            PayloadType payloadType = PayloadType.valueOf(payloadTypeString);

            Payload payload = new Payload(
                    payloadType,
                    clientName,
                    message
            );

            if (payload.getPayloadType().equals(PayloadType.CONNECT)) {
                // do something
            } else if (payload.getPayloadType().equals(PayloadType.DISCONNECT)) {
                // do something
            } else {
                // do another thing
            }

            System.out.println(payload.getPayloadType() + " " +
                    payload.getClientName() + " " +
                    payload.getMessage()
            );
        }
    }
}