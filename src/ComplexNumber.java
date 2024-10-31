public class ComplexNumber{

    public ComplexNumber() {
    }

    public int getY() {
        return (int) y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return (int) x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public ComplexNumber(int x, int y) {
        this.x = x;
        this.y = y;
    }

        private double x;
        private double y;
        

        public ComplexNumber(double x, double y) {
            this.x = x;
            this.y = (int) y;
        }

        public String toString() {
            return x + (y >= 0 ? "+" : "") + y + "i";
        }

        public ComplexNumber add(ComplexNumber other) {
            return new ComplexNumber(x + other.x, y + other.y);
        }

        public ComplexNumber sub(ComplexNumber other) {
            return new ComplexNumber(x - other.x, y - other.y);
        }

        public ComplexNumber mul(ComplexNumber other) {
            return new ComplexNumber(x * other.x - y * other.y,
                    x * other.y + y * other.x);
        }

        public ComplexNumber div(ComplexNumber other) {
            double denominator = Math.pow(other.x, 2) + Math.pow(other.y, 2);
            return new ComplexNumber((x * other.x + y * other.y) / denominator,
                    (y * other.x - x * other.y) / denominator);
        }

        public double modulus() {
            return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        }

        public boolean equals(ComplexNumber other) {
            return Double.compare(x, other.x) == 0 && Double.compare(y, other.y) == 0;
        }

}

