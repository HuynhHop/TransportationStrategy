class BusStrategy implements TransportationStrategy {
    @Override
    public double calculateCost(double distance, double duration) {
        // Logic tính toán chi phí cho xe buýt
        return distance * 0.05 + duration * 0.02;
    }
}