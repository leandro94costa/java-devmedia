package br.com.devmedia.blog.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("auth")
public class LoginController {

    @RequestMapping(value = "/form", method = RequestMethod.GET)
    public String loginPage() {

        return "login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public ModelAndView login(
            @RequestParam(value = "error", required = false) boolean error,
            @RequestParam(value = "logout", required = false) boolean logout, ModelMap model) {

        if (error) {

            model.addAttribute("error", "Login inválido, ou senha incorreta");

            return new ModelAndView("login", model);
        }

        if (logout) {

            model.addAttribute("logout", "Usuário deslogado");

            return new ModelAndView("login", model);
        }

        return new ModelAndView("redirect:/Blog/");
    }

    @RequestMapping(value = "/denied", method = RequestMethod.GET)
    public ModelAndView acessoNegado() {
        //viewName é sempre a pagina jsp
        return new ModelAndView("error", "mensagem", "Acesso negado, area restrita");
    }
}
