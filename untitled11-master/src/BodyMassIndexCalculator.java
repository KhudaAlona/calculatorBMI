class BodyMassIndexCalculator {
    private double weight; // Вага людини
    private double height; // Зріст людини
    private String gender; // Стать людини ("male" або "female")
    private int age; // Вік людини

    public BodyMassIndexCalculator(double weight, double height, String gender, int age) {
        setWeight(weight);
        setHeight(height);
        setGender(gender);
        setAge(age);
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if (weight > 0) {
            this.weight = weight;
        } else {
            throw new IllegalArgumentException("Вага повинна бути більшою за 0.");
        }
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height > 0) {
            this.height = height;
        } else {
            throw new IllegalArgumentException("Зріст повинен бути більшим за 0.");
        }
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        if (gender.equalsIgnoreCase("male") || gender.equalsIgnoreCase("female")) {
            this.gender = gender.toLowerCase();
        } else {
            throw new IllegalArgumentException("Стать повинна бути 'male' або 'female'.");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            throw new IllegalArgumentException("Вік повинен бути більшим за 0.");
        }
    }

    public double calculateBMI() {
        return weight / (height * height);
    }

    public String getResult() {
        double bmi = calculateBMI();
        String result = "";

        if (age >= 18) { // Для дорослих
            if (bmi >= 18.5 && bmi < 25) {
                result = "Norm";
            } else if (bmi >= 25 && bmi < 30) {
                result = "Warning!";
            } else if (bmi >= 30) {
                result = "Fat";
            } else {
                result = "Deficit";
            }
        } else { // Для дітей і підлітків
            if (gender.equals("male")) {
                // Використати різні інтерпретації BMI для хлопців
                if (bmi < 18.5) {
                    result = "Deficit";
                } else if (bmi >= 18.5 && bmi < 24) {
                    result = "Norm";
                } else if (bmi >= 24 && bmi < 28) {
                    result = "Warning!";
                } else {
                    result = "Fat";
                }
            } else if (gender.equals("female")) {
                // Використати різні інтерпретації BMI для дівчат
                if (bmi < 17.5) {
                    result = "Deficit";
                } else if (bmi >= 17.5 && bmi < 23) {
                    result = "Norm";
                } else if (bmi >= 23 && bmi < 27) {
                    result = "Warning!";
                } else {
                    result = "Fat";
                }
            }
        }

        return result;
    }
}
