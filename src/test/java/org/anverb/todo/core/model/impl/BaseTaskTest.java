package org.anverb.todo.core.model.impl;

import org.anverb.todo.core.model.IConfigurableTask;
import org.anverb.todo.core.model.ITask;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Base task model test.
 *
 * @author Anver
 * @version 0.1, 09.06.13
 */
public class BaseTaskTest {
    /**
     * Task name specified during task creation.
     */
    private String taskName;
    /**
     * Task notes specified during task creation.
     */
    private String notes;
    /**
     * Task name specified during task modification.
     */
    private String taskNameUpdated;
    /**
     * Task notes specified during task modification.
     */
    private String notesUpdated;

    /**
     * Perform initial test data setup.
     */
    @BeforeClass
    public void init() {
        taskName = "Buy milk";
        notes = "Just go to shop and bring some milk!";
        taskNameUpdated = "Other task name";
        notesUpdated = "Yet another description";
    }

    /**
     * Test BaseTask instance creation by name and notes.
     */
    @Test
    public void taskCreationByNameAndNotesTest() {
        ITask task = new BaseTask(taskName, notes);

        assert task.getName().equals(taskName);
        assert task.getNotes().equals(notes);
        assert !task.isFinished();
    }

    /**
     * Test BaseTask instance creation by name only.
     */
    @Test
    public void taskCreationByNameTest() {
        ITask task = new BaseTask(taskName);

        assert task.getName().equals(taskName);
        assert task.getNotes() == null;
        assert !task.isFinished();
    }

    /**
     * Test BaseTask instance modification.
     */
    @Test
    public void taskModificationTest() {
        IConfigurableTask task = new BaseTask(taskName);
        task.setFinished(true);
        task.setName(taskNameUpdated);
        task.setNotes(notesUpdated);

        assert task.getName().equals(taskNameUpdated);
        assert task.getNotes().equals(notesUpdated);
        assert task.isFinished();
    }
}
