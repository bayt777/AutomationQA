package com.company.aqa.module4.eshop.products.departments;

public class ProductDepartment {

    private String departmentName;
    private String productCategory;

    public ProductDepartment(String departmentName, String productCategory) {
        this.departmentName = departmentName;
        this.productCategory = productCategory;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }
}
