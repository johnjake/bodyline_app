package com.bodyline.org.repository;

import com.bodyline.org.model.GrossSalesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.r2dbc.core.R2dbcEntityTemplate;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

@Repository
public class GrossSalesServiceRepository {
    private final R2dbcEntityTemplate entityTemplate;

    @Autowired
    public GrossSalesServiceRepository(R2dbcEntityTemplate entityTemplate) {
        this.entityTemplate = entityTemplate;
    }

    public Flux<GrossSalesService> callStoredProc(String userName, String dateNow, String lastDate) {
        String sql = "EXEC usp_Select_Gross_Sales_Service_ByTherapist @UserName = :userName, @DateNow = :dateNow, @LastDate = :lastDate";

        return entityTemplate.getDatabaseClient()
                .sql(sql)
                .bind("userName", userName)
                .bind("dateNow", dateNow)
                .bind("lastDate", lastDate)
                .map((row, metadata) -> {
                    GrossSalesService result = new GrossSalesService();
                    result.setInvoiceId(row.get("InvoiceID", String.class));
                    result.setTimeIn(row.get("Time_In", String.class));
                    result.setTimeOut(row.get("Time_Out", String.class));
                    result.setName(row.get("Name", String.class));
                    result.setServiceBarcode(row.get("Service_Barcode", String.class));
                    result.setServiceCharge(row.get("Service_Charge", String.class));
                    result.setGross(row.get("Gross", String.class));
                    result.setDiscount(row.get("Discount", String.class));
                    result.setDiscountType(row.get("Discount_Type", String.class));
                    result.setNet(row.get("Net", String.class));
                    result.setDate(row.get("Date", String.class));
                    return result;
                })
                .all();
    }
}