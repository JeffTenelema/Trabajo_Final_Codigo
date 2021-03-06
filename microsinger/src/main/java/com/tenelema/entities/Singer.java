package com.tenelema.entities;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;;

@Entity
@Table(name="singer")
public class Singer {
	
    @Id
    @GeneratedValue
    private Long id;
    
    private String firstName;
    private String lastName;

    @Temporal(TemporalType.DATE)
    private Date birthDate;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "singer", cascade = CascadeType.ALL)
    private Set<Album> albums = new HashSet<>();

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "singer_instrument",
            joinColumns = @JoinColumn(name = "singer_id"),
            inverseJoinColumns = @JoinColumn(name = "instrument_id"))
    private Set<Instrumento> instruments = new HashSet<>();

    private String email;

    @Version
    private int version;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Set<Album> getAlbums() {
        return albums;
    }

    public void setAlbums(Set<Album> albums) {
        this.albums = albums;
    }

    public boolean addAbum(Album album) {
        album.setSinger(this);
        return getAlbums().add(album);
    }

    public boolean addInstrument(Instrumento instrument) {
        return getInstruments().add(instrument);
    }

    public Set<Instrumento> getInstruments() {
        return instruments;
    }

    public void setInstruments(Set<Instrumento> instruments) {
        this.instruments = instruments;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Singer{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthDate=" + birthDate +
                ", email=" + email +
                '}';
    }

}
