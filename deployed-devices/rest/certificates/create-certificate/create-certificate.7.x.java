// Get the Java helper library from https://twilio.com/docs/libraries/java
import com.twilio.Twilio;
import com.twilio.base.ResourceSet;
import com.twilio.rest.preview.deployedDevices.fleet;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Example {
    // Get your Account SID and Auth Token from https://twilio.com/console
    public static final String ACCOUNT_SID = "ACXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX";
    public static final String AUTH_TOKEN = "your_auth_token";

    public static void main(String[] args) {
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);

        CertificateCreator certificateCreator = CertificateCreator(
            "FLXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX",
            new String(Files.readAllBytes(Paths.get("/path/to/certificate.pem")))
        );

        Certificate certificate = certificateCreator
            .setFriendlyName("Woody")
            .setDeviceSid("THXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX")
            .create();

        System.out.println(certificate.getSid());
    }
}
