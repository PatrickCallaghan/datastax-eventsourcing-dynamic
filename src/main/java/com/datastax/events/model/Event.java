package com.datastax.events.model;

import java.util.Date;
import java.util.Map;
import java.util.UUID;

public class Event {
	
	private UUID id; 
	private String aggregateType; 
	private String host; 
	private String loglevel; 	
	private String data; 
	private Date time; 
	private String eventtype;
	private Map<String, Integer> p_;
	
	public UUID getId() {
		return id;
	}
	public void setId(UUID id) {
		this.id = id;
	}
	public String getAggregateType() {
		return aggregateType;
	}
	public void setAggregateType(String aggregateType) {
		this.aggregateType = aggregateType;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	public String getEventtype() {
		return eventtype;
	}
	public void setEventtype(String eventtype) {
		this.eventtype = eventtype;
	}
	public String getLoglevel() {
		return loglevel;
	}
	public void setLoglevel(String loglevel) {
		this.loglevel = loglevel;
	}
	public String getHost() {
		return host;
	}
	public void setHost(String host) {
		this.host = host;
	}
	@Override
	public String toString() {
		return "Event [id=" + id + ", aggregateType=" + aggregateType + ", host=" + host + ", loglevel=" + loglevel
				+ ", data=" + data + ", time=" + time + ", eventtype=" + eventtype + "]";
	}
	public Map<String, Integer> getProperties() {
		return p_;
	}
	public void setProperties(Map<String, Integer> p_) {
		this.p_ = p_;
	}
	
}
