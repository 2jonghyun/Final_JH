package com.example.demo.entity.recoment;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@SequenceGenerator(
        name = "seq_recoment",
        sequenceName = "seq_recoment",
        allocationSize = 1
)
@Table(name = "recoment")
public class Recoment {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_recoment")
	@Column(name = "rec_no")
	private int recNo;
	
	@Column(name = "member_id")
	private String memberId;
	@Column(name = "rec_content")
	private String recContent;
	private int no;
	private String type;
	@Column(name = "rec_date")
	private String recDate;

}