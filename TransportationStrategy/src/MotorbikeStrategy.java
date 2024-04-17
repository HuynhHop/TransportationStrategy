class MotorbikeStrategy implements TransportationStrategy {
    @Override
    public double calculateCost(double distance, double duration) {
        // Logic tính toán chi phí cho xe máy
        return distance * 0.1 + duration * 0.05;
    }
}
