import java.net.URI;
import java.util.Optional;

import com.atlassian.jira.rest.client.api.JiraRestClient;
import com.atlassian.jira.rest.client.api.domain.Issue;
import com.atlassian.jira.rest.client.internal.async.AsynchronousJiraRestClientFactory;
import com.atlassian.util.concurrent.Promise;

public class JRC {
    public Issue getIssue(String issueKey) throws Exception {
        final URI jiraServerUri = new URI("http://jira.baeldung.com");
        final JiraRestClient restClient = new AsynchronousJiraRestClientFactory().createWithBasicHttpAuthentication(jiraServerUri, "dhaval.simaria", "Dh@v@lH$31092");
        Promise issuePromise = restClient.getIssueClient()
            .getIssue(issueKey);
        return Optional.ofNullable((Issue) issuePromise.claim())
            .orElseThrow(() -> new Exception("No such issue"));
    }

}
