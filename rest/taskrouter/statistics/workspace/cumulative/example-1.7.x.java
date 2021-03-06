// Install the Java helper library from twilio.com/docs/java/install
import java.util.Map;

import com.twilio.Twilio;
import com.twilio.rest.taskrouter.v1.workspace.WorkspaceStatistics;
import com.twilio.rest.taskrouter.v1.workspace.WorkspaceCumulativeStatistics;

public class Example {
  private static final String ACCOUNT_SID = "ACXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX";
  private static final String AUTH_TOKEN = "your_auth_token";
  private static final String WORKSPACE_SID = "WSXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX";

  public static void main(String[] args) {
    Twilio.init(ACCOUNT_SID, AUTH_TOKEN);

    WorkspaceCumulativeStatistics statistics = WorkspaceCumulativeStatistics.fetcher(WORKSPACE_SID).fetch();

    System.out.println("Avg Task Acceptance Time: " + statistics.getAvgTaskAcceptanceTime());
    System.out.println("Tasks Created: " + statistics.getTasksCreated());
  }
}
