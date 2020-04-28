package builder.beanexample;

// A simple bean example with members and respective getters-setters 
public class OrderBean {
    private String bead;
    private String condiments;
    private String dressing;
    private String meat;

    /**
     * @return the bead
     */
    public String getBead() {
        return bead;
    }

    /**
     * @return the condiments
     */
    public String getCondiments() {
        return condiments;
    }

    /**
     * @return the dressing
     */
    public String getDressing() {
        return dressing;
    }

    /**
     * @return the meat
     */
    public String getMeat() {
        return meat;
    }

    /**
     * @param bead the bead to set
     */
    public void setBead(String bead) {
        this.bead = bead;
    }

    /**
     * @param condiments the condiments to set
     */
    public void setCondiments(String condiments) {
        this.condiments = condiments;
    }

    /**
     * @param dressing the dressing to set
     */
    public void setDressing(String dressing) {
        this.dressing = dressing;
    }

    /**
     * @param meat the meat to set
     */
    public void setMeat(String meat) {
        this.meat = meat;
    }
}