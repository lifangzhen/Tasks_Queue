package org.anverb.todo.core.model;

/**
 * Configurable task interface provides a way
 * to perform task data modification.
 *
 * @author Anver
 * @version 0.1, 09.06.13
 */
public interface IConfigurableTask extends ITask {
    /**
     * Set task new name.
     *
     * @param name - new task name
     */
    void setName(String name);

    /**
     * Set task new notes / new description.
     *
     * @param notes - new notes
     */
    void setNotes(String notes);

    /**
     * Set task was finished or not.
     *
     * @param isFinished - finished flag
     */
    void setFinished(boolean isFinished);
}
