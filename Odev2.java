void main() {
    double vize1 = 60;
    double vize2 = 70;
    double final1 = 75;
    double result = (vize1+vize2) * 0.25 + final1 * 0.5;
    if (result >= 85) {
        System.out.println("Takdir"+result);
    }
    else if (result >= 75) {
        System.out.println("Teşekkür"+result);
    }
    else if (result >= 50) {
        System.out.println("Geçtin"+result);
    }
    else {
        System.out.println("Kaldın"+result);
    }
    System.out.println(result);
}
