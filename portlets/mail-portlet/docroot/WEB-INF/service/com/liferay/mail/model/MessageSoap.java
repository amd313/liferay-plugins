/**
 * Copyright (c) 2000-2010 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.mail.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * <a href="MessageSoap.java.html"><b><i>View Source</i></b></a>
 *
 * <p>
 * ServiceBuilder generated this class. Modifications in this class will be
 * overwritten the next time is generated.
 * </p>
 *
 * <p>
 * This class is used by
 * {@link com.liferay.mail.service.http.MessageServiceSoap}.
 * </p>
 *
 * @author    Brian Wing Shun Chan
 * @see       com.liferay.mail.service.http.MessageServiceSoap
 * @generated
 */
public class MessageSoap implements Serializable {
	public static MessageSoap toSoapModel(Message model) {
		MessageSoap soapModel = new MessageSoap();

		soapModel.setMessageId(model.getMessageId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setAccountId(model.getAccountId());
		soapModel.setFolderId(model.getFolderId());
		soapModel.setSender(model.getSender());
		soapModel.setRecipientsTo(model.getRecipientsTo());
		soapModel.setRecipientsCc(model.getRecipientsCc());
		soapModel.setRecipientsBcc(model.getRecipientsBcc());
		soapModel.setSentDate(model.getSentDate());
		soapModel.setSubject(model.getSubject());
		soapModel.setPreview(model.getPreview());
		soapModel.setBody(model.getBody());
		soapModel.setFlags(model.getFlags());
		soapModel.setSize(model.getSize());
		soapModel.setRemoteMessageId(model.getRemoteMessageId());

		return soapModel;
	}

	public static MessageSoap[] toSoapModels(Message[] models) {
		MessageSoap[] soapModels = new MessageSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static MessageSoap[][] toSoapModels(Message[][] models) {
		MessageSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new MessageSoap[models.length][models[0].length];
		}
		else {
			soapModels = new MessageSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static MessageSoap[] toSoapModels(List<Message> models) {
		List<MessageSoap> soapModels = new ArrayList<MessageSoap>(models.size());

		for (Message model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new MessageSoap[soapModels.size()]);
	}

	public MessageSoap() {
	}

	public long getPrimaryKey() {
		return _messageId;
	}

	public void setPrimaryKey(long pk) {
		setMessageId(pk);
	}

	public long getMessageId() {
		return _messageId;
	}

	public void setMessageId(long messageId) {
		_messageId = messageId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getUserName() {
		return _userName;
	}

	public void setUserName(String userName) {
		_userName = userName;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public long getAccountId() {
		return _accountId;
	}

	public void setAccountId(long accountId) {
		_accountId = accountId;
	}

	public long getFolderId() {
		return _folderId;
	}

	public void setFolderId(long folderId) {
		_folderId = folderId;
	}

	public String getSender() {
		return _sender;
	}

	public void setSender(String sender) {
		_sender = sender;
	}

	public String getRecipientsTo() {
		return _recipientsTo;
	}

	public void setRecipientsTo(String recipientsTo) {
		_recipientsTo = recipientsTo;
	}

	public String getRecipientsCc() {
		return _recipientsCc;
	}

	public void setRecipientsCc(String recipientsCc) {
		_recipientsCc = recipientsCc;
	}

	public String getRecipientsBcc() {
		return _recipientsBcc;
	}

	public void setRecipientsBcc(String recipientsBcc) {
		_recipientsBcc = recipientsBcc;
	}

	public Date getSentDate() {
		return _sentDate;
	}

	public void setSentDate(Date sentDate) {
		_sentDate = sentDate;
	}

	public String getSubject() {
		return _subject;
	}

	public void setSubject(String subject) {
		_subject = subject;
	}

	public String getPreview() {
		return _preview;
	}

	public void setPreview(String preview) {
		_preview = preview;
	}

	public String getBody() {
		return _body;
	}

	public void setBody(String body) {
		_body = body;
	}

	public String getFlags() {
		return _flags;
	}

	public void setFlags(String flags) {
		_flags = flags;
	}

	public long getSize() {
		return _size;
	}

	public void setSize(long size) {
		_size = size;
	}

	public long getRemoteMessageId() {
		return _remoteMessageId;
	}

	public void setRemoteMessageId(long remoteMessageId) {
		_remoteMessageId = remoteMessageId;
	}

	private long _messageId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private long _accountId;
	private long _folderId;
	private String _sender;
	private String _recipientsTo;
	private String _recipientsCc;
	private String _recipientsBcc;
	private Date _sentDate;
	private String _subject;
	private String _preview;
	private String _body;
	private String _flags;
	private long _size;
	private long _remoteMessageId;
}