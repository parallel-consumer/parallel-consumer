package io.confluent.csid.utils;

/*-
 * Copyright (C) 2020-2026 Parallel Consumer Community
 */

import java.util.List;
import java.util.Optional;

public class CollectionUtils {

    public static <T> Optional<T> getLast(List<T> history) {
        return history.isEmpty() ? Optional.empty() : Optional.of(history.get(history.size() - 1));
    }

}
