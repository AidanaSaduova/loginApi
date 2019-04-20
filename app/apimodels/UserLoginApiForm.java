package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * UserLoginApiForm
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-04-20T20:49:34.098+02:00")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class UserLoginApiForm   {
  @JsonProperty("gaId")
  private String gaId = null;

  @JsonProperty("adId")
  private String adId = null;

  @JsonProperty("apnId")
  private String apnId = null;

  @JsonProperty("gcmId")
  private String gcmId = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("password")
  private String password = null;

  @JsonProperty("phone")
  private String phone = null;

  @JsonProperty("phoneCc")
  private String phoneCc = null;

  @JsonProperty("uuid")
  private String uuid = null;

  @JsonProperty("authcode")
  private String authcode = null;

  public UserLoginApiForm gaId(String gaId) {
    this.gaId = gaId;
    return this;
  }

   /**
   * Get gaId
   * @return gaId
  **/
    public String getGaId() {
    return gaId;
  }

  public void setGaId(String gaId) {
    this.gaId = gaId;
  }

  public UserLoginApiForm adId(String adId) {
    this.adId = adId;
    return this;
  }

   /**
   * Get adId
   * @return adId
  **/
    public String getAdId() {
    return adId;
  }

  public void setAdId(String adId) {
    this.adId = adId;
  }

  public UserLoginApiForm apnId(String apnId) {
    this.apnId = apnId;
    return this;
  }

   /**
   * Get apnId
   * @return apnId
  **/
    public String getApnId() {
    return apnId;
  }

  public void setApnId(String apnId) {
    this.apnId = apnId;
  }

  public UserLoginApiForm gcmId(String gcmId) {
    this.gcmId = gcmId;
    return this;
  }

   /**
   * Get gcmId
   * @return gcmId
  **/
    public String getGcmId() {
    return gcmId;
  }

  public void setGcmId(String gcmId) {
    this.gcmId = gcmId;
  }

  public UserLoginApiForm name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public UserLoginApiForm password(String password) {
    this.password = password;
    return this;
  }

   /**
   * Get password
   * @return password
  **/
    public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public UserLoginApiForm phone(String phone) {
    this.phone = phone;
    return this;
  }

   /**
   * Get phone
   * @return phone
  **/
    public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public UserLoginApiForm phoneCc(String phoneCc) {
    this.phoneCc = phoneCc;
    return this;
  }

   /**
   * Get phoneCc
   * @return phoneCc
  **/
    public String getPhoneCc() {
    return phoneCc;
  }

  public void setPhoneCc(String phoneCc) {
    this.phoneCc = phoneCc;
  }

  public UserLoginApiForm uuid(String uuid) {
    this.uuid = uuid;
    return this;
  }

   /**
   * Get uuid
   * @return uuid
  **/
    public String getUuid() {
    return uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  public UserLoginApiForm authcode(String authcode) {
    this.authcode = authcode;
    return this;
  }

   /**
   * Get authcode
   * @return authcode
  **/
    public String getAuthcode() {
    return authcode;
  }

  public void setAuthcode(String authcode) {
    this.authcode = authcode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserLoginApiForm userLoginApiForm = (UserLoginApiForm) o;
    return Objects.equals(gaId, userLoginApiForm.gaId) &&
        Objects.equals(adId, userLoginApiForm.adId) &&
        Objects.equals(apnId, userLoginApiForm.apnId) &&
        Objects.equals(gcmId, userLoginApiForm.gcmId) &&
        Objects.equals(name, userLoginApiForm.name) &&
        Objects.equals(password, userLoginApiForm.password) &&
        Objects.equals(phone, userLoginApiForm.phone) &&
        Objects.equals(phoneCc, userLoginApiForm.phoneCc) &&
        Objects.equals(uuid, userLoginApiForm.uuid) &&
        Objects.equals(authcode, userLoginApiForm.authcode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gaId, adId, apnId, gcmId, name, password, phone, phoneCc, uuid, authcode);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserLoginApiForm {\n");
    
    sb.append("    gaId: ").append(toIndentedString(gaId)).append("\n");
    sb.append("    adId: ").append(toIndentedString(adId)).append("\n");
    sb.append("    apnId: ").append(toIndentedString(apnId)).append("\n");
    sb.append("    gcmId: ").append(toIndentedString(gcmId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    phoneCc: ").append(toIndentedString(phoneCc)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    authcode: ").append(toIndentedString(authcode)).append("\n");
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

