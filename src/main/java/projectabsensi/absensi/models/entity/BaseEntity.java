package projectabsensi.absensi.models.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.DynamicUpdate;
import projectabsensi.absensi.AbsensiApplication;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


@Getter
@Setter
@DynamicUpdate
@MappedSuperclass
@NoArgsConstructor
@SuppressWarnings("unchecked")
public abstract class BaseEntity<T> implements Serializable {


    private static final long serialVersionUID = 5395811566850950905L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "created_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdTime;

    @Column(name = "deleted")
    private Boolean deleted = Boolean.FALSE;

    @Column(name = "deleted_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date deletedTime;

    @Column(name = "updated_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedTime;

    @Column(name = "created_by")
    private Long createdBy;

    @Column(name = "deleted_by")
    private Long deletedBy;

    @Column(name = "updated_by")
    private Long updatedBy;

//    @PrePersist
//    protected void onCreate() {
//        setCreatedTime(new Date());
//        setCreatedBy(AbsensiApplication.getCurrentUser() != null
//                ? AbsensiApplication.getCurrentUser().getId()
//                : 0);
//    }

//    @PreRemove
//    protected void onRemove() {
//        setDeleted(Boolean.TRUE);
//        setDeletedTime(new Date());
//    }

//    @PreUpdate
//    protected void onUpdate() {
//        setUpdatedTime(new Date());
//        setUpdatedBy(AbsensiApplication.getCurrentUser() != null
//                ? AbsensiApplication.getCurrentUser().getId() : 0);
//    }
}
