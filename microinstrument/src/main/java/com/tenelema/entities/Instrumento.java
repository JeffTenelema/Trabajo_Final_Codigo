package com.tenelema.entities;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "instrument")
public class Instrumento {

    @Id
    private String instrumentId;
    @ManyToMany
    @JoinTable(name = "singer_instrument",
            joinColumns = @JoinColumn(name = "instrument_id"),
            inverseJoinColumns = @JoinColumn(name = "singer_id"))
    private Set<Singer> singers = new HashSet<>();

    @Version
    private int version;

    public String getInstrumentId() {
        return instrumentId;
    }
    public void setInstrumentId(String instrumentId) {
        this.instrumentId = instrumentId;
    }
    public Set<Singer> getSingers() {
        return singers;
    }
    public void setSingers(Set<Singer> singers) {
        this.singers = singers;
    }
    public int getVersion() {
        return version;
    }
    public void setVersion(int version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return "Instrument{" +
                "instrumentId='" + instrumentId + '\'' +
                '}';
    }

}
