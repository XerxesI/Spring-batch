package com.techprimers.springbatchexample1.util;

public abstract class ValidationConstraint {
    private ValidationConstraint() {
    }

    public static final String FILEPATH_REGEXP = "^.*?(?=\\/)/";
}
