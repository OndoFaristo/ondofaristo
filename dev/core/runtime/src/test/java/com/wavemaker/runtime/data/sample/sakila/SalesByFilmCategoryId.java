/*
 *  Copyright (C) 2009 WaveMaker Software, Inc.
 *
 *  This file is part of the WaveMaker Server Runtime.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package com.wavemaker.runtime.data.sample.sakila;

// Generated Jul 5, 2007 6:21:54 PM by Hibernate Tools 3.2.0.b9

import java.math.BigDecimal;

/**
 * SalesByFilmCategoryId generated by hbm2java
 */
@SuppressWarnings({ "serial" })
public class SalesByFilmCategoryId implements java.io.Serializable {

    private String category;

    private BigDecimal totalSales;

    public SalesByFilmCategoryId() {
    }

    public SalesByFilmCategoryId(String category) {
        this.category = category;
    }

    public SalesByFilmCategoryId(String category, BigDecimal totalSales) {
        this.category = category;
        this.totalSales = totalSales;
    }

    public String getCategory() {
        return this.category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public BigDecimal getTotalSales() {
        return this.totalSales;
    }

    public void setTotalSales(BigDecimal totalSales) {
        this.totalSales = totalSales;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null) {
            return false;
        }
        if (!(other instanceof SalesByFilmCategoryId)) {
            return false;
        }
        SalesByFilmCategoryId castOther = (SalesByFilmCategoryId) other;

        return (this.getCategory() == castOther.getCategory() || this.getCategory() != null && castOther.getCategory() != null
            && this.getCategory().equals(castOther.getCategory()))
            && (this.getTotalSales() == castOther.getTotalSales() || this.getTotalSales() != null && castOther.getTotalSales() != null
                && this.getTotalSales().equals(castOther.getTotalSales()));
    }

    @Override
    public int hashCode() {
        int result = 17;

        result = 37 * result + (getCategory() == null ? 0 : this.getCategory().hashCode());
        result = 37 * result + (getTotalSales() == null ? 0 : this.getTotalSales().hashCode());
        return result;
    }

}
