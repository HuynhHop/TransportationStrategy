class CarStrategy implements TransportationStrategy {
    @Override
    public double calculateCost(double distance, double duration) {
        // Logic tính toán chi phí cho ô tô
        return distance * 0.2 + duration * 0.1;
    }
}