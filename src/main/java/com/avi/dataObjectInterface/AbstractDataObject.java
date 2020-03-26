package com.avi.dataObjectInterface;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Calendar;

@Entity
public abstract class AbstractDataObject {
    Calendar createTime;
    Calendar updateTime;
    @Id
    long Id;

    public AbstractDataObject() {
        this.createTime = Calendar.getInstance();
    }

    public Calendar getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Calendar createTime) {
        this.createTime = createTime;
    }

    public Calendar getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Calendar updateTime) {
        this.updateTime = updateTime;
    }

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }
}


// TODO: 3/23/20
//  1. Figure out the design for dataObject
//  2. Implement thhibehie base abstract dataObject, which will need to be extended by all hibernate objects