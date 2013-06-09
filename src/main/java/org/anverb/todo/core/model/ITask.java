package org.anverb.todo.core.model;

/**
 * Most common task interface that provides a
 * read-only way to get task data.
 *
 * @author Anver
 * @version 0.1, 09.06.13
 */
public interface ITask {
    /**
     * Get task name.
     *
     * @return task name
     */
    String getName();

    /**
     * Get task notes / description.
     *
     * @return task notes
     */
    String getNotes();

    /**
     * Show if task were finished.
     *
     * @return true if task is finished
     */
    boolean isFinished();
}
