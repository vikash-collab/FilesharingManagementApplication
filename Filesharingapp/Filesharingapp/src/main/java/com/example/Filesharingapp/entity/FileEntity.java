package com.example.Filesharingapp.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import lombok.Data;

@Entity
@Data
public class FileEntity{

    @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String fileName;
    private String uploadedBy;
    private LocalDateTime uploadTime;
    private LocalDateTime expiryTime;
    
        // In Spring and Java Persistence API (JPA)  
    @Lob     // field should be stored as a large object (LOB),types like BLOB (Binary Large Object) or CLOB (Character Large Object)
    @Column(name = "file_data", columnDefinition="LONGBLOB")
    private byte[] fileData;

} 