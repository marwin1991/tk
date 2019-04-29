package pl.edu.agh.tk.api;

import pl.edu.agh.tk.model.InlineResponse200;
import pl.edu.agh.tk.model.InlineResponse201;
import pl.edu.agh.tk.model.JobParams;
import pl.edu.agh.tk.model.JobResults;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-04-29T03:31:06.896Z[GMT]")
@Controller
public class JobApiController implements JobApi {

    private static final Logger log = LoggerFactory.getLogger(JobApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public JobApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Void> jobJobIdDelete(@ApiParam(value = "",required=true) @PathVariable("jobId") Integer jobId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<JobResults> jobJobIdResultsGet(@ApiParam(value = "",required=true) @PathVariable("jobId") Integer jobId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<JobResults>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<InlineResponse200> jobJobIdStatusGet(@ApiParam(value = "",required=true) @PathVariable("jobId") Integer jobId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<InlineResponse200>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<InlineResponse201> jobPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody JobParams body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<InlineResponse201>(HttpStatus.NOT_IMPLEMENTED);
    }

}
