package io.confluent.parallelconsumer;

/*-
 * Copyright (C) 2020-2026 Parallel Consumer Community
 */

import lombok.experimental.StandardException;

/**
 * Used for testing error handling - easier to identify than a plain exception.
 *
 * @author Antony Stubbs
 */
@StandardException
public class FakeRuntimeException extends PCRetriableException {
}
