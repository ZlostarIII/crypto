package com.sapienza.crypto.models;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "ver", "inputs", "weight", "relayed_by", "out", "lock_time", "size", "double_spend", "time",
		"tx_index", "vin_sz", "hash", "vout_sz" })
public class UnconfirmedTransaction {

	@JsonProperty("ver")
	private Integer ver;
	@JsonProperty("inputs")
	private List<Input> inputs = null;
	@JsonProperty("weight")
	private Integer weight;
	@JsonProperty("relayed_by")
	private String relayedBy;
	@JsonProperty("out")
	private List<Out> out = null;
	@JsonProperty("lock_time")
	private Integer lockTime;
	@JsonProperty("size")
	private Integer size;
	@JsonProperty("double_spend")
	private Boolean doubleSpend;
	@JsonProperty("time")
	private Integer time;
	@JsonProperty("tx_index")
	private Integer txIndex;
	@JsonProperty("vin_sz")
	private Integer vinSz;
	@JsonProperty("hash")
	private String hash;
	@JsonProperty("vout_sz")
	private Integer voutSz;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<>();

	@JsonProperty("ver")
	public Integer getVer() {
		return ver;
	}

	@JsonProperty("ver")
	public void setVer(Integer ver) {
		this.ver = ver;
	}

	public UnconfirmedTransaction withVer(Integer ver) {
		this.ver = ver;
		return this;
	}

	@JsonProperty("inputs")
	public List<Input> getInputs() {
		return inputs;
	}

	@JsonProperty("inputs")
	public void setInputs(List<Input> inputs) {
		this.inputs = inputs;
	}

	public UnconfirmedTransaction withInputs(List<Input> inputs) {
		this.inputs = inputs;
		return this;
	}

	@JsonProperty("weight")
	public Integer getWeight() {
		return weight;
	}

	@JsonProperty("weight")
	public void setWeight(Integer weight) {
		this.weight = weight;
	}

	public UnconfirmedTransaction withWeight(Integer weight) {
		this.weight = weight;
		return this;
	}

	@JsonProperty("relayed_by")
	public String getRelayedBy() {
		return relayedBy;
	}

	@JsonProperty("relayed_by")
	public void setRelayedBy(String relayedBy) {
		this.relayedBy = relayedBy;
	}

	public UnconfirmedTransaction withRelayedBy(String relayedBy) {
		this.relayedBy = relayedBy;
		return this;
	}

	@JsonProperty("out")
	public List<Out> getOut() {
		return out;
	}

	@JsonProperty("out")
	public void setOut(List<Out> out) {
		this.out = out;
	}

	public UnconfirmedTransaction withOut(List<Out> out) {
		this.out = out;
		return this;
	}

	@JsonProperty("lock_time")
	public Integer getLockTime() {
		return lockTime;
	}

	@JsonProperty("lock_time")
	public void setLockTime(Integer lockTime) {
		this.lockTime = lockTime;
	}

	public UnconfirmedTransaction withLockTime(Integer lockTime) {
		this.lockTime = lockTime;
		return this;
	}

	@JsonProperty("size")
	public Integer getSize() {
		return size;
	}

	@JsonProperty("size")
	public void setSize(Integer size) {
		this.size = size;
	}

	public UnconfirmedTransaction withSize(Integer size) {
		this.size = size;
		return this;
	}

	@JsonProperty("double_spend")
	public Boolean getDoubleSpend() {
		return doubleSpend;
	}

	@JsonProperty("double_spend")
	public void setDoubleSpend(Boolean doubleSpend) {
		this.doubleSpend = doubleSpend;
	}

	public UnconfirmedTransaction withDoubleSpend(Boolean doubleSpend) {
		this.doubleSpend = doubleSpend;
		return this;
	}

	@JsonProperty("time")
	public Integer getTime() {
		return time;
	}

	@JsonProperty("time")
	public void setTime(Integer time) {
		this.time = time;
	}

