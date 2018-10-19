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
@JsonPropertyOrder({ "sequence", "witness", "prev_out", "script" })
public class Input {

	@JsonProperty("sequence")
	private Integer sequence;
	@JsonProperty("witness")
	private String witness;
	@JsonProperty("prev_out")
	private PrevOut prevOut;
	@JsonProperty("script")
	private String script;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<>();

	@JsonProperty("sequence")
	public Integer getSequence() {
		return sequence;
	}

	@JsonProperty("sequence")
	public void setSequence(Integer sequence) {
		this.sequence = sequence;
	}

	public Input withSequence(Integer sequence) {
		this.sequence = sequence;
		return this;
	}

	@JsonProperty("witness")
	public String getWitness() {
		return witness;
	}

	@JsonProperty("witness")
	public void setWitness(String witness) {
		this.witness = witness;
	}

	public Input withWitness(String witness) {
		this.witness = witness;
		return this;
	}

	@JsonProperty("prev_out")
	public PrevOut getPrevOut() {
		return prevOut;
	}

	@JsonProperty("prev_out")
	public void setPrevOut(PrevOut prevOut) {
		this.prevOut = prevOut;
	}

	public Input withPrevOut(PrevOut prevOut) {
		this.prevOut = prevOut;
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

	public Input withScript(String script) {
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

	public Input withAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
		return this;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((additionalProperties == null) ? 0 : additionalProperties.hashCode());
		result = prime * result + ((prevOut == null) ? 0 : prevOut.hashCode());
		result = prime * result + ((script == null) ? 0 : script.hashCode());
		result = prime * result + ((sequence == null) ? 0 : sequence.hashCode());
		result = prime * result + ((witness == null) ? 0 : witness.hashCode());
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
		Input other = (Input) obj;
		if (additionalProperties == null) {
			if (other.additionalProperties != null)
				return false;
		} else if (!additionalProperties.equals(other.additionalProperties))
			return false;
		if (prevOut == null) {
			if (other.prevOut != null)
				return false;
		} else if (!prevOut.equals(other.prevOut))
			return false;
		if (script == null) {
			if (other.script != null)
				return false;
		} else if (!script.equals(other.script))
			return false;
		if (sequence == null) {
			if (other.sequence != null)
				return false;
		} else if (!sequence.equals(other.sequence))
			return false;
		if (witness == null) {
			if (other.witness != null)
				return false;
		} else if (!witness.equals(other.witness))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Input [sequence=" + sequence + ", witness=" + witness + ", prevOut=" + prevOut + ", script=" + script
				+ ", additionalProperties=" + additionalProperties + "]";
	}

}