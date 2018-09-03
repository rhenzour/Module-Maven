package tn.insat.domain;

import java.math.BigDecimal;


public class Produit 
{
	
	 public int codeProduit;
	 public String libelleProduit;
	 public BigDecimal quantiteEnStock;
	public int getCodeProduit() {
		return codeProduit;
	}
	public void setCodeProduit(int codeProduit) {
		this.codeProduit = codeProduit;
	}
	public String getLibelleProduit() {
		return libelleProduit;
	}
	public void setLibelleProduit(String libelleProduit) {
		this.libelleProduit = libelleProduit;
	}
	public BigDecimal getQuantiteEnStock() {
		return quantiteEnStock;
	}
	public void setQuantiteEnStock(BigDecimal quantiteEnStock) {
		this.quantiteEnStock = quantiteEnStock;
	}
	}