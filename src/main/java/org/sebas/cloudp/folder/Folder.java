package org.sebas.cloudp.folder;

import jakarta.persistence.*;
import org.sebas.cloudp.common.BaseEntity;
import org.sebas.cloudp.user.User;

@Entity
@Table(name = "folders")
public class Folder extends BaseEntity {

    @Column(nullable = false)
    private String folderName;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private User owner;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "parent_id")
    private Folder parent;
}
