package com.cappellinispirito.ispwproject202223jfx.view.beans;

import com.cappellinispirito.ispwproject202223jfx.model.Supermarket;
import com.cappellinispirito.ispwproject202223jfx.model.beansInterface.supermarketsToProductsBean;

import java.util.List;

public class SupermarketsToProductsBeanClass implements supermarketsToProductsBean {
    private Supermarket supermarket;
    private List<String> sellableProductsNames;
    private List<String> sellableProductsImages;
    private List<String> sellableProductsBarcodes;

    @Override
    public Supermarket getSupermarket() {
        return supermarket;
    }

    @Override
    public void setSupermarket(Supermarket supermarket) {
        this.supermarket = supermarket;
    }

    @Override
    public List<String> getSellableProductsName() {
        return sellableProductsNames;
    }

    @Override
    public void setSellableProductsNames(List<String> sellableProductsName) {
        this.sellableProductsNames = sellableProductsName;
    }

    @Override
    public List<String> getSellableProductsImage() {
        return sellableProductsImages;
    }

    @Override
    public void setSellableProductsImage(List<String> sellableProductsImage) {
        this.sellableProductsImages = sellableProductsImage;
    }

    @Override
    public List<String> getSellableProductsBarcode() {
        return sellableProductsBarcodes;
    }

    @Override
    public void setSellableProductsBarcode(List<String> sellableProductsBarcodes) {
        this.sellableProductsBarcodes = sellableProductsBarcodes;
    }


}
