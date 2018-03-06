package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.AccountBalance;
import io.swagger.model.CardBalance;
import io.swagger.model.CardStatus;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Both debit and credit cards.
 */
@ApiModel(description = "Both debit and credit cards.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-03-06T17:32:28.136+01:00")

public class Card   {
  @JsonProperty("cardId")
  private String cardId = null;

  @JsonProperty("maskedCardNumber")
  private String maskedCardNumber = null;

  /**
   * Visa, MasterCard, American Express, etc
   */
  public enum CardTypeEnum {
    VISA("VISA"),
    
    MASTERCARD("MASTERCARD"),
    
    AMERICANEXPRESS("AMERICANEXPRESS");

    private String value;

    CardTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static CardTypeEnum fromValue(String text) {
      for (CardTypeEnum b : CardTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("cardType")
  private CardTypeEnum cardType = CardTypeEnum.VISA;

  /**
   * Debit or credit.
   */
  public enum CardGroupEnum {
    DEBIT("DEBIT"),
    
    CREDIT("CREDIT");

    private String value;

    CardGroupEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static CardGroupEnum fromValue(String text) {
      for (CardGroupEnum b : CardGroupEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("cardGroup")
  private CardGroupEnum cardGroup = CardGroupEnum.DEBIT;

  @JsonProperty("accountNumber")
  private String accountNumber = null;

  @JsonProperty("cardStatus")
  private CardStatus cardStatus = null;

  @JsonProperty("blockCode")
  private String blockCode = null;

  @JsonProperty("expiryYear")
  private String expiryYear = null;

  @JsonProperty("expiryMonth")
  private String expiryMonth = null;

  @JsonProperty("debitBalance")
  private AccountBalance debitBalance = null;

  @JsonProperty("creditBalance")
  private CardBalance creditBalance = null;

  public Card cardId(String cardId) {
    this.cardId = cardId;
    return this;
  }

  /**
   * Get cardId
   * @return cardId
  **/
  @ApiModelProperty(example = "12345", required = true, value = "")
  @NotNull


  public String getCardId() {
    return cardId;
  }

  public void setCardId(String cardId) {
    this.cardId = cardId;
  }

  public Card maskedCardNumber(String maskedCardNumber) {
    this.maskedCardNumber = maskedCardNumber;
    return this;
  }

  /**
   * 16 characters: Twelve \"X\", and the last four digits of the card number. No whitespace.
   * @return maskedCardNumber
  **/
  @ApiModelProperty(example = "XXXXXXXXXXXX1234", required = true, value = "16 characters: Twelve \"X\", and the last four digits of the card number. No whitespace.")
  @NotNull

@Pattern(regexp="^X{12}\\d{4}$") @Size(min=16,max=16) 
  public String getMaskedCardNumber() {
    return maskedCardNumber;
  }

  public void setMaskedCardNumber(String maskedCardNumber) {
    this.maskedCardNumber = maskedCardNumber;
  }

  public Card cardType(CardTypeEnum cardType) {
    this.cardType = cardType;
    return this;
  }

  /**
   * Visa, MasterCard, American Express, etc
   * @return cardType
  **/
  @ApiModelProperty(example = "VISA", required = true, value = "Visa, MasterCard, American Express, etc")
  @NotNull


  public CardTypeEnum getCardType() {
    return cardType;
  }

  public void setCardType(CardTypeEnum cardType) {
    this.cardType = cardType;
  }

  public Card cardGroup(CardGroupEnum cardGroup) {
    this.cardGroup = cardGroup;
    return this;
  }

  /**
   * Debit or credit.
   * @return cardGroup
  **/
  @ApiModelProperty(example = "DEBIT", required = true, value = "Debit or credit.")
  @NotNull


  public CardGroupEnum getCardGroup() {
    return cardGroup;
  }

  public void setCardGroup(CardGroupEnum cardGroup) {
    this.cardGroup = cardGroup;
  }

  public Card accountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
    return this;
  }

  /**
   * Both for debit and credit cards
   * @return accountNumber
  **/
  @ApiModelProperty(example = "12345678901", required = true, value = "Both for debit and credit cards")
  @NotNull

@Pattern(regexp="^\\d{11}$") @Size(min=11,max=11) 
  public String getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }

  public Card cardStatus(CardStatus cardStatus) {
    this.cardStatus = cardStatus;
    return this;
  }

  /**
   * Get cardStatus
   * @return cardStatus
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public CardStatus getCardStatus() {
    return cardStatus;
  }

  public void setCardStatus(CardStatus cardStatus) {
    this.cardStatus = cardStatus;
  }

  public Card blockCode(String blockCode) {
    this.blockCode = blockCode;
    return this;
  }

  /**
   * If blocked: Code for the blocking reason.
   * @return blockCode
  **/
  @ApiModelProperty(example = "12345", value = "If blocked: Code for the blocking reason.")


  public String getBlockCode() {
    return blockCode;
  }

  public void setBlockCode(String blockCode) {
    this.blockCode = blockCode;
  }

  public Card expiryYear(String expiryYear) {
    this.expiryYear = expiryYear;
    return this;
  }

  /**
   * YYYY
   * @return expiryYear
  **/
  @ApiModelProperty(example = "2020", required = true, value = "YYYY")
  @NotNull

@Pattern(regexp="^\\d{4}$") @Size(min=4,max=4) 
  public String getExpiryYear() {
    return expiryYear;
  }

  public void setExpiryYear(String expiryYear) {
    this.expiryYear = expiryYear;
  }

  public Card expiryMonth(String expiryMonth) {
    this.expiryMonth = expiryMonth;
    return this;
  }

  /**
   * MM
   * @return expiryMonth
  **/
  @ApiModelProperty(example = "01", required = true, value = "MM")
  @NotNull

@Pattern(regexp="^\\d{4}$") @Size(min=2,max=2) 
  public String getExpiryMonth() {
    return expiryMonth;
  }

  public void setExpiryMonth(String expiryMonth) {
    this.expiryMonth = expiryMonth;
  }

  public Card debitBalance(AccountBalance debitBalance) {
    this.debitBalance = debitBalance;
    return this;
  }

  /**
   * Get debitBalance
   * @return debitBalance
  **/
  @ApiModelProperty(value = "")

  @Valid

  public AccountBalance getDebitBalance() {
    return debitBalance;
  }

  public void setDebitBalance(AccountBalance debitBalance) {
    this.debitBalance = debitBalance;
  }

  public Card creditBalance(CardBalance creditBalance) {
    this.creditBalance = creditBalance;
    return this;
  }

  /**
   * Get creditBalance
   * @return creditBalance
  **/
  @ApiModelProperty(value = "")

  @Valid

  public CardBalance getCreditBalance() {
    return creditBalance;
  }

  public void setCreditBalance(CardBalance creditBalance) {
    this.creditBalance = creditBalance;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Card card = (Card) o;
    return Objects.equals(this.cardId, card.cardId) &&
        Objects.equals(this.maskedCardNumber, card.maskedCardNumber) &&
        Objects.equals(this.cardType, card.cardType) &&
        Objects.equals(this.cardGroup, card.cardGroup) &&
        Objects.equals(this.accountNumber, card.accountNumber) &&
        Objects.equals(this.cardStatus, card.cardStatus) &&
        Objects.equals(this.blockCode, card.blockCode) &&
        Objects.equals(this.expiryYear, card.expiryYear) &&
        Objects.equals(this.expiryMonth, card.expiryMonth) &&
        Objects.equals(this.debitBalance, card.debitBalance) &&
        Objects.equals(this.creditBalance, card.creditBalance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cardId, maskedCardNumber, cardType, cardGroup, accountNumber, cardStatus, blockCode, expiryYear, expiryMonth, debitBalance, creditBalance);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Card {\n");
    
    sb.append("    cardId: ").append(toIndentedString(cardId)).append("\n");
    sb.append("    maskedCardNumber: ").append(toIndentedString(maskedCardNumber)).append("\n");
    sb.append("    cardType: ").append(toIndentedString(cardType)).append("\n");
    sb.append("    cardGroup: ").append(toIndentedString(cardGroup)).append("\n");
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    cardStatus: ").append(toIndentedString(cardStatus)).append("\n");
    sb.append("    blockCode: ").append(toIndentedString(blockCode)).append("\n");
    sb.append("    expiryYear: ").append(toIndentedString(expiryYear)).append("\n");
    sb.append("    expiryMonth: ").append(toIndentedString(expiryMonth)).append("\n");
    sb.append("    debitBalance: ").append(toIndentedString(debitBalance)).append("\n");
    sb.append("    creditBalance: ").append(toIndentedString(creditBalance)).append("\n");
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

