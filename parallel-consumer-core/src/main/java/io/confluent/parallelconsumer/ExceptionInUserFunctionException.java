package io.confluent.parallelconsumer;

/*-
 * Copyright (C) 2020-2026 Parallel Consumer Community
 */

import lombok.experimental.StandardException;

/**
 * This exception is only used when there is an exception thrown from code provided by the user.
 */
@StandardException
public class ExceptionInUserFunctionException extends ParallelConsumerException {
}
