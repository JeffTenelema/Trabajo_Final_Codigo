package com.tenelema.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class Instrumento implements Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String instrumentId;
    private Set<Singer> singers = new HashSet<>();
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
