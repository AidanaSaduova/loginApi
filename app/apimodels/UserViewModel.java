package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * UserViewModel
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-04-20T20:49:34.098+02:00")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class UserViewModel   {
  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("token")
  private String token = null;

  @JsonProperty("referralCode")
  private String referralCode = null;

  @JsonProperty("isResponsive")
  private Boolean isResponsive = null;

  public UserViewModel id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
    public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public UserViewModel token(String token) {
    this.token = token;
    return this;
  }

   /**
   * Get token
   * @return token
  **/
    public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }

  public UserViewModel referralCode(String referralCode) {
    this.referralCode = referralCode;
    return this;
  }

   /**
   * Get referralCode
   * @return referralCode
  **/
    public String getReferralCode() {
    return referralCode;
  }

  public void setReferralCode(String referralCode) {
    this.referralCode = referralCode;
  }

  public UserViewModel isResponsive(Boolean isResponsive) {
    this.isResponsive = isResponsive;
    return this;
  }

   /**
   * Get isResponsive
   * @return isResponsive
  **/
    public Boolean isIsResponsive() {
    return isResponsive;
  }

  public void setIsResponsive(Boolean isResponsive) {
    this.isResponsive = isResponsive;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserViewModel userViewModel = (UserViewModel) o;
    return Objects.equals(id, userViewModel.id) &&
        Objects.equals(token, userViewModel.token) &&
        Objects.equals(referralCode, userViewModel.referralCode) &&
        Objects.equals(isResponsive, userViewModel.isResponsive);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, token, referralCode, isResponsive);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserViewModel {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    referralCode: ").append(toIndentedString(referralCode)).append("\n");
    sb.append("    isResponsive: ").append(toIndentedString(isResponsive)).append("\n");
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

