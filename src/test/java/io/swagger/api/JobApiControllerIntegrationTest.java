package io.swagger.api;

import pl.edu.agh.tk.api.JobApi;
import pl.edu.agh.tk.model.InlineResponse200;
import pl.edu.agh.tk.model.InlineResponse201;
import pl.edu.agh.tk.model.JobParams;
import pl.edu.agh.tk.model.JobResults;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JobApiControllerIntegrationTest {

    @Autowired
    private JobApi api;

    @Test
    public void jobJobIdDeleteTest() throws Exception {
        Integer jobId = 56;
        ResponseEntity<Void> responseEntity = api.jobJobIdDelete(jobId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void jobJobIdResultsGetTest() throws Exception {
        Integer jobId = 56;
        ResponseEntity<JobResults> responseEntity = api.jobJobIdResultsGet(jobId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void jobJobIdStatusGetTest() throws Exception {
        Integer jobId = 56;
        ResponseEntity<InlineResponse200> responseEntity = api.jobJobIdStatusGet(jobId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void jobPostTest() throws Exception {
        JobParams body = new JobParams();
        ResponseEntity<InlineResponse201> responseEntity = api.jobPost(body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

}
