package pl.warkoczewski.apteka.Apteka.model;


import java.time.LocalDate;
import java.time.LocalDateTime;

public class Lek {

    private Long id;
    private String name;
    private LocalDate expiresAt;
    private Long amount;


    public Lek(Long id, String name, LocalDate expiresAt, Long amount) {
        this.id = id;
        this.name = name;
        this.expiresAt = expiresAt;
        this.amount = amount;
    }

    public Lek() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public LocalDate getExpiresAt() {
        return expiresAt;
    }

    public void setExpiresAt(LocalDate expiresAt) {
        this.expiresAt = expiresAt;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

}
