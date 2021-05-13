package design_pattern;

public class InitializationOnDemandHolder {

    private InitializationOnDemandHolder() {
    }

    public static InitializationOnDemandHolder getInstance() {
        return Holder.INSTANCE;
    }

    private static class Holder {
        private static final InitializationOnDemandHolder INSTANCE = new InitializationOnDemandHolder();
    }

}
