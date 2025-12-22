package org.sebas.cloudp.folder;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.sebas.cloudp.common.BaseEntity;
import org.sebas.cloudp.user.User;

@Entity
@Table(name = "folders")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class Folder extends BaseEntity {

    @Column(nullable = false)
    @Setter
    @NotBlank(message = "Folder name cannot be blank")
    @Size(max = 255)
    private String folderName;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private User owner;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "parent_id")
    private Folder parent;
}
