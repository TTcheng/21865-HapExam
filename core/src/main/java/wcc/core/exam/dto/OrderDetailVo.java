package wcc.core.exam.dto;

import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotNull;

/**
 * Copyright @ 2000 Shanghai Hand Co. Ltd.
 * All right reserved.
 *
 * @author chuncehng.wang@hand-china.com
 * @version 1.0
 * @name OrderDetailVo
 * @description 订单明细信息
 * @date 2019/1/2
 */
public class OrderDetailVo extends OmOrderLines {
    private static final long serialVersionUID = -8838611793553453026L;

    public OrderDetailVo() {
    }

    public void setSuperDto(@NotNull OmOrderLines orderLines){
        super.setLineId(orderLines.getLineId());
        super.setHeaderId(orderLines.getHeaderId());
        super.setCompanyId(orderLines.getCompanyId());
        super.setInventoryItemId(orderLines.getInventoryItemId());
        super.setLineNumber(orderLines.getLineNumber());
        super.setOrderdQuantity(orderLines.getOrderdQuantity());
        super.setOrderQuantityUom(orderLines.getOrderQuantityUom());
        super.setUnitSellingPrice(orderLines.getUnitSellingPrice());
        super.setDescription(orderLines.getDescription());
        super.setAddition1(orderLines.getAddition1());
        super.setAddition2(orderLines.getAddition2());
        super.setAddition3(orderLines.getAddition3());
        super.setAddition4(orderLines.getAddition4());
        super.setAddition5(orderLines.getAddition5());
    }

    @Length(max = 60)
    private String itemCode; //物料编码

    @Length(max = 60)
    private String itemUom; //物料单位

    @Length(max = 240)
    private String itemDescription; //物料描述

    private Long orderPrice; //金额

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public String getItemUom() {
        return itemUom;
    }

    public void setItemUom(String itemUom) {
        this.itemUom = itemUom;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public Long getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(Long orderPrice) {
        this.orderPrice = orderPrice;
    }
}
