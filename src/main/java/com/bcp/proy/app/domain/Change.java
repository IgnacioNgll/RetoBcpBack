package com.bcp.proy.app.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="tbl_change")
public class Change {

    private @Id
    @GeneratedValue
    Long id;

    @Column(name="origin")
    private String origin;

    @Column(name="destination")
    private String destination;

    @Column(name="value")
    private String value;

    public Change() {
    }

    public Change( String origin, String destination, String value) {

        this.origin = origin;
        this.destination = destination;
        this.value = value;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}
    
}
