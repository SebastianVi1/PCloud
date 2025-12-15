package org.sebas.cloudp.file;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import org.sebas.cloudp.common.BaseEntity;
import org.sebas.cloudp.folder.Folder;
import org.sebas.cloudp.user.User;

@Entity
@Table(name = "files")
public class File extends BaseEntity {

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private long size;

    @Column(nullable = false)
    private String contentType;

    @Column(nullable = false)
    private String storagePath;

    @Column(nullable = false)
    private String checksum;

    @Column(nullable = false)
    private User owner;

    @Column(nullable = false)
    private Folder folder;
}
