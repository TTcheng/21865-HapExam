package wcc.core.exam.dto;

import com.hand.hap.mybatis.annotation.ExtensionAttribute;
import com.hand.hap.system.dto.BaseDTO;
import org.hibernate.validator.constraints.Length;

import javax.persistence.Id;
import java.util.Date;

/**
 * Copyright @ 2000 Shanghai Hand Co. Ltd.
 * All right reserved.
 *
 * @author chuncehng.wang@hand-china.com
 * @version 1.0
 * @name OrderSummaryVO
 * @description 订单汇总对象
 * @date 2018/12/31
 */
@ExtensionAttribute(disable = true)
public class OrderSummaryVO extends BaseDTO {
    private static final long serialVersionUID = 3741982357569353026L;

    @Id
    private Long headerId; //订单头ID
    //show fields
    @Length(max = 60)
    private String orderNumber;//订单编号varchar60

    @Length(max = 240)
    private String companyName;//公司名称 varchar240

    @Length(max = 240)
    private String customerName;//客户名称 varchar240

    private Date orderDate;//订单日期 date

    @Length(max = 30)
    private String orderStatus;//订单状态varchar30

    private Long totalPrice;//订单金额calculatedResult，number

    //other condition fields
    private Long companyId;//公司ID
    private Long customerId;//客户ID
    private Long inventoryItemId; //物料ID

    @Override
    public String toString() {
        return "OrderSummaryVO{" +
                "headerId=" + headerId +
                ", orderNumber='" + orderNumber + '\'' +
                ", companyName='" + companyName + '\'' +
                ", customerName='" + customerName + '\'' +
                ", orderDate=" + orderDate +
                ", orderStatus='" + orderStatus + '\'' +
                ", totalPrice=" + totalPrice +
                ", companyId=" + companyId +
                ", customerId=" + customerId +
                ", inventoryItemId=" + inventoryItemId +
                '}';
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Long getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Long totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public Long getInventoryItemId() {
        return inventoryItemId;
    }

    public void setInventoryItemId(Long inventoryItemId) {
        this.inventoryItemId = inventoryItemId;
    }

    public Long getHeaderId() {
        return headerId;
    }

    public void setHeaderId(Long headerId) {
        this.headerId = headerId;
    }
}
