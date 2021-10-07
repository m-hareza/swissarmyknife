package com.mhareza.jdd.untangling.good;

import com.mhareza.jdd.untangling.bad.Result;
import java.util.Optional;

public interface Action {

	Optional<Result> perform();
}
