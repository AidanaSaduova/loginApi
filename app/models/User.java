package models;


import Enums.Language;
import org.joda.time.DateTime;
import play.data.validation.Constraints;

import javax.persistence.*;

@Entity
@Table(name = "appuser")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @Column(length = 255,nullable = true)
    @Constraints.MaxLength(30)
    @Constraints.MinLength(6)
    public String password;

    @Column(length = 30, nullable = false, unique = true)
    @Constraints.MaxLength(30)
    @Constraints.MinLength(3)
    @Constraints.Required
    public String username;

    @Column(name="apn_id", length = 500, unique = true)
    @Constraints.MaxLength(500)
    public String apnId;

    @Column(nullable = true)
    public DateTime apnRegisteredAt;

    @Constraints.Required
    @Column(nullable = false, updatable = false)
    public DateTime createdAt;

    @Column(length = 255, nullable = false, unique = true)
    @Constraints.Email
    @Constraints.MaxLength(255)
    @Constraints.Required
    public String email;

    @Column(name = "gcm_id", length = 500, unique = true)
    @Constraints.MaxLength(500)
    public String gcmId;

    @Column(length = 50, unique = true)
    @Constraints.MaxLength(50)
    public String phone;

    @Column(nullable = false)
    @Constraints.Min(0)
    public int referredUsers;


    @Constraints.Required
    @Column(nullable = false)
    public boolean settingHd;

    @Constraints.Required
    @Column(nullable = false)
    public boolean settingShowDate;

    @Constraints.Required
    @Column(nullable = false)
    public boolean settingShowLocation;

    @Enumerated(EnumType.STRING)
    @Column(length = 2)
    public Language settingLanguage;


    @Column(length = 255, nullable = false)
    @Constraints.MaxLength(255)
    @Constraints.Required
    public String token;

    @Column(length = 255)
    @Constraints.MaxLength(255)
    public String uuid;

    @Column(nullable = false, columnDefinition = "integer default 0")
    @Constraints.Required
    public int credits;


    @Column(length = 255, nullable = true)
    @Constraints.MaxLength(3000)
    public String facebookId;

    @Column(nullable = false)
    public int unredeemedCreditInvites;

    @Column(nullable = true)
    public String passwordResetToken;

    @Constraints.Required
    @Column(nullable = true, updatable = true)
    public DateTime passwordResetTokenExpiresAt;

    @Column(nullable = false, columnDefinition = "TINYINT(1) DEFAULT 1")
    public boolean hasSeenPhoneNumberConfirmationPopup;

    @Column(name="deleted", nullable=true)
    public boolean deleted;

    @Column(name="ga_id", nullable=true)
    public String gaId;

    @Column(name="ad_id", nullable = true)
    public String adId;

    @Column(name="mail_confirmed")
    public Boolean mailConfirmed;

    @Column(name="mail_confirm_token", nullable = true)
    public String mailConfirmToken;

    @Column(nullable = true, updatable = true)
    public DateTime mailConfirmTokenExpire;

    @Column
    public String mailChangeAdress;


    @Column(name="apz_devicekey")
    public String chatDevicekey;

    @Column(name="apz_userkey")
    public String chatUserkey;


    @Column(name="apz_token")
    public String chatToken;


    @Column(name="referral_code")
    public String referralCode;

    @Column(name="first_name")
    public String firstName;

    @Column(name="last_name")
    public String lastName;

}
