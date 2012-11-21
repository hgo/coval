package models.coval;

import play.data.validation.Validation;

public abstract class Command {
    public void validate() {
        Validation.current().valid(this);
    }
}
