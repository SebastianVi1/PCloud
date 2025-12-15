package org.sebas.cloudp.share;

import jakarta.persistence.*;
import org.sebas.cloudp.common.BaseEntity;
import org.sebas.cloudp.file.File;

import java.time.Instant;

@Entity
@Table(name = "share_links")
public class ShareLink extends BaseEntity {
    @Column(nullable = false, unique = true)
    private String token;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private File file;

    private Instant expiresAt;

}
