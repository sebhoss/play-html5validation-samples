package controllers;

import models.Task;
import play.data.validation.Valid;
import play.mvc.Controller;

/**
 *  <p>
 *  A sample application controller which can {@link #save(Task) save} a single task and show it via a template.
 *  </p>
 */
public class Application extends Controller {

    /**
     * <p>
     * The index page shows a single {@link Task task} and offers the ability to edit and save it.
     * </p>
     */
    public static void index() {
        final Task task = new Task();

        Controller.render(task);
    }

    /**
     * <p>
     * Pseudo-saves a tasks and renders it again.
     * </p>
     * 
     * @param task  The task to save.
     */
    public static void save(@Valid final Task task) {
        Controller.render("Application/index.html", task); //$NON-NLS-1$
    }

}