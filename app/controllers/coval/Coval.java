package controllers.coval;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import models.coval.Command;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
public @interface Coval {
    public Class<? extends Command> command();

    public String paramName();
}
