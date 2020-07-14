package com.stock.demo.entity;


import java.sql.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;



import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "User_Stock")
public class UserStock {
	@Id
	@NotNull(message = "ID is required")
	@Column(name = "user_stock_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long userStockId;
	@Column(name = "stock_id")
	@NotEmpty(message = "stock id is required")
	private Long stockId;
	@Column(name = "stock_price")
	@NotNull(message = "stock price is required")
	private Double stockPrice;
	@Column(name = "stock_date")
	@NotNull(message = "date is required")
	private Date stockDate;
	@Column(name = "user_id")
	@NotNull(message = "userid column is required")
	private Long userId;
	@Column(name = "quantity")
	@NotNull(message = "quantity column is required")
	private Integer quantity;
	
	public Long getUserStockId() {
		return userStockId;
	}
	public void setUserStockId(Long userStockId) {
		this.userStockId = userStockId;
	}
	public Long getStockId() {
		return stockId;
	}
	public void setStockId(Long stockId) {
		this.stockId = stockId;
	}
	public Double getStockPrice() {
		return stockPrice;
	}
	public void setStockPrice(Double stockPrice) {
		this.stockPrice = stockPrice;
	}
	public Date getStockDate() {
		return stockDate;
	}
	public void setStockDate(Date stockDate) {
		this.stockDate = stockDate;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	
	
	
}