package com.dyz.myBatis.model;

import java.util.Date;

public class Invite {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column invite.id
	 * @mbggenerated
	 */
	private Integer id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column invite.inviteId
	 * @mbggenerated
	 */
	private Integer inviteid;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column invite.invitedid
	 * @mbggenerated
	 */
	private Integer invitedid;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column invite.inviteTime
	 * @mbggenerated
	 */
	private Date invitetime;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column invite.reward
	 * @mbggenerated
	 */
	private Integer reward;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column invite.id
	 * @return  the value of invite.id
	 * @mbggenerated
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column invite.id
	 * @param id  the value for invite.id
	 * @mbggenerated
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column invite.inviteId
	 * @return  the value of invite.inviteId
	 * @mbggenerated
	 */
	public Integer getInviteid() {
		return inviteid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column invite.inviteId
	 * @param inviteid  the value for invite.inviteId
	 * @mbggenerated
	 */
	public void setInviteid(Integer inviteid) {
		this.inviteid = inviteid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column invite.invitedid
	 * @return  the value of invite.invitedid
	 * @mbggenerated
	 */
	public Integer getInvitedid() {
		return invitedid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column invite.invitedid
	 * @param invitedid  the value for invite.invitedid
	 * @mbggenerated
	 */
	public void setInvitedid(Integer invitedid) {
		this.invitedid = invitedid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column invite.inviteTime
	 * @return  the value of invite.inviteTime
	 * @mbggenerated
	 */
	public Date getInvitetime() {
		return invitetime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column invite.inviteTime
	 * @param invitetime  the value for invite.inviteTime
	 * @mbggenerated
	 */
	public void setInvitetime(Date invitetime) {
		this.invitetime = invitetime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column invite.reward
	 * @return  the value of invite.reward
	 * @mbggenerated
	 */
	public Integer getReward() {
		return reward;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column invite.reward
	 * @param reward  the value for invite.reward
	 * @mbggenerated
	 */
	public void setReward(Integer reward) {
		this.reward = reward;
	}
}