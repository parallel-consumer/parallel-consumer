package io.confluent.parallelconsumer.internal;

/*-
 * Copyright (C) 2020-2026 Parallel Consumer Community
 */

public class LimitedDynamicExtraLoadFactor extends DynamicLoadFactor {
    public LimitedDynamicExtraLoadFactor() {
        super(2, 2);
    }
}
