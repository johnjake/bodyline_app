package com.bodyline.org.model;

import lombok.Data;

@Data

public class GrossSalesService {
    private String invoiceId;
    private String timeIn;
    private String timeOut;
    private String name;
    private String serviceBarcode;
    private String serviceCharge;
    private String gross;
    private String discount;
    private String discountType;
    private String net;
    private String date;
}
