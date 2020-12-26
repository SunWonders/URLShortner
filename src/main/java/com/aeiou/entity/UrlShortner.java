package com.aeiou.entity;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

// TODO: Auto-generated Javadoc
/**
 * The Class UrlShortner.
 */
@Document
public class UrlShortner {
	/** The id. */
	@Id
	private String id;

	/** The user name. */
	private String userName;

	/** The url. */
	private String url;

	/** The short url. */
	private String shortUrl;

	/** The is active. */
	private Boolean isActive;

	/** The inserted date time. */
	private Date insertedDateTime;

	/** The updated date time. */
	private Date updatedDateTime;

	/**
	 * Gets the checks if is active.
	 *
	 * @return the checks if is active
	 */
	public Boolean getIsActive() {
		return isActive;
	}

	/**
	 * Sets the checks if is active.
	 *
	 * @param isActive the new checks if is active
	 */
	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	/**
	 * Gets the inserted date time.
	 *
	 * @return the inserted date time
	 */
	public Date getInsertedDateTime() {
		return insertedDateTime;
	}

	/**
	 * Sets the inserted date time.
	 *
	 * @param insertedDateTime the new inserted date time
	 */
	public void setInsertedDateTime(Date insertedDateTime) {
		this.insertedDateTime = insertedDateTime;
	}

	/**
	 * Gets the updated date time.
	 *
	 * @return the updated date time
	 */
	public Date getUpdatedDateTime() {
		return updatedDateTime;
	}

	/**
	 * Sets the updated date time.
	 *
	 * @param updatedDateTime the new updated date time
	 */
	public void setUpdatedDateTime(Date updatedDateTime) {
		this.updatedDateTime = updatedDateTime;
	}

	/**
	 * Gets the user name.
	 *
	 * @return the user name
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * Sets the user name.
	 *
	 * @param userName the new user name
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * Gets the url.
	 *
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * Sets the url.
	 *
	 * @param url the new url
	 */
	public void setUrl(String url) {
		this.url = url;
	}

	/**
	 * Gets the short url.
	 *
	 * @return the short url
	 */
	public String getShortUrl() {
		return shortUrl;
	}

	/**
	 * Sets the short url.
	 *
	 * @param shortUrl the new short url
	 */
	public void setShortUrl(String shortUrl) {
		this.shortUrl = shortUrl;
	}

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * Sets the id.
	 *
	 * @param id the new id
	 */
	public void setId(String id) {
		this.id = id;
	}

}