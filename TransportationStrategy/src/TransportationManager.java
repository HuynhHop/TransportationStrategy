class TransportationManager {
    private TransportationStrategy strategy;

    public void setStrategy(TransportationStrategy strategy) {
        this.strategy = strategy;
    }

    public double calculateCost(double distance, double duration) {
        return strategy.calculateCost(distance, duration);
    }
}