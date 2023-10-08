package com.greengroupecommerce.entities;

import java.util.List;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "`Category`")
public class Category {
  @Id
	@GeneratedValue(strategy = GenerationType.UUID)
	@Column(name = "category_id")
  @Getter
	@Setter
	private UUID categoryID;

  @Column(name = "category_name")
  @Getter
	@Setter
	private String categoryName;

  @OneToMany(fetch = FetchType.LAZY, mappedBy = "category")
  @Getter
	@Setter
  private List<Products> products;

}
