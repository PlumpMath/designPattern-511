
public class SubOperationFactory implements OperationFactory {

    @Override
    public Operation getOperation() {
        return new SubtractionOperation();
    }

}
