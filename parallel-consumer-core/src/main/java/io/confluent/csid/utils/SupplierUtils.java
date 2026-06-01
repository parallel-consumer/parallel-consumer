package io.confluent.csid.utils;

/*-
 * Copyright (C) 2020-2026 Parallel Consumer Community
 */

import lombok.experimental.UtilityClass;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Supplier;

@UtilityClass
public class SupplierUtils {

    public static <T> Supplier<T> memoize(Supplier<T> delegate) {
        Objects.requireNonNull(delegate);
        AtomicReference<T> value = new AtomicReference<>();
        return () -> {
            T val = value.get();
            if (val == null) {
                synchronized (value) {
                    val = value.get();
                    if (val == null) {
                        val = Objects.requireNonNull(delegate.get());
                        value.set(val);
                    }
                }
            }
            return val;
        };
    }
}
