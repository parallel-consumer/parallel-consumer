package io.confluent.parallelconsumer.internal;

/*-
 * Copyright (C) 2020-2026 Parallel Consumer Community
 */

import lombok.experimental.StandardException;

/**
 * Generic Parallel Consumer parent exception.
 *
 * @author Antony Stubbs
 * @see InternalRuntimeException RuntimeException version
 */
@StandardException
public class InternalException extends Exception {
}
