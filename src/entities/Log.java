package entities;

// Generated May 26, 2015 1:52:35 AM by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Log generated by hbm2java
 */
@Entity
@Table(name = "log", catalog = "atm")
public class Log implements java.io.Serializable {

	private Integer logId;
	private Atm atm;
	private Card card;
	private Date logDate;
	private String ammount;
	private String details;

	public Log() {
	}

	public Log(Atm atm, Card card, Date logDate, String ammount) {
		this.atm = atm;
		this.card = card;
		this.logDate = logDate;
		this.ammount = ammount;
	}

	public Log(Atm atm, Card card, Date logDate, String ammount, String details) {
		this.atm = atm;
		this.card = card;
		this.logDate = logDate;
		this.ammount = ammount;
		this.details = details;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "LogID", unique = true, nullable = false)
	public Integer getLogId() {
		return this.logId;
	}

	public void setLogId(Integer logId) {
		this.logId = logId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ATMID", nullable = false)
	public Atm getAtm() {
		return this.atm;
	}

	public void setAtm(Atm atm) {
		this.atm = atm;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CardNo", nullable = false)
	public Card getCard() {
		return this.card;
	}

	public void setCard(Card card) {
		this.card = card;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "LogDate", nullable = false, length = 0)
	public Date getLogDate() {
		return this.logDate;
	}

	public void setLogDate(Date logDate) {
		this.logDate = logDate;
	}

	@Column(name = "Ammount", nullable = false, length = 16777215)
	public String getAmmount() {
		return this.ammount;
	}

	public void setAmmount(String ammount) {
		this.ammount = ammount;
	}

	@Column(name = "Details")
	public String getDetails() {
		return this.details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

}
