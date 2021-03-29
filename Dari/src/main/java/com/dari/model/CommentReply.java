package com.dari.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CommentReply {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ReplyId ; 
	private String Description ; 
	private int LikesNb ; 
	private int DislikeNb ; 

}
