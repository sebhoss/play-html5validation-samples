package models;

import javax.persistence.Entity;

import play.data.validation.Email;
import play.data.validation.Range;
import play.data.validation.Required;
import play.data.validation.URL;
import play.db.jpa.Model;

/**
 * <p>
 * A simple model with several restricted fields.
 * </p>
 */
@SuppressWarnings("serial")
@Entity
public class Task extends Model {

    /**
     * <p>
     * Every task requires more details.
     * </p>
     * <p>
     * This configuration adds <code>required="required"</code> to the HTML output for this field.
     * </p>
     */
    @Required
    public String       details;

    /**
     * <p>
     * Each task requires a priority which can be any number between 1 and 10.
     * </p>
     * <p>
     * This configuration adds <code>required="required" min="1" max="10"</code> to the HTML output for this field.
     * </p>
     */
    @Required
    @Range(min = 1, max = 10)
    public int          priority;

    /**
     * <p>
     * Every task requires the e-mail address of the task's author.
     * </p>
     * <p>
     * This configuration adds <code>required="required" type="email"</code> to the HTML output for this field.
     * </p>
     */
    @Required
    @Email
    public String       authorEmail;

    /**
     * <p>
     * Every task requires the URL of the task's author.
     * </p>
     * <p>
     * This configuration adds <code>required="required" type="url"</code> to the HTML output for this field.
     * </p>
     */
    @Required
    @URL
    public String       authorUrl;

    /**
     * <p>
     * A simple constant value that can not be changed.
     * </p>
     * <p>
     * This configuration adds <code>readonly="readonly"</code> to the HTML output for this field.
     * </p>
     */
    public final String CONSTANT = "hey there"; //$NON-NLS-1$
}
