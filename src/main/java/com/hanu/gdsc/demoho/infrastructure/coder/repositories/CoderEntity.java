package com.hanu.gdsc.demoho.infrastructure.coder.repositories;

import com.hanu.gdsc.demoho.domain.coder.models.Coder;
import lombok.*;
import org.bson.types.ObjectId;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

@Entity
@Table(name = "coder")
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CoderEntity {
    @Id
    @Column(columnDefinition = "CHAR(36)")
    private String id;
    private String name;
    private int age;

    public static CoderEntity fromDomain(Coder coder) {
        return CoderEntity.builder()
                .id(coder.getId().toString())
                .name(coder.getName())
                .age(coder.getAge())
                .build();
    }

    public Coder toDomain() {
        return new Coder(new ObjectId(id), name, age);
    }
}
