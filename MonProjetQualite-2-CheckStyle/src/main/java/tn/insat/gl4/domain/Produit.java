package tn.insat.gl4.domain;

import java.math.BigDecimal;

/**
 * 
 * @author Mohamed
 *
 */
public class Produit {
	/**
	 * qsqddd.
	 */
	 private int codeProduit;
	 /**
	  *     
	  * jsqdj;sdh;sqh;k.
	  */
	 private String libelleProduit;
	
	 public BigDecimal quantitéEnStock;
	public int getCodeProduit() {
		return codeProduit;
	}
	public void setCodeProduit(int codeProduit) {
		this.codeProduit = codeProduit;
	}
	public String getLibelléProduit() {
		return libelleProduit;
	}
	public void setLibelléProduit(String libelléProduit) {
		this.libelleProduit = libelléProduit;
	}
	public BigDecimal getQuantitéEnStock() {
		return quantitéEnStock;
	}
	public void setQuantitéEnStock(BigDecimal quantitéEnStock) {
		this.quantitéEnStock = quantitéEnStock;
	}
	 
	 
	

}
