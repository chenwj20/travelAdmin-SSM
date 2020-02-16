package cn.cwj.ssm.domain;

import cn.cwj.ssm.utils.DateUtils;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Product {
    private String id; //主键id
    private String productNum; // 产品编号，唯一
    private String ProductName; //产品名称
    private String cityName; // 出发城市名称

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm")
    private Date departureTime; //出发时间
    private String departureTimeStr;
    private Double productPrice; //产品价格
    private String productDesc; // 产品描述
    private Integer productStatus; //产品状态信息 0(关闭) 1(开启)
    private String ProductStatusStr;

    public Product() {
    }

    public Product(String id, String productNum, String productName, String cityName, Date departureTime, String departureTimeStr, Double productPrice, String productDesc, Integer productStatus, String productStatusStr) {
        this.id = id;
        this.productNum = productNum;
        ProductName = productName;
        this.cityName = cityName;
        this.departureTime = departureTime;
        this.departureTimeStr = departureTimeStr;
        this.productPrice = productPrice;
        this.productDesc = productDesc;
        this.productStatus = productStatus;
        ProductStatusStr = productStatusStr;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProductNum() {
        return productNum;
    }

    public void setProductNum(String productNum) {
        this.productNum = productNum;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String productName) {
        ProductName = productName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public Date getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(Date departureTime) {
        this.departureTime = departureTime;
    }

    public String getDepartureTimeStr() {
        return DateUtils.getDateStr(departureTime,"yyyy-MM-dd");
    }

    public void setDepartureTimeStr(String departureTimeStr) {
        this.departureTimeStr = departureTimeStr;
    }

    public Double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Double productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductDesc() {
        return productDesc;
    }

    public void setProductDesc(String productDesc) {
        this.productDesc = productDesc;
    }

    public Integer getProductStatus() {
        return productStatus;
    }

    public void setProductStatus(Integer productStatus) {
        this.productStatus = productStatus;
    }

    public String getProductStatusStr() {

        if (productStatus!=null){
            if (productStatus == 0){
                ProductStatusStr = "关闭";
            }
            if (productStatus == 1){
                ProductStatusStr = "开启";
            }
        }
        return ProductStatusStr;
    }

    public void setProductStatusStr(String productStatusStr) {
        ProductStatusStr = productStatusStr;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", productNum='" + productNum + '\'' +
                ", ProductName='" + ProductName + '\'' +
                ", cityName='" + cityName + '\'' +
                ", departureTime=" + departureTime +
                ", departureTimeStr='" + departureTimeStr + '\'' +
                ", productPrice=" + productPrice +
                ", productDesc='" + productDesc + '\'' +
                ", productStatus=" + productStatus +
                ", ProductStatusStr='" + ProductStatusStr + '\'' +
                '}';
    }
}