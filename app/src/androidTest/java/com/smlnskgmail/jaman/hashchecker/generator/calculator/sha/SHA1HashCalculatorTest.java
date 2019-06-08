package com.smlnskgmail.jaman.hashchecker.generator.calculator.sha;

import android.support.annotation.NonNull;

import com.smlnskgmail.jaman.hashchecker.generator.HashTypes;
import com.smlnskgmail.jaman.hashchecker.generator.calculator.BaseHashCalculatorTest;

public class SHA1HashCalculatorTest extends BaseHashCalculatorTest {

    @NonNull
    @Override
    protected HashTypes getHashType() {
        return HashTypes.SHA_1;
    }

    @NonNull
    @Override
    protected String getHashValueForTestText() {
        return "984816fd329622876e14907634264e6f332e9fb3";
    }

    @NonNull
    @Override
    protected String getHashValueForTesFile() {
        return "13bda17771cb0bdb19d1640e9e68f2dcec583d39";
    }

}
