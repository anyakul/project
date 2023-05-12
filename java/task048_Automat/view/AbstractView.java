package task048_Automat.view;

import java.util.ArrayList;
import java.util.HashMap;

import task048_Automat.models.AbstractProduct;
import task048_Automat.models.AbstractProductSet;

public abstract class AbstractView<T extends AbstractProductSet> {
    protected final boolean error;
    protected final String errorMessage;

    public AbstractView(boolean error, String errorMessage) {
        this.error = error;
        this.errorMessage = errorMessage;
    }

    public final String getErrorMessage() {
        return errorMessage;
    }

    public final boolean getError() {
        return error;
    }

    public abstract void PrintSetList(ArrayList<T> productSets);

    public abstract void PrintProductList(HashMap<AbstractProduct, Integer> productList);
}
