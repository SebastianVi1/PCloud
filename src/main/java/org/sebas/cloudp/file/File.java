package org.sebas.cloudp.file;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.sebas.cloudp.common.BaseEntity;
import org.sebas.cloudp.folder.Folder;
import org.sebas.cloudp.user.User;

@Entity
@Table(name = "files")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class File extends BaseEntity {

    @Column(nullable = false)
    @Setter @NotBlank(message = "The name cannot be null")
    @NotNull(message = "File name cannot be null")
    private String name;

    @Column(nullable = false)
    private long size;

    @Column(nullable = false)
    private String contentType;

    @Column(nullable = false)
    @Setter
    private String storagePath;

    @Column(nullable = false)
    private String checksum;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "owner_id", nullable = false)
    private User owner;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "folder_id", nullable = false)
    private Folder folder; // folder who owns the file
}
