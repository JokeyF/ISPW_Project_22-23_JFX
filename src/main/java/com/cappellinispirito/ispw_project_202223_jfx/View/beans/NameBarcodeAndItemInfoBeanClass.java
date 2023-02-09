package com.cappellinispirito.ispw_project_202223_jfx.View.beans;

import com.cappellinispirito.ispw_project_202223_jfx.Model.beansInterface.nameBarcodeAndItemInfoBeanInterface;

import java.util.List;

public class NameBarcodeAndItemInfoBeanClass implements nameBarcodeAndItemInfoBeanInterface {
    private String name;
    private String barcode;
    private float FruitPercentage;
    private float energy;
    private float sugars;
    private float proteins;
    private float saturatedFats;
    private float fibers;
    private float salt;
    private boolean isBiological;
    private boolean isBeverage;
    private String imageUrl;
    private String ingredients;
    private String additives;
    private int price;
    private int score;





    @Override
    public int getScore() {
        return score;
    }

    @Override
    public void setScore(int score) { this.score = score;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getBarcode() {
        return barcode;
    }

    @Override
    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    @Override
    public float getFruitPercentage() {
        return FruitPercentage;
    }

    @Override
    public void setFruitPercentage(float fruitPercentage) {
        this.FruitPercentage = fruitPercentage;
    }

    @Override
    public float getEnergy() {
        return energy;
    }

    @Override
    public void setEnergy(float energy) {
        this.energy = energy;
    }

    @Override
    public float getSugars() {
        return sugars;
    }

    @Override
    public void setSugars(float sugars) {
        this.sugars = sugars;
    }

    @Override
    public float getProteins() {
        return proteins;
    }

    @Override
    public void setProtein(float protein) {
        this.proteins = protein;
    }

    @Override
    public float getSaturatedFats() {
        return saturatedFats;
    }

    @Override
    public void setSaturatedFats(float saturated_fat) {
        this.saturatedFats = saturated_fat;
    }

    @Override
    public float getFibers() {
        return fibers;
    }

    @Override
    public void setFibers(float fiber) {
        this.fibers = fiber;
    }

    @Override
    public float getSalt() {
        return salt;
    }

    @Override
    public void setSalt(float salt) {
        this.salt = salt;
    }

    @Override
    public boolean getIsBio() {
        return isBiological;
    }

    @Override
    public void setIsBio(boolean isBio) {
        this.isBiological = isBio;
    }

    @Override
    public boolean getIsBeverage() {
        return isBeverage;
    }

    @Override
    public void setIsBeverage(boolean isBeverage) {
        this.isBeverage = isBeverage;
    }

    @Override
    public String getImageUrl() {
        return imageUrl;
    }

    @Override
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @Override
    public String getIngredients() {
        return ingredients;
    }

    @Override
    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    @Override
    public List<String> getAdditives() {
        return additives;
    }

    @Override
    public void setAdditives(List<String> additives) {
        this.additives = additives;
    }

}