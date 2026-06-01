package io.confluent.parallelconsumer.offsets;

/*-
 * Copyright (C) 2020-2026 Parallel Consumer Community
 */

import io.confluent.parallelconsumer.internal.InternalException;
import lombok.experimental.StandardException;

/**
 * Throw when for whatever reason, no encoding of the offsets is possible.
 *
 * @author Antony Stubbs
 */
@StandardException
public class NoEncodingPossibleException extends InternalException {
}
