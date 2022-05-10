package com.mhareza.swiss.untangling.good;

import com.mhareza.swiss.untangling.bad.Result;
import java.util.Optional;

public interface Action {

	Optional<Result> perform();
}
