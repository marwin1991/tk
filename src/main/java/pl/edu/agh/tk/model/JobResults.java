package pl.edu.agh.tk.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

/**
 * JobResults
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-04-29T03:31:06.896Z[GMT]")
public class JobResults   {
  @JsonProperty("population")
  private String population = null;

  @JsonProperty("newDf")
  private String newDf = null;

  public JobResults population(String population) {
    this.population = population;
    return this;
  }

  /**
   * URL of the file with 59 parameters for each person (Population Data Frame)
   * @return population
  **/
  @ApiModelProperty(value = "URL of the file with 59 parameters for each person (Population Data Frame)")

  public String getPopulation() {
    return population;
  }

  public void setPopulation(String population) {
    this.population = population;
  }

  public JobResults newDf(String newDf) {
    this.newDf = newDf;
    return this;
  }

  /**
   * URL of the file with the newDF Data Frame
   * @return newDf
  **/
  @ApiModelProperty(value = "URL of the file with the newDF Data Frame")

  public String getNewDf() {
    return newDf;
  }

  public void setNewDf(String newDf) {
    this.newDf = newDf;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JobResults jobResults = (JobResults) o;
    return Objects.equals(this.population, jobResults.population) &&
        Objects.equals(this.newDf, jobResults.newDf);
  }

  @Override
  public int hashCode() {
    return Objects.hash(population, newDf);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobResults {\n");
    
    sb.append("    population: ").append(toIndentedString(population)).append("\n");
    sb.append("    newDf: ").append(toIndentedString(newDf)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
