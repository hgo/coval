package controllers.coval;

import models.coval.Command;
import play.Logger;
import play.Play;
import play.mvc.Before;
import play.mvc.Controller;

public class CovalController extends Controller {

    @Before
    static void before() {
        Coval annotation = getActionAnnotation(Coval.class);
        if (annotation != null) {
            Command command = params.get(annotation.paramName(), annotation.command());
            command.validate();
        }
    }
}
