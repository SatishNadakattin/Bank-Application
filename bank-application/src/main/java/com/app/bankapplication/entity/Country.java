package com.app.bankapplication.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="country")
public class Country {

	    private long id;
	    private String Name;
	    private String createdBy;
	    private Date createdAt;
	    private Date createdOn;
	    private String modifiedBy;
	    private Date modifiedOn;
	    private Date modifiedAt;
	    
		public Country(long id, String name, String createdBy, Date createdAt, Date createdOn, String modifiedBy,
				Date modifiedOn, Date modifiedAt) {
			super();
			this.id = id;
			Name = name;
			this.createdBy = createdBy;
			this.createdAt = createdAt;
			this.createdOn = createdOn;
			this.modifiedBy = modifiedBy;
			this.modifiedOn = modifiedOn;
			this.modifiedAt = modifiedAt;
		}


	  
		@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
		public long getId() {
			return id;
		}
		public void setId(long id) {
			this.id = id;
		}
		

	    @Column(name = "name", nullable = false)
		public String getName() {
			return Name;
		}
		public void setName(String name) {
			Name = name;
		}
		

	    @Column(name = "created_By", nullable = false)
		public String getCreatedBy() {
			return createdBy;
		}
		public void setCreatedBy(String createdBy) {
			this.createdBy = createdBy;
		}
		
		 @Column(name = "created_At", nullable = false)
		public Date getCreatedAt() {
			return createdAt;
		}
		public void setCreatedAt(Date createdAt) {
			this.createdAt = createdAt;
		}
		
		 @Column(name = "created_On", nullable = false)
		public Date getCreatedOn() {
			return createdOn;
		}
		public void setCreatedOn(Date createdOn) {
			this.createdOn = createdOn;
		}
		
		 @Column(name = "modified_By", nullable = false)
		public String getModifiedBy() {
			return modifiedBy;
		}
		public void setModifiedBy(String modifiedBy) {
			this.modifiedBy = modifiedBy;
		}
		
		 @Column(name = "modified_On", nullable = false)
		public Date getModifiedOn() {
			return modifiedOn;
		}
		public void setModifiedOn(Date modifiedOn) {
			this.modifiedOn = modifiedOn;
		}
		
		 @Column(name = "modified_At", nullable = false)
		public Date getModifiedAt() {
			return modifiedAt;
		}
		public void setModifiedAt(Date modifiedAt) {
			this.modifiedAt = modifiedAt;
		}
	    
		  @Override
			public String toString() {
				return "Country [id=" + id + ", Name=" + Name + ", createdBy=" + createdBy + ", createdAt=" + createdAt
						+ ", createdOn=" + createdOn + ", modifiedBy=" + modifiedBy + ", modifiedOn=" + modifiedOn
						+ ", modifiedAt=" + modifiedAt + "]";
			}
}
