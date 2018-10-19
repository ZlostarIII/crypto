package com.sapienza.crypto.models;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "spent", "tx_index", "type", "addr", "value", "n", "script" })
public class PrevOut {

	@JsonProperty("spent")
	private Boolean spent;
	@JsonProperty("tx_index")
	private Integer txIndex;
	@JsonProperty("type")
	private Integer type;
	@JsonProperty("addr")
	private String addr;
	@JsonProperty("value")
	private Integer value;
	@JsonProperty("n")
	private Integer n;
	@JsonProperty("script")
	private String script;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<>();

	@JsonProperty("spent")
	public Boolean getSpent() {
		return spent;
	}

	@JsonProperty("spent")
	public void setSpent(Boolean spent) {
		this.spent = spent;
	}

	public PrevOut withSpent(Boolean spent) {
		this.spent = spent;
		return this;
	}

	@JsonProperty("tx_index")
	public Integer getTxIndex() {
		return txIndex;
	}

	@JsonProperty("tx_index")
	public void setTxIndex(Integer txIndex) {
		this.txIndex = txIndex;
	}

	public PrevOut withTxIndex(Integer txIndex) {
		this.txIndex = txIndex;
		return this;
	}

	@JsonProperty("type")
	public Integer getType() {
		return type;
	}

	@JsonProperty("type")
	public void setType(Integer type) {
		this.type = type;
	}

	public PrevOut withType(Integer type) {
		this.type = type;
		return this;
	}

	@JsonProperty("addr")
	public String getAddr() {
		return addr;
	}

	@JsonProperty("addr")
	public void setAddr(String addr) {
		this.addr = addr;
	}

	public PrevOut withAddr(String addr) {
		this.addr = addr;
		return this;
	}

	@JsonProperty("value")
	public Integer getValue() {
		return value;
	}

	@JsonProperty("value")
	public void setValue(Integer value) {
		this.value = value;
	}

	public PrevOut withValue(Integer value) {
		this.value = value;
		return this;
	}

	@JsonProperty("n")
	public Integer getN() {
		return n;
	}

	@JsonProperty("n")
	public void setN(Integer n) {
		this.n = n;
	}

	public PrevOut withN(Integer n) {
		this.n = n;
		return this;
	}

	@JsonProperty("script")
	public String getScript() {
		return script;
	}

	@JsonProperty("script")
	public void setScript(String script) {
		this.script = script;
	}

	public PrevOut withScript(String script) {
		this.script = script;
		return this;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

	public PrevOut withAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
		return this;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((additionalProperties == null) ? 0 : additionalProperties.hashCode());
		result = prime * result + ((addr == null) ? 0 : addr.hashCode());
		result = prime * result + ((n == null) ? 0 : n.hashCode());
		result = prime * result + ((script == null) ? 0 : script.hashCode());
		result = prime * result + ((spent == null) ? 0 : spent.hashCode());
		result = prime * result + ((txIndex == null) ? 0 : txIndex.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		result = prime * result + ((value == null) ? 0 : value.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PrevOut other = (PrevOut) obj;
		if (additionalProperties == null) {
			if (other.additionalProperties != null)
				return false;
		} else if (!additionalProperties.equals(other.additionalProperties))
			return false;
		if (addr == null) {
			if (other.addr != null)
				return false;
		} else if (!addr.equals(other.addr))
			return false;
		if (n == null) {
			if (other.n != null)
				return false;
		} else if (!n.equals(other.n))
			return false;
		if (script == null) {
			if (other.script != null)
				return false;
		} else if (!script.equals(other.script))
			return false;
		if (spent == null) {
			if (other.spent != null)
				return false;
		} else if (!spent.equals(other.spent))
			return false;
		if (txIndex == null) {
			if (other.txIndex != null)
				return false;
		} else if (!txIndex.equals(other.txIndex))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		if (value == null) {
			if (other.value != null)
				return false;
		} else if (!value.equals(other.value))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "PrevOut [spent=" + spent + ", txIndex=" + txIndex + ", type=" + type + ", addr=" + addr + ", value="
				+ value + ", n=" + n + ", script=" + script + ", additionalProperties=" + additionalProperties + "]";
	}

}