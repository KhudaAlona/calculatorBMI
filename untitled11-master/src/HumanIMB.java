public class HumanIMB {
    private double weight; // Weight of Human
    private double height; // Height of Human
    private double imb;

    public HumanIMB(double weight, double height) {
        this.weight = weight;
        this.height = height;
        calculateIMB();
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
        calculateIMB();
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
        calculateIMB();
    }

    public double getIMB() {
        return imb;
    }

    public String getResult() {
        if (imb >= 18.5 && imb < 25) {
            return "Norm";
        } else if (imb >= 25 && imb < 30) {
            return "Warning!";
        } else if (imb >= 30) {
            return "Fat";
        } else {
            return "Deficit";
        }
    }

    private void calculateIMB() {
        imb = weight / (height * height);
    }
}
