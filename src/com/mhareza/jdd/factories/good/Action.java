package com.mhareza.jdd.factories.good;

import com.mhareza.jdd.factories.bad.ObjectRepository;
import com.mhareza.jdd.factories.bad.ObjectX;
import com.mhareza.jdd.factories.bad.Request;
import com.mhareza.jdd.factories.bad.Result;
import java.util.Optional;

public interface Action {

	Optional<Result> perform();
}
