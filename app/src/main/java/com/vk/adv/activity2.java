package com.vk.adv;

import com.fathzer.soft.javaluator.*;
import java.util.*;

public class activity2 extends DoubleEvaluator
 {
    private static final Function SQRT = new Function("sqrt", 1);


    private static final Parameters PARAMS;

    static {
        PARAMS = DoubleEvaluator.getDefaultParameters();
        PARAMS.add(SQRT);

    }

    public activity2() {
        super(PARAMS);
    }

    @Override
    public Double evaluate(Function function, Iterator<Double> arguments, Object evaluationContext) {
        if (function == SQRT) {
            return Math.sqrt(arguments.next());
        }

        else {
            return super.evaluate(function, arguments, evaluationContext);
        }
    }
}

