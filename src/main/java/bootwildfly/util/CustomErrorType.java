package bootwildfly.util;

/**
 * Created by simonjohansson on 2017-08-28.
 */
public class CustomErrorType {

    private String errorMessage;

    public CustomErrorType(String errorMessage){
        this.errorMessage = errorMessage;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

}
