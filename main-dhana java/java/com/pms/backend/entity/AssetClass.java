package com.pms.backend.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "asset_classes")
public class AssetClass {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "class_name", nullable = false)
    private String className;

    @Column(name = "description")
    private String description;

    @Column(name = "sub_class_name")
    private String subClassName;

    @Column(name = "sub_class_description")
    private String subClassDescription;

    @Column(name = "risk")
    private String risk;

    @Column(name = "investment_horizon")
    private String investmentHorizon;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getSubClassName() {
		return subClassName;
	}

	public void setSubClassName(String subClassName) {
		this.subClassName = subClassName;
	}

	public String getSubClassDescription() {
		return subClassDescription;
	}

	public void setSubClassDescription(String subClassDescription) {
		this.subClassDescription = subClassDescription;
	}

	public String getRisk() {
		return risk;
	}

	public void setRisk(String risk) {
		this.risk = risk;
	}

	public String getInvestmentHorizon() {
		return investmentHorizon;
	}

	public void setInvestmentHorizon(String investmentHorizon) {
		this.investmentHorizon = investmentHorizon;
	}

	public AssetClass(Long id, String className, String description, String subClassName, String subClassDescription,
			String risk, String investmentHorizon) {
		super();
		this.id = id;
		this.className = className;
		this.description = description;
		this.subClassName = subClassName;
		this.subClassDescription = subClassDescription;
		this.risk = risk;
		this.investmentHorizon = investmentHorizon;
	}

	public AssetClass() {
		super();
	}

    
}
