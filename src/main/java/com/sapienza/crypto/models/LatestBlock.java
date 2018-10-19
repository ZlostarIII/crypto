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
@JsonPropertyOrder({ "hash", "time", "block_index", "height", "txIndexes" })
public class LatestBlock {

	@JsonProperty("hash")
	private String hash;
	@JsonProperty("time")
	private Integer time;
	@JsonProperty("block_index")
	private Integer blockIndex;
	@JsonProperty("height")
	private Integer height;
	@JsonProperty("txIndexes")
	private List<Integer> txIndexes = null;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<>();

	@JsonProperty("hash")
	public String getHash() {
		return hash;
	}

	@JsonProperty("hash")
	public void setHash(String hash) {
		this.hash = hash;
	}

	public LatestBlock withHash(String hash) {
		this.hash = hash;
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

	public LatestBlock withTime(Integer time) {
		this.time = time;
		return this;
	}

	@JsonProperty("block_index")
	public Integer getBlockIndex() {
		return blockIndex;
	}

	@JsonProperty("block_index")
	public void setBlockIndex(Integer blockIndex) {
		this.blockIndex = blockIndex;
	}

	public LatestBlock withBlockIndex(Integer blockIndex) {
		this.blockIndex = blockIndex;
		return this;
	}

	@JsonProperty("height")
	public Integer getHeight() {
		return height;
	}

	@JsonProperty("height")
	public void setHeight(Integer height) {
		this.height = height;
	}

	public LatestBlock withHeight(Integer height) {
		this.height = height;
		return this;
	}

	@JsonProperty("txIndexes")
	public List<Integer> getTxIndexes() {
		return txIndexes;
	}

	@JsonProperty("txIndexes")
	public void setTxIndexes(List<Integer> txIndexes) {
		this.txIndexes = txIndexes;
	}

	public LatestBlock withTxIndexes(List<Integer> txIndexes) {
		this.txIndexes = txIndexes;
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

	public LatestBlock withAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
		return this;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((additionalProperties == null) ? 0 : additionalProperties.hashCode());
		result = prime * result + ((blockIndex == null) ? 0 : blockIndex.hashCode());
		result = prime * result + ((hash == null) ? 0 : hash.hashCode());
		result = prime * result + ((height == null) ? 0 : height.hashCode());
		result = prime * result + ((time == null) ? 0 : time.hashCode());
		result = prime * result + ((txIndexes == null) ? 0 : txIndexes.hashCode());
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
		LatestBlock other = (LatestBlock) obj;
		if (additionalProperties == null) {
			if (other.additionalProperties != null)
				return false;
		} else if (!additionalProperties.equals(other.additionalProperties))
			return false;
		if (blockIndex == null) {
			if (other.blockIndex != null)
				return false;
		} else if (!blockIndex.equals(other.blockIndex))
			return false;
		if (hash == null) {
			if (other.hash != null)
				return false;
		} else if (!hash.equals(other.hash))
			return false;
		if (height == null) {
			if (other.height != null)
				return false;
		} else if (!height.equals(other.height))
			return false;
		if (time == null) {
			if (other.time != null)
				return false;
		} else if (!time.equals(other.time))
			return false;
		if (txIndexes == null) {
			if (other.txIndexes != null)
				return false;
		} else if (!txIndexes.equals(other.txIndexes))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "LatestBlock [hash=" + hash + ", time=" + time + ", blockIndex=" + blockIndex + ", height=" + height
				+ ", txIndexes=" + txIndexes + ", additionalProperties=" + additionalProperties + "]";
	}

}