package br.com.devmedia.webservice.exception;

import br.com.devmedia.webservice.model.domain.ErrorMessage;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class WebAPIExceptionMapper implements ExceptionMapper<WebApplicationException> {

    @Override
    public Response toResponse(WebApplicationException ex) {
        ErrorMessage error = new ErrorMessage(ex.getMessage(), ex.getResponse().getStatus());
        return Response.status(ex.getResponse().getStatus())
                .entity(error)
                .type(MediaType.APPLICATION_JSON)
                .build();
    }
}
