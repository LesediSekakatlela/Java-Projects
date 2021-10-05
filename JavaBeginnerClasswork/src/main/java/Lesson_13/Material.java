/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson_13;

/**
 *
 * @author admin
 */
public abstract class Material {
    private String materialType = "cotton";
    private String materialType02 = "Wool";
    private String materialType03 = "Silk";

    public String getMaterialType() {
        return materialType;
    }

    public void setMaterialType(String materialType) {
        this.materialType = materialType;
    }

    public String getMaterialType02() {
        return materialType02;
    }

    public void setMaterialType02(String materialType02) {
        this.materialType02 = materialType02;
    }

    public String getMaterialType03() {
        return materialType03;
    }

    public void setMaterialType03(String materialType03) {
        this.materialType03 = materialType03;
    }
    
    public abstract double getPrice();
}
