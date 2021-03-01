package com.dari.model;

import javax.persistence.Entity;

@Entity
public class Comment {
	
	private int CommentId ; 
	private String Description ; 
	private int LikesNb ; 
	private int DislikeNb ; 

}
