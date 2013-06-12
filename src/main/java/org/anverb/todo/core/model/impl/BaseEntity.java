package org.anverb.todo.core.model.impl;

import java.util.Date;

/**
 * TODO: Place javadocs here
 *
 * @author Anver
 * @version 0.1, 09.06.13
 */
public class BaseEntity {
    protected Date createdAt;
    protected Date updatedAt;

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}
