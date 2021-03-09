package junits; 

 

import org.junit.jupiter.api.extension.ConditionEvaluationResult;
import org.junit.jupiter.api.extension.ExecutionCondition;
import org.junit.jupiter.api.extension.ExtensionContext; 

 

public class EnvExtension implements ExecutionCondition{
    
    @Override
    public ConditionEvaluationResult evaluateExecutionCondition(ExtensionContext context) {
        String env = "dev";
        if("dev".equalsIgnoreCase(env)) {
            return ConditionEvaluationResult.disabled("Test disabled");
        }
        return ConditionEvaluationResult.enabled("Test enabled");
    } 
}