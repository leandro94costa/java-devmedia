package br.edu.devmedia.crud.command;

import javax.servlet.http.HttpServletRequest;

public interface Command {

    public String execute(HttpServletRequest request);
}
