package org.sebas.cloudp.share;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;
import org.sebas.cloudp.common.BaseEntity;
import org.sebas.cloudp.file.File;

import java.time.Instant;

@Entity
@Table(name = "share_links")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class ShareLink extends BaseEntity {

    @Column(nullable = false, unique = true)
    @NotBlank(message = "Token cannot be blank")
    private String token;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "file_id", nullable = false)
    private File file;

    @Column(nullable=false)
    private Instant expiresAt;

}
