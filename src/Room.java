import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Room {

    // list of participants
    // list of questions
    //

    private Round round;
    List<Question> questions;
    List<User> users; // placeholder for actual clients
    Queue<QuestionResponse> responses;
    List<UserResults> results;


    public void joinRoom(User client) {
        if (round.isStarted()) {
            throw new RuntimeException("round started");
        }

       try {

           users.add(client);

       } catch (Exception exception) {
           throw new RuntimeException(exception.getMessage());
       }
    }

    public void answerQuestion(QuestionResponse response) {
        // ensure that round has started and not  yet completed

        try {

            responses.add(response);

        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    public List<UserResults> calculateScores() {
        // ensure round has ended
        // use whatever formula you want to assign scores to the responses in queue
        List<UserResults> userResults = new ArrayList<>();

        for (QuestionResponse response: responses) {
            // answer must be correct
            // if answer is correct, assign score to user based on the position in queue
            Long score = 0L; //
            UserResults result = new UserResults(response.getUser(), score);
            userResults.add(result);
        }
        return userResults;
    }
}
