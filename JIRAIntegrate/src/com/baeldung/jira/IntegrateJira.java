/**
 * 
 */
package com.baeldung.jira;

/**
 * @author a611021
 *
 */
public class IntegrateJira {

import java.net.URI;
import java.util.Optional;

public class JRC {
    public Issue getIssue(String issueKey) throws Exception {
        final URI jiraServerUri = new URI("http://jira.baeldung.com");
        final JiraRestClient restClient = new AsynchronousJiraRestClientFactory().createWithBasicHttpAuthentication(jiraServerUri, "dhaval.simaria", "Dh@v@lH$31092");
        Promise issuePromise = restClient.getIssueClient()
            .getIssue(issueKey);
        return Optional.ofNullable((Issue) issuePromise.claim())
            .orElseThrow(() -> new Exception("No such issue"));
    }

}}