	public UnconfirmedTransaction withTime(Integer time) {
		this.time = time;
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

	public UnconfirmedTransaction withTxIndex(Integer txIndex) {
		this.txIndex = txIndex;
		return this;
	}

	@JsonProperty("vin_sz")
	public Integer getVinSz() {
		return vinSz;
	}

	@JsonProperty("vin_sz")
	public void setVinSz(Integer vinSz) {
		this.vinSz = vinSz;
	}

	public UnconfirmedTransaction withVinSz(Integer vinSz) {
		this.vinSz = vinSz;
		return this;
	}

	@JsonProperty("hash")
	public String getHash() {
		return hash;
	}

	@JsonProperty("hash")
	public void setHash(String hash) {
		this.hash = hash;
	}

	public UnconfirmedTransaction withHash(String hash) {
		this.hash = hash;
		return this;
	}

	@JsonProperty("vout_sz")
	public Integer getVoutSz() {
		return voutSz;
	}

	@JsonProperty("vout_sz")
	public void setVoutSz(Integer voutSz) {
		this.voutSz = voutSz;
	}

	public UnconfirmedTransaction withVoutSz(Integer voutSz) {
		this.voutSz = voutSz;
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

	public UnconfirmedTransaction withAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
		return this;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((additionalProperties == null) ? 0 : additionalProperties.hashCode());
		result = prime * result + ((doubleSpend == null) ? 0 : doubleSpend.hashCode());
		result = prime * result + ((hash == null) ? 0 : hash.hashCode());
		result = prime * result + ((inputs == null) ? 0 : inputs.hashCode());
		result = prime * result + ((lockTime == null) ? 0 : lockTime.hashCode());
		result = prime * result + ((out == null) ? 0 : out.hashCode());
		result = prime * result + ((relayedBy == null) ? 0 : relayedBy.hashCode());
		result = prime * result + ((size == null) ? 0 : size.hashCode());
		result = prime * result + ((time == null) ? 0 : time.hashCode());
		result = prime * result + ((txIndex == null) ? 0 : txIndex.hashCode());
		result = prime * result + ((ver == null) ? 0 : ver.hashCode());
		result = prime * result + ((vinSz == null) ? 0 : vinSz.hashCode());
		result = prime * result + ((voutSz == null) ? 0 : voutSz.hashCode());
		result = prime * result + ((weight == null) ? 0 : weight.hashCode());
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
		UnconfirmedTransaction other = (UnconfirmedTransaction) obj;
		if (additionalProperties == null) {
			if (other.additionalProperties != null)
				return false;
		} else if (!additionalProperties.equals(other.additionalProperties))
			return false;
		if (doubleSpend == null) {
			if (other.doubleSpend != null)
				return false;
		} else if (!doubleSpend.equals(other.doubleSpend))
			return false;
		if (hash == null) {
			if (other.hash != null)
				return false;
		} else if (!hash.equals(other.hash))
			return false;
		if (inputs == null) {
			if (other.inputs != null)
				return false;
		} else if (!inputs.equals(other.inputs))
			return false;
		if (lockTime == null) {
			if (other.lockTime != null)
				return false;
		} else if (!lockTime.equals(other.lockTime))
			return false;
		if (out == null) {
			if (other.out != null)
				return false;
		} else if (!out.equals(other.out))
			return false;
		if (relayedBy == null) {
			if (other.relayedBy != null)
				return false;
		} else if (!relayedBy.equals(other.relayedBy))
			return false;
		if (size == null) {
			if (other.size != null)
				return false;
		} else if (!size.equals(other.size))
			return false;
		if (time == null) {
			if (other.time != null)
				return false;
		} else if (!time.equals(other.time))
			return false;
		if (txIndex == null) {
			if (other.txIndex != null)
				return false;
		} else if (!txIndex.equals(other.txIndex))
			return false;
		if (ver == null) {
			if (other.ver != null)
				return false;
		} else if (!ver.equals(other.ver))
			return false;
		if (vinSz == null) {
			if (other.vinSz != null)
				return false;
		} else if (!vinSz.equals(other.vinSz))
			return false;
		if (voutSz == null) {
			if (other.voutSz != null)
				return false;
		} else if (!voutSz.equals(other.voutSz))
			return false;
		if (weight == null) {
			if (other.weight != null)
				return false;
		} else if (!weight.equals(other.weight))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "UnconfirmedTransaction [ver=" + ver + ", inputs=" + inputs + ", weight=" + weight + ", relayedBy="
				+ relayedBy + ", out=" + out + ", lockTime=" + lockTime + ", size=" + size + ", doubleSpend="
				+ doubleSpend + ", time=" + time + ", txIndex=" + txIndex + ", vinSz=" + vinSz + ", hash=" + hash
				+ ", voutSz=" + voutSz + ", additionalProperties=" + additionalProperties + "]";
	}

}