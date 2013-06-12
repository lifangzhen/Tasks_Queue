package org.anverb.todo.core.model.impl;

import org.anverb.todo.core.model.IConfigurableTask;

/**
 * Base task model that contains information
 * about task execution and meaning.
 *
 * @author Anver
 * @version 0.1, 09.06.13
 */
public class BaseTask extends BaseEntity implements IConfigurableTask {
    /**
     * Task name.
     */
    private String name;
    /**
     * Task notes / full description.
     */
    private String notes;
    /**
     * Marker that shows is task finished.
     */
    private boolean isFinished;

    {
        isFinished = false;
    }

    /**
     * Construct new task with name.
     *
     * @param name - task name
     */
    public BaseTask(String name) {
        this(name, null);
    }

    /**
     * Construct new task with name and description.
     *
     * @param name  - task name
     * @param notes - task description
     */
    public BaseTask(String name, String notes) {
        this.name = name;
        this.notes = notes;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setName(String name) {
        this.name = name;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getNotes() {
        return notes;
    }

    /**
     * {@inheritDoc}
     */
    public void setNotes(String notes) {
        this.notes = notes;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isFinished() {
        return isFinished;
    }

    /**
     * {@inheritDoc}
     */
    public void setFinished(boolean finished) {
        isFinished = finished;
    }
}
