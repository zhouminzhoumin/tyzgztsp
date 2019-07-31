package com.example.demo.model;

import javax.persistence.*;

@Table(name = "PL_DIRECTION_SHELVES")
public class PlDirectionShelvesVo {
	@Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @Column(name = "PRODUCT_ID")
    private String productId;

    @Column(name = "LABEL_TYPE")
    private String labelType;

    @Column(name = "LABEL")
    private String label;

    /**
     * @return ID
     */
    public String getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return PRODUCT_ID
     */
    public String getProductId() {
        return productId;
    }

    /**
     * @param productId
     */
    public void setProductId(String productId) {
        this.productId = productId;
    }

    /**
     * @return LABEL_TYPE
     */
    public String getLabelType() {
        return labelType;
    }

    /**
     * @param labelType
     */
    public void setLabelType(String labelType) {
        this.labelType = labelType;
    }

    /**
     * @return LABEL
     */
    public String getLabel() {
        return label;
    }

    /**
     * @param label
     */
    public void setLabel(String label) {
        this.label = label;
    }
}