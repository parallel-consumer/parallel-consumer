package io.confluent.parallelconsumer.offsets;

/*-
 * Copyright (C) 2020-2026 Parallel Consumer Community
 */

import lombok.experimental.StandardException;

/**
 * Thrown when Runlength V1 encoding is not supported.
 *
 * @author Antony Stubbs
 */
@StandardException
public class RunLengthV2EncodingNotSupported extends EncodingNotSupportedException {
}
