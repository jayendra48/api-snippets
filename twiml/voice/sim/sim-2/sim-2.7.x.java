import com.twilio.twiml.voice.Dial;
import com.twilio.twiml.VoiceResponse;
import com.twilio.twiml.voice.Sim;
import com.twilio.twiml.TwiMLException;


public class Example {
    public static void main(String[] args) {
        Sim sim = new Sim.Builder("DE8caa2afb9d5279926619c458dc7098a8").build();
        Dial dial = new Dial.Builder().record(Dial.Record.RECORD_FROM_RINGING)
            .sim(sim).build();
        VoiceResponse response = new VoiceResponse.Builder().dial(dial).build();

        try {
            System.out.println(response.toXml());
        } catch (TwiMLException e) {
            e.printStackTrace();
        }
    }
}
