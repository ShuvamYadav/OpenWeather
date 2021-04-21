package in.shuvam.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonPropertyOrder({"id","main","description"})
public class Weather {
	@JsonProperty("id")
	private int id;
	@JsonProperty("main")
	private String main;
	@JsonProperty("description")
	private String description;
	@JsonProperty("id")
	public int getId() {
		return id;
	}
	@JsonProperty("id")
	public void setId(int id) {
		this.id = id;
	}
	@JsonProperty("main")
	public String getMain() {
		return main;
	}
	@JsonProperty("main")
	public void setMain(String main) {
		this.main = main;
	}
	@JsonProperty("description")
	public String getDescription() {
		return description;
	}
	@JsonProperty("description")
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "Weather=\n [id=" + id + ",\n main=" + main + ",\n description=" + description;
	}

}
