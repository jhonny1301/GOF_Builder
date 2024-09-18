class Pizza {
    private String masa;
    private String salsa;
    private String relleno;

    public static class Builder {
        private String masa;
        private String salsa;
        private String relleno;

        public Builder setMasa(String masa) {
            this.masa = masa;
            return this;
        }

        public Builder setSalsa(String salsa) {
            this.salsa = salsa;
            return this;
        }

        public Builder setRelleno(String relleno) {
            this.relleno = relleno;
            return this;
        }

        public Pizza build() {
            Pizza pizza = new Pizza();
            pizza.masa = this.masa;
            pizza.salsa = this.salsa;
            pizza.relleno = this.relleno;
            return pizza;
        }
    }

    @Override
    public String toString() {
        return "Pizza con masa: " + masa + ", salsa: " + salsa + ", relleno: " + relleno;
    }
}