package com.example.studentDemo.models;


import jakarta.persistence.*;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Entity
@Table(name = "certificate")
public class Certificate {
    @Id
    @Column(name = "id")
    private Long certificateId;
    @Column(name = "name")
    private String certificateName;
    @Column(name = "rank")
    private String certificateRank;
    @Column(name = "certificate_date")
    @Temporal(value = TemporalType.DATE)
    private LocalDate certificateDate;

    public Certificate() {
    }

    public Certificate(Long certificateId, String certificateName, String certificateRank, LocalDate certificateDate) {
        this.certificateId = certificateId;
        this.certificateName = certificateName;
        this.certificateRank = certificateRank;
        this.certificateDate = certificateDate;
    }

    public Long getCertificateId() {
        return certificateId;
    }

    public void setCertificateId(Long certificateId) {
        this.certificateId = certificateId;
    }

    public String getCertificateName() {
        return certificateName;
    }

    public void setCertificateName(String certificateName) {
        this.certificateName = certificateName;
    }

    public String getCertificateRank() {
        return certificateRank;
    }

    public void setCertificateRank(String certificateRank) {
        this.certificateRank = certificateRank;
    }

    public LocalDate getCertificateDate() {
        return certificateDate;
    }

    public void setCertificateDate(LocalDate certificateDate) {
        this.certificateDate = certificateDate;
    }
}
